package kafkams;

import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConsumerDemo {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(ConsumerDemo.class);
		// Properties object
		// bootstrap-server, serialization

		Properties properties = new Properties();
		properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		// properties.setProperty("bootstrap.servers", "localhost:9092");
		// Broker -> Topic -> partition -> Message - Key value, the default key is null
		properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName()); 
		properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
		properties.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
		properties.setProperty(ConsumerConfig.GROUP_ID_CONFIG, "java-example-group-1");

		// Create consumer object
		KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(properties);

		// subscribe to the topic
		consumer.subscribe(Arrays.asList("api_topic"));

		// read the message - polling the message from the broker
		while (true) {

			ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100));

			for (ConsumerRecord<String, String> record : records) {

				logger.info("Key: " + record.key() + "  " + record.value());
				logger.info("Partition - :" + record.partition() + "   offset " + record.offset());
			}

		}

	}
}
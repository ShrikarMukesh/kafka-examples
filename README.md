
Kafka is a distributed streaming platform, which is really popular and a default choice in many organizations for streaming data.

It is a high throughput, scalable , highly available system. <br/>
It has the capability to store the data permanently for some specific use-cases. <br/>
It is used by thousands of companies for high-performance data pipelines, streaming analytics, data integration, and mission-critical applications. <br/>

![image](https://user-images.githubusercontent.com/46884233/209466485-aca11394-69c1-4897-b31b-87cc5168a440.png)

<br/>
At the heart of Kafka, we have the Kafka broker.

Kafka broker is where the actual data resides. <br/>
Data in Kafka are stored in the form of topics. <br/>
You can relate this as the equivalent of a Table in a Relational DB. <br/>
Kafka broker is also responsible for handling request from the clients efficiently.  <br/>
It also is responsible for a lot of other optimizations such as high throughput, data replication, and etc.,  <br/>

Kafka Clients APIs
Fundamentally we have four APIs that we can use to interact with Kafka:

Kafka Producer API
Kafka Consumer API
Kafka Connect API
Source Connector - Reading Data from an external data source and send it to the Kafka topic.
Sink Connector - Reading Data from a Kafka topic and send it to an external data source (eg.,DB).
Kafka Streams API

![kafka](https://user-images.githubusercontent.com/46884233/209466738-5adfd16f-cc59-4eb0-84b2-6f3756824bcd.png)

In Apache Kafka, the acks configuration property determines the number of acknowledgments the producer requires from the broker before considering a message as successfully sent. It affects the reliability and durability guarantees provided by Kafka. The acks property accepts the following values:
<br/>
acks=0: This setting means the producer will not wait for any acknowledgment from the broker. Once the message is sent, the producer considers it successful without any confirmation. This option provides the highest throughput but offers no reliability guarantee, as the message may be lost or go undelivered.
<br/>
acks=1: With acks=1, the producer waits for a leader replica of the topic partition to acknowledge the message. This ensures that the message is successfully written to the leader replica's local log. However, this setting does not guarantee that the message has been replicated to all the replicas before the acknowledgment is received. This option provides a balance between performance and reliability.
<br/>
acks=all/-1: When acks=all or acks=-1 is configured, the producer waits for acknowledgment from all in-sync replicas (ISRs) of the topic partition. This ensures that the message is written to multiple replicas and replicated for fault tolerance. It provides the highest level of durability and reliability but introduces additional latency due to the replication process.

The acks configuration can be set when creating a Kafka Producer instance. For example:


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

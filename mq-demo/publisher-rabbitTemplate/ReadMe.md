- rabbitMQ的订阅和发布的工作模式------> 使用fanoutExchange实现广播式的发送到已经绑定的队列中，每个消费者消费的消息就是发布者发布的消息量
- 一个消息发布者多个消息消息消费者：多个消费者之间的关系不是合作关系而是并列消费消息的关系，假如发布者发布了100个消息此时有两个
  消息消费者他们每个人都消费100个消息，
- 使用bean的方式创建exchange、queue、bing
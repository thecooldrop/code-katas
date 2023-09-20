# Use Redis as basic queue

The goal of this exercise is to get acquainated with more advanced Redis use-case. 
It is possible to use Redis as a queue and this will be explored as part of this exercise.

In this exercise we will write a producer and consumer applications for a queue. The
producer application will push a new message into the queue every second, while
the consumer will actively be consuming messages from the queue. The consumer
application should sleep for 2 seconds when it retrieves a message from the
queue.

In the end you should run single instance of the producer application and two instances
of consumer application to demonstrate that they consume the messages in an interchanging fashion.
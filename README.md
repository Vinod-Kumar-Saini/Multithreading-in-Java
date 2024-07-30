Multithreading in Java 

Sometimes we encounter situations where managing multiple tasks simultaneously becomes challenging. To address this issue, Java provides the concept of multithreading. Multithreading allows a program to execute multiple threads concurrently, enabling it to handle various tasks in parallel. This not only improves the efficiency and performance of applications but also enhances their responsiveness. By leveraging multithreading, developers can create more robust and scalable software that can better utilize system resources.

In other words, multithreading is a process of executing multiple threads simultaneously. A thread is the smallest unit of execution within a process, functioning as a lightweight sub-process. Each thread can run independently, allowing for concurrent execution and more efficient use of resources.
Here we can see that multiple threads are executing within a process.

Threads can be created by using two mechanisms :

1. Extending the Thread class. 

We create a class that extends the java.lang.Thread class.
 This class overrides the run() method available in the Thread class. 
A thread begins its life inside run() method. 
We create an object of our new class and call start() method to start the execution of a thread. 
Start() invokes the run() method on the Thread object.


2. Implementing the Runnable Interface
   
We create a new class which implements java.lang.Runnable interface and override run() method. 
Then we instantiate a Thread object and call start() method on this object.


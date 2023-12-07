import java.util.LinkedList;

class Buffer{
    private LinkedList<Integer> buffer;
    private int capacity;

    public Buffer(int capacity){
        this.capacity = capacity;
        this.buffer = new LinkedList<>();
    }
    
    public void produce(int item) {
        synchronized(this){
            while(buffer.size() == capacity){
                try{
                    wait();
                }
                catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }
            buffer.add(item);
            System.out.println("Produced: "+ item);
            notifyAll();
        }
    }
    public void consume(){
        synchronized(this){
            while(buffer.isEmpty()){
                try{
                    wait();
                }
                catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }
            int item = buffer.remove();
            System.out.println("Consumed: "+ item);
            notifyAll();
        }
    }
}
class producer implements Runnable{
        private Buffer buffer;
        public producer(Buffer buffer){
            this.buffer = buffer;
        }
        public void run(){
            for(int i=0; i<10; i++){
                buffer.produce(i);
            try{
                Thread.sleep((int) (Math.random()*1000));
            }
            catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }
}

class consumer implements Runnable{
        private Buffer buffer;
        public consumer(Buffer buffer){
            this.buffer = buffer;
        }
        public void run(){
            for(int i=0; i<10; i++){
                buffer.consume();
            try{
                Thread.sleep((int) (Math.random()*1000));
            }
            catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }
}



public class ProducerConsumerDuo {
public static void main(String[] args) {
Buffer buffer = new Buffer(5); // Buffer with a capacity of 5
Thread producerThread = new Thread(new producer(buffer));
Thread consumerThread = new Thread(new consumer(buffer));
producerThread.start();
consumerThread.start();
}}

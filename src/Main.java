import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int bufferSize = 10;
        BlockingQueue<Integer> buffer = new ArrayBlockingQueue<>(bufferSize);
        //Create and Start multiple Producer and Consumers

        for (int i = 0 ;i<3;i++){
            new Producer(buffer).start();
        }
        for (int i = 0 ; i <2 ; i++){
            new Consumer(buffer).start();
        }
    }
}

//Producers and consumers use BlockingQueue to handle synchronization automatically.
// When the buffer is full, producers will block until there is space,
// and when it's empty, consumers will block until there are items to consume.
import java.util.concurrent.BlockingQueue;

public class Consumer extends Thread{
    private BlockingQueue<Integer>buffer;


    public Consumer(BlockingQueue<Integer>buffer){
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try{
            while (true){
                int item = buffer.take();
                System.out.println("Consumed : " + item);
                Thread.sleep(1500);
            }
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }

    }
}

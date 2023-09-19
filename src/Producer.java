import java.util.Queue;
import java.util.concurrent.BlockingQueue;

public class Producer extends Thread{
   private BlockingQueue<Integer> buffer;

   public Producer(BlockingQueue<Integer>buffer){
       this.buffer = buffer;

   }

    @Override
    public void run() {
        try{
            while (true){
                int item = (int) (Math.random() * 100);
                buffer.put(item);
                System.out.println("Producer : " + item);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}

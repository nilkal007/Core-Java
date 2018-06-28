package Thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;


public class consumerProduser {

	public static void main(String[] args) {
		 //Creating BlockingQueue of size 10
        BlockingQueue<Message> queue = new ArrayBlockingQueue<>(10);
        Producer11 producer = new Producer11(queue);
        Consumer11 consumer = new Consumer11(queue);
        //starting producer to produce messages in queue
        new Thread(producer).start();
        //starting consumer to consume messages from queue
        new Thread(consumer).start();
        System.out.println("Producer and Consumer has been started");
    
	}
} 
class Message{
    private String msg;
    
    public Message(String str){
        this.msg=str;
    }

    public String getMsg() {
        return msg;
    }

}
 class Producer11 implements Runnable {

    private BlockingQueue<Message> queue;
    
    public Producer11(BlockingQueue<Message> q){
        this.queue=q;
    }
    @Override
    public void run() {
        //produce messages
        for(int i=0; i<10; i++){
            Message msg = new Message(""+i);
            try {
                Thread.sleep(i+000);
                queue.put(msg);
                System.out.println("Produced "+msg.getMsg());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //adding exit message
        Message msg = new Message("exit");
        try {
            queue.put(msg);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

 class Consumer11 implements Runnable{

	 private BlockingQueue<Message> queue;
	     
	     public Consumer11(BlockingQueue<Message> q){
	         this.queue=q;
	     }

	     @Override
	     public void run() {
	         try{
	             Message msg;
	             //consuming messages until exit message is received
	             while((msg = queue.take()).getMsg() !="exit"){
	             Thread.sleep(10);
	             System.out.println("Consumed "+msg.getMsg());
	             }
	         }catch(InterruptedException e) {
	             e.printStackTrace();
	         }
	     }
	 }
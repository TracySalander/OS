/**
 * Created by tracy on 2017-10-21.
 */
//Source code for semaphore class
public class Semaphore {
    private int value;

    public Semaphore(int value){
        this.value = value;
    }

    public Semaphore(){
        this(0);
    }

    public synchronized void Wait(){
        this.value--;//----------------Below is the original one, for Task1, I move it to here---------------------
        while (this.value <= 0){
            try{
                wait();
            }catch (InterruptedException e){
                System.out.println("Semaphore::Wait() - caught InterruptedException: " + e.getMessage());
                e.printStackTrace();
            }
        }
        //this.value--;
        // abs(value) + 1 == the amount of threads are waiting
    }

    public synchronized void Signal(){
        ++this.value;
        notify();
    }

    public synchronized void P(){
        this.Wait();
    }

    public synchronized void V(){
        this.Signal();
    }

    public synchronized int getWaitingProcess(){
        if (value > 0) {
            return 0;
        } else {
            return Math.abs(value) + 1;
        }
    }
}

package mulThread;

/**
 * Created by tracy on 2017-09-14.
 */
public class ThreadEx2 implements Runnable {
    private String name;

    public ThreadEx2(String name) {
        this.name = name;
    }

    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.print("\n\nI am " + name);
        }
    }
}

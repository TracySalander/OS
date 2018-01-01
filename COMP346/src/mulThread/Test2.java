package mulThread;

/**
 * Created by tracy on 2017-09-14.
 */
public class Test2 {
    public static void main(String[] args) {
        Thread tr1 = new Thread(new ThreadEx2("alpha"));
        Thread tr2 = new Thread(new ThreadEx2("beta"));
        tr1.start();//Start the first thread
        tr2.start();//Start the second thread
        try {
            tr1.join();
            tr2.join();
        }
        catch (InterruptedException e) {
            System.out.println("\n main finished");
        }
    }
}

package multithreading;

public class JavaCode extends Thread{

    public void run() {
        System.out.println("Thread is running ..." + Thread.currentThread().getName());
    }
}

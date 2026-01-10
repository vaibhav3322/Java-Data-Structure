package multithreading;

public class PrintSequenceA1A2 {

    private final Object lock = new Object();
    private boolean isA1Turn = true;

    public void printA1() throws InterruptedException
    {
        synchronized (lock)
        {
            while(!isA1Turn)
            {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            System.out.print("A1 ");
            isA1Turn = false;
            lock.notifyAll();
        }
    }

    public void printA2() throws InterruptedException
    {
        synchronized (lock)
        {
            while(isA1Turn)
            {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            System.out.print("A2 ");
            isA1Turn = true;
            lock.notifyAll();
        }
    }

    public static void main(String[] args) {
        PrintSequenceA1A2 printSq = new PrintSequenceA1A2();

        Thread a1 = new Thread(() ->{
            for (int i=0; i<5; i++)
            {
                try {
                    printSq.printA1();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread a2 = new Thread( () -> {
            for (int i=0; i<5; i++){
                try {
                    printSq.printA2();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        a1.start();
        a2.start();

    }
}

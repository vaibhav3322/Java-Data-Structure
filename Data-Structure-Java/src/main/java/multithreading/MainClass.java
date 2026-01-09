package multithreading;

public class MainClass {

    public static void main(String[] args) throws InterruptedException {
        JavaCode jc = new JavaCode();
        System.out.println("Initial Status -->> " +jc.getState());
        jc.start();

        //jc.join();
       System.out.println("Main thread is running ..." + Thread.currentThread().getName());
       System.out.println("status .... after main thread---->>> "+jc.getState());

        jc.join();

         System.out.println("status .... after join method---->>> "+jc.getState());
        //new JavaCode().start();
    }
}

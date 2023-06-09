public class MyThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Start: " + Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Finished: " + Thread.currentThread().getName());
    }
}

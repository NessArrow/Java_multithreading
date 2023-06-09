public class JThread extends Thread{
    public JThread (String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is started");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("thread is interrupted");
        }
        System.out.println(Thread.currentThread().getName() + " is finished");
    }
}

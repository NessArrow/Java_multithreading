public class MyThreadToo implements Runnable{

    private boolean isActive;

    void disable() {
        isActive = false;
    }

    MyThreadToo() {
        isActive = true;
    }

    @Override
    public void run() {
        System.out.println("Start " + Thread.currentThread().getName());
        int counter = 1; // счетчик циклов

        while (isActive) {
            System.out.println("Loop " + counter++);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted");
            }
        }
        System.out.println("Finish " + Thread.currentThread().getName());
    }
}

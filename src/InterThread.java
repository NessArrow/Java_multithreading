public class InterThread extends Thread{
    InterThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Start " + Thread.currentThread().getName());
        int counter = 1; // счетчик циклов

        while (!isInterrupted()) {
            System.out.println("Loop " + counter++);
//            try {
//                Thread.sleep(400);
//            } catch (InterruptedException e) {
//                System.out.println("Thread has been interrupted");
//            }
        }
        System.out.println("Finish " + Thread.currentThread().getName());
    }
}

public class Main {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("Main thread started");
//        new JThread("JThread").start();
//        for (int i = 0; i < 5; i++) {
//            new JThread("JThread" + i).start();
//        }
        JThread t = new JThread("JThread");
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Main thread finished");
    }
}
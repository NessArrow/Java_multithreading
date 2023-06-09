public class Main {
    public static void main(String[] args) {
        implementsRunnableThroughLambdaExpression();
    }
    public static void extendsThreadClass() {
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
    public static void implementsRunnableInterface() {
        System.out.println("Main started");
        Thread myThread = new Thread(new MyThread(), "MyThread");
        myThread.start();
        System.out.println("Main finished");
    }

    public static void implementsRunnableThroughLambdaExpression() {
        System.out.println("Main started");

        Runnable r = () -> {
            System.out.println("Start: " + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Finished: " + Thread.currentThread().getName());
        };

        Thread myThread = new Thread(r, "MyThread");
        myThread.start();

        System.out.println("Main finished");
    }
}
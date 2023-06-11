import java.util.concurrent.Semaphore;

public class ThreadSemaphore {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        for (int i = 1; i < 6; i++) {
            new Philosopher(semaphore, i).start();
        }
    }
}
class Philosopher extends Thread {
    Semaphore semaphore;
    int numOfMeals = 0;
    int id;

    Philosopher (Semaphore semaphore, int id) {
        this.semaphore = semaphore;
        this.id = id;
    }

    public void run() {
        try {
            while (numOfMeals < 3) {
                semaphore.acquire();
                System.out.println("Философ " + id + " cадится за стол");
                sleep(500);
                numOfMeals++;

                System.out.println("Философ " + id + " выходит из-за стола");
                semaphore.release();

                sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("У философа " + id + " проблемы со здоровьем");
        }
    }
}

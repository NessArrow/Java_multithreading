public class InterThreadToo extends Thread{

    InterThreadToo(String name) {
        super(name);
    }

    public void run() {

        System.out.printf("%s started... \n", Thread.currentThread().getName());
        int counter=1; // счетчик циклов
        try{
            while(!isInterrupted()){
                System.out.println("Loop " + counter++);
                Thread.sleep(100);
            }
        }
        catch(InterruptedException e){
            System.out.println(getName() + " has been interrupted");
        }

        System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }

}

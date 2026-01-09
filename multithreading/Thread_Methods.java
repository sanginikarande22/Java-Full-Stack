package multithreading;

public class Thread_Methods extends Thread {
	
    public void run() {

        System.out.println("Run method started : " + Thread.currentThread().getName());

        for (int i = 1; i <= 5; i++) {
            System.out.println("Run thread value: " + i);
            try {
                Thread.sleep(500);  
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Run method ended");
    }

    
    public void m1() {

        System.out.println("m1 method started : " + Thread.currentThread().getName());

        for (int i = 11; i <= 15; i++) {
            System.out.println("m1 value: " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("m1 method ended");
    }
}
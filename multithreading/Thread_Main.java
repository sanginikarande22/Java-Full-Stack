package multithreading;

public class Thread_Main {
	public static void main(String[] args) {
	
		System.out.println("Main thread started");

       
        Thread mainThread = Thread.currentThread();
        System.out.println("Main thread name: " + mainThread.getName());

        Thread_Methods t = new Thread_Methods();
      
        t.setName("Child-Thread");
        t.setPriority(Thread.NORM_PRIORITY);

   
        System.out.println("Is child alive before start? " + t.isAlive());

    
        t.start();

     
        System.out.println("Is child alive after start? " + t.isAlive());

        
        try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

       
        t.m1();

        System.out.println("Is child alive after join? " + t.isAlive());

        System.out.println("Main thread ended");
    }
}
package es1;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyMain {
 public static Logger l = LoggerFactory.getLogger(MyMain.class);
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread('#',20);
		
		MyRunnable r1 = new MyRunnable();
		
		Thread Tr1 = new Thread(r1);
		System.out.println("start");
		try {
			System.out.println("aspetta 1 secondo");
			Thread.sleep(1000);
			System.out.println("dopo 1 secondo mi vedi e dopo di me partono i tred");
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		t1.start();
		Tr1.start();
		t2.start();
		System.out.println("sarò visualizzato prima che i thread finiscono");
		try {
			t1.join();
			Tr1.join();
			l.debug("Finiti t1 e Tr1 <3");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

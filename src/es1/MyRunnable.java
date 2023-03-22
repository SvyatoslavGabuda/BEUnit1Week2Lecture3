package es1;

public class MyRunnable implements Runnable {
	public char simbol = '*';
	public MyRunnable() {
		
	}
	public MyRunnable(char a) {
		this.simbol =a;
	}
	@Override
	public void run() {
		for(int i = 0;i<10;i++) {
			MyMain.l.info(i+"\t"+simbol);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("End Runnable");
		   
		
	}

}

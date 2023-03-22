package es1;

public class MyThread extends Thread{
 public char simbol = '@';
 public int n=10;
 public MyThread() {}
 public MyThread(char a,int i) {
	 this.simbol = a;
	 this.n=i;
 }
	@Override
	public void run() {
		for(int i = 0;i<this.n;i++) {
			MyMain.l.info(i+"\t"+simbol);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println("End Thread");
		                        
		
		
	}
}

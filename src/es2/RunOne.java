package es2;

import java.util.List;

public class RunOne implements Runnable{
public int somma;
public List<Integer> arr;
int inizio;
int fine;

	public RunOne(List<Integer>a, int inizio,int fine) {
		this.arr =a;
		this.inizio=inizio;
		this.fine=fine;
	}
	public void run() {
		MyMain.l.debug("start");
		for(int i = inizio;i<fine;i++) {
			somma+=arr.get(i);
		}
		MyMain.l.debug("end");
		
	}
 public int getSomma() {
	 return somma;
 }
}

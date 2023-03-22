package es2;


import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class MyMain {
	 public static Logger l = LoggerFactory.getLogger(MyMain.class);
	public static void main(String[] args) {
		List<Integer> one = new ArrayList<Integer>();
		for(int i = 0;i<3000;i++) {
			int r=((int)(Math.random()*101));
			one.add(r);
			
			//System.out.println(r);
		}
		System.out.println("prima");
		System.out.println("one"+ one);
		System.out.println("dopo");
		long resSomma = 0l;
		for(int i = 0;i<one.size();i++) {
			resSomma+=one.get(i);
		}
		System.out.println("Somma Standar\t"+resSomma);
		RunOne primo = new RunOne(one,0,1000);
		RunOne sec = new RunOne(one,1000,2000);
		RunOne ter = new RunOne(one,2000,3000);
		RunOne controllo = new RunOne(one,0,one.size());
		Thread primoThread = new Thread(primo);
		Thread secThread = new Thread(sec);
		Thread terThread = new Thread(ter);
		Thread controlloThread = new Thread(controllo);
		
		primoThread.start();
		secThread.start();
		terThread.start();
		controlloThread.start();
		
		try {
			primoThread.join();
			secThread.join();
			terThread.join();
			controlloThread.join();
			System.out.println("somma parziale 1\t"+primo.somma);
			System.out.println("somma parziale 2\t"+sec.somma);
			System.out.println("somma parziale 3\t"+ter.somma);
			System.out.println("somma delle somme\t"+(primo.somma+sec.somma+ter.somma));
			System.out.println("somma controllo \t"+controllo.somma);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}

}

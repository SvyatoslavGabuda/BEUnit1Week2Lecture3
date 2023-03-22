package es3;

import java.util.ArrayList;

public class Registro {
	ArrayList<Presenza> reg ;

	Registro() {
		this.reg = new ArrayList<Presenza>();
	}

	Registro(ArrayList<Presenza> a) {
		this.reg = a;
	}

	public void addToReg(Presenza a) {
		this.reg.add(a);
	}
	public void stampa() {
		for(int i =0;i<this.reg.size();i++) {
			System.out.println(reg.get(i).nome +"\t"+reg.get(i).giorni);
		}
	}

	public String toString() {
		String tutti = "";
		for (int i = 0; i < this.reg.size(); i++) {
			tutti += reg.get(i).nome + "@" + reg.get(i).giorni + "#";
		}
		return tutti;
	}
}

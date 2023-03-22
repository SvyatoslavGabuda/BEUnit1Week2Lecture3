package es3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.commons.io.FileUtils;



public class FileManager {
    public static Logger l = LoggerFactory.getLogger(FileManager.class);
	
	public static void main(String[] args) {
		ArrayList<Presenza> nuovo = new ArrayList<Presenza>();
		Presenza pri = new Presenza("Mario",50);
		Presenza sec = new Presenza("Giacomo",150);
		Presenza ter = new Presenza("Roberto",250);
		Presenza qua = new Presenza("luca",520);
		Presenza qui = new Presenza("Carlo",40);
		nuovo.add(pri);
		nuovo.add(sec);
		nuovo.add(ter);
		nuovo.add(qua);
		nuovo.add(qui);
		
		Registro prova = new Registro(nuovo);
		System.out.println(prova);
		
		File primo = new File("text.txt");
		
		System.out.println(primo.exists());
		System.out.println(primo.getPath());
		System.out.println(primo.getAbsolutePath());
		
		try {
			FileUtils.writeStringToFile(primo, prova.toString(),"UTF-8");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		try {
			String s = FileUtils.readFileToString(primo,"UTF-8");
			System.out.println(s);
			Registro letto = new Registro();
			String[] daFile = s.split("#");
			for(int i =0;i<daFile.length;i++) {
				System.out.println(daFile[i]);
				String[] nomeGiorni = daFile[i].split("@");
				Presenza var = new Presenza(nomeGiorni[0],Integer.parseInt(nomeGiorni[1]));
				letto.addToReg(var);
			}
			System.out.println(letto);
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

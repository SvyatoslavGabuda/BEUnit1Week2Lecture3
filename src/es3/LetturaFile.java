package es3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class LetturaFile {

	public static void main(String[] args) {
		File prova = new File("text.txt");
		System.out.println(prova.exists());
		try {
			String s = FileUtils.readFileToString(prova,"UTF-8");
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
			letto.stampa();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

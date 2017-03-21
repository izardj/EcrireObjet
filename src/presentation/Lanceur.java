package presentation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import metier.Compte;

public class Lanceur {

	public static void main(String[] args) throws IOException {

		Compte c1 = new Compte(1, "comptetest1", 1000);
		Compte c2 = new Compte(2, "comptetest2", 5840);

		File f = new File("banque.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(c1);
		oos.writeObject(c2);
		
		oos.close();
		fos.close();
	}

}

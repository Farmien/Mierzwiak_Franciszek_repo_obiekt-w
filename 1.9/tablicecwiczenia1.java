import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class tablicecwiczenia1{
    public static void main(String [] args)throws FileNotFoundException{
		Random rand = new Random();
		File plik = new File("uczniowie.txt");
		Scanner odczyt = new Scanner(plik);
		
		int[] ocena = new int[10];
		String[] imie_nazwisko = new String[10];
		for(int i = 0; i < 10 ; i++){
			ocena[i] = rand.nextInt(6)+1;
			imie_nazwisko[i] = odczyt.nextLine();
			System.out.println(imie_nazwisko[i] + " " + ocena[i]);
		}
	}
}
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class tablicecwiczenia2{
    public static void main(String [] args){
		try{
			Random rand = new Random();
			File plik1 = new File("czylosowac.txt");
			File plik2 = new File("ileliczb.txt");
			Scanner odczyt1 = new Scanner(plik1);
			Scanner odczyt2 = new Scanner(plik2);
			String[] czylos = odczyt1.nextLine().split(" ");
			int[] ile = new int[10];
			for(int i = 0; i < 10; i++){
				ile[i] = Integer.parseInt(odczyt2.nextLine());
			}
			for(int i = 0; i < 10; i++){
				if(czylos[i].equals("1")){
					for(int j = 0; j < ile[i]; j++){
						System.out.print(rand.nextInt(80)+1+" ");
					}
					System.out.print("\n");
				}else{
					System.out.println("Wczytalem liczbe 0 - nie losuje liczby");
				}
			}
		}catch(FileNotFoundException ex){
			System.out.println(ex.toString());
		}
	}
}
class PolaPrywatnePubliczne{
	//definiowanie zmiennych/obiektow globalnie!!!
	static DaneOsobowe dos;
	public static void main(String [] args){
		//stworzenie obiektu
		dos = new DaneOsobowe(); //od tego meomentu moge uzywać nazwy: dos
		System.out.println(dos.pesel);
	}
}
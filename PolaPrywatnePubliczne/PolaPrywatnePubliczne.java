class PolaPrywatnePubliczne{
	//definiowanie zmiennych/obiektow globalnie!!!
	static DaneOsobowe dos;
	public static void main(String [] args){
		//stworzenie obiektu
		dos = new DaneOsobowe(); //od tego meomentu moge uzywać nazwy: dos
		System.out.println("BMI: "+ dos.mybmi()   );
		dos.wzrost = 192;
		dos.waga = 94;
		System.out.println("BMI: "+ dos.mybmi()   );
		dos.adres();
	}
}
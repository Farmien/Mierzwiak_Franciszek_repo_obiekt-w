class PierwszyObiekt{
	public static void main ( String [] args){
		//Zdefiniowanie i stworzenie obiektu
		ObiektPudelko op = new ObiektPudelko();
		Osoba os = new Osoba();
		System.out.println("Domyslna wartosc: "+op.wysokosc);
		
		op.wysokosc = 100;
		System.out.println("Po zmodyfikowaniu wartosc: "+op.wysokosc);
		System.out.println("Imie: "+os.imie+"\n Nazwisko:"+os.nazwisko);
	}
}


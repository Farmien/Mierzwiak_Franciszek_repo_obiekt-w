class DaneOsobowe{
	private String pesel = "12345678901";
	public int wiek = 20;
	public int wzrost = 177;
	public int waga = 88;
	
	public String miasto = "Nowa Sol";
	public String ulica  = "Urzednicza 3";
	public String kod = "67-100";
	
	public double mybmi(){
		//Rzutowanie int na double: (double)wzrost
		System.out.println("Osoba o peselu:  "+pesel);
		return waga/((double)wzrost/100*(double)wzrost/100);
		
	}
	public void adres(){
		System.out.println("Moj adres:"+"\nMiasto: "+miasto+"\nUlica: "+ulica+"\nKod: "+kod);
	}
}
class CwiczenieObiektowe_1{
    public static void main(String[] args){
		MojeDane md = new MojeDane("Franciszek","Mierzwiak","2ptn");
		System.out.println(md.imie+"\n"+md.nazwisko+"\n"+md.klasa);
		
	
		Logowanie lg = new Logowanie("akronim", "123ASDlo9");
		System.out.println(lg.toString());
		
		Kolo k1 = new Kolo(4);
		System.out.println("Pole kola k1: "+k1.PoleK());
		System.out.println("Obwod kola k1: "+k1.ObwK());	
		Kolo k2 = new Kolo(20);
		System.out.println("Pole kola k2: "+k2.PoleK());
		System.out.println("Obwod kola k2: "+k2.ObwK());
	}
}
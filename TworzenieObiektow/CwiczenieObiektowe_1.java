class CwiczenieObiektowe_1{
    public static void main(String[] args){
		MojeDane md = new MojeDane("Franciszek","Mierzwiak","2ptn");
		System.out.println(md.imie+"\n"+md.nazwisko+"\n"+md.klasa);
		
	
		Logowanie lg = new Logowanie("akronim", "123ASDlo9");
		System.out.println(lg.toString());
		
		Kolo k1 = new Kolo(4);
		System.out.println("Pole kola k1: "+k1.PoleK());
		System.out.println("Obwod kola k1: "+k1.ObwK()+"\n");	
		
		Kolo k2 = new Kolo(20);
		System.out.println("Pole kola k2: "+k2.PoleK());
		System.out.println("Obwod kola k2: "+k2.ObwK()+"\n");
		
		Kwadrat kw = new Kwadrat(7);
		System.out.println("Pole kwadratu kw: "+kw.PoleKw());
		System.out.println("Obwod kwadratu kw: "+kw.ObwKw()+"\n");
		
		Prostokat p = new Prostokat(9, 21);
		System.out.println("Pole prostokata p: "+p.PoleP());
		System.out.println("Obwod prostokata p: "+p.ObwP());
	}
}
class CwiczenieObiektowe_1{
    public static void main(String[] args){
		MojeDane md = new MojeDane("Franciszek","Mierzwiak","2ptn");
		System.out.println(md.imie+"\n"+md.nazwisko+"\n"+md.klasa);
		
	
		Logowanie lg = new Logowanie("akronim", "123ASDlo9");
		System.out.println(lg.toString());
    }
}
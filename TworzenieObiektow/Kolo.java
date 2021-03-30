class Kolo{
	private float liczba_pi = 3.1415F;
	private int prom = 0;
	
	public Kolo(int prom){
		this.prom = prom;
	}
	
	public float PoleK(){
		return liczba_pi * prom * prom;
	}
	public float ObwK(){
		return 2 * prom * liczba_pi;
	}
}
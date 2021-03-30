class Prostokat{
	private int bok = 0;
	private int wysokosc = 0;
	
	public Prostokat(int bok, int wysokosc){
		this.bok = bok;
		this.wysokosc = wysokosc;
	}
	public float PoleP(){
		return bok * wysokosc;
	}
	public float ObwP(){
		return bok + bok + wysokosc + wysokosc;
	}
}
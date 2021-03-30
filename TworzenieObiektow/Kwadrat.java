class Kwadrat{
	private int bok = 0;
	
	public Kwadrat(int bok){
		this.bok = bok;
	}
	public float PoleKw(){
		return bok * bok;
	}
	public float ObwKw(){
		return 4 * bok;
	}
}
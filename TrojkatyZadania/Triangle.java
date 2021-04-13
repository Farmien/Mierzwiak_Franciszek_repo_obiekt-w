
class Triangle{
	
	//pole trojkata(podstawa * wysokosc)
	public Triangle(int wysokosc, int podstawa){
		System.out.println(wysokosc*podstawa/2);
	}
	
	//pole trojkata rownobocznego
	public Triangle(float podstawa){
		System.out.println(podstawa*podstawa*1.73205080757/4);
	}
}
public class Card {
    private int number;
    private String name;

    public Card(int number, String name){
		this.number = number;
        this.name = name;
	}
    
    public int getNumber(){
        return number;
    }
    public String getName(){
        return name;
    }

    public void setNumber(int number){
        number = this.number;
    }

    public void setNumber(String name){
        name = this.name;
    }
}

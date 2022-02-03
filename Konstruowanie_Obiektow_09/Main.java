import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

class Main{
    public static void main(String[] args){
        ArrayList<Card> cards = new ArrayList<Card>();
        cards.add(new Card(2, "two"));
        cards.add(new Card(3, "three"));
        cards.add(new Card(4, "four"));
        cards.add(new Card(5, "five"));
        cards.add(new Card(6, "six"));
        cards.add(new Card(7, "seven"));
        cards.add(new Card(8, "eight"));
        cards.add(new Card(9, "nine"));
        cards.add(new Card(10, "ten"));
        cards.add(new Card(10, "jack"));
        cards.add(new Card(10, "queen"));
        cards.add(new Card(10, "king"));
        cards.add(new Card(11, "as"));

        ArrayList<Card> hand = new ArrayList<Card>();

        hand.add(cards.get(los()));
        hand.add(cards.get(los()));
        int h = 2;
        

        char check = 'x';
        char opt = 'x';
        while(check != 'E'){
            switch(opt){
                case 'x':
                    break;
                case 'S':

                break;
            }
            System.out.println("Posiadasz\n");
                for(int i=0; i<h; i++){
            System.out.println(hand.get(i).getName());
            }

            Scanner sc = new Scanner(System.in);
            check = sc.nextLine().charAt(0);
        }
        

        
    }

    public static int los(){
        Random rand = new Random();
        int r = rand.nextInt(13);
        return r;
    }

}
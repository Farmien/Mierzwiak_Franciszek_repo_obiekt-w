import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Settings settings = new Settings(0,0);
        ReadFromFile rff = new ReadFromFile();
        while((settings.getNumberOfPlayers() < 2 || settings.getNumberOfPlayers() > 4) ||
                (settings.getNumberOfRounds() < 4 || settings.getNumberOfRounds() > 10)){
            System.out.print("Podaj ilosc graczy[2-4]: ");
            Scanner players = new Scanner(System.in);
            settings.setNumberOfPlayers(players.nextInt());
            System.out.print("Podaj ilosc rund[4-10]: ");
            Scanner rounds = new Scanner(System.in);
            settings.setNumberOfRounds(rounds.nextInt());
        }
        ArrayList<Question> questionlist = new ArrayList<>();
        ArrayList<Players> playerlist = new ArrayList<>();
        for(int i=0;i <= settings.getNumberOfPlayers();i++){
            playerlist.add(new Players(""+(i+1)));
        }
        int numberOfQuestions = 45;
        for(int i=0;i < numberOfQuestions;i++){
            questionlist.add(rff.readFromFile("pytania.txt", i));
        }
        int randomNumber = 0;
        int rounds = 0;
        int playerTurn = 0;
        while(rounds < settings.getNumberOfRounds()){
            while(playerTurn < settings.getNumberOfPlayers()){
                randomNumber = (int)(Math.random() * numberOfQuestions);
                questionlist.get(randomNumber).showQuestion();
                if(questionlist.get(randomNumber).isCorrect() == true){
                    if(questionlist.get(randomNumber).getDifficulty().equals("latwy")) {
                        playerlist.get(playerTurn).setScore(playerlist.get(playerTurn).getScore()+1);
                    }else if (questionlist.get(randomNumber).getDifficulty().equals("sredni")){
                        playerlist.get(playerTurn).setScore(playerlist.get(playerTurn).getScore()+2);
                    }else{
                        playerlist.get(playerTurn).setScore(playerlist.get(playerTurn).getScore()+3);
                    }
                    System.out.println("poprawna \nilosc pkt gracza nr:  "+(playerTurn+1)+": "+playerlist.get(playerTurn).getScore());
                }else{
                    System.out.println("bledna \nilosc pkt gracza nr:  "+(playerTurn+1)+": "+playerlist.get(playerTurn).getScore());
                }
                playerTurn++;
                numberOfQuestions--;
                questionlist.remove(randomNumber);
            }
            playerTurn = 0;
            rounds++;
            

        }
        System.out.println("Punktacja Koncowa: ");
        if(settings.getNumberOfPlayers() == 2){
            int[] players = {playerlist.get(0).getScore(), playerlist.get(1).getScore()};

            Arrays.sort(players);
            System.out.println(players[0]);
            for(int i = 1; i >= 0 ; i--){
                for(int j = 0; j < 2 ; j++){
                    if(players[i] == playerlist.get(j).getScore()){
                        System.out.println("Gracz nr. "+playerlist.get(j).getPlayerNumber()+" zdobyl: "+players[i]+" punktow");
                    }
                }
            }
        }else if(settings.getNumberOfPlayers() == 3){
            int[] players = {playerlist.get(0).getScore(), playerlist.get(1).getScore(), playerlist.get(2).getScore()};

            Arrays.sort(players);
            System.out.println(players[0]);
            for(int i = 2; i >= 0 ; i--){
                for(int j = 0; j < 3 ; j++){
                    if(players[i] == playerlist.get(j).getScore()){
                        System.out.println("Gracz nr. "+playerlist.get(j).getPlayerNumber()+" zdobyl: "+players[i]+" punktow");
                    }
                }
            }
        }else if(settings.getNumberOfPlayers() == 4){
            int[] players = {playerlist.get(0).getScore(), playerlist.get(1).getScore(), playerlist.get(2).getScore(), playerlist.get(3).getScore()};

            Arrays.sort(players);
            System.out.println(players[0]);
            for(int i = 3; i >= 0 ; i--){
                for(int j = 0; j < 4 ; j++){
                    if(players[i] == playerlist.get(j).getScore()){
                        System.out.println("Gracz nr. "+playerlist.get(j).getPlayerNumber()+" zdobyl: "+players[i]+" punktow");
                    }
                }
            }
        }
        


    }
}

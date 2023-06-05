import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import java.util.Scanner;

public class Server{
    public static void main(String[] args){
        SaveToFile stf = new SaveToFile();
        String klientZnak, serverZnak;
        boolean bulin, koniecGry;
        String boardIndex[] = {"1","2","3","4","5","6","7","8","9"};
        String board = boardIndex[0]+" | "+boardIndex[1]+" | "+boardIndex[2]+
        "\n---------\n"+boardIndex[3]+" | "+boardIndex[4]+" | "+boardIndex[5]+
        "\n---------\n"+boardIndex[6]+" | "+boardIndex[7]+" | "+boardIndex[8];
        int port = 23459;
        String input;
        Scanner sc = new Scanner(System.in);
        String wybor;
        int tura = 1;
        int test = 100;
        System.out.println("Podaj swoje imie: ");
        String nazwaGracza, nazwaGracza2;
        nazwaGracza = sc.nextLine();
        try{
            koniecGry = false;
            System.out.println("Proba polaczenia "+port);
            ServerSocket serverSocket = new ServerSocket(port);
            Socket clientSocket = serverSocket.accept();
            DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
            DataInputStream in = new DataInputStream(clientSocket.getInputStream());
            if(Math.floor(Math.random() * 2 ) == 0){
                klientZnak = "X";
                serverZnak = "O";
            }else{
                klientZnak = "O";
                serverZnak = "X";
            }
            clearCmd();
            System.out.println("Przypisany znak: "+serverZnak+"\n"+board);
            out.writeUTF("Przypisany znak: "+klientZnak+"\n"+board);
            nazwaGracza2 = in.readUTF();
            while(true){
                try{
                    input = in.readUTF();
                    tura = 0;
                    bulin = false;
                    if(input.equals("q") || input.equals("gg")){
                        break;
                    }
                    for(int i=0;i<boardIndex.length;i++){
                        if(input.equals(boardIndex[i])&& !input.equals("X") && !input.equals("O")){
                            test = Integer.parseInt(input);
                            boardIndex[i] = klientZnak;
                            tura = 1;
                        }
                    }
                    if(checkIfWin(boardIndex) == true){
                        clearCmd();
                        System.out.println("Wygrywa "+nazwaGracza2+" z "+nazwaGracza+" posiadajac znak: "+klientZnak);
                        out.writeUTF("Wygrywa "+nazwaGracza2+" z "+nazwaGracza+" posiadajac znak: "+klientZnak+(" prosze opuscic program uzywajac znaku (q)"));
                        stf.saveToFile("Wygrywa "+nazwaGracza2+" z "+nazwaGracza+" posiadajac znak: "+klientZnak);
                        break;
                    }
                    board = boardIndex[0]+" | "+boardIndex[1]+" | "+boardIndex[2]+
                        "\n---------\n"+boardIndex[3]+" | "+boardIndex[4]+" | "+boardIndex[5]+
                        "\n---------\n"+boardIndex[6]+" | "+boardIndex[7]+" | "+boardIndex[8];
                    clearCmd();   
                    System.out.println("Przypisany znak: "+serverZnak+"\n"+board);
                    if(tura == 1){
                        while(bulin == false){
                            wybor = sc.nextLine();
                            for(int i=0;i<boardIndex.length;i++){
                                if(wybor.equals(boardIndex[i]) && !wybor.equals("X") && !wybor.equals("O")){
                                    test = Integer.parseInt(wybor);
                                    boardIndex[i] = serverZnak;
                                    bulin = true;
                                }
                            }
                            if(bulin == false){
                                System.out.println("Nieprawidlowe pole");
                            }
                        }
                        
                        if(checkIfWin(boardIndex) == true){
                            clearCmd();
                            System.out.println("Wygrywa "+nazwaGracza+" z "+nazwaGracza2+" posiadajac znak: "+serverZnak);
                            out.writeUTF("Wygrywa "+nazwaGracza+" z "+nazwaGracza2+" posiadajac znak: "+serverZnak);
                            stf.saveToFile("Wygrywa "+nazwaGracza+" z "+nazwaGracza2+" posiadajac znak: "+serverZnak); 
                            break;
                        }
                        board = boardIndex[0]+" | "+boardIndex[1]+" | "+boardIndex[2]+
                            "\n---------\n"+boardIndex[3]+" | "+boardIndex[4]+" | "+boardIndex[5]+
                            "\n---------\n"+boardIndex[6]+" | "+boardIndex[7]+" | "+boardIndex[8];
                        //tura--;    
                    }else{
                        board = boardIndex[0]+" | "+boardIndex[1]+" | "+boardIndex[2]+
                            "\n---------\n"+boardIndex[3]+" | "+boardIndex[4]+" | "+boardIndex[5]+
                            "\n---------\n"+boardIndex[6]+" | "+boardIndex[7]+" | "+boardIndex[8];
                        out.writeUTF("Przypisany znak: "+klientZnak+"\n"+board+"\nNieprawidlowy pole");
                    }
                    
                    out.writeUTF("Przypisany znak: "+klientZnak+"\n"+board);
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            try{
                in.close();
                out.close();
                clientSocket.close();
            }catch(IOException e){
                System.out.println(e);
            }
        }catch(IOException e){
            System.out.println(e);
        }
        
    }
    public static Boolean checkIfWin(String tab[]){
        if(tab[0].equals(tab[1]) && tab[0].equals(tab[2])){ //3 poz 1 rzac
            return true;
        }else if(tab[3].equals(tab[4]) && tab[3].equals(tab[5])){ //3 poz 2 rzac
            return true;
        }else if(tab[6].equals(tab[7]) && tab[6].equals(tab[8])){ //3 poz 3 rzac
            return true;
        }else if(tab[0].equals(tab[3]) && tab[0].equals(tab[6])){ //3 pion 1 kol
            return true;
        }else if(tab[1].equals(tab[4]) && tab[1].equals(tab[7])){ //3 pion 2 kol
            return true;
        }else if(tab[2].equals(tab[5]) && tab[2].equals(tab[8])){ //3 pion 3 kol
            return true;
        }else if(tab[0].equals(tab[4]) && tab[0].equals(tab[8])){ //ukos lewo gora do prawo dol
            return true;
        }else if(tab[2].equals(tab[4]) && tab[2].equals(tab[6])){ //ukos prawo gora do lewo dol
            return true;
        }else{
            return false;
        }
    }
    public static void clearCmd(){
        try {
            System.out.print("\033[H\033[2J"); 
            System.out.flush();
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception ex) {}  
    }
}
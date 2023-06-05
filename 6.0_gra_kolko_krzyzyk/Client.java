import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.IOException;
import java.util.Scanner;

public class Client{
    public static void main(String[] args){
        String address = "127.0.0.16";
        Socket clientSocket;
        DataOutputStream out;
        DataInputStream in;
        int port = 23459;
        Scanner sc = new Scanner(System.in);
        String line = "";
        String odp = "";
        int tura = 0;
        System.out.println("Podaj swoje imie: ");
        String nazwaGracza = sc.nextLine();

        try{
            System.out.println("Proba polaczenia "+port+"  "+address);
            clientSocket = new Socket(address, port);
            out = new DataOutputStream(clientSocket.getOutputStream());
            in = new DataInputStream(clientSocket.getInputStream()); 
            out.writeUTF(nazwaGracza);
            while(true){
                try{
                    line = in.readUTF();
                    clearCmd();
                    System.out.println(line);
                    if(line.contains("Wygrywa")){
                        out.writeUTF("gg");
                        break;
                    }
                    
                    odp = sc.nextLine();
                    if(odp.equals("q")){
                        out.writeUTF("q");
                        break;
                    }else{
                        
                        out.writeUTF(odp);
                    }
                    
                    
                    
                }catch(IOException e){
                    System.out.println(e);
                }
            }
            try{
                in.close();
                out.close();
                clientSocket.close();
            }catch(IOException e){
                System.out.println(e);
            }
        }catch(UnknownHostException u){
            System.out.println(u);
        }catch(IOException e){
            System.out.println(e);
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
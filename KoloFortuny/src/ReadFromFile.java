import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {
    public Question readRandomFromFile(String filename){
        try {
            File file = new File(filename);
            int nr_pyt = (int)(Math.random() * 12);
            System.out.println(nr_pyt);
            Scanner sc = new Scanner(file);
            for(int i=0;i<=nr_pyt;i++) {
                String[] test = sc.nextLine().split(";");
            }
            String[] text = sc.nextLine().split(";");
            return new Question(text[0],text[1],text[2],text[3],text[4],text[5],text[6],text[7]);
        }catch(IOException e){return null;}

    }
    public Question readFromFile(String filename, int x){
        try {
            File file = new File(filename);
            Scanner sc = new Scanner(file);
            int i = -1;
            String[] text;
            do{
                text = sc.nextLine().split(";");
                i++;
            }while(i < x);
            try{
                return new Question(text[0],text[1],text[2],text[3],text[4],text[5],text[6],text[7]);
            }catch(ArrayIndexOutOfBoundsException e){
                return null;
            }
        }catch(IOException e){return null;}

    }
}

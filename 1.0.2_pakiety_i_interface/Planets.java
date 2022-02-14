import java.util.Scanner;
public class Planets {
    public static void main(String[] args) {
        PlanetsImp planetsImp;
        
        System.out.println("Earth/Venus");
        Scanner sc = new Scanner(System.in);

        if(sc.nextLine().equals("Earth")){
            planetsImp = new Earth();
        }else if(sc.nextLine().equals("Venus")){
            planetsImp = new Venus();
        }else{
            planetsImp = null;
        }

        if(planetsImp.hasAtmosphere() == true){
            System.out.println("This Planet has atmosphere");
        }else{
            System.out.println("This Planet has not atmosphere");
        }
        
    }
}

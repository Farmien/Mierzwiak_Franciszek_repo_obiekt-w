import java.util.Scanner;

class sortieren{
    public static void quicksort(int tab[], int min, int max){
        if(min < max){
            int indeks = indeksiarz(tab, min, max);
            quicksort(tab, min, indeks-1);
            quicksort(tab, indeks+1, max);
        }
    }
    public static int indeksiarz(int tab[], int min, int max){
        int srak = tab[max];
        int miejsce = min-1;
        for(int i=min;i< max;i++){
            if(tab[i]< srak){
                miejsce++;
                int temp = tab[miejsce];
                tab[miejsce] = tab[i];
                tab[i] = temp;
            }
        }
        int temp = tab[miejsce+1];
        tab[miejsce+1] = tab[max];
        tab[max] = temp;
        return miejsce+1;
    }
    public static void bubblesort(int tab[]){
        int dlug = tab.length-1;
        for(int i=0;i<dlug;i++){
            for(int j=0;j<=dlug-i-1;j++){
                if(tab[j]>tab[j+1]){
                    int temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = temp;
                }
            }
                
        }
    }
}
class sortowanie{
    public static void main(String[] args){
        int[] tab = {1,2,3,6,8,3,2,4,5,8,6,3,9,1};
        System.out.println(":");
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        if(a == 0){
            sortieren.quicksort(tab,0,tab.length-1);
        }else if(a == 1){
            sortieren.bubblesort(tab);
        }
        for(int i=0;i<tab.length;i++){
            System.out.print(tab[i]+" ");
        }
    }
}
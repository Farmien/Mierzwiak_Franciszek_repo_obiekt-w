class MyArrayUtils{
    public int tablica[] = new int[1000];
    public MyArrayUtils(){
        for(int i=0; i<1000;i++){
            tablica[i] = (int)(Math.random() * 201) - 100;
        }
    }
    
    
    public void wypisanie(){
        for(int i=0;i<tablica.length;i++){
            System.out.print(tablica[i]+"; ");
        }
    }

    public int findMax(){
        int checker = -100;
        for(int i=0; i<tablica.length;i++){
            if(tablica[i] > checker){
                checker = tablica[i];
            }
        }
        return checker;
    }
    public int findIndex(int x){
        boolean sprawdzacz = false;
        for(int i=0;i<tablica.length;i++){
            if(tablica[i] == x){
                return i;
            }
        }
        return 6969;
        
    }
    public String countDuplicate(){
        String finalMessage = "Duplikaty: ";
        int tablicaWart[] = new int[1000];
        int tempTablica[] = tablica;
        int o = 0;
        int dlug = tempTablica.length;
        for(int i=0;i<dlug;i++){
            tablicaWart[i] = 0;
            for(int j=0;j<dlug;j++){
                if(tempTablica[i] == tempTablica[j]){
                    if(i != j){
                        int temp = tempTablica[j];
                        tempTablica[j] = tempTablica[dlug-1];
                        tempTablica[dlug-1] = temp;
                        dlug--;
                    }
                    tablicaWart[i] += 1;
                }
            }
            finalMessage += tempTablica[i]+":"+tablicaWart[i]+"; ";
            o += tablicaWart[i];
        }
        return finalMessage;
    } 
}
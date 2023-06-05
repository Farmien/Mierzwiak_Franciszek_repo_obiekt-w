class Tablicarz{
    public static void main(String[] args){
        
        //int[] tab = tablicowanie(100-1,tab);
        //System.out.print("\ndlug:"+tab.length);
        MyArrayUtils myArrayUtils = new MyArrayUtils();
        System.out.println(myArrayUtils.findMax());
        System.out.println(myArrayUtils.findIndex(100));
        System.out.println(myArrayUtils.countDuplicate());
        //myArrayUtils.wypisanie();
        Seeker seeker = new Seeker("ciagzna #kowy2137ąęćś");
        System.out.println("Liczba samoglosek: "+seeker.PodajSamogloski());
        System.out.println("Liczba spolglosek: "+seeker.PodajSpolgloski());
        System.out.println("Liczba liczb: "+seeker.PodajLiczby());
        System.out.println("Liczba innych:"+seeker.PodajInne());

    }
    public static int[] tablicowanie(int dlug, int[] tab){
        if(tab.length <= dlug){
            int[] tab2 = new int[tab.length+1];
            for(int i=0;i<tab.length;i++){
                tab2[i] = tab[i];
            }
            int rand = (int)(Math.random() * 20) + 1;
            tab2[tab.length] = rand;
            System.out.print(rand+" ");
            tablicowanie(dlug, tab2);
            
        }else{System.out.print("\ndlug:"+tab.length);}
        
        return tab;
        
    }
}
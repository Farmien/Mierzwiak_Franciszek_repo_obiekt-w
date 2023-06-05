class Seeker{
    private String ciag;
    private String samogloski = "eyuioaąęó";
    private String spolgloski = "qwrtpsdfghjklzxcvbnmśłżźćń";
    private String liczby = "1234567890";
    public Seeker(String ciag){
        this.ciag = ciag;
    }

    public String PodajCiag(){
        return ciag;
    }
    public int PodajSamogloski(){
        int liczbaSamoglosek = 0;
        for(int i=0;i<ciag.length();i++){
            for(int j=0;j<samogloski.length();j++){
                if(ciag.charAt(i) == samogloski.charAt(j)){
                    liczbaSamoglosek++;
                }
            }
        }
        return liczbaSamoglosek;
    }

    public int PodajSpolgloski(){
        int liczbaSpolglosek = 0;
        for(int i=0;i<ciag.length();i++){
            for(int j=0;j<spolgloski.length();j++){
                if(ciag.charAt(i) == spolgloski.charAt(j)){
                    liczbaSpolglosek++;
                }
            }
        }
        return liczbaSpolglosek;
    }

    public int PodajLiczby(){
        int liczbaLiczb = 0;
        for(int i=0;i<ciag.length();i++){
            for(int j=0;j<liczby.length();j++){
                if(ciag.charAt(i) == liczby.charAt(j)){
                    liczbaLiczb++;
                }
            }
        }
        return liczbaLiczb;
    }

    public int PodajInne(){
        int liczbaInnych = 0;
        boolean sprawdzansko;
        for(int i=0;i<ciag.length();i++){
            sprawdzansko = false;
            for(int j=0;j<liczby.length();j++){
                if(ciag.charAt(i) == liczby.charAt(j)){
                    sprawdzansko = true;
                }
            }
            if(sprawdzansko == false){
                for(int j=0;j<spolgloski.length();j++){
                    if(ciag.charAt(i) == spolgloski.charAt(j)){
                        sprawdzansko = true;
                    }
                }
            }
            if(sprawdzansko == false){
                for(int j=0;j<samogloski.length();j++){
                    if(ciag.charAt(i) == samogloski.charAt(j)){
                        sprawdzansko = true;
                    }
                }
            }
            if(sprawdzansko == false){
                liczbaInnych++;
            }
        }
        return liczbaInnych;
    }
}
package Hotel;
//ATRIBUTES
public class Habitacio {

       private String noms;      
       private int places ;
       private int plantes ;
       private boolean ocupades ; 

//CONSTRUCTORS
public Habitacio(String noms){

        this.noms= noms ;         
        this.places = (int)(Math.random() * 5) + 1;      
        this.plantes = (int)(Math.random() * 4) + 1; 
        if((int)(Math.random() * 2)  == 1)   {

            this.ocupades = true;
        }else {

           this.ocupades = false; 
        }
        
}

//METHODS
public int getPlaces(){
return places;
}

public void setPlaces(int places){

    this.places=places;
}

public int getPlantes(){
return plantes;
}

public void setPlantes(int plantes){

    this.plantes=plantes;
}

public String getNoms(){
    return noms;
}

public void setNom(String noms){

    this.noms=noms;

}
public boolean getOcupades(){
    return ocupades;
}

public void setOcupades(boolean ocupades){

    this.ocupades=ocupades;
}

@Override
public String toString(){
    return " [nom: " + noms + ", places: " + places + ", planta: " + plantes+ ", ocupada: " + ocupades + "]";
}
}



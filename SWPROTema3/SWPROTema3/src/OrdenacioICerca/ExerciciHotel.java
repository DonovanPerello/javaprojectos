package OrdenacioICerca;

public class ExerciciHotel {

    void main(){
        //nom, places i planta i  si estan ocupades.
        String[] noms = new String[20];       
        int[] places = new int[20];
        int[] plantes = new int[20];
        boolean[] ocupades = new boolean[20];    

        inicialitzarArrayshabitacions(noms, places, plantes, ocupades);
        //mostraTotaInformacioHabitacions(noms, places, plantes, ocupades);
        //DeterminadaPlanta(noms, plantes, 2);
        //DeterminadaPlace(noms, places);
        PlacesSenseOcupar(noms, places, ocupades, 4 );

    }
// Crea un mètode que inicialitzi la informació de l'hotel. Si voleu podeu utilitzar Math.random();

    public void inicialitzarArrayshabitacions(String[] noms,   int[] places,  int[] plantes, boolean[] ocupades){

        for(int i = 0; i< noms.length ; i++){
            noms[i]= "HAB-" + (i + 1);
            places[i] = (int) (Math.random() * 5) + 1;
            plantes[i] = (int) (Math.random() * 5) + 1;
            ocupades[i] = Math.random() < 0.5; 
        }
    }
 //Fes un mètode que mostri la llista de les habitacions amb tota la informació: nom, places i planta i ocupades.
    public void mostraTotaInformacioHabitacions(String[] noms,   int[] places,  int[] plantes, boolean[] ocupades){

       for (int i = 0;i< noms.length; i++){

                IO.println(noms[i] + " | " + places[i]+ " | " + plantes[i] + " | " + ocupades[i]);

            }
    }
//Crea un mètode que mostri el nom de totes les habitacions d'una determinada planta, passant la planta com a paràmetre.

    public void DeterminadaPlanta(String[] noms,  int[] plantes, int numPlanta){

       for (int i = 0;i< noms.length; i++){

        if(plantes[i] == numPlanta ){ 

                IO.println(noms[i] + " | " + plantes[i]);
                }
            }
        }

//Escriu un mètode que ens digui quantes habitacions tenim d'un determinat nombre de places i quines són.



    public void DeterminadaPlace(String[] noms, int[] places, int nPlacesBusca) {
    int contador = 0; 

    for (int i = 0; i < noms.length; i++) {
        
        if (places[i] == nPlacesBusca) {
            IO.println(noms[i] + " té " + nPlacesBusca + " places.");
            contador++;
        }
    }
    IO.println("Total de " + nPlacesBusca + " places: " + contador);
}
        

//Escriu un altre mètode que ens mostri les habitacions d'un nombre determinat de places que tenim buides. Si no n'hi ha cap ens ha d'avisar.

public void PlacesSenseOcupar(String[] noms,  int[] places, boolean[] ocupades,  int numPlaces){
    int trobades = 0;
    for(int i = 0; i< noms.length; i++){

        if(places[i] == numPlaces && ocupades[i] == false ){

            IO.println(noms[i] + "|" + places[i]);

            trobades = trobades +1;
        } 
       
    }
     if(trobades == 0){
            IO.println("Estan totes ocupades");
        }
}
  
}

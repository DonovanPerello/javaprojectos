package Hotel;


public class Hotel1 {

    private String nom;

    private Habitacio[] habitacions;

    public Hotel1(String nom){

        this.nom = nom;

        habitacions = new Habitacio[10];
        
        for(int i = 0; i< habitacions.length;i ++){
            Habitacio nova = new Habitacio( "Habitacio" + i);
            habitacions[i]=nova;
        }
    }

    public void MostraHabitacions(){

        for(int i= 0; i< habitacions.length; i++){
            IO.println(habitacions[i]);
            

        }
    }



}
public class Televisor {
 //Primero atributos

    private int volum;
    private int canal;

// Constructors
    public Televisor(){
        volum=0;
        canal=1;
    }
    public Televisor(int vol, int channel){
        volum=vol;
        canal=channel;
    }

    public Televisor(int volum){
        this.volum=volum;
    }

 //Luego Metodos

    public void incrementaVolum(){
            volum++;
    }
    public void  setCanal(int canal){
        if(canal>=0){
        this.canal=canal;
        }
    }
//getter Recupera el valor de l'atribut

    public int getCanal(){
        // NUNCA PONER UN PRINTLN, NUNCA IMPRIME

        return canal;
    }   
}

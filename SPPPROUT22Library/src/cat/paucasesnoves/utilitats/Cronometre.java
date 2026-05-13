package cat.paucasesnoves.utilitats;

public class Cronometre {
 private long inici;
    private long fi;
    private boolean enMarxa;

    /**
     * Inicialitza el cronòmetre
     */
    public Cronometre() {
        inici = 0;
        fi = 0;
        enMarxa = false;
    }

    //Guarda l'instant de temps inicial
    public void start() {
        if (!enMarxa) {
            inici = System.nanoTime();//.currentTimeMillis();
            enMarxa = true;
        }
    }

    //Guarada l'estat de temps final
    public void stop() {
        if (enMarxa) {
            fi = System.nanoTime();//.currentTimeMillis();
            enMarxa = false;
        }
    }

    //Calcula la diferència de temps, en nanosegons.
    public long temps() {
        return fi - inici;
    }

}

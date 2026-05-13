package institut;
import java.time.Duration;
import java.time.Instant;
// Fes una classe Cronometre que permeti calcular intervals de temps. Ha de tenir un mètode per posar el cronòmetre en marxa, 
// un per aturar-lo i un altre que torni el temps, la diferència que hi ha entre que s’ha posat en marxa i que s’ha aturat.
// Utilitza Instant per saber quan es posa en marxa o s’atura el cronometre i Duration per saber quants nanosegons ha cronometrat.
public class Cronometre {

    private Instant inici;
    private Instant fi;

    public void iniciar(){
        this.inici = Instant.now();
        this.fi = null;

    }

    public void aturar(){
        this.fi = Instant.now();
    }

    public Duration getTemps(){
        if(inici == null || fi == null){
            return Duration.ZERO;
        }

        return Duration.between(inici, fi);
    }





}

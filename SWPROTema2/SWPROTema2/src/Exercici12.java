/* Exercici12cici 5 afegeix el codi necessari per calcular l'IRPF. 

Suposa que si el salari no arriba a 300€ l'IRPF=10%, si esta entre 300 i 500 és el 20% i si és major o igual és el 30%. 

Mostra al final el salari brut, l'import de l'IRPF i el salari net.

@author Donovan 
*/

void main () {

   int hores= 42;
    double preu= 7.5;
    int horesExtres = hores - 40;
    double sou;
    double IRPF;
    double ImportIRPF;

    if (hores > 40) {
       IO.println("El teu sou semanal brut es  " + ((hores * preu) + (horesExtres * preu * 2)) ); 
       sou = (hores * preu) + (horesExtres * preu * 2);
        
    } else {
       IO.println( "El teu sou semanal brut es  " + (hores * preu) ); 

       sou = (hores * preu);
    } 

    if (sou < 300) {

        IRPF = 0.1;
    } else if (sou >= 300 && sou <= 500) {
        
        IRPF = 0.2;
    } else {

        IRPF = 0.3;
    }
    ImportIRPF = sou * IRPF; 
    IO.println("El import de IRPF es: " + ImportIRPF + " y el salari Net: " + (sou - ImportIRPF));
    
    
}

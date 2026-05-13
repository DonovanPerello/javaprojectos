/**A partir d'un sencer que representa les hores treballades per un/a treballador/a 
 * i un real que representa el preu en € de cada hora, 
 * calcula que ha de cobrar aquesta persona en acabar la setmana. 
 * Suposa que totes les hores extra, les que passen de 40, doblen el preu. 
 * 
 * @Author Donovan
 *  */

void main() {
    int hores= 42;
    double preu= 7.5;
    int horesExtres = hores - 40;

    if (hores > 40) {
       IO.println("El teu sou semanal es  " + ((hores * preu) + (horesExtres * preu * 2)) + " Euros" ); 
        
    } else {
       IO.println( "El teu sou semanal es  " + (hores * preu) + " Euros" ); 
    }
    
}
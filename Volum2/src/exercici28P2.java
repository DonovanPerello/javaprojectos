

/**
 * 25. Feis un programa que llegeixi números sencers del teclat fins que
 * l'usuari pitgi un zero. Calculau la mitjana d'aquests números (sense incloure
 * el 0 final).
 *
 * @author Joan Pons i Tugores
 */


void main() throws IOException {
    int num = 0;
    int comptador = 0;
    int suma = 0;
    double mitjana;
    int nota;

    do {
        String cadena = IO.readln("Entri una nota (0 per acabar): ");
        nota = Integer.parseInt(cadena);
        comptador++;
        suma = suma + nota;
    } while (nota != 0);
    //Hem d'eliminar el zero del compte
    comptador--;
    mitjana = (double) suma / (double) comptador;
    IO.println("Mitjana=" + mitjana);

    
}


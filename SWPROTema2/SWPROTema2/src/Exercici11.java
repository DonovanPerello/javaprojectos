/*Repeteix l'exercici anterior amb un switch.
 * 
 * @Author Donovan
*/

void main () {
    int nota = 6;
    switch (nota) {

        case 1, 2, 3, 4: {

            System.out.println("Insuficient");
            break;
        }

        case 5: {
            IO.println( "Suficient");
            break;
        }

        case 6: {
            IO.println( "Bé");
            break;
        }

        case 7, 8: {
            IO.println( "Notable");
            break;
        }
        case 9, 10: {
            IO.println( "Excel.lent");
            break;
        }
    }

 
}

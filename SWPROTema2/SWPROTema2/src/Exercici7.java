/*(Opcional) Repeteix l'exercici anterior amb tres sencers.
 * 
 * @Author Donovan
 * 
 */
void main () {
    int a = 5;
    int b = 0;
    int c = 5;

    if (a > b & b >= c){
        IO.println("El major es a");

    } else if(b > a & a >= c) {
        IO.println("El major es b");

    } else if(c > b & b >= a) {
        IO.println("El major es c");

    } else if (a == b & b > c) {
        IO.println("El major es a y b");

    } else if(b == c & c > a) {
        IO.println("El major es c y b");

    } else if(c == a & a > b) {
        IO.println("El major es c y a");
        
    } else {
        IO.println("Son iguals");
    }
}
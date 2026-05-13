/*Donats tres números, a, b i c ordena-los de forma que al final a<=b<=c.
 * 
 * @Author Donovan
*/
void main() {

    int a = 0;
    int b = 3;
    int c = 1;
    
    int temp;
    
    if (a > b) {
        temp = a;
        a = b;
        b = temp;
    }

    if (b > c) {
        temp = b;
        b = c;
        c = temp;
    }
    

    IO.println("Despres: a=" + a + ", b=" + b + ", c=" + c);
}
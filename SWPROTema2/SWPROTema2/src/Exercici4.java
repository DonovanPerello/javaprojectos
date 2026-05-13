/**Intercanvia els valors de dues variables del mateix tipus. 
 * Mostra-les per pantalla abans i després de fer el canvi. 
 * Per exemple si a=2 i b=3, al final a=3 i b=2.
 * 
 * @Author Donovan
 * */
void main(){
    int a = 2;
    int b = 3;

    int c;

    IO.println("Abans: a = " + a + " b = " + b);

    c = b; 
    b = a; 
    a = c;

    IO.println("Despres: a = " + a + " b = " + b);







}

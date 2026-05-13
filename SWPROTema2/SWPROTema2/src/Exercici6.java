/*Donats dos sencers a i b, mostra quin és el major de dos sencers, 
 * 
 * @Author Donovan
 * 
*/
void main () {
    int a = 4;
    int b = 2;

    if (a > b){
        IO.println("El major es a");
    } else if(b > a) {
        IO.println("El major es b");
    }else {
        IO.println("Son iguals");
    }
}

/* 
 * Repeteix l'exercici 14 de forma que mostri només els nombres parells.
 * @Author Donovan
 */


 void main(){
    int inici = 1;
    int fi = 22;

    

while (inici <= fi) {
    
    if (inici % 2==0) {
        IO.println(inici);    
    }
    inici = inici +1;
 }
}
/*Donat un temps expressat en segons, descomposa'l en hores, minuts i segons. 

1 Hora = 3600 segons i 1 minut= 60 segons. 

Per exemple 3662 ens ha de donar 1 hora, 1 minut i 2 segons.

@Author Donovan

*/

void main () {

    int temps = 3662;
    int sobrant;
    int hores;  
    int min;

    hores = temps / 3600;
    sobrant = temps  % 3600;
    min = sobrant / 60;
    sobrant = sobrant % 60;
    
    IO.println(hores + ":" + min + ":" + sobrant );

}
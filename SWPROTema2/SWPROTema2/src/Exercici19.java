/*Crea un programa que recorri els 10 primers sencers. 
Si el nombre és 5 ha d'executar una instrucció continue, 
si no l'ha de mostrar per pantalla. 
Repeteix-lo amb un break. 
Quina és la diferència? 
Mostra explicació per pantalla. */
void main(){

    int inici= 1;
    int fi = 10;
    int index;
IO.println("-----------continue----------");
for (index = inici; index <= fi; index ++){
    if (index == 5) {
        continue;
    }
    IO.println(index);
}


IO.println("----------break----------");
for (index = inici; index <= fi; index ++){
    if (index == 5) {
        break;
    }
    IO.println(index);
}
IO.println("La diferencia esque el continue pega un salto, es decir, que se salta el 5 y el break cuando llega al 5 se para la instrucción");
}


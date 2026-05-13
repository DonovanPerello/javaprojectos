package volum4;

/*  Escriviu una classe que generi un valor aleatòri entre dos i quatre. Ha d'utilitzar aquest valor per crear un array de sencers d'aquesta longitud. Ha d'omplir l'array aleatòriament. 
Posteriorment l'ha d'ordenar utilitzant l'algorisme de l'exercici 13. Per ordenar-lo vos heu d'assegurar que l'array tengui tres posicions, sinó l'algorisme no funciona. 
Si es pot ordenar(per que tengui tres posicions) ha de mostrar per pantalla l'array ordenat. Si no, ha d'avisar que no ho pot ordenar.*/
public class Exercici36 {
    
    void main(){
    int[]v1;

    int Max = 4;
    int Min= 2;
    int longitud = Min + (int)(Math.random() * (Max - Min + 1));
    v1 = new int[longitud];
    int temp;
  
    if (v1.length != 3){

        IO.println("solo puedo escribir si hay 3 caracteres ");

    } else{
            for (int i= 0; i < v1.length; i++){

                int random = 0 + (int)(Math.random() * (100 - 0 + 1));
                
                v1[i] = random;

                }

             if (v1[0] > v1[1]) {

                temp = v1[0];
                v1[0] = v1[1];
                v1[1] = temp;
             }  

             if(v1[1] > v1[2]){

                temp = v1[1];
                v1[1] = v1[2];
                v1[2] = temp;
             }
             IO.println("v1[0]= "+ v1[0] + " v1[1]= "+ v1[1]+ " v1[2]= "+ v1[2]);
    }
    


    }
    

   
}

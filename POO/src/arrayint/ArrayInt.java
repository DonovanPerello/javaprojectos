package arrayint;

public class ArrayInt {
private int[] arrayInt;
private int posicioBuida;

    

 public ArrayInt(int longitud){
    if(longitud<=0){
        //throw new ArrayIntException("Error");
    }
    this.arrayInt = new int [longitud];
    this.posicioBuida = 0;


 
}

/** 
 * @return int[]
 */
public  int[] getArrayCompleto (){

    return arrayInt;
}
/** 
 * @return int
 */
public int getPosicioBuida() {
        return posicioBuida;
    }

    /** 
     * @return boolean
     */
    //7. Ha detenir un mètode que indiqui si l'array és plè o no. Heu de montar el mecanisme necessari per saber-ho.
public boolean ArrayCompleto(){


    if(posicioBuida >= arrayInt.length){
        return true;
    } else{
        return false;
    }
    
}

/** 
 * @param valor
 * @return boolean
 */
/*8. Ha de tenir un mètode que permeti afegir un valor positiu (rebut com a paràmetre) a l’array sempre que no sigui ple. Ha de tornar true si l’ha afegit i false en cas contrari.
*/

public boolean AfegirValor(int valor){

    
    if(posicioBuida < arrayInt.length && valor >= 0 ){
        arrayInt[posicioBuida]= valor;
        posicioBuida++;
        return true;
        
    } else{
        return false;
    }
    
}

/** 
 * @param valorBorrar
 * @return boolean
 */
//10. Afegeix un mètode que rebi un valor sencer per paràmetre i esborri la primera aparició d'aquest valor dins l'array. Ha de compactar l'array de manera que no quedin buits i l'atribut que indica la primera posició buida sigui correcte.

public boolean BorrarValor(int valorBorrar){

    for( int i = 0; i < posicioBuida; i++){

        if(arrayInt[i] == valorBorrar){

            for(int j = i; j < posicioBuida-1 ;j++){

                arrayInt[j] = arrayInt[j+1];

            }
            posicioBuida --;
            return true;
        }
    }
    return false;  
}

}


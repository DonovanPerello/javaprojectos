package OrdenacioICerca;

public class CercaBinaria{

    void main(){
        int[] array = {1, 5, 8, 10, 12, 15, 20};
        
        int paraula= CercaBinari(array, 12);

        IO.println(paraula);
     
    }

public  int CercaBinari (int[]array , int cercat){

    int inici = 0;
    int fi = array.length-1;
    int mig = -1;

    while (inici<= fi) {

        mig = (inici + fi)/2;
        if (cercat == array[mig]) {

            return mig;
            
        }else if(array[mig]>cercat){
            fi = mig -1;
        } else{
            inici = mig +1;
        }
        
    }
    return -1;
}

}
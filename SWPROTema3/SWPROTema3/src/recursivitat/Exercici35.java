package recursivitat;
/*

    Crea un fitxer amb un mètode recursiu que calculi em màxim comú divisor de dos números utilitzant l'algorisme d'euclides: El mcd de m i n s'obté seguint el següent algorisme

Funció mcd (Sencer m, Sencer n)

Enter residu ← m mod n

Si residu = 0 llavors

torna n

Sino

torna mcd(n, r)

Fsi

Ffunció 

@Author Donovan
*/
public class Exercici35 {
    void main(){

        IO.println(mcd(12, 18));
    }

    public int mcd(int a, int n){


        int residu= a % n;

        if (residu == 0){
            return n;
        } else {


            return mcd(a, residu);
        }

        
    }
}

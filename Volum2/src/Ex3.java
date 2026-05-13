public class Ex3 {
    void main (){
    int a = 0;
int b = 1;
int c; // Auxiliar para la suma

System.out.print(a + ", " + b); // Imprimimos los dos primeros a mano (0, 1)

// Queremos mostrar los siguientes 8 números
for(int i = 0; i < 10; i++){
    c = a + b;           // 1. Calculamos el nuevo
    System.out.print(", " + c); 
    
    // 2. DESPLAZAMOS LA VENTANA (El orden importa)
    a = b; // El viejo 'b' ahora es el 'a' (el de más atrás)
    b = c; // El nuevo 'c' ahora es el 'b' (el actual)
}
    }
}

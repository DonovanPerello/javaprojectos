
void main(){
    int a = 30;
        int b = 10;
        int c = 20;
        IO.println(a+ " "+ b + " "+ c);
        ordenar(a, b, c);
        
}

public void ordenar( int a, int b, int c){

    int z = 0;
    // a = 8
    //b = 10
    //c = 5
    boolean huboCambios ;
do{
     huboCambios = false;
    
if(a > b){
        z = a;
        a = b;
        b = z;
    huboCambios = true;
    }
    if(b > c){
        z = b;
        b = c;
        c = z;
        huboCambios = true;
    }
}while( huboCambios == true);
    
   
        IO.println(a+ " "+ b + " "+ c);

}

void main(){

    simpatic(nom());
    
}

public String nom(){

   String nom = IO.readln("Como te llamas?: ");

   return nom;
}

public void simpatic( String saluda){

    IO.println("Hola " + saluda + " !!!!!!!!!");
}
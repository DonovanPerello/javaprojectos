package institut;
/*Crea la classe Institut amb main. Dins el main crea un objecte de les classes Cicle i Modul. 
Prova els seus mètodes.

@Author Donovan
*/
public class Institut {

    void main(){

        Modul Programacio = new Modul("Programacio", 0);
    
        Programacio.setHoresSetmanals(7);

        Cicle GrauSuperior = new Cicle("Multiplataforma", 22);

        Modul2 LLM = new Modul2("Lenguaje de Marcas", 5, GrauSuperior);

        IO.println(LLM);

        

    }

}

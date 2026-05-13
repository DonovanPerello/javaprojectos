//Escriu una funció que prengui un array de noms i retorni un nou array que contingui només els noms que
//comencen amb la lletra "A".



    let palabras = ["anzana", "anana","Pera", "Sandia" , "Manzana"];


    function nuevoArray(palabras, letra){
        
       const letramin= letra.toLowerCase();
        const nuevoArrays=[ ]
        for(const palabaBuscar of palabras ){
                    
            if(palabaBuscar.toLowerCase().startsWith(letramin) === true){

                nuevoArrays.push(palabaBuscar);
            }

            
        }
        return nuevoArrays;

    }

    console.log(nuevoArray(palabras,"a"));
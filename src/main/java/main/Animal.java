package main;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor // Este genera un constructor vacío
@AllArgsConstructor //Este crea un constructor con de la clase que le estás aplicando con todos los atributos
public class Animal {

    protected String nombre;

    /*
    //constructor  - super clase -
    //Un Constructor por default es un constructor vacío
    //Al agregar en el paso el @AllArgs..... este constructor no hace falta
    public Animal(String nombre){
        this.nombre = nombre;
    }
    */

    //Método
    public void mensaje(){
        System.out.println("animal");
    }
}

package main;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Gato extends Animal{
    private String miau;

    //constructor
    public Gato(String nombre, String miau){
        super(nombre);
        this.miau=miau;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "miau='" + miau + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}

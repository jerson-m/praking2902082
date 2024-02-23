package org.ficha2902082.maven.parking.jerson.entities;

public class Cupo {

    public char letra;
    public Double largo;
    public Double ancho;

    //Todo developer debe tener en cuenta el constructor.
    //constructor de clase: Es un metodo especial en una entidad. Un constructor se ejecuta automaticamente cuando se crea un objeto (instanciar)
    //Constructor por defecto
    public Cupo() {
    }

    //Constructor con parametros
    public Cupo(char letra, Double largo, Double ancho) {
        this.letra = letra;
        this.largo = largo;
        this.ancho = ancho;
    } 


}

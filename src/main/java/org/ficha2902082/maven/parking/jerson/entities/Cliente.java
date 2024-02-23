package org.ficha2902082.maven.parking.jerson.entities;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    public String nombre;
    public String apellidos;
    public TipoDocumento tipoDocumento;
    public Long numeroDocumento;
    public Long celular;
    public List <Carro> misCarros;

    public Cliente(String nombre, String apellidos, TipoDocumento tipoDocumento, Long numeroDocumento, Long celular) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.celular = celular;
        this.misCarros = new ArrayList<Carro>();
    }

    //metodo1: añadir carro al cliente
    //definir metodo:
    // -modificador acceso
    // -tipo de dato de retorno
    // -nombre del metodo
    // parametros(entradas, inputs):
    //     1. tipo de dato del parametro
    //     2. nombre del parametro
    public void addCar(Carro c){
        this.misCarros.add(c);
    }
    //sobre carga de metodos
    //en una clase se permite metodos
    //con el mismo nombre
    //pero con diferente firma

    //sobrecarga del metodo addCar
    public void addCar(String placa, TipoVehiculo tipoVehiculo){
        //construir(instanciar)
        Carro c= new Carro();
        c.placa=placa;
        c.tipoVehiculo=tipoVehiculo;
        this.misCarros.add(c);
    }
}

package org.ficha2902082.maven.parking.jerson;
//importar dependencias

import org.ficha2902082.maven.parking.jerson.entities.Cupo;
import org.ficha2902082.maven.parking.jerson.entities.TipoDocumento;
import org.ficha2902082.maven.parking.jerson.entities.TipoVehiculo;
import org.ficha2902082.maven.parking.jerson.entities.Carro;
import org.ficha2902082.maven.parking.jerson.entities.Cliente;
import org.ficha2902082.maven.parking.jerson.entities.Registro;

import java.util.List;
import java.util.ArrayList;
import java.time.*;

public class Main {
    public static void main(String[] args) {
        //crear dos cupos
        //instanciar dos cupos:
        Cupo cupito1 = new Cupo();
        cupito1.ancho = 1.0;
        cupito1.largo = 4.5;
        cupito1.letra ='A';
        Cupo cupito2 = new Cupo('B', 5.0,2.5);

        //instanciar dos carros:
        Carro carrito1 = new Carro("ASJ 123", TipoVehiculo.MOTO);
        Carro carrito2 = new Carro("SGA 894",TipoVehiculo.CAMION);

        //instanciar dos clientes:
        Cliente clientesito1 = new Cliente("Jerson", "Rincon", TipoDocumento.CC, 1032456987L, 3138636954L);
        Cliente clientesito2 = new Cliente("Sergio", "Quiroga", TipoDocumento.CE, 1032654458L, 3125024778L);

        //vincular
        clientesito1.addCar(carrito1);
        clientesito1.addCar(carrito2);
        clientesito2.addCar("AMG 133", TipoVehiculo.CAMIONETA);

        //Declarar una lista de registros
        List<Registro> misRegistros = new ArrayList<>();

        //Instacnciar dos registros E/S
        Registro registro1 = new Registro(
            LocalDate.of(2024 , Month.JANUARY , 23) , 
            LocalTime.of(15 , 30 , 34),
            LocalDate.of(2024 , Month.FEBRUARY , 1),
            LocalTime.of(6 , 30 , 23),
            4500.00,
            clientesito1.misCarros.get(0),
            cupito1
        );

        Registro registro2 = new Registro(
            LocalDate.of(2024 , Month.AUGUST , 6) , 
            LocalTime.of(23 , 23 , 10),
            LocalDate.of(2024 , Month.DECEMBER , 1),
            LocalTime.of(00, 59 , 59),
            450000.00,
            clientesito1.misCarros.get(0),
            cupito2
        );

        //vincular los registros a la lista
        //de registros
        misRegistros.add(registro1);

        //recorrer la lista de registro
        for( Registro c :misRegistros ){
            System.out.println("Placa: "+ c.carro.placa + " | " + "Cupo: " + c.cupo.letra + " | " + "Valor: " + c.valor + " | " + "Fecha y hora de incio: " + c.fechaInicio.toString() + "|");
        }



    }
} 
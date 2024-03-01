package org.ficha2902082.maven.parking.jerson;
//importar dependencias

import org.ficha2902082.maven.parking.jerson.entities.Cupo;
import org.ficha2902082.maven.parking.jerson.entities.TipoDocumento;
import org.ficha2902082.maven.parking.jerson.entities.TipoVehiculo;
import org.ficha2902082.maven.parking.jerson.entities.Carro;
import org.ficha2902082.maven.parking.jerson.entities.Cliente;
import org.ficha2902082.maven.parking.jerson.entities.Registro;
import org.ficha2902082.maven.parking.jerson.entities.Empleado;

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
        Cupo cupito3 = new Cupo('C', 6.0, 3.5);
        Cupo cupito4 = new Cupo('D', 5.0, 4.0);

        //instanciar dos carros:
        Carro carrito1 = new Carro("ASJ 123", TipoVehiculo.MOTO);
        Carro carrito2 = new Carro("SGA 894",TipoVehiculo.CAMION);
        Carro carrito3 = new Carro("JKL 674", TipoVehiculo.TAXI);

        //instanciar dos clientes:
        Cliente clientesito1 = new Cliente("Jerson", "Rincon", TipoDocumento.CC, 1032456987L, 3138636954L);
        Cliente clientesito2 = new Cliente("Sergio", "Quiroga", TipoDocumento.CE, 1032654458L, 3125024778L);
        Cliente clientesito3 = new Cliente("Sergio", "Triana", TipoDocumento.CE, 1032458789L, 3120458778L);
        //vincular
        clientesito1.addCar(carrito1);
        clientesito1.addCar(carrito2);
        clientesito2.addCar("AMG 133", TipoVehiculo.CAMIONETA);
        clientesito3.addCar(carrito3);

        Empleado empleado1 = new Empleado("juan palacios", 1L);
        Empleado empleado2 = new Empleado("Serigo Quiroga", 2L);
        Empleado empleado3 = new Empleado("Miguel Zambrano", 3L);

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
            cupito2,
            empleado3

        );

        LocalDate fi1 = LocalDate.of(2024, Month.AUGUST, 6);
        LocalTime hi1 = LocalTime.of(23,23,10);
        LocalDate ff1 = LocalDate.of(2024, Month.DECEMBER, 1);
        LocalTime hf2 = LocalTime.of(00, 59, 59);
        Double vr2 = 450000.00;

        Registro registro2 = new Registro(
            fi1, 
            hi1,
            ff1,
            hf2,
            vr2,
            clientesito3.misCarros.get(0),
            cupito3,
            empleado2
        );

        Registro registro3 = new Registro(
            LocalDate.of(2024 , Month.AUGUST , 20) , 
            LocalTime.of(20 , 50 , 10),
            LocalDate.of(2025 , Month.FEBRUARY , 1),
            LocalTime.of(16 , 30 , 23),
            40000.00,
            clientesito1.misCarros.get(0),
            cupito1,
            empleado3

        );

        Registro registro4 = new Registro(
            LocalDate.of(2025 , Month.OCTOBER , 20) , 
            LocalTime.of(00 , 30 , 00),
            LocalDate.of(2026 , Month.FEBRUARY , 1),
            LocalTime.of(6 , 30 , 23),
            300000.00,
            clientesito2.misCarros.get(0),
            cupito3,
            empleado2

        );

        Registro registro5 = new Registro(
            LocalDate.of(2023 , Month.MAY , 15) , 
            LocalTime.of(18 , 38 , 20),
            LocalDate.of(2024 , Month.FEBRUARY , 1),
            LocalTime.of(15 , 40 , 00),
            50000.00,
            clientesito3.misCarros.get(0),
            cupito1,
            empleado1

        );

       

        //vincular los registros a la lista
        //de registros
        misRegistros.add(registro1);
        misRegistros.add(registro2);
        misRegistros.add(registro3);
        misRegistros.add(registro4);
        misRegistros.add(registro5);


        //recorrer la lista de registro
        for( Registro c :misRegistros ){
            System.out.println("Placa: "+ c.carro.placa + " | Cupo: " + c.cupo.letra + " | Valor: " + c.valor + " | Fecha de incio: " + c.fechaInicio.toString() + " | Hora inicio: " + c.horaInicio.toString() + " | Fecha fin: " + c.fechaFin + " | Hora fin: " + c.horaFin.toString() + " | codigo empleado: "+c.empleado.codigo);
        }



    }
} 
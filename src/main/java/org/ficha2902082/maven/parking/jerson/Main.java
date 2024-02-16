package org.ficha2902082.maven.parking.jerson;
//importar dependencias
import org.ficha2902082.maven.parking.jerson.entities.Carro;
import org.ficha2902082.maven.parking.jerson.entities.Cliente;
import org.ficha2902082.maven.parking.jerson.entities.TipoVehiculo;
import org.ficha2902082.maven.parking.jerson.entities.TipoDocumento;

public class Main {
    public static void main(String[] args) {
        //crear instancias
        //de la clase carro
        Carro carrito1 = new Carro();
        carrito1.placa = "ASB 345";
        carrito1.tipoVehiculo = TipoVehiculo.BUS;

        Carro carrito2 =new Carro();
        carrito2.placa ="PWQ 875";
        carrito2.tipoVehiculo = TipoVehiculo.TAXI;

        Carro carrito3 =new Carro();
        carrito3.placa ="ASZ 612";
        carrito3.tipoVehiculo= TipoVehiculo.MOTO;

        Cliente clientecito = new Cliente();
        clientecito.nombre="juan";
        clientecito.apellidos="rojas";
        clientecito.tipoDocumento=TipoDocumento.CC;
        clientecito.numeroDocumento=1031648576L;
        clientecito.celular=3123456784L;

        //añadir carros al cliente
        //invocar, llamar o ejecutar el metodo addCar
        clientecito.addCar(carrito2);
        clientecito.addCar(carrito3);
        clientecito.addCar("ASB 345", TipoVehiculo.TAXI);

       
        System.out.println("Cliente:"+ clientecito.tipoDocumento);
        System.out.println("documento:" + clientecito.numeroDocumento);
        System.out.println("Cliente:"+clientecito.nombre);
        System.out.println("vehiculos:");
        for(Carro c: clientecito.misCarros){
            System.out.println("placa:"+c.placa);
            System.out.println("tipo:"+c.tipoVehiculo);
            System.out.println("_______");
        }

    }
}
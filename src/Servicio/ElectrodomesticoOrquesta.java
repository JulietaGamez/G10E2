package Servicio;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;
import java.util.Scanner;

public class ElectrodomesticoOrquesta extends ServicioElectrodomestico {

    Electrodomestico electro = new Electrodomestico();
    ArrayList<Electrodomestico> listaElectros = new ArrayList();
    Scanner leer = new Scanner(System.in);
    ServicioLavadora sL = new ServicioLavadora();
    Lavadora l = new Lavadora();

    ServicioTelevisor sT = new ServicioTelevisor();
    Televisor tv = new Televisor();

    public ArrayList<Electrodomestico>  crearLista(ArrayList<Electrodomestico>listaElectros) {
        String rta = "";

        for (int i = 0; i < 4; i++) {
            do {
                System.out.println("Que electrodomestico desea crear? Lavadora o Tv");
                rta = leer.next();

                if (rta.equalsIgnoreCase("lavadora")) {
                    l = sL.crearLavadora();
                    listaElectros.add(l);
                    break;
                } else if (rta.equalsIgnoreCase("tv")) {
                    tv = sT.crearTelevisor();
                    listaElectros.add(tv);
                    break;
                } else {
                    System.out.println("No tenemos el electrodomestico ingresado");

                }
            } while (!rta.equalsIgnoreCase("Lavadora") || !rta.equalsIgnoreCase("tv"));
        }
        return listaElectros;
        
    }

    public void mostrarYsumarLista(ArrayList<Electrodomestico> listaElectros) {
        int sumaLa = 0;
        int sumaTv = 0;
        int suma = 0;
        for (Electrodomestico Electro : listaElectros) {
            System.out.println(Electro);
            if (Electro instanceof Lavadora) {
                sumaLa += Electro.getPrecio();
            } else if (Electro instanceof Televisor) {
                sumaTv += Electro.getPrecio();
            }
            suma += Electro.getPrecio();
        }
        System.out.println("La suma de los precios es ");
        System.out.println("La suma de los lavarropas es " + sumaLa
                + "\nLa suma de los televisores es " + sumaTv
                + "\nLa suma de todo es " + suma);

    }
}

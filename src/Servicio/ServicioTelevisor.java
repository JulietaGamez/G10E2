/*
Se debe crear también una subclase llamada Televisor con los siguientes
atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de los
atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
 */
package Servicio;

import Entidades.Televisor;
import java.util.Scanner;



public class ServicioTelevisor extends ServicioElectrodomestico {
    Scanner leer= new Scanner(System.in);
    public Televisor crearTelevisor(){
        System.out.println("---TELEVISOR---");
        Televisor tv= new Televisor();
        super.crearElectrodomestico(tv);
        System.out.println("Indique la resolucion");
        tv.setResolucion(leer.nextInt());
        System.out.println("Indique si tiene sintonizador o no. SI/NO");
        String rta= leer.next();
        if (rta.equalsIgnoreCase("si")) {
            tv.setSintonizadorTDT(true);
        }else{
            tv.setSintonizadorTDT(false);
        }
        tv.setPrecio(precioFinal(tv));
        return tv;
    }
    public int precioFinal(Televisor tv){
        super.precioFinal(tv.getConsumoEnergetico(), tv.getPeso());
        if (tv.getResolucion()>=40) {
            int aumento=(int) (tv.getPrecio()*0.3);
            tv.setPrecio(tv.getPrecio()+ aumento);
        }
        if (tv.isSintonizadorTDT()) {
            tv.setPrecio(tv.getPrecio()+500);
        }
        return tv.getPrecio();
    }
}

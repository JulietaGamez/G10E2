/*
Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método crearLavadora (): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500,
si la carga es menor o igual, no se incrementará el precio. Este método debe
llamar al método padre y añadir el código necesario. Recuerda que las
condiciones que hemos visto en la clase Electrodoméstico también deben
afectar al precio.
 */
package Servicio;

import Entidades.Lavadora;
import java.util.Scanner;

public class ServicioLavadora extends ServicioElectrodomestico {

    Scanner leer = new Scanner(System.in);

    public Lavadora crearLavadora() {
           System.out.println("---LAVADORA---");
        Lavadora lavadora = new Lavadora();
        super.crearElectrodomestico(lavadora);//saque el super y le envie por parametro el objeto lavadora

        System.out.println("Ingrese la carga de la lavadora");
        lavadora.setCarga(leer.nextInt());
        lavadora.setPrecio(precioFinal(lavadora));
        return lavadora;
    }


    public Integer precioFinal(Lavadora lavadora) {
        super.precioFinal(lavadora.getConsumoEnergetico(), lavadora.getPeso());
        if (lavadora.getCarga() >= 30) {
            lavadora.setPrecio(lavadora.getPrecio() + 500);
        }
        return lavadora.getPrecio();
    }

}

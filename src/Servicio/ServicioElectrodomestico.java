/*
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra
es correcta, sino es correcta usara la letra F por defecto. Este método se debe
invocar al crear el objeto y no será visible.
Método comprobarColor(String color): comprueba que el color es correcto, y
si no lo es, usa el color blanco por defecto. Los colores disponibles para los
electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
está en mayúsculas o en minúsculas. Este método se invocará al crear el
objeto y no será visible.
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el
consumo. Al precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará
el valor del precio. Esta es la lista de precios:
 */
package Servicio;

import Entidades.Electrodomestico;
import java.util.Scanner;

public class ServicioElectrodomestico {
    Scanner leer= new Scanner(System.in);
   public Electrodomestico crearElectrodomestico(Electrodomestico e){
       //Electrodomestico e= new Electrodomestico();
       System.out.println("Ingrese el color");
       e.setColor(comprobarColor(leer.next()));
       System.out.println("Ingrese el consumo energetico");
       e.setConsumoEnergetico(comprobarConsumoEnergetico(leer.next()));
       System.out.println("Ingrese el peso en kg");
       e.setPeso(leer.nextInt());
       e.setPrecio(precioFinal(e.getConsumoEnergetico(),e.getPeso()));
       return e;
   } 
   public String comprobarConsumoEnergetico(String letra){
       if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("b") || letra.equalsIgnoreCase("c") || letra.equalsIgnoreCase("d") || letra.equalsIgnoreCase("e") ) {
           letra.equals(letra);
       }else {
           letra="F";
       }
       
       return letra;
   }
   public String comprobarColor(String color){
       if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul")|| color.equalsIgnoreCase("gris") ) {
           color.equals(color);
       }else{
           color="blanco";
       }
       return color;
   }
   public void mostrarElectrodomestico(Electrodomestico e){
       System.out.println("Electrodomestico "+ e.toString());
   }
   public Integer precioFinal(String letra, Integer peso ){
       Integer precioFinal=0;
       switch (letra) {
           case "a":
               precioFinal=1000;
               break;
             case "b":
               precioFinal=800;
               break;
                case "c":
               precioFinal=600;
               break;
                case "d":
               precioFinal=500;
               break;
                case "e":
               precioFinal=300;
               break;
                case "f":
               precioFinal=100;
               break;
           
       }
       if (peso>=1 & peso <=19) {
           precioFinal= precioFinal+100;
       }else if (peso>=20 & peso <=49){
            precioFinal= precioFinal+500;
       }else if (peso>=50 & peso <=79){
            precioFinal= precioFinal+800;
       }else if (peso>=80){
            precioFinal= precioFinal+1000;
       }
       return precioFinal;
   }
}

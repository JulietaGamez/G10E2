/*
A continuación se debe crear una subclase llamada Lavadora, con el atributo
carga, además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de atributos heredados. Recuerda que
debes llamar al constructor de la clase padre.
 */
package Entidades;

public class Lavadora extends Electrodomestico {
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, Integer precio, String color, String consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "---Lavadora--- " + 
                " \nCarga: " + carga 
                + "\nConsumo energetico: "+super.getConsumoEnergetico()+
                "\nColor: "+ super.getColor()+
                "\nPeso: "+ super.getPeso()+
                "\nPrecio: "+super.getPrecio();
    }

    
   

    

    
    
}

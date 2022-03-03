/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author julietagamez
 */
public class Televisor extends Electrodomestico {

    private int resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizadorTDT, Integer precio, String color, String consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public String toString() {
        return "---Televisor--- " + "\nResolucion=" + resolucion
                + "\nSintonizadorTDT=" + sintonizadorTDT
                + "\nConsumo energetico: " + super.getConsumoEnergetico()
                + "\nColor: " + super.getColor()
                + "\nPeso: " + super.getPeso()
                + "\nPrecio: " + super.getPrecio();
    }

}

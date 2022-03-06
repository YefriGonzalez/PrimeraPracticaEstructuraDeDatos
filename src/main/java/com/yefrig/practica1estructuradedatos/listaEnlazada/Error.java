
package com.yefrig.practica1estructuradedatos.listaEnlazada;

/**
 *
 * @author yefri
 */

public class Error {
    private String nombreApostador;
    private double monto;
    private int[] posicionesCaballo;

    public Error(String nombreApostador, double monto, int[] posicionesCaballo) {
        this.nombreApostador = nombreApostador;
        this.monto = monto;
        this.posicionesCaballo = posicionesCaballo;
    }

    public String getNombreApostador() {
        return nombreApostador;
    }

    public void setNombreApostador(String nombreApostador) {
        this.nombreApostador = nombreApostador;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int[] getPosicionesCaballo() {
        return posicionesCaballo;
    }

    public void setPosicionesCaballo(int[] posicionesCaballo) {
        this.posicionesCaballo = posicionesCaballo;
    }
    
}

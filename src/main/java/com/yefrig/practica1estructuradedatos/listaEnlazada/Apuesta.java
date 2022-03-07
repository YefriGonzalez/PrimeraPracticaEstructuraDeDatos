package com.yefrig.practica1estructuradedatos.listaEnlazada;

import com.yefrig.practica1estructuradedatos.frame.VentanaPrincipalJframe;

/**
 *
 * @author yefri
 */
public class Apuesta {

    private String nombreApostador;
    private double monto;
    private int[] posicionesCaballo;
    Apuesta anterior;
    Apuesta siguiente;
    private int puntos;

    public Apuesta(String nombreApostador, double monto, int[] posiciones) {
        this.nombreApostador = nombreApostador;
        this.monto = monto;
        this.posicionesCaballo = posiciones;
    }
    
    public Apuesta(String nombreApostador, double monto, int[] posiciones,int puntos) {
        this.nombreApostador = nombreApostador;
        this.monto = monto;
        this.posicionesCaballo = posiciones;
        this.puntos=puntos;
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

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public Apuesta getAnterior() {
        return anterior;
    }

    public void setAnterior(Apuesta anterior) {
        this.anterior = anterior;
    }

    public Apuesta getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Apuesta siguiente) {
        this.siguiente = siguiente;
    }
    
    public void imprimirApuestas(){
        VentanaPrincipalJframe.areaCargaTextArea.append("Apuesta: "+nombreApostador+", Monto: "+monto+", Posiciones: "+imprimirOrdenCaballos()+"\n");
        if (siguiente!=null) {
            siguiente.imprimirApuestas();
        }else {
            System.out.println("------------Fin-----------------");
        }
    }
    
    
    public String imprimirOrdenCaballos() {
        String posciones = "";
        for (int i = 0; i < posicionesCaballo.length; i++) {
            posciones += posicionesCaballo[i] + ",";
        }
        return posciones;
    }
}

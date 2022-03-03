
package com.yefrig.practica1estructuradedatos.objetos;

/**
 *
 * @author yefri
 */
public class Apuesta {
    private String nombreApostador;
    private double monto;
    private int caballo1;
    private int caballo2;
    private int caballo3;
    private int caballo4;
    private int caballo5;
    private int caballo6;
    private int caballo7;
    private int caballo8;
    private int caballo9;
    private int caballo10;

    public Apuesta(String nombreApostador, double monto, int caballo1, int caballo2, int caballo3, int caballo4, int caballo5, int caballo6, int caballo7, int caballo8, int caballo9, int caballo10) {
        this.nombreApostador = nombreApostador;
        this.monto = monto;
        this.caballo1 = caballo1;
        this.caballo2 = caballo2;
        this.caballo3 = caballo3;
        this.caballo4 = caballo4;
        this.caballo5 = caballo5;
        this.caballo6 = caballo6;
        this.caballo7 = caballo7;
        this.caballo8 = caballo8;
        this.caballo9 = caballo9;
        this.caballo10 = caballo10;
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

    public int getCaballo1() {
        return caballo1;
    }

    public void setCaballo1(int caballo1) {
        this.caballo1 = caballo1;
    }

    public int getCaballo2() {
        return caballo2;
    }

    public void setCaballo2(int caballo2) {
        this.caballo2 = caballo2;
    }

    public int getCaballo3() {
        return caballo3;
    }

    public void setCaballo3(int caballo3) {
        this.caballo3 = caballo3;
    }

    public int getCaballo4() {
        return caballo4;
    }

    public void setCaballo4(int caballo4) {
        this.caballo4 = caballo4;
    }

    public int getCaballo5() {
        return caballo5;
    }

    public void setCaballo5(int caballo5) {
        this.caballo5 = caballo5;
    }

    public int getCaballo6() {
        return caballo6;
    }

    public void setCaballo6(int caballo6) {
        this.caballo6 = caballo6;
    }

    public int getCaballo7() {
        return caballo7;
    }

    public void setCaballo7(int caballo7) {
        this.caballo7 = caballo7;
    }

    public int getCaballo8() {
        return caballo8;
    }

    public void setCaballo8(int caballo8) {
        this.caballo8 = caballo8;
    }

    public int getCaballo9() {
        return caballo9;
    }

    public void setCaballo9(int caballo9) {
        this.caballo9 = caballo9;
    }

    public int getCaballo10() {
        return caballo10;
    }

    public void setCaballo10(int caballo10) {
        this.caballo10 = caballo10;
    }
}

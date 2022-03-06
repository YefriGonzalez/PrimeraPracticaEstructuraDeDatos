/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yefrig.practica1estructuradedatos.listaEnlazada;

import com.yefrig.practica1estructuradedatos.frame.IngresoResultadosJFrame;
import static com.yefrig.practica1estructuradedatos.frame.IngresoResultadosJFrame.jComboC1;
import static com.yefrig.practica1estructuradedatos.frame.IngresoResultadosJFrame.jComboC10;
import static com.yefrig.practica1estructuradedatos.frame.IngresoResultadosJFrame.jComboC2;
import static com.yefrig.practica1estructuradedatos.frame.IngresoResultadosJFrame.jComboC3;
import static com.yefrig.practica1estructuradedatos.frame.IngresoResultadosJFrame.jComboC4;
import static com.yefrig.practica1estructuradedatos.frame.IngresoResultadosJFrame.jComboC5;
import static com.yefrig.practica1estructuradedatos.frame.IngresoResultadosJFrame.jComboC6;
import static com.yefrig.practica1estructuradedatos.frame.IngresoResultadosJFrame.jComboC7;
import static com.yefrig.practica1estructuradedatos.frame.IngresoResultadosJFrame.jComboC8;
import static com.yefrig.practica1estructuradedatos.frame.IngresoResultadosJFrame.jComboC9;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author yefri
 */
public class ListaEnlazadaDoble {

    private JTextArea texto = new JTextArea();
    private Apuesta cabeza;
    private Apuesta cola;

    public void agregarAlFinal(Apuesta Agregar) { //O(1)
        if (cabeza == null) {
            this.cabeza = Agregar;
            this.cola = Agregar;
        } else {
            cola.setSiguiente(Agregar);
            cola.getSiguiente().setAnterior(cola);
            cola = cola.getSiguiente();
        }
    }

    public Apuesta getCabeza() {
        return cabeza;
    }

    public void setCabeza(Apuesta cabeza) {
        this.cabeza = cabeza;
    }

    public Apuesta getCola() {
        return cola;
    }

    public void setCola(Apuesta cola) {
        this.cola = cola;
    }

    public void cabeza() {
        verificarApuesta(cabeza);
    }

    public void verificarApuesta(Apuesta apuesta) {
        if (apuesta != null) {
            if (verificarRepeticion(apuesta)) {
                eliminarApuesta(apuesta);//o(n)
            } else {
                verificarApuesta(apuesta.getSiguiente());//o(n)
            }
        }

    }

    public void eliminarApuesta(Apuesta eliminar) {//o(n)
        if (eliminar != cabeza && eliminar != cola) {
            if (eliminar.siguiente != null) {
                eliminar.getAnterior().setSiguiente(eliminar.getSiguiente());
                eliminar.getSiguiente().setAnterior(eliminar.getAnterior());
                Apuesta tmp = eliminar.getSiguiente();
                eliminar.setAnterior(null);
                eliminar.setSiguiente(null);
                guardarEliminadas(eliminar);
                verificarApuesta(tmp);
            } else {
                eliminar.getAnterior().setSiguiente(null);
                eliminar.setAnterior(null);
                eliminar.setSiguiente(null);
                guardarEliminadas(eliminar);
            }

        } else if (eliminar == cabeza) {
            if (eliminar.siguiente != null) {
                cabeza = eliminar.getSiguiente();
                cabeza.setAnterior(null);
                eliminar.setSiguiente(null);
                guardarEliminadas(eliminar);
                verificarApuesta(cabeza);
            } else {
                eliminar.setAnterior(null);
                eliminar.setSiguiente(null);
                guardarEliminadas(eliminar);
            }
        } else if (eliminar == cola) {
            cola = cola.getAnterior();
            cola.setSiguiente(null);
            eliminar.setAnterior(null);
            eliminar.setSiguiente(null);
            guardarEliminadas(eliminar);
        } else {
            if (eliminar.siguiente != null) {
                verificarApuesta(eliminar.siguiente);
            }
        }
    }

    public void imprimirApuestas() { //O(n)
        cabeza.imprimirApuestas();
    }

    public boolean verificarRepeticion(Apuesta actual) {//o(n)
        boolean caballo1 = false;
        boolean caballo2 = false;
        boolean caballo3 = false;
        boolean caballo4 = false;
        boolean caballo5 = false;
        boolean caballo6 = false;
        boolean caballo7 = false;
        boolean caballo8 = false;
        boolean caballo9 = false;
        boolean caballo10 = false;
        boolean repetido = false;

        for (int i = 0; i < actual.getPosicionesCaballo().length; i++) {
            switch (actual.getPosicionesCaballo()[i]) {
                case 1:
                    if (!caballo1) {
                        caballo1 = true;
                    } else {
                        return true;
                    }
                    break;

                case 2:
                    if (!caballo2) {
                        caballo2 = true;
                    } else {
                        return true;
                    }
                    break;

                case 3:
                    if (!caballo3) {
                        caballo3 = true;
                    } else {
                        return true;
                    }
                    break;

                case 4:
                    if (!caballo4) {
                        caballo4 = true;
                    } else {
                        return true;
                    }
                    break;

                case 5:
                    if (!caballo5) {
                        caballo5 = true;
                    } else {
                        return true;
                    }
                    break;
                case 6:
                    if (!caballo6) {
                        caballo6 = true;
                    } else {
                        return true;
                    }
                    break;
                case 7:
                    if (!caballo7) {
                        caballo7 = true;
                    } else {
                        return true;
                    }
                    break;
                case 8:
                    if (!caballo8) {
                        caballo8 = true;
                    } else {
                        return true;
                    }
                    break;
                case 9:
                    if (!caballo9) {
                        caballo9 = true;
                    } else {
                        return true;
                    }
                    break;
                case 10:
                    if (!caballo10) {
                        caballo10 = true;
                    } else {
                        return true;
                    }
                    break;

                default:
                    return true;
            }
        }
        return false;
    }

    public void guardarEliminadas(Apuesta eliminada) {
        try {
            String error = "Nombre: " + eliminada.getNombreApostador() + ", Monto: " + eliminada.getMonto() + ",Posiciones: " + eliminada.imprimirOrdenCaballos();
            texto.append(error + "\n");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void crearArchivoEliminados() {
        try {
            File archivo = new File("arhivoErrores.txt");
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(texto.getText());
            bw.close();
            JOptionPane.showMessageDialog(null, "Archivo de errores creado");
        } catch (IOException e) {
            System.out.println("Error al guardar  el archivo");
        }
    }

    public void calculoResultados(Apuesta apuesta) {
        int puntos=0;
        int num1 = Integer.parseInt((String) jComboC1.getSelectedItem());
        int num2 = Integer.parseInt((String) jComboC2.getSelectedItem());
        int num3 = Integer.parseInt((String) jComboC3.getSelectedItem());
        int num4 = Integer.parseInt((String) jComboC4.getSelectedItem());
        int num5 = Integer.parseInt((String) jComboC5.getSelectedItem());
        int num6 = Integer.parseInt((String) jComboC6.getSelectedItem());
        int num7 = Integer.parseInt((String) jComboC7.getSelectedItem());
        int num8 = Integer.parseInt((String) jComboC8.getSelectedItem());
        int num9 = Integer.parseInt((String) jComboC9.getSelectedItem());
        int num10 = Integer.parseInt((String) jComboC10.getSelectedItem());

        int[] arrayNumeros = {num1, num2, num3, num4, num5, num6, num7, num8, num9, num10};
        while(apuesta!=null){//O(n)
            if (num1==apuesta.getPosicionesCaballo()[0]) {
                puntos+=10;
            }
            if (num2==apuesta.getPosicionesCaballo()[1]) {
                puntos+=9;
            }
            if (num3==apuesta.getPosicionesCaballo()[2]) {
                puntos+=8;
            }
            if (num4==apuesta.getPosicionesCaballo()[3]) {
                puntos+=7;
            }
            if (num5==apuesta.getPosicionesCaballo()[4]) {
                puntos+=6;
            }
            if (num6==apuesta.getPosicionesCaballo()[5]) {
                puntos+=5;
            }
            if (num7==apuesta.getPosicionesCaballo()[6]) {
                puntos+=4;
            }
            if (num8==apuesta.getPosicionesCaballo()[7]) {
                puntos+=3;
            }
            if (num9==apuesta.getPosicionesCaballo()[8]) {
                puntos+=2;
            }
            if (num10==apuesta.getPosicionesCaballo()[9]) {
                puntos+=1;
            }
            apuesta.setPuntos(puntos);
            apuesta=apuesta.getSiguiente();
        }
    }
}

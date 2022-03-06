/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yefrig.practica1estructuradedatos.listaEnlazada;
/**
 *
 * @author yefri
 */
public class ListaEnlazadaDoble {

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
        if (apuesta!=null) {
            if (verificarRepeticion(apuesta)) {
                eliminarApuesta(apuesta);//o(n)
            } else {
                verificarApuesta(apuesta.getSiguiente());//o(n)
            }
        }

    }

    public void eliminarApuesta(Apuesta eliminar) {//o(n)
        if (eliminar!=cabeza && eliminar!=cola) {
            if (eliminar.siguiente!=null) {
                eliminar.getAnterior().setSiguiente(eliminar.getSiguiente());
                eliminar.getSiguiente().setAnterior(eliminar.getAnterior());
                Apuesta tmp=eliminar.getSiguiente();
                eliminar.setAnterior(null);
                eliminar.setSiguiente(null);
                System.out.println("Eliminado: "+eliminar.getNombreApostador());
                verificarApuesta(tmp);
            }else {
                eliminar.getAnterior().setSiguiente(null);
                eliminar.setAnterior(null);
                eliminar.setSiguiente(null);
                System.out.println("Eliminado: "+eliminar.getNombreApostador());
            }
 
        }else if (eliminar==cabeza) {
            if (eliminar.siguiente!=null) {
                cabeza=eliminar.getSiguiente();
                cabeza.setAnterior(null);
                eliminar.setSiguiente(null);
                System.out.println("Eliminado: "+eliminar.getNombreApostador());
                verificarApuesta(cabeza);
            } else {
                eliminar.setAnterior(null);
                eliminar.setSiguiente(null);
                System.out.println("Eliminado: "+eliminar.getNombreApostador());
            }
        }else if (eliminar==cola) {
            cola=cola.getAnterior();
            cola.setSiguiente(null);
            eliminar.setAnterior(null);
            eliminar.setSiguiente(null);
            System.out.println("Eliminado: "+eliminar.getNombreApostador());
        }else{
            if (eliminar.siguiente!=null) {
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
        boolean repetido=false;

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

}

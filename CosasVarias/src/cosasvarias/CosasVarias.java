/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cosasvarias;

import enumeracion.Dias;

/**
 *
 * @author Alumno Mañana
 */
public class CosasVarias {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        imprimirDia(Dias.LUNES);
        
    }
    
    public static void imprimirDia(Dias ey){
        switch (ey) {
            case LUNES:
                System.out.println("PRIMER DIA DE LA SEMANA");
                break;
            case MARTES:
                System.out.println("SEGUNDO DIA DE LA SEMANA");
                break;
            case MIERCOLES:
                System.out.println("TERCER DIA DE LA SEMANA");
                break;
            case JUEVES:
                System.out.println("CUARTO DIA DE LA SEMANA");
                break;
            case VIERNES:
                System.out.println("QUINTO DIA DE LA SEMANA");
                break;
            case SABADO:
                System.out.println("SEXTO DIA DE LA SEMANA");
                break;
            case DOMINGO:
                System.out.println("SEPTIMO DIA DE LA SEMANA");
                break;
            default:
                throw new AssertionError();
        }
    }
    
}

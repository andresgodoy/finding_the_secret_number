/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findingthenumber;

import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class RangoNum {

    private int cantidad;

    public RangoNum(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int[] llenaNumeros() {
        int serie[] = new int[cantidad];
        int contenido = 1;
        for (int i = 0; i <= serie.length; i++) {
            serie[i] = contenido;
            contenido++;
        }
        return serie;
    }

    public void adivinar() {
        int numeros[] = new int[cantidad];
        int n = numeros.length, inf = 0, sup = n - 1;
        int centro;
        int contenido = 1;
        int contador = 1;
        String es;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = contenido;
            contenido++;
        }
        while (inf <= sup) {
            centro = (inf + sup) / 2;
            es = JOptionPane.showInputDialog("¿Tu número es el " + numeros[centro] + "?\n Es correcto: C \n No, es Mayor: M \n No, es Menor: m");
            while (!es.contains("C") && !es.contains("c") && !es.contains("M") && !es.contains("m")) {

                JOptionPane.showMessageDialog(null, "Solo podés elegir entre C (Correcto), M (Mayor) y m (Menor)");
                es = JOptionPane.showInputDialog("¿Tu número es el " + numeros[centro] + "?\n Es correcto: C \n No, es Mayor: M \n No, es Menor: m");

            }
            if (es.contains("C") || es.contains("c")) {
                JOptionPane.showMessageDialog(null, "¡Excelente!\n Lo adivine en tan solo: " + contador + " intentos");
                break;
            } else if (es.contains("M")) {

                inf = centro + 1;
            } else if (es.contains("m")) {

                sup = centro - 1;
            }
            contador++;
        }

    }
}

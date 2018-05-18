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
public class NumRandom {
    private int tope;
    private int valor;

    public NumRandom() {
    }

    public NumRandom(int tope) {
        this.tope = tope;
        this.valor = (int) (Math.random() * tope) + 1;
    }

    public int getTope() {
        return tope;
    }

    public int getValor() {
        return valor;
    }

    public void adivinar() {
        int contador = 1;
        int intento = Integer.parseInt(JOptionPane.showInputDialog("Pienso en un número entre 1 y " + this.tope + "..."));
        while (intento != this.getValor()) {
            if (intento >= this.getValor()) {
                contador++;
                intento = Integer.parseInt(JOptionPane.showInputDialog("No, el número que pienso es MENOR. Intentalo nuevamente:"));
            } else if (intento <= this.getValor()) {
                contador++;
                intento = Integer.parseInt(JOptionPane.showInputDialog("No, el número que pienso es MAYOR. Intentalo nuevamente:"));
            }
        }

        JOptionPane.showMessageDialog(null, "¡Acertaste!\n -El número era: " + this.valor + ".\n -Y ocupaste: " + contador + " intentos.");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findingthenumber;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class FindingTheNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 1;
        String denuevo;
        do {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a Adivina número.\n -Si querés ser el adivino: 1\n -Si querés ser adivinado: 2"));
            while (opcion != 1 && opcion != 2) {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Tenés que presionar 1 o 2.\n -Si querés ser el adivino: 1\n -Si querés ser adivinado: 2"));
            }

            JOptionPane.showMessageDialog(null, "¡Comencemos!");

            if (opcion == 1) {
                int cuantos = Integer.parseInt(JOptionPane.showInputDialog("¿Qué rango numérico desea adivinar?"));
                NumRandom numero = new NumRandom(cuantos);
                numero.adivinar();

            } else if (opcion == 2) {
                int numeros = Integer.parseInt(JOptionPane.showInputDialog("Elegí el límite superior del rango que contenga el número que pensaste que quieras:"));
                RangoNum serie = new RangoNum(numeros);
                serie.adivinar();

            }
            denuevo = JOptionPane.showInputDialog("¿Querés jugar otra vez?\n Si: S\n No: N");
            while (!denuevo.contains("S") && !denuevo.contains("s") && !denuevo.contains("N") && !denuevo.contains("n")) {
                denuevo = JOptionPane.showInputDialog("Ingrese S para para volver a jugar o N para terminar.");
            }

        } while (denuevo.contains("S") || denuevo.contains("s"));

    }

}

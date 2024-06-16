package persona1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) throws ParseException{
        DateFormat formateador = new SimpleDateFormat("dd/M/yy");
        //Arreglo para almacenar registros de profesores
        String[] nombre  = new String[50];
        String[] apellido = new String[50];
        Date[] fechaDeNacimiento = new Date[50];
        String[] genero = new String[50];
        double[] estatura = new double[50];
        double[] peso = new double[50];
        String[] materia = new String[50];
             
        for (int i = 0; i < 50; i++) {
         
            nombre[i]= JOptionPane.showInputDialog("Ingresa el nombre del profesor: ");
            apellido[i]=JOptionPane.showInputDialog("Ingresa el apellido del profesor: ");
            try {
                fechaDeNacimiento[i] = formateador.parse(JOptionPane.showInputDialog("Ingresa la fecha de nacimiento del profesor (dd/MM/yy):"));
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Fecha de nacimiento inválida. Intenta de nuevo.");
                i--; 
                continue; 
            }
            genero[i]=JOptionPane.showInputDialog("Ingresa el género del profesor: ");
             try {
                estatura[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la estatura del profesor: "));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Estatura inválida. Intenta de nuevo.");
                i--; // Decrementa el contador para repetir la iteración
                continue; // Continúa con la siguiente iteración del bucle
            }
            try {
                peso[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el peso del profesor: "));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Peso inválido. Intenta de nuevo.");
                i--; // Decrementa el contador para repetir la iteración
                continue; // Continúa con la siguiente iteración del bucle
            }
            materia[i]=JOptionPane.showInputDialog("Ingresa la materia del profesor: ");
        }
        StringBuilder nombres = new StringBuilder("Los nombres de los profesores son:\n");
        StringBuilder apellidos = new StringBuilder("Los apellidos de los profesores son:\n");
        StringBuilder fechasNacimiento = new StringBuilder("Las fechas de nacimiento de los profesores son:\n");
        StringBuilder generos = new StringBuilder("Los géneros de los profesores son:\n");
        StringBuilder estaturas = new StringBuilder("Las estaturas de los profesores son:\n");
        StringBuilder pesos = new StringBuilder("Los pesos de los profesores son:\n");
        StringBuilder materias = new StringBuilder("Las materias de los profesores son:\n");

        for (int i = 0; i < 50; i++) {
            nombres.append(nombre[i]).append("\n");
            apellidos.append(apellido[i]).append("\n");
            fechasNacimiento.append(new SimpleDateFormat("dd/MM/yy").format(fechaDeNacimiento[i])).append("\n");
            generos.append(genero[i]).append("\n");
            estaturas.append(estatura[i]).append("\n");
            pesos.append(peso[i]).append("\n");
            materias.append(materia[i]).append("\n");
        }

        JOptionPane.showMessageDialog(null, nombres.toString());
        JOptionPane.showMessageDialog(null, apellidos.toString());
        JOptionPane.showMessageDialog(null, fechasNacimiento.toString());
        JOptionPane.showMessageDialog(null, generos.toString());
        JOptionPane.showMessageDialog(null, estaturas.toString());
        JOptionPane.showMessageDialog(null, pesos.toString());
        JOptionPane.showMessageDialog(null, materias.toString());
    }
}



        


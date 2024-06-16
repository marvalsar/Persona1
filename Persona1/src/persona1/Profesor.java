package persona1;
   
import java.util.Date;
import javax.swing.JOptionPane;

public class Profesor extends Persona {
    //Atributos
    private String materia;
    private static Profesor[] profesores = new Profesor[50]; // Arreglo estático para almacenar profesores
    private static int contador = 0; 
    
    //Constructor
    public Profesor(String nombre, String apellido, Date fechaDeNacimiento, String genero,double estatura, double peso, String materia) {
        super(nombre, apellido, fechaDeNacimiento,genero,estatura,peso);
        this.materia = materia;
    }
    // Métodos para el TDA
    public static void agregarProfesor(Profesor profesor) {
        if (contador < 50) {
            profesores[contador] = profesor;
            contador++;
        } else {
            JOptionPane.showMessageDialog(null, "No se pueden agregar más profesores. Tamaño máximo alcanzado.");
        }
    }

    public static Profesor[] obtenerProfesores() {
        return profesores;
    }
    
    public static int contarProfesores() {
        return contador;
    }
    //Getters y Setters
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    @Override
    public String mostrarInformacion(){
        return super.mostrarInformacion()+ "\nMateria: "+materia;
    }
}
    

    


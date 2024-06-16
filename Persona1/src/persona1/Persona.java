package persona1;

import java.util.Date;

public class Persona {
    //Atributos
    private String nombre;
    private String apellido;
    private Date fechaDeNacimiento;
    private String genero;
    private double estatura;
    private double peso;

    //Constructor
    public Persona(String nombre, String apellido, Date fechaDeNacimiento, String genero, double estatura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.genero = genero;
        this.estatura = estatura;
        this.peso = peso;
    }

    public Persona() {
    }
    
        //Getters y Setters
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public Date getFechaDeNacimiento() {
            return fechaDeNacimiento;
        }

        public void setFechaDeNacimiento(Date fechaDeNacimiento) {
            this.fechaDeNacimiento = fechaDeNacimiento;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public double getEstatura() {
            return estatura;
        }

        public void setEstatura(double estatura) {
            this.estatura = estatura;
        }

        public double getPeso() {
            return peso;
        }

        public void setPeso(double peso) {
            this.peso = peso;
        }

    
    public String mostrarInformacion() {
        return "Nombre: " +nombre+"\nApellido: "+apellido+"\nfechaDeNacimiento: "+fechaDeNacimiento+"\nGénero: "+genero+"\nEstatura: "+estatura+"\nPeso: "+peso; 
    }
}




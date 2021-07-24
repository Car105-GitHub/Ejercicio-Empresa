package repaso.julio24.clasesysqlite.empresa;

public abstract class Persona {

    // ATRIBUTOS
    private String nombre;
    private int edad;


    // CONSTRUCTOR
    public Persona (String nombre, Integer edad){
       this.nombre= nombre;
       this.edad= edad;


    }

    public String mostrar (){

        return String.format (" nombre : "+ nombre + " edad : "+ edad );

    }
    
}

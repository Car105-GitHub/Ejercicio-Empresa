package repaso.julio24.clasesysqlite.empresa;

public abstract class Persona {
    private String nombre;
    private int edad;

    public Persona (String nombre, Integer edad){
       this.nombre= nombre;
       this.edad= edad;


    }

    public String mostrar (){

        return String.format (" nombre : "+ nombre + " edad : "+ edad );

    }
    
}

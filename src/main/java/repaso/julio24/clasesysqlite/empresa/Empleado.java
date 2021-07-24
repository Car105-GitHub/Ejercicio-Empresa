package repaso.julio24.clasesysqlite.empresa;

public class Empleado extends Persona {
    
    private Double sueldoBruroDouble;


        // CONSTRUCTOR video repaso julio 24 min 1:50

    public Empleado(String nombre, Integer edad, Double sueldoBruroDouble) {
        super(nombre, edad);
        this.sueldoBruroDouble = sueldoBruroDouble;
    }


    @Override
    public String mostrar() {
        return super.mostrar() + " sueldo : "+ sueldoBruroDouble;
    }




    
}

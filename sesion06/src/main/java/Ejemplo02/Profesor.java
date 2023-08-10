package Ejemplo02;

public class Profesor extends Persona{
private String idProfesor;

    public Profesor(String Nombre, String Apellido,String idProfesor) {
        super(Nombre, Apellido);
        this.idProfesor=idProfesor;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
    }
}


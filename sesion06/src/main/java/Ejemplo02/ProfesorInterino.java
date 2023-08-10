package Ejemplo02;

import java.time.LocalDate;

public class ProfesorInterino extends Profesor{

    private LocalDate fechaTerminacion;

    public ProfesorInterino(String Nombre, String Apellido, String idProfesor,LocalDate terminacion) {
        super(Nombre, Apellido, idProfesor);
        this.fechaTerminacion=terminacion;
    }
}

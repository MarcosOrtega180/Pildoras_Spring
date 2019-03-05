package es.pildoras.IoC;

public class JefeEmpleado implements Empleados {
    @Override
    public String getTareas() {
        return "Gestiono las cuestions relatias a mis empleados de sección";
    }
}

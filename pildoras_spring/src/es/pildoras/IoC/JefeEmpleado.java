package es.pildoras.IoC;

public class JefeEmpleado implements Empleados {
    @Override
    public String getTareas() {
        return "Gestiono las cuestions relatias a mis empleados de sección";
    }

    @Override
    public String getInforme() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

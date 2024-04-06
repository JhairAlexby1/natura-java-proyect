package clases;

import java.util.ArrayList;

public class GestionConsultores {
    private ArrayList<Consultor> consultores;

    public GestionConsultores() {
        this.consultores = new ArrayList<>();
    }

    // Método para agregar un consultor
    public void agregarConsultor(Consultor consultor) {
        this.consultores.add(consultor);
    }

    // Método para buscar un consultor por código
    public Consultor buscarConsultor(String codigo) {
        for (Consultor consultor : this.consultores) {
            if (consultor.getCodigo().equals(codigo)) {
                return consultor;
            }
        }
        return null;
    }

    // Método para eliminar un consultor por código
    public boolean eliminarConsultor(String codigo) {
        Consultor consultor = buscarConsultor(codigo);
        if (consultor != null) {
            this.consultores.remove(consultor);
            return true; // Retorna true si se eliminó el consultor
        }
        return false; // Retorna false si no se encontró el consultor
    }
}
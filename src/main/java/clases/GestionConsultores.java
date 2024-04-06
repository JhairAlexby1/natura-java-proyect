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

    // Método para buscar un consultor por ID
    public Consultor buscarConsultorPorId(String id) {
        for (Consultor consultor : this.consultores) {
            if (consultor.getId().equals(id)) {
                return consultor;
            }
        }
        return null;
    }

    // Método para agregar y ver todos los consultores
public String verConsultores() {
    // Crear algunos consultores
    Consultor consultor1 = new Consultor("id1", "nombre1", "apellidoPaterno1", "apellidoMaterno1", "telefono1", "direccion1", "email1", "password1");
    Consultor consultor2 = new Consultor("id2", "nombre2", "apellidoPaterno2", "apellidoMaterno2", "telefono2", "direccion2", "email2", "password2");
    Consultor consultor3 = new Consultor("id3", "nombre3", "apellidoPaterno3", "apellidoMaterno3", "telefono3", "direccion3", "email3", "password3");
    // Agregar los consultores al ArrayList
    this.consultores.add(consultor1);
    this.consultores.add(consultor2);
    this.consultores.add(consultor3);

    // Mostrar los consultores
    StringBuilder sb = new StringBuilder();
    for (Consultor consultor : this.consultores) {
        sb.append(consultor.toString()).append("\n");
    }
    return sb.toString();
}
}
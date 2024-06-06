package modelos;

public class Cliente {
    private int idCliente;
    private String nombre;
    private int dni;
    private String email;
    private int telefono;

    public Cliente() {
    }

    public Cliente(int idCliente, String nombre, int dni, String email, int telefono) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.dni = dni;
        this.email = email;
        this.telefono = telefono;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", email='" + email + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}

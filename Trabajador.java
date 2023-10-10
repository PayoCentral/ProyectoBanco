class Trabajador {
    private String nombre;
    private String cargo;
    private String telefono;
    private String nss;

    public Trabajador(String nombre, String cargo, String telefono, String nss) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.telefono = telefono;
        this.nss = nss;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public String getTelefono() {
        return telefono;
    }
    
    public String getNss() {
        return nss;
    }
}
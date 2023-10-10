class Empleado {
    private String nombre;
    private String telefono;
    private String nss;

    public Empleado (String nombre, String telefono, String nss) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.nss = nss;
    }

    public String getNombre() {
        return nombre;
    }


    public String getTelefono() {
        return telefono;
    }
    
    public String getNss() {
        return nss;
    }
}

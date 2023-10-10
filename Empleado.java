class Empleado {
    private String nombre;
    private String telefono;
    private int id_empl;
    private int sueldo;
    private int nss;

    public Trabajador(String nombre, String telefono, int nss) {
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
    
    public int getNss() {
        return nss;
    }
}

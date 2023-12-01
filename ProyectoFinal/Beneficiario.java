import java.util.ArrayList;

public class Beneficiario {
    private String nombre;
    private String fecha_nacimiento;
    private Float porcentaje;
    private String fecha_alta;
    private ArrayList<Beneficiario> beneficiarios;

    public Beneficiario(String nombre, String fecha_nacimiento, Float porcentaje, String fecha_alta) {
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.porcentaje = porcentaje;
        this.fecha_alta = fecha_alta;
        this.beneficiarios = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public Float getPorcentaje() {
        return porcentaje;
    }

    public String getFecha_alta() {
        return fecha_alta;
    }

    public void modPorcentaje(Float nuevoPorcentaje) {
        this.porcentaje = nuevoPorcentaje;
    }

    public void addBeneficiario(Beneficiario nuevoBeneficiario) {
        beneficiarios.add(nuevoBeneficiario);
    }
}
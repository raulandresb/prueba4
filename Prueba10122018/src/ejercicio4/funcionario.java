
package ejercicio4;

public class funcionario {


    
    private String rut;
    private String nombre;
    private String apellido;
    private String domicilio;
    private String fechaNacimiento;
    private double sueldoBruto;

    public funcionario(String rut, String nombre, String apellido, String domicilio, String fechaNacimiento, double sueldoBruto) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.fechaNacimiento = fechaNacimiento;
        this.sueldoBruto = sueldoBruto;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }
    

    public String getAtributos(){
        return this.rut+","+this.apellido+","+this.nombre+","+this.fechaNacimiento+","+this.sueldoBruto;
    }
}

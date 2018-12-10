
package ejercicio3;

public class Articulo {
    private String referencia;
    private String nombre;
    private double precio;

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public String GetAtributos(){
        return this.referencia+" ,"+this.nombre+","+this.precio;
        
    }
    
    public void SetAtributos(String referencia,String nombre,double precio){
        this.referencia=referencia;
        this.nombre=nombre;
        this.precio=precio;
        
    }
    public void Calculo_Venta(String referencia){
        
        
    }
    
}

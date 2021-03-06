public class Articulo{
    
    private String nombre;
    private double precio;

    public Articulo(){
        this.nombre = "N/A";
        this.precio = 0.0;
    }

    public Articulo(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre(){
        return this.nombre;
    }

    public double getPrecio(){
        return this.precio;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    public String toString(){
        return  getNombre() + ": $" + getPrecio() + "\n";
    }
}

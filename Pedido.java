import java.util.ArrayList;

public class Pedido {
    private String nombre;
    private boolean listo;
    private ArrayList<Articulo> items = new ArrayList<Articulo>();

    public Pedido(){
        this.nombre = "N/A";
        this.listo = false;
        this.items = new ArrayList<Articulo>();
    }

    public Pedido(String nombre,boolean listo,ArrayList<Articulo> items){
        this.nombre = nombre;
        this.listo = listo;
        this.items = items;
    }

    public String getNombre(){
        return this.nombre;
    }

    public boolean getListo(){
        return this.listo;
    }

    public ArrayList<Articulo> getItems(){
        return this.items;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setListo(boolean listo){
        this.listo = listo;
    }

    public void setItems(ArrayList<Articulo> items){
        this.items = items;
    }

    public void addArticulo(Articulo articulo){
        this.items.add(articulo);
    }

    public double precioTotal(){
        double total = 0.0;
        for(int i = 0; i<this.items.size();i++){
            total += this.items.get(i).getPrecio();
        }
        return total;
    }
    public String getStatusMessage(){
        if(this.listo == true){
            return "Tu pedido esta listo";
        }
        else{
            return "Gracias por esperar. Tu pedido estará listo pronto";
        }
    }

    public String Display(){
        if(this.listo == true){
            return  "Nombre cliente: " + getNombre() + "\n"+
                    this.items.toString() + "\n" +
                    "Total: "+precioTotal()+ "\n";
        }
        else{
            return "Gracias por esperar. Tu pedido estará listo pronto";
        }
    }
}

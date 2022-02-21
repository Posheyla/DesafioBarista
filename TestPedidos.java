import java.util.ArrayList;
public class TestPedidos {
    public static void main(String[] args){
        // Elementos del menú
        Articulo articulo1 = new Articulo("moka",5.00);
        Articulo articulo2 = new Articulo("Latte",6.00);
        Articulo articulo3 = new Articulo("Cafe de goteo",4.00);
        Articulo articulo4 = new Articulo("Capuchino",3.00);
        //Ordenar variables -- orden1, orden2, etc.
        Pedido pedido1 = new Pedido("Cindhuri",true,new ArrayList<Articulo>());
        Pedido pedido2 = new Pedido("Jimmy",true,new ArrayList<Articulo>());
        pedido2.addArticulo(articulo1);
        Pedido pedido3 = new Pedido("Noah",false,new ArrayList<Articulo>());
        pedido3.addArticulo(articulo4);
        Pedido pedido4 = new Pedido("Sam",true,new ArrayList<Articulo>());
        pedido4.addArticulo(articulo2);
        pedido4.addArticulo(articulo2);
        // Simulaciones de aplicaciones
        System.out.println(pedido1.Display());
        System.out.println(pedido4.getItems());
        System.out.println(pedido4.Display());
    }
}

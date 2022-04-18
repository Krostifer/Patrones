//Receiver
public class Inventario {

    private int id;
    private int stock;

    //Constructor
    public Inventario(int id, int stock){
        this.id = id;
        this.stock = stock;
    }

    //Operaciones
    //Retirar productos
    public void retirar(int cantRetirar){
        this.stock = this.stock - cantRetirar;
        System.out.println("Se retiraron: " + cantRetirar + " productos de la bodega " + id + ", el nuevo stock es: " + this.stock + " productos.\n");
    }

    //Recibir productos
    public void recibir(int cantRecibida){
        this.stock = this.stock + cantRecibida;
        System.out.println("Se recibieron: " + cantRecibida + " productos en la bodega " + id + ", el nuevo stock es: " + this.stock + " productos.\n");
    }
}
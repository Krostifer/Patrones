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
        if(this.stock >= cantRetirar){
            this.stock = this.stock - cantRetirar;
            System.out.println("Se retiraron: " + cantRetirar + " productos de la bodega " + id + ", el nuevo stock es: " + this.stock + " productos.\n");
        }
        else{
            System.out.println("En la bodega no hay suficientes productos para retirar la cantidad solicitada.\n");
        }
    }

    //Recibir productos
    public void recibir(int cantRecibida){
        this.stock = this.stock + cantRecibida;
        System.out.println("Se recibieron: " + cantRecibida + " productos en la bodega " + id + ", el nuevo stock es: " + this.stock + " productos.\n");
    }
}
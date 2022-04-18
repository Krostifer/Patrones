public class RecibirCommand implements Command{

    //Receiver
    private Inventario inventario;
    //Parametros de la solicitud
    private int cantidad;

    //Constructor
    public RecibirCommand(Inventario inventario, int cantidad){
        this.inventario = inventario;
        this.cantidad = cantidad;
    }

    @Override
    public void execute(){
        this.inventario.recibir(this.cantidad);
    }
}

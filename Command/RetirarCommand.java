public class RetirarCommand implements Command{
    
    //Receiver
    private Inventario inventario;
    //Parametros de la solicitud
    private int cantidad;

    //Constructor
    public RetirarCommand(Inventario inventario, int cantidad){
        this.inventario = inventario;
        this.cantidad = cantidad;
    }

    @Override
    public void execute(){
        this.inventario.retirar(this.cantidad);
    }
}

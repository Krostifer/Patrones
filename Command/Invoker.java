import java.util.ArrayList;
import java.util.List;

public class Invoker {
    //Lista de comandos
    private List<Command> solicitudes = new ArrayList<>();

    //Agrega el comand a la lista de solicitudes
    public void setCommand(Command solicitud){
        this.solicitudes.add(solicitud);
    }

    //Ejecutar las solicitudes
    public void executeCommand(){
        //Se ejecuta cada solicitud almacenada
        this.solicitudes.forEach(x -> x.execute());
        //Se limpia la lista de solicitudes
        this.solicitudes.clear();
    }
}

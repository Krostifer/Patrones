public class CommandMain {

	public static void main(String[] args) {
				
		System.out.println("----------------------------------------");
		System.out.println("Ejecucion del Patron Command");
		System.out.println("----------------------------------------");

		//Se crea el un inventario de una bodega
		Inventario inventario = new Inventario(1, 500);

		//Se establece las solicitudes a realizar
        RetirarCommand solicitud1 = new RetirarCommand(inventario, 300);
        RecibirCommand solicitud2 = new RecibirCommand(inventario, 100);
		RetirarCommand solicitud3 = new RetirarCommand(inventario, 250);
		RetirarCommand solicitud4 = new RetirarCommand(inventario, 100);
		RecibirCommand solicitud5 = new RecibirCommand(inventario, 100);
		RetirarCommand solicitud6 = new RetirarCommand(inventario, 100);

        //Se crea el invocador
		Invoker invocador = new Invoker();
        //Se "envian" las solicitudes
		invocador.setCommand(solicitud1);
		invocador.setCommand(solicitud2);
		invocador.setCommand(solicitud3);
		invocador.setCommand(solicitud4);
		invocador.setCommand(solicitud5);
		invocador.setCommand(solicitud6);
        
        //Se ejecutan las solicitudes almacenadas
        invocador.executeCommand();
	}
}
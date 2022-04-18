public class CommandMain {

	public static void main(String[] args) {
				
		System.out.println("----------------------------------------");
		System.out.println("Ejecucion del Patron Command");
		System.out.println("----------------------------------------");

		//Se crea el un inventario de una bodega
		Inventario inventario = new Inventario(1, 500);

		//Se establece las solicitudes a realizar
        RetirarCommand nuevoRetiro = new RetirarCommand(inventario, 300);
        RecibirCommand nuevoRecibo = new RecibirCommand(inventario, 100);
		
        //Se crea el invocador
		Invoker invocador = new Invoker();
        //Se "envian" las solicitudes
		invocador.setCommand(nuevoRetiro);
        invocador.setCommand(nuevoRecibo);

        //Se ejecutan las solicitudes almacenadas
        invocador.executeCommand();
	}
}
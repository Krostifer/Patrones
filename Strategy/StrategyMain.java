public class StrategyMain {

	public static void main(String[] args) {
		
		String message = "evaluacion 1 mingeso";
		
		System.out.println("----------------------------------------");
		System.out.println("Ejecucion del Patron Strategy");
		System.out.println("----------------------------------------");

		//Se crea el contexto
		EditMessageContext context = new EditMessageContext();
		//Se establece la estrategia a utilizar
		context.setEditMethod(new VowelsExtract());
		//Se ejecuta la estrategia
		context.editMessage(message);
		
		System.out.println("--------------------------");
		//Se establece la estrategia a utilizar
		context.setEditMethod(new ConsonantsExtract());
		//Se ejecuta la estrategia
		context.editMessage(message);
		
	}
}
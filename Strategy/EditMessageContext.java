public class EditMessageContext {
	//Se define estrategia como un atributo del contexto
    private EditMessageStrategy strategy;
	
	//Metodo para establecer la estrategia a utilizar
	public void setEditMethod(EditMessageStrategy strategy) {
		this.strategy = strategy;
	}
	
	//Metodo para obtener la estrategia actual
	public EditMessageStrategy getStrategy() {
		return this.strategy;
	}
	
	//Ejecucion de la estrategia
	public void editMessage(String message){
		this.strategy.edit(message);
	}
}

public class AdapterMain {
    public static void main(String[] args) {
		
        WeightChecker lightWeightChecker = new WeightChecker(135);
        EeuuBoxer boxeador1 = new EeuuBoxer("Floyd Mayweather", 132);
		ChileanBoxer boxeador2 = new ChileanBoxer("Jose Velasquez", 61);
		
		System.out.println("----------------------------------------");
		System.out.println("Ejecucion del Patron Adapter");
		System.out.println("----------------------------------------\n");

		//Se prueba si el boxeador estadounidense es de peso ligero
        if(lightWeightChecker.accepted(boxeador1)){
            System.out.println("El boxeador de EEUU puede competir en categoria peso ligero\n");
        }
        else{
            System.out.println("El boxeador de EEUU no puede competir en categoria peso ligero\n");
        }
		
		System.out.println("------------Se aplica el adaptador--------------\n");

		KgLbAdapter boxeador2Adaptado = new KgLbAdapter(boxeador2);

        if(lightWeightChecker.accepted(boxeador2Adaptado)){
            System.out.println("El boxeador de Chile puede competir en categoria peso ligero\n");
        }
        else{
            System.out.println("El boxeador de Chile no puede competir en categoria peso ligero\n");
        }
		
	}
}

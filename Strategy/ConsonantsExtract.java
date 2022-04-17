public class ConsonantsExtract implements EditMessageStrategy {

	@Override
	public void edit(String message) {
		System.out.println("Consonants Extraction!");
        
        String mensajeFinal = "";
        mensajeFinal = message.replaceAll("[bcdfghjklmnpqrstvwxyz]", "");

		System.out.println(mensajeFinal);
	}
}
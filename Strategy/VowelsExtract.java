public class VowelsExtract implements EditMessageStrategy {

	@Override
	public void edit(String message) {
		System.out.println("Vowels Extraction!");
        
        String mensajeFinal = "";
        mensajeFinal = message.replaceAll("[aeiou]", "");

		System.out.println(mensajeFinal);
	}
}
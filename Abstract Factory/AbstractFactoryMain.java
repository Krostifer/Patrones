public class AbstractFactoryMain {
    public static void main(String[] args) {
		
		System.out.println("----------------------------------------");
		System.out.println("Ejecucion del Abstract Factory");
		System.out.println("----------------------------------------\n");

        DifficultyFactory factoryE = new EasyDifficultyFactory();
        DifficultyFactory factoryH = new HardDifficultyFactory();
        BossFight peleaE = new BossFight(factoryE);
        BossFight peleaH = new BossFight(factoryH);

        peleaE.interact();       
        System.out.println("\n----------------------------------------\n");
		peleaH.interact();
	}
}

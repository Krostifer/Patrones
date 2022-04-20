public class EasyDifficultyFactory implements DifficultyFactory{

    @Override
    public Enemy createEnemy(){
        return new EasyEnemy();
    }

    @Override
    public Drop createDrop(){
        return new EasyDrop();
    }
}
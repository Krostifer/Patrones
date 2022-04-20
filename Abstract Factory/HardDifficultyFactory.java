public class HardDifficultyFactory implements DifficultyFactory{

    @Override
    public Enemy createEnemy(){
        return new HardEnemy();
    }

    @Override
    public Drop createDrop(){
        return new HardDrop();
    }
}

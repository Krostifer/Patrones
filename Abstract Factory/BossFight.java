public class BossFight {
   private Enemy enemy;
   private Drop drop;

   public BossFight(DifficultyFactory factory){
      this.enemy = factory.createEnemy();
      this.drop = factory.createDrop();
   }

   public void interact(){
      enemy.atacar();
      drop.aparecer();
   }
}
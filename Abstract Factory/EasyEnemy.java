public class EasyEnemy implements Enemy{
    
    @Override
    public void atacar(){
        System.out.println("El enemigo atacara solamente si es atacado previamente");
    }
}

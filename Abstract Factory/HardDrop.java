import java.util.Random;

public class HardDrop implements Drop{
    
    @Override
    public void aparecer(){
        String[] arr = {"Ultra raro", "Epico", "Legendario"};
      	Random r = new Random();        
      	int randomNumber = r.nextInt(arr.length);
      	System.out.println("Tras matar al jefe ha aparecido un objeto de rareza " + arr[randomNumber]);
    }
}
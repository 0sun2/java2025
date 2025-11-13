package game.simple;
import java.util.Random;

public class GameMian {
	public static void main(String[] args) {
		Player player = new Player(100, 100,100);
		Dragon dragon = new Dragon(30, 20, 50);
		Thief thief = new Thief(30, 20, 50);
		Mouse mouse = new Mouse(30, 20, 50);
		
		Enemy[] enemys = {dragon, thief, mouse};
		
		Random rand = new Random();
		
        while(player.IsAlive()) {
        	int val = rand.
        }
            int val = rand.nextInt(3);
			if(val == 0) {
			dragon.Attack(player);
		}
			else if(val == 1){
				thief.Attack(player);
			}
			else {
				mouse.Attack(player);
			}
			enemys[val].Attack(player);
	}

}

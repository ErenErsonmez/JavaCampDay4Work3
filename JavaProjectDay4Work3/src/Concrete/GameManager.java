package Concrete;

import Abstract.IGameService;
import Entities.Game;

public class GameManager implements IGameService {

	@Override
	public void gameAdd(Game game) {
		
		System.out.println("Oyun eklendi:"+game.getGameName());
		
	}

	@Override
	public void gameDelete(Game game) {
		
		System.out.println("Oyun silindi:"+game.getGameName());
	}

	@Override
	public void gameUpdate(Game game) {
		
		System.out.println("Oyun güncellendi:"+game.getGameName());
	}

}

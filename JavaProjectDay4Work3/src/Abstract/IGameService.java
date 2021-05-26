package Abstract;

import Entities.Game;

public interface IGameService {

	public void gameAdd(Game game);
	
	public void gameDelete(Game game);
	
	public void gameUpdate(Game game);
	
}

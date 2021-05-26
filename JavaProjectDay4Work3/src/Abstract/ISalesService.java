package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.User;


public interface ISalesService {

	public void gameSales(Game game,User user);
	
	public void saleWithcampaing(Game game,User user,Campaign campaign);
	
	
}

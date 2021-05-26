package Concrete;

import Abstract.ISalesService;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class SalesManager implements ISalesService{

	@Override
	public void gameSales(Game game, User user) {
		
		System.out.println(user.getFirstName()+" isimli oyuncu "+game.getGameName()+" isimli oyunu aldý");
		
	}

	@Override
	public void saleWithcampaing(Game game, User user, Campaign campaign) {
		
		System.out.println(user.getFirstName()+" isimli oyuncu "+game.getGameName()+" isimli oyunu "+campaign.getDiscount()+"tl indirim ile aldý");
		
	}

}

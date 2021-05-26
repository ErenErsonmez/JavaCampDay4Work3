package Concrete;

import Abstract.ICampaningService;
import Entities.Campaign;

public class CampaignManager implements ICampaningService {

	@Override
	public void campaningAdd(Campaign campaign) {
	
		System.out.println("Yeni kampanya eklendi:"+campaign.getCampaingName());
		
	}

	@Override
	public void campaningDelete(Campaign campaign) {
		
		System.out.println("Kampanya silindi:"+campaign.getCampaingName());
	}

	@Override
	public void campaningUpdate(Campaign campaign) {
		
		System.out.println("Kampanya güncellendi:"+campaign.getCampaingName());
	}

}

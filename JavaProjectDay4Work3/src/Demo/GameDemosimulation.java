package Demo;

import java.time.LocalDate;
import java.time.Month;

import Concrete.UserCheckService;
import Concrete.UserManager;
import Entities.User;

public class GameDemosimulation {

	public static void main(String[] args) throws Exception {
		
		UserManager manager=new UserManager(new UserCheckService());
		
		manager.add(new User(1, "Eren","Ersönmez",LocalDate.of(2000,Month.SEPTEMBER,28), "17540241296","erenersonmez619@gmail.com"));
		
		

	}

}

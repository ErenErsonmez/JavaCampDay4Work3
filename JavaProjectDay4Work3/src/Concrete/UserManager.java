package Concrete;

import Abstract.IUserCheckService;
import Abstract.IUserService;
import Entities.User;

public class UserManager implements IUserService {

	IUserCheckService checkservice;
	
	
	
	public UserManager(IUserCheckService checkservice) {
		
		this.checkservice = checkservice;
	}

	@Override
	public void add(User user) throws Exception {
		
			if (checkservice.CheckIfRealPlayer(user)) 
			{
				System.out.println("Kullanýcý kayýt oldu...");
			}
			else 
			{
				throw new Exception("Kullanýcý kayýt olamadý!!!");
			}
			
			
		}
	


	@Override
	public void Update(User user)  {
		System.out.println("Kullanýcý kaydedildi...");
		
	}



	@Override
	public void delete(User user)  {
		System.out.println("Kullanýcý silindi...");
		
	}

		
	}


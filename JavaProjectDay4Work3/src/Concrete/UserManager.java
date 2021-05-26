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
				System.out.println("Kullan�c� kay�t oldu...");
			}
			else 
			{
				throw new Exception("Kullan�c� kay�t olamad�!!!");
			}
			
			
		}
	


	@Override
	public void Update(User user)  {
		System.out.println("Kullan�c� kaydedildi...");
		
	}



	@Override
	public void delete(User user)  {
		System.out.println("Kullan�c� silindi...");
		
	}

		
	}


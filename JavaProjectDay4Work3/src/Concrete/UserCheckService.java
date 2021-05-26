package Concrete;

import Abstract.IUserCheckService;
import Entities.User;

public class UserCheckService implements IUserCheckService{

	@Override
	public boolean CheckIfRealPlayer(User user) 
{
		
if (user.getLastName().length()>2 && user.getLastName().length()>2 && user.getId()>0) 
{
	return true;		
}
else
{
    return false;	
}

}

	
}

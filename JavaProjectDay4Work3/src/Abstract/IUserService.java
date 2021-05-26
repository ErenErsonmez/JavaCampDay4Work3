package Abstract;

import Entities.User;

public interface IUserService {
   
	public void add(User user) throws Exception;
	
	public void Update(User user);
	
	public void delete(User user);
}

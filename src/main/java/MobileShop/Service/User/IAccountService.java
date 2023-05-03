package MobileShop.Service.User;

import org.springframework.stereotype.Service;

import MobileShop.Entity.Users;

@Service
public interface IAccountService {
	public int AddAccount(Users user);
	
	public boolean CheckAccount(Users user);
}

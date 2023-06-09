package MobileShop.Service.User;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import MobileShop.Dto.CartDto;
import MobileShop.Entity.Bills;

@Service
public interface IBillsService {
	public int AddBills(Bills bill);
	public void AddBillsDetail(HashMap<Long, CartDto> carts);
}

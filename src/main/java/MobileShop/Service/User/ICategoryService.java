package MobileShop.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import MobileShop.Dto.ProductsDto;
@Service
public interface ICategoryService {
	
	public List<ProductsDto> GetAllProductsByID(int id);
	
	
}

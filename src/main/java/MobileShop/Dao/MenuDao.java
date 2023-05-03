package MobileShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import MobileShop.Entity.Categorys;
import MobileShop.Entity.MapperCategorys;
import MobileShop.Entity.MapperMenus;
import MobileShop.Entity.Menus;
@Repository
public class MenuDao extends BaseDao{
	public List<Menus> GetDataMenus(){
		List<Menus> list = new ArrayList<Menus>();
		String sql = "SELECT * FROM menus";
		list = _jdbcTemplate.query(sql, new MapperMenus());
		return list;
	}
}

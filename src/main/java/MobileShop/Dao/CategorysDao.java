package MobileShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import MobileShop.Entity.Categorys;
import MobileShop.Entity.MapperCategorys;
@Repository
public class CategorysDao extends BaseDao{

	public List<Categorys> GetDataCategorys(){
		List<Categorys> list = new ArrayList<Categorys>();
		String sql = "SELECT * FROM categorys";
		list = _jdbcTemplate.query(sql, new MapperCategorys());
		return list;
	}
}

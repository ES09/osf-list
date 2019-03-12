package osf.list.service.impl;

import java.util.List;

import osf.list.dao.FoodDAO;
import osf.list.dao.impl.FoodDAOImpl;
import osf.list.service.FoodService;
import osf.list.vo.FoodVO;

public class FoodServiceImpl implements FoodService {
	
	private FoodDAO fdao = new FoodDAOImpl();
	
	@Override
	public List<FoodVO> selectFoodList() {
		// TODO Auto-generated method stub
		return fdao.selectFoodList();
	}

	@Override
	public boolean insertFood(FoodVO food) {
		// TODO Auto-generated method stub
		return fdao.insertFood(food);
	}

	@Override
	public FoodVO selectFood(FoodVO food) {
		// TODO Auto-generated method stub
		return fdao.selectFood(food);
	}

	@Override
	public boolean updateFood(FoodVO food) {
		// TODO Auto-generated method stub
		return fdao.updateFood(food);
	}

	@Override
	public boolean deleteFood(FoodVO food) {
		// TODO Auto-generated method stub
		return fdao.deleteFood(food);
	}

}

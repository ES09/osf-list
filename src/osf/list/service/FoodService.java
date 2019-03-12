package osf.list.service;

import java.util.List;

import osf.list.vo.FoodVO;

public interface FoodService {
	
	public List<FoodVO> selectFoodList();

	public FoodVO selectFood(FoodVO food);
	
	public boolean insertFood(FoodVO food);
	
	public boolean updateFood(FoodVO food);
	
	public boolean deleteFood(FoodVO food);
	
}

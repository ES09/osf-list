package osf.list.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import osf.list.vo.FoodVO;

public class FoodData {
	
	public static final List<FoodVO> FOOD_LIST = new ArrayList<>();
		
	static {
		FoodVO food = new FoodVO();
		food.setNumber(1);;
		food.setName("떡볶이");
		food.setPrice(5000);
		FOOD_LIST.add(food);
		
	}

}

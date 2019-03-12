package osf.list;

import java.util.HashMap;
import java.util.Map;

import osf.list.controller.FoodController;

public class Execute {
	
	public static void main(String[] args) {
		FoodController fc = new FoodController();
		Map<String,String> req = new HashMap<>();
		Map<String,Object> res = new HashMap<>();
		
		req.put("cmd", "food");
		req.put("number","1");
		fc.doGet(req, res);
		System.out.println(res);
		
     	req.put("cmd","insert");
		req.put("number", "2");
		req.put("name", "연어");
		req.put("price", "25000");
		fc.doPost(req, res);
		req = new HashMap<>();
		res = new HashMap<>();
		req.put("cmd","insert");
		req.put("number", "3");
		req.put("name", "초밥");
		req.put("price", "12000");
		fc.doPost(req, res);
		System.out.println(res); 		
		
		req = new HashMap<>();
		res = new HashMap<>();
		req.put("cmd","update");
		req.put("number","3");
		req.put("name", "전골");
		fc.doPost(req, res);
		System.out.println(res);
		
		req = new HashMap<>();
		res = new HashMap<>();
		req.put("cmd","delete");
		req.put("number","3");
		fc.doPost(req, res);
		System.out.println(res);
		
		req = new HashMap<>();
		res = new HashMap<>();
		req.put("cmd","foodlist");
		fc.doGet(req,res);
		System.out.println(res);
	}

}

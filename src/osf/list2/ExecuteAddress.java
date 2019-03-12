package osf.list2;

import java.util.HashMap;
import java.util.Map;

import osf.list2.controller.AddressController;

public class ExecuteAddress {

	public static void main(String[] args) {
	
	AddressController ac = new AddressController();
	Map<String,String> req = new HashMap<>();
	Map<String,Object> res = new HashMap<>();
	
	req.put("cmd","address");
	req.put("number","0101111111");
	ac.doGet(req,res);
	System.out.println(res);       //단건조회
	
	req.put("cmd", "addresslist");
	req.put("number", "010");
	ac.doGet(req, res);
	System.out.println(res);       //리스트조회
	
	req.put("cmd", "insert");
	req.put("number", "0106666666");
	req.put("name", "제이지");
	req.put("adr", "경기도 광명시 하안1동");
	ac.doPost(req,res);
	System.out.println(res);       //insert 

	req = new HashMap<>();
	res = new HashMap<>();
	req.put("cmd", "update");
	req.put("number", "0101111111");
	req.put("adr", "경기도 광명시 철산1동");
	ac.doPost(req, res);
	System.out.println(res);       //update
	
	req = new HashMap<>();
	res = new HashMap<>();
	req.put("cmd", "delete");
	req.put("number", "0105555555");
	ac.doPost(req,res);
	System.out.println(res);       //delete
			
	req = new HashMap<>();
	res = new HashMap<>();
	req.put("cmd", "addresslist");
	ac.doGet(req, res);
	System.out.println(res);       //목록 조회
	
	}
	
	
}

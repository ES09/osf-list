package osf.list2.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddressData {

	public static final List<Map<String,String>> ADDRESS_LIST = new ArrayList<>();
	
	static {
		Map<String,String> map = new HashMap<>();
		map.put("이름", "라이언");
		map.put("전화번호", "0101111111");
		map.put("주소", "서울특별시 금천구 가산동");
		ADDRESS_LIST.add(map);
		
		map = new HashMap<>();
		map.put("이름", "어피치");
		map.put("전화번호", "0102222222");
		map.put("주소", "서울특별시 금천구 시흥동");
		ADDRESS_LIST.add(map);
		
		map = new HashMap<>();
		map.put("이름", "무지");
		map.put("전화번호", "0103333333");
		map.put("주소", "서울특별시 금천구 독산동");
		ADDRESS_LIST.add(map);
		
		map = new HashMap<>();
		map.put("이름", "콘");
		map.put("전화번호", "0105555555");
		map.put("주소", "경기도 광명시 소하1동");
		ADDRESS_LIST.add(map);
	}
}

package osf.list2.service.impl;

import java.util.List;
import java.util.Map;

import osf.list2.dao.AddressDAO;
import osf.list2.dao.impl.AddressDAOImpl;
import osf.list2.service.AddressService;

public class AddressServiceImpl implements AddressService {

	private AddressDAO adao = new AddressDAOImpl();
	
	@Override
	public List<Map<String, String>> selectAddressList() {
		// TODO Auto-generated method stub
		return adao.selectAddressList();
	}

	@Override
	public Map<String, String> selectAddress(Map<String, String> address) {
		// TODO Auto-generated method stub
		return adao.selectAddress(address);
	}

	@Override
	public boolean insertAddress(Map<String, String> address) {
		// TODO Auto-generated method stub
		return adao.insertAddress(address);
	}

	@Override
	public boolean updateAddress(Map<String, String> address) {
		// TODO Auto-generated method stub
		return adao.updateAddress(address);
	}

	@Override
	public boolean deleteAddress(Map<String, String> address) {
		// TODO Auto-generated method stub
		return adao.deleteAddress(address);
	}
	
	

}

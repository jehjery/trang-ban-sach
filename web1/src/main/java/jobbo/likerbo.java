package jobbo;

import java.util.ArrayList;

import jobbean.likerbean;
import jobdao.likerdao;

public class likerbo {
	likerdao user=  new likerdao();
	public ArrayList<likerbean> findAll() {
		return user.findAll();
	}
	public void insert(likerbean l) {
		user.insert(l);
	}
	public ArrayList<likerbean> findAll(int page, int pageSize) {
		return user.findAll(page, pageSize);
	}
	public void delete(String email) {
		 user.delete(email);
	}
}



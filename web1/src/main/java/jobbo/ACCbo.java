package jobbo;

import java.util.ArrayList;

import jobbean.ACCbean;
import jobdao.ACCdao;

public class ACCbo {
	ACCdao user=  new ACCdao();
	public ArrayList<ACCbean> findAll() {
		return user.findAll();
	}
	public void insert(ACCbean l) {
		user.insert(l);
	}
}

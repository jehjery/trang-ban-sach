package jobbo;

import java.util.ArrayList;
import jobbean.blogbean;

import jobdao.blogdao;

public class blogBo {
	blogdao user=  new blogdao();
	public ArrayList<blogbean> findAll() {
		return user.findAll();
	}
	public void insert(blogbean l) {
		user.insert(l);
	}
	public ArrayList<blogbean> findAll(int page, int pageSize) {
		return user.findAll(page, pageSize);
	}
	public void delete(blogbean l) {
		user.delete(l.getMablog());
	}
}


package jobdao;

import java.util.ArrayList;

import org.bson.Document;

import com.google.gson.Gson;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import connectDB.connectDB;
import jobbean.voucherBean;

public class voucherDao {
	MongoDatabase database = connectDB.getInstance();
	MongoCollection<Document> Collection = database.getCollection("tbvoucher");
	public ArrayList<voucherBean> getloai() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<voucherBean> findAll() {
		ArrayList<voucherBean> listloai = new ArrayList<>();
		Collection.find().forEach(doc ->  
		{
			Gson gson = new Gson();
			voucherBean loai = gson.fromJson(doc.toJson(), voucherBean.class);
			listloai.add(loai);
//			System.out.println(listloai.size());
		});
		return listloai;
	}
	public ArrayList<voucherBean> findAll(int page, int pageSize) {
		ArrayList<voucherBean> list = new ArrayList<>();
		Collection.find().skip(pageSize*(page-1)).limit(pageSize).forEach(doc ->  
		{
			Gson gson = new Gson();
			voucherBean loai = gson.fromJson(doc.toJson(), voucherBean.class);
			list.add(loai);
		});
		return list;
	}
	
	public void insert(voucherBean l) {
		Gson gson = new Gson();
		Document doc = Document.parse(gson.toJson(l));
		Collection.insertOne(doc);
	}
}

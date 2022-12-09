package connectDB;
import java.util.ArrayList;
import org.bson.Document;
import com.google.gson.Gson;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import jobbean.ACCbean;

public class main {

	public static void main(String[] args) {
		
		// kết nối database 
		MongoDatabase database = connectDB.getInstance();
		MongoCollection<Document> collection = database.getCollection("tbACC"); // lấy bảng 

		
//		 đọc dữ liệu
		ArrayList<ACCbean> list = new ArrayList<>();
	
		collection.find().forEach(doc -> 
		{	
			Gson gson = new Gson();
			ACCbean user = gson.fromJson(doc.toJson(), ACCbean.class);
			list.add(user);
			System.out.println(doc);
			
		});
		for(ACCbean s: list) {
			System.out.print(s.getTendangnhap());
			System.out.print(s.getMatkhau());
			System.out.print(s.getSolandang());
		}
	}

}
package connectDB;
import java.util.ArrayList;
import org.bson.Document;
import com.google.gson.Gson;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import jobbean.ACCbean;
import jobbean.loaibean;
import jobbean.sanphambean;
import jobbo.loaibo;
import jobbo.sanphambo;

public class main {

	public static void main(String[] args) {
		loaibo lbo= new loaibo();
		ArrayList<loaibean> listloai = lbo.findAll();
		
		sanphambo spbo= new sanphambo();
		ArrayList<sanphambean> listsp = spbo.findAll();
		
		loaibo lbo1 = new loaibo();
		
		for (loaibean a:listloai)
		{
			lbo1.resetsoluong(a);
		}
		
		
		int d=0;
	
		for(sanphambean b:listsp)
		{ 
			for (loaibean a:listloai)
			{
				if(a.getMaloai().equals(b.getMaloai()))
				lbo1.updatesoluong(a, b);
				d++;
			
			}
			
		}
		System.out.println("đã cập nhật :"+ d);
	}
}
		


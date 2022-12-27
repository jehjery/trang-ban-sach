package jobControlller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jobbean.loaibean;
import jobbean.sanphambean;
import jobbo.loaibo;
import jobbo.sanphambo;

/**
 * Servlet implementation class SHOPcontroller
 */
@WebServlet("/SHOPcontroller")
public class SHOPcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SHOPcontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// lay ds loai
		loaibo lbo= new loaibo();
		ArrayList<loaibean> listloai = lbo.findAll();
		request.setAttribute("loai", listloai);
			// lay ds san phẩm 16
		String pageS = request.getParameter("page");
		String pageSizeS = request.getParameter("pageSize");
		
		sanphambo spbo= new sanphambo();
		int page = 1;
		int pageSize = 12;
		if(pageS != null ) page = Integer.parseInt(pageS);
		if(pageSizeS != null ) pageSize = Integer.parseInt(pageSizeS);

		ArrayList<sanphambean> listsp = spbo.findAll(page, pageSize);
		request.setAttribute("sp", listsp);
		request.setAttribute("page", page);
		
		request.getRequestDispatcher("SHOP.jsp").forward(request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

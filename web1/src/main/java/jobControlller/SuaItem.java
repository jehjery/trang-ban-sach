package jobControlller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import jobbean.sanphambean;
import jobbo.sanphambo;

/**
 * Servlet implementation class SuaItem
 */
@WebServlet("/SuaItem")
public class SuaItem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SuaItem() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		sanphambo sach= new sanphambo();
		// lay list sach ve
		ArrayList<sanphambean> listsach = sach.findAll();	
	    // lay thogn tin sach can update
		String maloai=request.getParameter("maloai");
		String tensach=request.getParameter("Tensach");
		String masach=request.getParameter("masach");
		String tacgia=request.getParameter("tacgia");
		String soluong=request.getParameter("soluong");
		String gia=request.getParameter("gia");
		String anh=request.getParameter("anh");
		
		for (sanphambean a: listsach)
			{		
				if( (masach.equals(a.getMasp() )))
				{
				 sach.update(new sanphambean(masach,tensach,maloai,Integer.parseInt(soluong),Integer.parseInt(gia),anh,tacgia));
				 
				 RequestDispatcher rd1=request.getRequestDispatcher("ITEMcontroller");
				 rd1.forward(request, response);
				break;
				}
		
			}
		RequestDispatcher rd1=request.getRequestDispatcher("ITEMcontroller");
		rd1.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

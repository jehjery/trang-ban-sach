package jobControlller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jobbean.loaibean;
import jobbo.loaibo;



/**
 * Servlet implementation class SuaLoai
 */
@WebServlet("/SuaLoai")
public class SuaLoai extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SuaLoai() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRe	quest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		loaibo loai= new loaibo();
		ArrayList<loaibean> listloai = loai.findAll();
		int d=0;	
	    String ma=request.getParameter("maloai");
	    String ten=request.getParameter("Tenloai");
		for (loaibean a: listloai)
			{		
				if( (ma.equals(a.getMaloai() )))
				{
				 loai.Update(new loaibean(ma,ten,10));
				 
				    request.setAttribute("Loai", loai.findAll());
					request.getRequestDispatcher("Type.jsp").forward(request, response);
				
				}
		
		 }
		request.setAttribute("Loai", loai.findAll());
		request.getRequestDispatcher("Type.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
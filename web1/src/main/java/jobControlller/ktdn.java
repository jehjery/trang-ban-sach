package jobControlller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import jobbean.ACCbean;
import jobbo.ACCbo;

/**
 * Servlet implementation class ktdn
 */
@WebServlet("/ktdn")
public class ktdn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ktdn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ACCbo user= new ACCbo();
		ArrayList<ACCbean> listuser = user.findAll();
		int d=1;
		//tao session
		HttpSession session= request.getSession();
	    String un=request.getParameter("txtun");
		String pass=request.getParameter("txtpass");
		String lg=request.getParameter("lg");
		
//		if ((lg!=null)||(session.getAttribute("dn")==null)) session.setAttribute("dn","");
		session.setAttribute("dn",un);
//		if(un.equals(dn)&&pass.equals("123")){//Neu dang nhap dung
			//Mo trang maytinh.jsp
		if ((pass!=null)&&(un!=null))
		{
		for (ACCbean a: listuser)
			{		
				if( (pass.equals(a.getMatkhau()) ) && (un.equals(a.getTendangnhap())) )
					{
					d++;
					}
			}
		if (d>1) {RequestDispatcher rd1=request.getRequestDispatcher("Home.jsp");
				 rd1.forward(request, response);}
				 //}else //Neu dang nhap sai
				 else	
				 {
					 RequestDispatcher rd1=request.getRequestDispatcher("login.jsp");
					 rd1.forward(request, response);
				 }
		
		}
		 else	
		 {
			 RequestDispatcher rd1=request.getRequestDispatcher("login.jsp");
			 rd1.forward(request, response);
		 }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

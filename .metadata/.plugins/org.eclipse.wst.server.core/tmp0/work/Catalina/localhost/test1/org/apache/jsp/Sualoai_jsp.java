/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.78
 * Generated at: 2022-12-05 17:38:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.loaibean;

public final class Sualoai_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("bean.loaibean");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; chars	et=UTF-8;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style>\r\n");
      out.write(".form-label{\r\n");
      out.write("    color: darkturquoise;\r\n");
      out.write("    form-check-label{\r\n");
      out.write("    color: darkturquoise!important;\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./sachonl.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("	<title>Registation Form * Form Tutorial</title>\r\n");
      out.write("	<!-- Latest compiled and minified CSS -->\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("	<!-- jQuery library -->\r\n");
      out.write("	<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("	<!-- Popper JS -->\r\n");
      out.write("	<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("	<!-- Latest compiled JavaScript -->\r\n");
      out.write("	<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<section class=\"vh-100\">\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<div class=\"panel panel-primary\">\r\n");
      out.write("			<div class=\"panel-heading\">\r\n");
      out.write("				<h2 class=\"text-center\">Update Loại </h2>\r\n");
      out.write("			</div>\r\n");
      out.write("			");

			response.setCharacterEncoding("utf-8");
			String ma=request.getParameter("maloai");
			String ten=request.getParameter("tenloai");	
			
      out.write("\r\n");
      out.write("			<form action=\"SuaLoai\"method=\"post\">\r\n");
      out.write("			<div class=\"panel-body\">\r\n");
      out.write("				<div class=\"form-group\">\r\n");
      out.write("				  <label for=\"usr\">Mã loại:</label>\r\n");
      out.write("				  <input value=\"");
      out.print(ma );
      out.write("\"\r\n");
      out.write("				  name= \"maloai\" required=\"true\" type=\"text\" class=\"form-control\" id=\"usr\">\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"form-group\">\r\n");
      out.write("				  <label for=\"usr\">Tên loại:</label>\r\n");
      out.write("				  <input value=\"");
      out.print(ten );
      out.write("\" \r\n");
      out.write("				  name= \"Tenloai\" required=\"true\" type=\"text\" class=\"form-control\" id=\"usr\">\r\n");
      out.write("				</div>\r\n");
      out.write("				\r\n");
      out.write("				\r\n");
      out.write("				\r\n");
      out.write("				<!-- <div class=\"form-group\">\r\n");
      out.write("				  <label for=\"address\">Address:</label>\r\n");
      out.write("				  <input type=\"text\" class=\"form-control\" id=\"address\">\r\n");
      out.write("				</div> -->\r\n");
      out.write("				<!-- <div class=\"form-group\">\r\n");
      out.write("				  <label for=\"email\">Email:</label>\r\n");
      out.write("				  <input required=\"true\" type=\"email\" class=\"form-control\" id=\"email\">\r\n");
      out.write("				</div> -->\r\n");
      out.write("				<!-- <div class=\"form-group\">\r\n");
      out.write("				  <label for=\"birthday\">Birthday:</label>\r\n");
      out.write("				  <input type=\"date\" class=\"form-control\" id=\"birthday\">\r\n");
      out.write("				</div> -->\r\n");
      out.write("				<button  class=\"btn btn-success\">Update</button>\r\n");
      out.write("			</div>\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

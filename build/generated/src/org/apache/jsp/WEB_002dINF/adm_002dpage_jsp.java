package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adm_002dpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      java.myPackage.DatabaseClass pDAO = null;
      synchronized (_jspx_page_context) {
        pDAO = (java.myPackage.DatabaseClass) _jspx_page_context.getAttribute("pDAO", PageContext.PAGE_SCOPE);
        if (pDAO == null){
          try {
            pDAO = (java.myPackage.DatabaseClass) java.beans.Beans.instantiate(this.getClass().getClassLoader(), "java.myPackage.DatabaseClass");
          } catch (ClassNotFoundException exc) {
            throw new InstantiationException(exc.getMessage());
          } catch (Exception exc) {
            throw new ServletException("Cannot create bean of class " + "java.myPackage.DatabaseClass", exc);
          }
          _jspx_page_context.setAttribute("pDAO", pDAO, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title></title>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"style-backend.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"top-area\">\n");
      out.write("\t\t<center><h2>Admin Panel</h2></center> <a href=\"controller.jsp?page=logout\" class=\"button\" style=\"float: right;background:crimson;color:white\">Logout</a>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("        ");

            if(session.getAttribute("userStatus")!=null){
            if(session.getAttribute("userStatus").equals("1")){
            
            
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            ");
 
            //pgpart = pagepart, accounts=1,courses=2,questions=3 and profile is default
            if(request.getParameter("pgprt").equals("1")){
                
            
      out.write("\n");
      out.write("            \n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "accounts.jsp", out, false);
      out.write("\n");
      out.write("            \n");
      out.write("            ");

                
            }else if(request.getParameter("pgprt").equals("2")){
            
                
      out.write("\n");
      out.write("            \n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "courses.jsp", out, false);
      out.write("\n");
      out.write("                \n");
      out.write("                ");

                
            }else if(request.getParameter("pgprt").equals("3")){
                
      out.write("\n");
      out.write("            \n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "questions.jsp", out, false);
      out.write("\n");
      out.write("            ");

            }else if(request.getParameter("pgprt").equals("4")){// if( 4 == 4 )
                
      out.write("\n");
      out.write("            \n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "showall.jsp", out, false);
      out.write("\n");
      out.write("            ");

            }else{
                
      out.write("\n");
      out.write("            \n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "profile.jsp", out, false);
      out.write("\n");
      out.write("            \n");
      out.write("            ");

            }
            
      out.write("\n");
      out.write("            \n");
      out.write("            ");

            }else response.sendRedirect("login.jsp");
            }else response.sendRedirect("login.jsp");
                
      out.write("\n");
      out.write("              \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

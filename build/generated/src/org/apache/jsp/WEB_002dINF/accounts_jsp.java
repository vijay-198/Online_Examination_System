package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.myPackage.classes.User;
import java.util.ArrayList;

public final class accounts_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("\n");
      out.write("<!-- SIDEBAR -->\n");
      out.write("\t\t\t<div class=\"sidebar\" style=\"background-image: url(sidebar-1.jpg)\">\n");
      out.write("\t\t\t\t<div class=\"sidebar-background\" >\n");
      out.write("\t\t\t\t\t<h2 class=\"logo-text\">\n");
      out.write("\t\t\t\t\t\tOnline Examination System\n");
      out.write("\t\t\t\t\t</h2>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"left-menu\">\n");
      out.write("\t\t\t\t\t\t<a  href=\"adm-page.jsp?pgprt=0\"><h2>Profile</h2></a>\n");
      out.write("\t\t\t\t\t\t<a href=\"adm-page.jsp?pgprt=2\"><h2>Courses</h2></a>\n");
      out.write("                                                <a href=\"adm-page.jsp?pgprt=3\"><h2>Questions</h2></a>\n");
      out.write("\t\t\t\t\t\t<a class=\"active\" href=\"adm-page.jsp?pgprt=1\"><h2>Accounts</h2></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("            <!-- CONTENT AREA -->\n");
      out.write("\t\t\t<div class=\"content-area\">\n");
      out.write("                            <div class=\"inner\" style=\"margin-top: 50px\">\n");
      out.write("                                <div class=\"title\" style=\"margin-top: -30px\">List of All Registered Persons</div>\n");
      out.write("       \n");
      out.write("                                <br>\n");
      out.write("                                <br>\n");
      out.write("                                <br/>\n");
      out.write("                                <a href=\"register.html\" class=\"button\"><span class=\"add-btn\" style=\"margin-left: 80px;\">Add New Person</span></a>\n");
      out.write("           <br>\n");
      out.write("           \n");
      out.write("           \n");
      out.write("                       <table id=\"one-column-emphasis\" >\n");
      out.write("    <colgroup>\n");
      out.write("    \t<col class=\"oce-first\" />\n");
      out.write("    </colgroup>\n");
      out.write("    <thead>\n");
      out.write("    \t<tr>\n");
      out.write("        \t<th scope=\"col\">Name</th>\n");
      out.write("                \n");
      out.write("            <th scope=\"col\">email</th>\n");
      out.write("            <th scope=\"col\">City</th>\n");
      out.write("            <th scope=\"col\">Address</th>\n");
      out.write("            <th scope=\"col\">Action</th>\n");
      out.write("            \n");
      out.write("        </tr>\n");
      out.write("    </thead>\n");
      out.write("    <tbody>\n");
      out.write("           ");

              ArrayList list=pDAO.getAllUsers();
              User user;
              for(int i=0;i<list.size();i++){
                  user=(User)list.get(i);
                  if(user.getUserId()!= Integer.parseInt(session.getAttribute("userId").toString())){
               
      out.write("\n");
      out.write("   \n");
      out.write("    \t<tr>\n");
      out.write("        \t<td>");
      out.print(user.getFirstName()+" "+user.getLastName() );
      out.write("</td>\n");
      out.write("            <td>");
      out.print(user.getEmail() );
      out.write("</td>\n");
      out.write("            <td>");
      out.print(user.getCity() );
      out.write("</td>\n");
      out.write("            <td>");
      out.print(user.getAddress() );
      out.write("</td>\n");
      out.write("            <td><a href=\"controller.jsp?page=accounts&operation=del&uid=");
      out.print(user.getUserId() );
      out.write("\" \n");
      out.write("                  onclick=\"return confirm('Are you sure you want to delete this ?');\">\n");
      out.write("                <div class=\"delete-btn\" style=\"max-width: 40px;font-size: 17px; padding: 3px\">X</div>\n");
      out.write("                </a></td>\n");
      out.write("            \n");
      out.write("        </tr>\n");
      out.write("         \n");
      out.write("               \n");
      out.write("               \n");
      out.write("               ");

                  }
                  } 
      out.write("\n");
      out.write("               \n");
      out.write("                </tbody>\n");
      out.write("</table>\n");
      out.write("           \n");
      out.write("    \n");
      out.write("                            </div>\n");
      out.write("                        </div>");
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

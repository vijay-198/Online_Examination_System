package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>my website</title>\n");
      out.write("<link href=\"web1.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("var image1=new Image();\n");
      out.write("image1.src=\"IMG/exam6.jpg\"; \n");
      out.write("var image2=new Image();\n");
      out.write("image2.src=\"IMG/exam4.jpg\";\n");
      out.write("var image3=new Image();\n");
      out.write("image3.src=\"IMG/exam1.png\";\n");
      out.write("var image4=new Image();\n");
      out.write("image4.src=\"IMG/exam5.jpg\";\n");
      out.write("var image5=new Image();\n");
      out.write("image5.src=\"IMG/exam16.jpg\";\n");
      out.write("</script>\n");
      out.write("<img src=\"\" name=\"slide\" width=\"1300\" height=\"480\">\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("var step=1;\n");
      out.write("function slideit(){\n");
      out.write("document.images.slide.src=eval(\"image\"+step+\".src\");\n");
      out.write("if(step<5)\n");
      out.write("step++;\n");
      out.write("else\n");
      out.write("step=1;\n");
      out.write("setTimeout(\"slideit()\",3000);\n");
      out.write("}\n");
      out.write("slideit();\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("<div id=\"nav\">\n");
      out.write("<ul>\n");
      out.write("<li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("<li><a href=\"login.jsp\">login</a></li>\n");
      out.write("<li><a href=\"contactuspage.html\">Contact Us</a></li>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("<div id=\"d\">\n");
      out.write("<h1>Welcome to our Website</h1>\n");
      out.write("<p>This website will provide you to take exam online and thus saves your time to go far away. There are different kind of\n");
      out.write("subjects are provided for exam purpose. Candidate can select any subject for which he/she wants to take exam and then\n");
      out.write("he/she can start their exam. System provides the facility to check attempted papers by candidates automatically and shows \n");
      out.write("result after paper submitting.<p>\n");
      out.write("</div>\n");
      out.write("<div id=\"img1\">\n");
      out.write("<img src=\"IMG\\book1.jpg\" width=\"300\" height=\"250\" />\n");
      out.write("<img src=\"IMG\\book2.jpg\" width=\"300\" height=\"250\" />\n");
      out.write("<img src=\"IMG\\book8.jpg\" width=\"300\" height=\"250\" />\n");
      out.write("<img src=\"IMG\\book9.jpg\" width=\"300\" height=\"250\" />\n");
      out.write("<img src=\"IMG\\book4.jpg\" width=\"300\" height=\"250\" />\n");
      out.write("<img src=\"IMG\\booktwo.jpg\" width=\"300\" height=\"250\" />\n");
      out.write("<img src=\"IMG\\bookthree.jpg\" width=\"300\" height=\"250\" />\n");
      out.write("<img src=\"IMG\\bookone.jpg\" width=\"300\" height=\"250\" />\n");
      out.write("<img src=\"IMG\\bookfour.jpg\" width=\"300\" height=\"250\" />\n");
      out.write("<img src=\"IMG\\bookfive.jpg\" width=\"300\" height=\"250\" />\n");
      out.write("<img src=\"IMG\\booksix.jpg\" width=\"300\" height=\"250\" />\n");
      out.write("<img src=\"IMG\\bookseven.jpg\" width=\"300\" height=\"250\" />\n");
      out.write("</div>\n");
      out.write("<div id=\"footer\">\n");
      out.write("Footer Area\n");
      out.write("</div>\n");
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

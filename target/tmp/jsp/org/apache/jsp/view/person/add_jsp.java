package org.apache.jsp.view.person;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Add person</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<h1>add person:</h1>\n");
      out.write("\t<form action=\"person?add\" method=\"post\">\n");
      out.write("\t\t<input type=\"hidden\" name=\"add\">\n");
      out.write("\t\t<ul>\n");
      out.write("\t\t\t<li>name: <input type=\"text\" name=\"name\"></li>\n");
      out.write("\t\t\t<li>street: <input type=\"text\" name=\"street\"></li>\n");
      out.write("\t\t\t<li>city: <input type=\"text\" name=\"city\"></li>\n");
      out.write("\t\t\t<li>state: <input type=\"text\" name=\"state\"></li>\n");
      out.write("\t\t\t<li>zip: <input type=\"text\" name=\"zip\"></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t<input type=\"submit\" value=\"add\">\n");
      out.write("\t</form>\n");
      out.write("\t<a href=\"contacts\">back to contact list</a>\n");
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
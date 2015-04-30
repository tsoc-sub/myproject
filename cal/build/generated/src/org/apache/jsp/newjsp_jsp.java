package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        function flowtime() {\n");
      out.write("            chantime_m = setTimeout(\"timebar_m()\", 1000);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function timebar_m() {\n");
      out.write("            var ti = document.all.timebox_m.value;\n");
      out.write("            ti = ti - 1;\n");
      out.write("\n");
      out.write("            if (ti < 1) {\n");
      out.write("                document.all.timebox_m.value = \"end count\";\n");
      out.write("            } else {\n");
      out.write("                document.all.timebox_m.value = ti;\n");
      out.write("                chantime = setTimeout(\"timebar_m()\", 1000);\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function cleartime() {\n");
      out.write("            clearTimeout(chantime_m);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function move(para) {\n");
      out.write("            var nmonth = document.all.month.value;\n");
      out.write("            if (para == \"prev\") {\n");
      out.write("                document.all.timebox_m.value = nmonth - 1;\n");
      out.write("            }\n");
      out.write("            if (para == \"next\") {\n");
      out.write("                document.all.timebox_m.value = nmonth + 1;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        flowtime();\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <input type =\"text\" name = \"timebox_m\" value = \"300\"><br>\n");
      out.write("        \n");
      out.write("    </body>\n");
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

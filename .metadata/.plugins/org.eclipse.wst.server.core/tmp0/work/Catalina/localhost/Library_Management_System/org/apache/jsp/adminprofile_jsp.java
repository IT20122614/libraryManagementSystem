/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.54
 * Generated at: 2021-11-21 19:31:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1636809372866L));
    _jspx_dependants.put("jar:file:/C:/Users/kavinduSHK/Documents/Eclipse/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Library_Management_System/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\r\n");
      out.write("	<style type=\"text/css\">\r\n");
      out.write("		.container{\r\n");
      out.write("			margin-top: 8%;\r\n");
      out.write("			width: 400px;\r\n");
      out.write("			border: ridge 1.5px white;\r\n");
      out.write("			padding: 20px;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("	</style>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"bodyContent\">\r\n");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /adminprofile.jsp(26,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("cus");
      // /adminprofile.jsp(26,0) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/adminprofile.jsp(26,0) '${userD}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${userD}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\r\n");
            out.write("    \r\n");
            out.write("    \r\n");
            out.write("    \r\n");
            out.write("    \r\n");
            out.write("\r\n");
            out.write("    <main class=\"site-wrapper\">\r\n");
            out.write("        <div class=\"pt-table desktop-768\">\r\n");
            out.write("          <div class=\"pt-tablecell page-home relative\" style=\"background-image: url(https://images.unsplash.com/photo-1486870591958-9b9d0d1dda99?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1500&q=80);\r\n");
            out.write("          background-position: center;\r\n");
            out.write("          background-size: cover;\">\r\n");
            out.write("                          <div class=\"overlay\"></div>\r\n");
            out.write("      \r\n");
            out.write("                          <div>\r\n");
            out.write("                              <div class=\"row\">\r\n");
            out.write("                                  \r\n");
            out.write("                                  \r\n");
            out.write("                                  <div class=\"hexagon-menu clear\">\r\n");
            out.write("                                  \r\n");
            out.write("                                  <div class=\"hexagon-item\">\r\n");
            out.write("                                              <div class=\"hex-item\">\r\n");
            out.write("                                                  <div></div>\r\n");
            out.write("                                                  <div></div>\r\n");
            out.write("                                                  <div></div>\r\n");
            out.write("                                              </div>\r\n");
            out.write("                                              <div class=\"hex-item\">\r\n");
            out.write("                                                  <div></div>\r\n");
            out.write("                                                  <div></div>\r\n");
            out.write("                                                  <div></div>\r\n");
            out.write("                                              </div>\r\n");
            out.write("                                              <a  class=\"hex-content\">\r\n");
            out.write("                                                  <span class=\"hex-content-inner\">\r\n");
            out.write("                                                      <span class=\"icon\">\r\n");
            out.write("                                                          <i class=\"fa fa-universal-access\"></i>\r\n");
            out.write("                                                      </span>\r\n");
            out.write("                                                      <form action=\"profileEdit\" method=\"post\">\r\n");
            out.write("                                              			<input type=\"submit\" value=\"Edit Profile\" name=\"submit\" style=\"background-color: transparent; color: white; border-style: none;\">\r\n");
            out.write("                                              		</form>\r\n");
            out.write("                                                  </span>\r\n");
            out.write("                                                  <svg viewBox=\"0 0 173.20508075688772 200\" height=\"200\" width=\"174\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\"><path d=\"M86.60254037844386 0L173.20508075688772 50L173.20508075688772 150L86.60254037844386 200L0 150L0 50Z\" fill=\"#1e2530\"></path></svg>\r\n");
            out.write("                                              </a>\r\n");
            out.write("                                          </div>\r\n");
            out.write("                                  <div class=\"hexagon-item\">\r\n");
            out.write("                                              <div class=\"hex-item\">\r\n");
            out.write("                                                  <div></div>\r\n");
            out.write("                                                  <div></div>\r\n");
            out.write("                                                  <div></div>\r\n");
            out.write("                                              </div>\r\n");
            out.write("                                              <div class=\"hex-item\">\r\n");
            out.write("                                                  <div></div>\r\n");
            out.write("                                                  <div></div>\r\n");
            out.write("                                                  <div></div>\r\n");
            out.write("                                              </div>\r\n");
            out.write("                                              <a  class=\"hex-content\" href=\"findbook.jsp\">\r\n");
            out.write("                                                  <span class=\"hex-content-inner\">\r\n");
            out.write("                                                      <span class=\"icon\">\r\n");
            out.write("                                                          <i class=\"fa fa-life-ring\"></i>\r\n");
            out.write("                                                      </span>\r\n");
            out.write("                                                      <span class=\"title\">find Book</span>\r\n");
            out.write("                                                  </span>\r\n");
            out.write("                                                  <svg viewBox=\"0 0 173.20508075688772 200\" height=\"200\" width=\"174\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\"><path d=\"M86.60254037844386 0L173.20508075688772 50L173.20508075688772 150L86.60254037844386 200L0 150L0 50Z\" fill=\"#1e2530\"></path></svg>\r\n");
            out.write("                                              </a>\r\n");
            out.write("                                          </div>\r\n");
            out.write("                                  	\r\n");
            out.write("                                  	\r\n");
            out.write("                                          <div class=\"hexagon-item\">\r\n");
            out.write("                                              <div class=\"hex-item\">\r\n");
            out.write("                                                  <div></div>\r\n");
            out.write("                                                  <div></div>\r\n");
            out.write("                                                  <div></div>\r\n");
            out.write("                                              </div>\r\n");
            out.write("                                              <div class=\"hex-item\">\r\n");
            out.write("                                                  <div></div>\r\n");
            out.write("                                                  <div></div>\r\n");
            out.write("                                                  <div></div>\r\n");
            out.write("                                              </div>\r\n");
            out.write("                                              <a  class=\"hex-content\" href=\"addbook.jsp\">\r\n");
            out.write("                                                  <span class=\"hex-content-inner\">\r\n");
            out.write("                                                      <span class=\"icon\">\r\n");
            out.write("                                                          <i class=\"fa fa-clipboard\"></i>\r\n");
            out.write("                                                      </span>\r\n");
            out.write("                                                      <span class=\"title\">Add new Book</span>\r\n");
            out.write("                                                  </span>\r\n");
            out.write("                                                  <svg viewBox=\"0 0 173.20508075688772 200\" height=\"200\" width=\"174\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\"><path d=\"M86.60254037844386 0L173.20508075688772 50L173.20508075688772 150L86.60254037844386 200L0 150L0 50Z\" fill=\"#1e2530\"></path></svg>\r\n");
            out.write("                                              </a>\r\n");
            out.write("                                          </div>\r\n");
            out.write("                                           <div class=\"hexagon-item\">\r\n");
            out.write("                                              <div class=\"hex-item\">\r\n");
            out.write("                                                  <div></div>\r\n");
            out.write("                                                  <div></div>\r\n");
            out.write("                                                  <div></div>\r\n");
            out.write("                                              </div>\r\n");
            out.write("                                              <div class=\"hex-item\">\r\n");
            out.write("                                                  <div></div>\r\n");
            out.write("                                                  <div></div>\r\n");
            out.write("                                                  <div></div>\r\n");
            out.write("                                              </div>\r\n");
            out.write("                                              <a  class=\"hex-content\" href=\"editFindBook.jsp\">\r\n");
            out.write("                                                  <span class=\"hex-content-inner\">\r\n");
            out.write("                                                      <span class=\"icon\">\r\n");
            out.write("                                                          <i class=\"fa fa-clipboard\"></i>\r\n");
            out.write("                                                      </span>\r\n");
            out.write("                                                      <span class=\"title\">Edit Book</span>\r\n");
            out.write("                                                  </span>\r\n");
            out.write("                                                  <svg viewBox=\"0 0 173.20508075688772 200\" height=\"200\" width=\"174\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\"><path d=\"M86.60254037844386 0L173.20508075688772 50L173.20508075688772 150L86.60254037844386 200L0 150L0 50Z\" fill=\"#1e2530\"></path></svg>\r\n");
            out.write("                                              </a>\r\n");
            out.write("                                          </div>\r\n");
            out.write("                                          <div class=\"hexagon-item\">\r\n");
            out.write("                                              <div class=\"hex-item\">\r\n");
            out.write("                                                  <div></div>\r\n");
            out.write("                                                  <div></div>\r\n");
            out.write("                                                  <div></div>\r\n");
            out.write("                                              </div>\r\n");
            out.write("                                              <div class=\"hex-item\">\r\n");
            out.write("                                                  <div></div>\r\n");
            out.write("                                                  <div></div>\r\n");
            out.write("                                                  <div></div>\r\n");
            out.write("                                              </div>\r\n");
            out.write("                                              \r\n");
            out.write("                                              <a  class=\"hex-content\">\r\n");
            out.write("                                                  <span class=\"hex-content-inner\">\r\n");
            out.write("                                                      <span class=\"icon\">\r\n");
            out.write("                                                          <i class=\"fa fa-clipboard\"></i>\r\n");
            out.write("                                                      </span>\r\n");
            out.write("                                                     \r\n");
            out.write("                                                      <div class=\"stats\">\r\n");
            out.write("                                                        <form action=\"display\" method=\"post\">\r\n");
            out.write("                                                        <input type=\"submit\" value=\"View all books\" name=\"submit\" style=\"background-color: transparent; color: white; border-style: none;\">\r\n");
            out.write("                                                        </form>\r\n");
            out.write("                                                    </div>\r\n");
            out.write("                                                  </span>\r\n");
            out.write("                                                  <svg viewBox=\"0 0 173.20508075688772 200\" height=\"200\" width=\"174\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\"><path d=\"M86.60254037844386 0L173.20508075688772 50L173.20508075688772 150L86.60254037844386 200L0 150L0 50Z\" fill=\"#1e2530\"></path></svg>\r\n");
            out.write("                                              </a>\r\n");
            out.write("                                          </div>\r\n");
            out.write("                                  \r\n");
            out.write("                                  </div>\r\n");
            out.write("                                      \r\n");
            out.write("      \r\n");
            out.write("                                    <div class=\"container d-flex justify-content-center align-items-center\">\r\n");
            out.write("                                        <div class=\"card\">\r\n");
            out.write("                                            <div class=\"upper\"> <img src=\"https://i.imgur.com/Qtrsrk5.jpg\" class=\"img-fluid\"> </div>\r\n");
            out.write("                                            <div class=\"user text-center\">\r\n");
            out.write("                                                <div class=\"profile\"> <img src=\"https://i.imgur.com/JgYD2nQ.jpg\" class=\"rounded-circle\" width=\"80\"> </div>\r\n");
            out.write("                                            </div>\r\n");
            out.write("                                            <div class=\"mt-5 text-center\">\r\n");
            out.write("                                                <h4 class=\"mb-0\">Admin ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cus.username }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</h4> <span class=\"text-muted d-block mb-2\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cus.email }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</span>\r\n");
            out.write("                                                <form action=\"logout\" method=\"post\">\r\n");
            out.write("                                                	<input type=\"submit\" class=\"btn btn-primary btn-sm follow\" value=\"logout\">\r\n");
            out.write("                                                </form>\r\n");
            out.write("                                                 \r\n");
            out.write("                                                 \r\n");
            out.write("                                                <div class=\"d-flex justify-content-between align-items-center mt-4 px-4\">\r\n");
            out.write("                                                    <div class=\"stats\">\r\n");
            out.write("                                                        <h6 class=\"mb-0\">Phone</h6> <span>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cus.phone }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</span>\r\n");
            out.write("                                                    </div>\r\n");
            out.write("                                                    \r\n");
            out.write("                                                    \r\n");
            out.write("                                                    \r\n");
            out.write("                                                </div>\r\n");
            out.write("                                            </div>\r\n");
            out.write("                                        </div>\r\n");
            out.write("                                    </div>\r\n");
            out.write("\r\n");
            out.write("\r\n");
            out.write("                                  \r\n");
            out.write("                              </div>\r\n");
            out.write("                          </div>\r\n");
            out.write("                      </div>\r\n");
            out.write("                  </div>\r\n");
            out.write("        </main>\r\n");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}

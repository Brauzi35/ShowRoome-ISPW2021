/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: JspC/ApacheTomcat9
 * Generated at: 2021-07-03 13:40:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import logic.utils.SessionArtist;

public final class MapArtist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("logic.utils.SessionArtist");
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

      out.write("\r\n    \r\n    \r\n    ");

    String place = (String)session.getAttribute("Posto");
    String address = (String)session.getAttribute("Indirizzo");
    SessionArtist instanceA = SessionArtist.getInstance();
    String username = instanceA.getUsername();

    
    int capacity = (int)session.getAttribute("Capienza");
    
      out.write("\r\n    \r\n<!DOCTYPE html>\r\n<html  lang=\"it\">\r\n  <body style=\"height: 512px; background-color: white;\"><img src=\"https://github.com/Brauzi35/ShowRoome-ISPW2021/blob/main/Immagini/26362.png?raw=true\" alt=\"\" style=\"width: 93px; height: 73px; margin-left: -2px;\"><br>\r\n    <h1 style=\"margin-top: -45.5667px; margin-left: 115px;\"> ShowRoome Performer </h1>\r\n    <h1 style=\"margin-top:84px;margin-left:3px;\">    \r\n  \r\n      \r\n    <h1 style=\"margin-top:84px;margin-left:3px;\">\r\n       <form action=\"TastoChart\" method=\"post\">\r\n        <p style=\"margin-top:-74px;margin-left:160px;\"><button name=\"Profile\" style=\"height: 35px ; width: 95px; margin-top: -48px; margin-left: 570px;background-color: #4D4D4D;\">Chart</button>\r\n        </p>\r\n      </form>\r\n      <form action=\"TastoMap\" method=\"post\">\r\n        <p style=\"margin-top:-74px;margin-left:-180px;\"><button name=\"Profile\" style=\"height: 35px ; width: 95px; margin-top: -48px; margin-left: 570px;color:white; background-color: #4D4D4D;\">Map</button>\r\n        </p>\r\n      </form>\r\n      <form action=\"Homepage\" method=\"post\">\r\n");
      out.write("        <p style=\"margin-top:-74px;margin-left:-555px;\"><button name=\"Profile\" style=\"height: 35px ; width: 95px; margin-top: -46px; margin-left: 570px;background-color: #4D4D4D;\">Homepage</button>\r\n        </p>\r\n      </form>\r\n      <form action=\"HostShowWebController\" method=\"get\">\r\n        <p style=\"margin-top:-74px;margin-left:937px;\"><button name=\"Proposte\" style=\"height: 35px ; width: 95px; margin-top: -48px; margin-left: 210px;background-color: #4D4D4D;\">Proposte</button></p>\r\n      </form>\r\n    </h1>\r\n    <h1 style=\"margin-top: -74px;margin-left:px ;background-color: white;\">\r\n      <style>\r\n#rectangle {\r\n    width: 1250px;\r\n    height: 50px;\r\n    background: #10030F;\r\n}\r\n</style> <div id=\"rectangle\"></div>\r\n    </h1>\r\n                  <h1 style=\"margin-top: -159px; margin-left: 1100px;\"> <input value=");
      out.print(username );
      out.write(" size=\"65\" maxlength=\"40\" ;style=\"background-color:\" #10030f=\"\" type=\"submit\"> </h1>\r\n          <form action=\"Logout\" method=\"post\">          <h1 style=\"margin-left: 1190px;margin-top: -57px;\" > <input value=\"logout\" size=\"65\" maxlength=\"40\" ;style=\"background-color:\" #10030f=\"\" type=\"submit\"> </h1></form> \r\n    \r\n    \r\n \r\n <div id=\"container2\"  style=\"margin-top: 100px;\">\r\n  <h1> <label  style=\"width: 300x; height: 40px;position:absolute;margin-top: 30px;z-index:0;margin-left:1000px\"></label>    </h1> \r\n<textarea name=\"text1\" id=\"text1\" readonly=\"readonly\";  style=\"resize: none; width: 300x; height: 40px;position:absolute;margin-top: 100px;z-index:0;margin-left:1000px\">");
      out.print( place );
      out.write("</textarea>\r\n<textarea name=\"text2\" id=\"text2\" readonly=\"readonly\";  style=\"resize: none; width: 300x; height: 40px;position:absolute;margin-top: 180px;z-index:0;margin-left:1000px\">");
      out.print( address );
      out.write("</textarea>\r\n<textarea name=\"text3\" id=\"text3\" readonly=\"readonly\";  style=\"resize: none; width: 300x; height: 40px;position:absolute;margin-top: 260px;z-index:0;margin-left:1000px\">");
      out.print( capacity );
      out.write("</textarea>\r\n\r\n \r\n\r\n \r\n\r\n \r\n\r\n</div>\r\n \r\n <form action =\"TastoMapArtista\" method = \"post\">\r\n <div class=\"container\" style=\" margin-top: 140px;\"\">\r\n     <img src=\"https://www.researchgate.net/profile/Francesco-Mensa/publication/330994606/figure/fig1/AS:724708081283073@1549795279179/Figura-125-Mappa-della-citta-di-Roma-I-punti-colorati-indicano-i-luoghi-visitati.png\" alt=\"\" style=\"width: 976x; height: 976px; margin-left: -2px; overflow:hidden; z-index:-1\">\r\n     \r\n<button type=\"submit\" name=\"action\" value=\"Eur\" onclick=\"myFunction()\" style=\"width: 60x; height: 60px; background-color: Transparent; border: none; margin-top: 750px; position:absolute; margin-left:-600px; float:left;\"><img src=\"https://image.flaticon.com/icons/png/512/48/48703.png\" style=\"width: 55x; height: 55px;\" /></button>\r\n<button  type=\"submit\" name=\"action\" value=\"Villa\" onclick=\"myFunction()\" style=\"width: 60x; height: 60px; background-color: Transparent; border: none; margin-top: 470px; position:absolute; margin-left:-650px; float:left;\"><img src=\"https://image.flaticon.com/icons/png/512/48/48703.png\" style=\"width: 55x; height: 55px;\" /></button>\r\n");
      out.write("<button  type=\"submit\" name=\"action\" value=\"Pigneto\" onclick=\"myFunction()\" style=\"width: 60x; height: 60px; background-color: Transparent; border: none; margin-top: 470px; position:absolute; margin-left:-350px; float:left;\"><img src=\"https://image.flaticon.com/icons/png/512/48/48703.png\" style=\"width: 55x; height: 55px;\" /></button>\r\n<button  type=\"submit\" name=\"action\" value=\"Statuario\" onclick=\"myFunction()\" style=\"width: 60x; height: 60px; background-color: Transparent; border: none; margin-top: 700px; position:absolute; margin-left:-270px; float:left;\"><img src=\"https://image.flaticon.com/icons/png/512/48/48703.png\" style=\"width: 55x; height: 55px;\" /></button>\r\n</div>\r\n</form>\r\n\r\n \r\n\r\n \r\n\r\n<script>\r\nfunction myFunction() {\r\n    elem=document.getElementById(\"container2\");\r\n    elem.style.display=\"block\";\r\n\r\n \r\n\r\n \r\n\r\n}\r\n</script>\r\n \r\n    \r\n<div id=\"risultato\"></div>\r\n\r\n \r\n<form action=\"TastoMapArtista\" method=\"post\">\r\n<textarea name=\"text1\" id=\"text1\" ;  style=\"resize: none; width: 300x; height: 40px;position:absolute;margin-top: -150px;z-index:0;margin-left:1000px\">Inserire nome evento</textarea>\r\n");
      out.write("<textarea name=\"text2\" id=\"text2\" ; style=\"resize: none; width: 300x; height: 40px;position:absolute;margin-top: -100px;z-index:0;margin-left:1000px\">Inserire descrizione evento</textarea>\r\n<textarea name=\"plc\" id=\"plc\" readonly=\"readonly\";  style=\"display:none; resize: none; width: 300x; height: 40px;position:absolute;margin-top: 660px;z-index:0;margin-left:1000px\">");
      out.print( place );
      out.write("</textarea>\r\n<textarea name=\"plc6\" id=\"plc6\" value=\"control\" readonly=\"readonly\";  style=\"display:none; resize: none; width: 300x; height: 40px;position:absolute;margin-top: 660px;z-index:0;margin-left:1000px\">control</textarea>\r\n    <p style=\"margin-top:-400px;margin-left:880px;\"><button type=\"submit\" name=\"prenota\" style=\"height: 35px; width: 95px; margin-top: -48px; margin-left: 160px;background-color: #4D4D4D;\">Prenota</button></p></form>\r\n\r\n \r\n</form>\r\n \r\n\r\n \r\n\r\n\r\n</html>\r\n\r\n \r\n\r\n \r\n\r\n \r\n\r\n \r\n\r\n \r\n\r\n ");
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

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.87
 * Generated at: 2024-04-16 18:01:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ManageBooking_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write(" <title>Manage Bus Details</title>\r\n");
      out.write("<head>\r\n");
      out.write("	<meta charset=\"UTF-8\">\r\n");
      out.write("	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<link href='https://unpkg.com/boxicons@2.0.9/css/boxicons.min.css' rel='stylesheet'>\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("\r\n");
      out.write("	<title>AdminHub</title>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("* {\r\n");
      out.write("	margin: 0;\r\n");
      out.write("	padding: 0;\r\n");
      out.write("	box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a {\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li {\r\n");
      out.write("	list-style: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(":root {\r\n");
      out.write("	--poppins: 'Poppins', sans-serif;\r\n");
      out.write("	--lato: 'Lato', sans-serif;\r\n");
      out.write("\r\n");
      out.write("	--light: #F9F9F9;\r\n");
      out.write("	--blue: #3C91E6;\r\n");
      out.write("	--light-blue: #CFE8FF;\r\n");
      out.write("	--grey: #eee;\r\n");
      out.write("	--dark-grey: #AAAAAA;\r\n");
      out.write("	--dark: #342E37;\r\n");
      out.write("	--red: #DB504A;\r\n");
      out.write("	--yellow: #FFCE26;\r\n");
      out.write("	--light-yellow: #FFF2C6;\r\n");
      out.write("	--orange: #FD7238;\r\n");
      out.write("	--light-orange: #FFE0D3;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("html {\r\n");
      out.write("	overflow-x: hidden;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body.dark {\r\n");
      out.write("	--light: #0C0C1E;\r\n");
      out.write("	--grey: #060714;\r\n");
      out.write("	--dark: #FBFBFB;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("	background: var(--grey);\r\n");
      out.write("	overflow-x: hidden;\r\n");
      out.write("}\r\n");
      out.write(".container {\r\n");
      out.write("    max-width: 800px;\r\n");
      out.write("    margin: 50px auto;\r\n");
      out.write("    background-color: #fff; \r\n");
      out.write("    padding: 20px;\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\r\n");
      out.write("    text-align: center; \r\n");
      out.write("}\r\n");
      out.write(".heading {\r\n");
      out.write("    color: blue; \r\n");
      out.write("    font-size: 36px; \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("#sidebar {\r\n");
      out.write("	position: fixed;\r\n");
      out.write("	top: 0;\r\n");
      out.write("	left: 0;\r\n");
      out.write("	width: 280px;\r\n");
      out.write("	height: 100%;\r\n");
      out.write("	background: var(--light);\r\n");
      out.write("	z-index: 2000;\r\n");
      out.write("	font-family: var(--lato);\r\n");
      out.write("	transition: .3s ease;\r\n");
      out.write("	overflow-x: hidden;\r\n");
      out.write("	scrollbar-width: none;\r\n");
      out.write("}\r\n");
      out.write("#sidebar::--webkit-scrollbar {\r\n");
      out.write("	display: none;\r\n");
      out.write("}\r\n");
      out.write("#sidebar.hide {\r\n");
      out.write("	width: 60px;\r\n");
      out.write("}\r\n");
      out.write("#sidebar .brand {\r\n");
      out.write("	font-size: 40px;\r\n");
      out.write("	font-weight: 700;\r\n");
      out.write("	height: 56px;\r\n");
      out.write("	display: flex;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("	color: var(--blue);\r\n");
      out.write("	position: sticky;\r\n");
      out.write("	top: 0;\r\n");
      out.write("	left: 20;\r\n");
      out.write("	background: var(--light);\r\n");
      out.write("	z-index: 500;\r\n");
      out.write("	padding-bottom: 20px;\r\n");
      out.write("	box-sizing: content-box;\r\n");
      out.write("}\r\n");
      out.write("#sidebar .brand .bx {\r\n");
      out.write("	min-width: 60px;\r\n");
      out.write("	display: flex;\r\n");
      out.write("	justify-content: center;\r\n");
      out.write("}\r\n");
      out.write("#sidebar .side-menu {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	margin-top: 48px;\r\n");
      out.write("}\r\n");
      out.write("#sidebar .side-menu li {\r\n");
      out.write("	height: 48px;\r\n");
      out.write("	background: transparent;\r\n");
      out.write("	margin-left: 6px;\r\n");
      out.write("	border-radius: 48px 0 0 48px;\r\n");
      out.write("	padding: 4px;\r\n");
      out.write("}\r\n");
      out.write("#sidebar .side-menu li.active {\r\n");
      out.write("	background: var(--grey);\r\n");
      out.write("	position: relative;\r\n");
      out.write("}\r\n");
      out.write("#sidebar .side-menu li.active::before {\r\n");
      out.write("	content: '';\r\n");
      out.write("	position: absolute;\r\n");
      out.write("	width: 40px;\r\n");
      out.write("	height: 40px;\r\n");
      out.write("	border-radius: 50%;\r\n");
      out.write("	top: -40px;\r\n");
      out.write("	right: 0;\r\n");
      out.write("	box-shadow: 20px 20px 0 var(--grey);\r\n");
      out.write("	z-index: -1;\r\n");
      out.write("}\r\n");
      out.write("#sidebar .side-menu li.active::after {\r\n");
      out.write("	content: '';\r\n");
      out.write("	position: absolute;\r\n");
      out.write("	width: 40px;\r\n");
      out.write("	height: 40px;\r\n");
      out.write("	border-radius: 50%;\r\n");
      out.write("	bottom: -40px;\r\n");
      out.write("	right: 0;\r\n");
      out.write("	box-shadow: 20px -20px 0 var(--grey);\r\n");
      out.write("	z-index: -1;\r\n");
      out.write("}\r\n");
      out.write("#sidebar .side-menu li a {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	height: 100%;\r\n");
      out.write("	background: var(--light);\r\n");
      out.write("	display: flex;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("	border-radius: 48px;\r\n");
      out.write("	font-size: 16px;\r\n");
      out.write("	color: var(--dark);\r\n");
      out.write("	white-space: nowrap;\r\n");
      out.write("	overflow-x: hidden;\r\n");
      out.write("}\r\n");
      out.write("#sidebar .side-menu.top li.active a {\r\n");
      out.write("	color: var(--blue);\r\n");
      out.write("}\r\n");
      out.write("#sidebar.hide .side-menu li a {\r\n");
      out.write("	width: calc(48px - (4px * 2));\r\n");
      out.write("	transition: width .3s ease;\r\n");
      out.write("}\r\n");
      out.write("#sidebar .side-menu li a.logout {\r\n");
      out.write("	color: var(--red);\r\n");
      out.write("}\r\n");
      out.write("#sidebar .side-menu.top li a:hover {\r\n");
      out.write("	color: var(--blue);\r\n");
      out.write("}\r\n");
      out.write("#sidebar .side-menu li a .bx {\r\n");
      out.write("	min-width: calc(60px  - ((4px + 6px) * 2));\r\n");
      out.write("	display: flex;\r\n");
      out.write("	justify-content: center;\r\n");
      out.write("}\r\n");
      out.write("#content {\r\n");
      out.write("	position: relative;\r\n");
      out.write("	width: calc(100% - 280px);\r\n");
      out.write("	left: 280px;\r\n");
      out.write("	transition: .3s ease;\r\n");
      out.write("}\r\n");
      out.write("#sidebar.hide ~ #content {\r\n");
      out.write("	width: calc(100% - 60px);\r\n");
      out.write("	left: 60px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {font-family: Arial, Helvetica, sans-serif;}\r\n");
      out.write("* {box-sizing: border-box;}\r\n");
      out.write("\r\n");
      out.write("/* Button used to open the contact form - fixed at the bottom of the page */\r\n");
      out.write(".open-button {\r\n");
      out.write("  background-color: #555;\r\n");
      out.write("  color: white;\r\n");
      out.write("  padding: 16px 20px;\r\n");
      out.write("  border: none;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("  opacity: 0.8;\r\n");
      out.write("  position: fixed;\r\n");
      out.write("  top: 40%;\r\n");
      out.write("  left: 40%;\r\n");
      out.write("  transform: translate(-50%, -50%);\r\n");
      out.write("  width: 280px;\r\n");
      out.write("}\r\n");
      out.write(".open-button-delete {\r\n");
      out.write("  background-color: #555;\r\n");
      out.write("  color: white;\r\n");
      out.write("  padding: 16px 20px;\r\n");
      out.write("  border: none;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("  opacity: 0.8;\r\n");
      out.write("  position: fixed;\r\n");
      out.write("  top: 50%;\r\n");
      out.write("  left: 40%;\r\n");
      out.write("  transform: translate(-50%, -50%);\r\n");
      out.write("  width: 280px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/* The popup form - hidden by default */\r\n");
      out.write(".form-popup {\r\n");
      out.write("  display: none;\r\n");
      out.write("  position: fixed;\r\n");
      out.write("  bottom: -20;\r\n");
      out.write("  right: 15px;\r\n");
      out.write("  border: 3px solid #f1f1f1;\r\n");
      out.write("  z-index: 9;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Add styles to the form container */\r\n");
      out.write(".form-container {\r\n");
      out.write("  max-width: 400px;\r\n");
      out.write("  padding: 20px;\r\n");
      out.write("  background-color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Full-width input fields */\r\n");
      out.write(".form-container input[type=text] {\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  padding: 15px;\r\n");
      out.write("  margin: 5px 0 22px 0;\r\n");
      out.write("  border: none;\r\n");
      out.write("  background: #f1f1f1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* When the inputs get focus, do something */\r\n");
      out.write(".form-container input[type=text]:focus{\r\n");
      out.write("  background-color: #ddd;\r\n");
      out.write("  outline: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Set a style for the submit/login button */\r\n");
      out.write(".form-container .btn {\r\n");
      out.write("  background-color: #04AA6D;\r\n");
      out.write("  color: white;\r\n");
      out.write("  padding: 16px 20px;\r\n");
      out.write("  border: none;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  margin-bottom:10px;\r\n");
      out.write("  opacity: 0.8;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Add a red background color to the cancel button */\r\n");
      out.write(".form-container .cancel {\r\n");
      out.write("  background-color: red;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Add some hover effects to buttons */\r\n");
      out.write(".form-container .btn:hover, .open-button:hover {\r\n");
      out.write("  opacity: 1;\r\n");
      out.write("}\r\n");
      out.write(".form-popup-delete {\r\n");
      out.write("  display: none;\r\n");
      out.write("  position: fixed;\r\n");
      out.write("  bottom: -20;\r\n");
      out.write("  right: 50px;\r\n");
      out.write("  border: 3px solid #f1f1f1;\r\n");
      out.write("  z-index: 9;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("form-container-delete {\r\n");
      out.write("  max-width: 400px;\r\n");
      out.write("  padding: 50px;\r\n");
      out.write("  background-color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Full-width input fields */\r\n");
      out.write(".form-container-delete input[type=text] {\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  padding: 15px;\r\n");
      out.write("  margin: 5px 0 22px 0;\r\n");
      out.write("  border: none;\r\n");
      out.write("  background: #f1f1f1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* When the inputs get focus, do something */\r\n");
      out.write(".form-container-delete input[type=text]:focus{\r\n");
      out.write("  background-color: #ddd;\r\n");
      out.write("  outline: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Set a style for the submit*/\r\n");
      out.write(".form-container-delete .btn {\r\n");
      out.write("  background-color: #04AA6D;\r\n");
      out.write("  color: white;\r\n");
      out.write("  padding: 16px 20px;\r\n");
      out.write("  border: none;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  margin-bottom:10px;\r\n");
      out.write("  opacity: 0.8;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Add a red background color to the cancel button */\r\n");
      out.write(".form-container-delete .cancel {\r\n");
      out.write("  background-color: red;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Add some hover effects to buttons */\r\n");
      out.write(".form-container-delete .btn:hover, .open-button:hover {\r\n");
      out.write("  opacity: 1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<section id=\"sidebar\">\r\n");
      out.write("		<a href=\"#\" class=\"brand\">\r\n");
      out.write("			\r\n");
      out.write("			<span class=\"text\">Admin</span>\r\n");
      out.write("		</a>\r\n");
      out.write("		<ul class=\"side-menu top\">\r\n");
      out.write("			<li class=\"active\">\r\n");
      out.write("				<a href=\"http://localhost:8090/BusDemostrate/dashBoard.jsp\">\r\n");
      out.write("					<i class='bx bxs-dashboard' ></i>\r\n");
      out.write("		 			<span class=\"text\">Dashboard</span>\r\n");
      out.write("				</a>\r\n");
      out.write("			</li>\r\n");
      out.write("			<li>\r\n");
      out.write("				<a href=\"#\">\r\n");
      out.write("					<i class='bx bxs-shopping-bag-alt' ></i>\r\n");
      out.write("					<span class=\"text\">My Store</span>\r\n");
      out.write("				</a>\r\n");
      out.write("			</li>\r\n");
      out.write("			<li>\r\n");
      out.write("				<a href=\"#\">\r\n");
      out.write("					<i class='bx bxs-doughnut-chart' ></i>\r\n");
      out.write("					<span class=\"text\">Analytics</span>\r\n");
      out.write("				</a>\r\n");
      out.write("			</li>\r\n");
      out.write("			<li>\r\n");
      out.write("				<a href=\"#\">\r\n");
      out.write("					<i class='bx bxs-message-dots' ></i>\r\n");
      out.write("					<span class=\"text\">Messages</span>\r\n");
      out.write("				</a>\r\n");
      out.write("			</li>\r\n");
      out.write("			<li>\r\n");
      out.write("				<a href=\"#\">\r\n");
      out.write("					<i class='bx bxs-group' ></i>\r\n");
      out.write("					<span class=\"text\">Our Team</span>\r\n");
      out.write("				</a>\r\n");
      out.write("			</li>\r\n");
      out.write("		</ul>\r\n");
      out.write("		<ul class=\"side-menu\">\r\n");
      out.write("			<li>\r\n");
      out.write("				<a href=\"#\">\r\n");
      out.write("					<i class='bx bxs-cog' ></i>\r\n");
      out.write("					<span class=\"text\">Settings</span>\r\n");
      out.write("				</a>\r\n");
      out.write("			</li>\r\n");
      out.write("			<li>\r\n");
      out.write("				<a href=\"#\" class=\"logout\">\r\n");
      out.write("					<i class='bx bxs-log-out-circle' ></i>\r\n");
      out.write("					<span class=\"text\">Logout</span>\r\n");
      out.write("				</a>\r\n");
      out.write("			</li>\r\n");
      out.write("		</ul>\r\n");
      out.write("	</section>\r\n");
      out.write("	\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <h2 class=\"heading\">Manage Booking</h2>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<button class=\"open-button\" onclick=\"openForm()\">View Booking</button>\r\n");
      out.write("\r\n");
      out.write("<div class=\"form-popup\" id=\"myForm\">\r\n");
      out.write("  <form action=\"/action_page.php\" class=\"form-container\" method=\"post\">\r\n");
      out.write("  <h2 style=\"color: #333; font-size: 24px;\">View Booking</h2>\r\n");
      out.write("    <label for=\"text\"><b>Enter BookingId:</b></label>\r\n");
      out.write("    <input type=\"text\" placeholder=\"Enter busid\" name=\"busid\" required>\r\n");
      out.write("\r\n");
      out.write("    <button type=\"submit\" class=\"btn\">View</button>\r\n");
      out.write("    <button type=\"button\" class=\"btn cancel\" onclick=\"closeForm()\">Close</button>\r\n");
      out.write("  </form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<button class=\"open-button-delete\" onclick=\"openFormDelete()\">Delete Booking</button>\r\n");
      out.write("<div class=\"form-popup-delete\" id=\"myFormdelete\">\r\n");
      out.write("  <form action=\"/action_page.php\" class=\"form-container-delete\">\r\n");
      out.write("   <h2 style=\"color: #333; font-size: 24px;\">Delete Booking</h2>\r\n");
      out.write("    <label for=\"text\"><b>Enter BookingId:</b></label>\r\n");
      out.write("    <input type=\"text\" placeholder=\"Enter busid\" name=\"busid\" required>\r\n");
      out.write("    <button type=\"submit\" class=\"btn\">Delete </button>\r\n");
      out.write("    <button type=\"button\" class=\"btn cancel\" onclick=\"closeFormDelete()\">Cancel</button>\r\n");
      out.write("  </form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("function openForm() {\r\n");
      out.write("  document.getElementById(\"myForm\").style.display = \"block\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function closeForm() {\r\n");
      out.write("  document.getElementById(\"myForm\").style.display = \"none\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function openFormDelete() {\r\n");
      out.write("	  document.getElementById(\"myFormdelete\").style.display = \"block\";\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	function closeFormDelete() {\r\n");
      out.write("	  document.getElementById(\"myFormdelete\").style.display = \"none\";\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("    ");
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

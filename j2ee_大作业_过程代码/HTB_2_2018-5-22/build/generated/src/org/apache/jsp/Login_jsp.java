package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<!-- <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"> -->\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<title>Flat - Responsive HTML Template</title>\r\n");
      out.write("<!-- load stylesheets -->\r\n");
      out.write("<!-- <link rel=\"stylesheet\" href=\"http://fonts.useso.com/css?family=Open+Sans:300,400\"> -->\r\n");
      out.write("<!-- Google web font \"Open Sans\" -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"font-awesome-4.6.3/css/font-awesome.min.css\">\r\n");
      out.write("<!-- Font awesome -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css1/bootstrap.min.css\">\r\n");
      out.write("<!-- Bootstrap style -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css1/hero-slider-style.css\">\r\n");
      out.write("<!-- Hero slider style (https://codyhouse.co/gem/hero-slider/) -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css1/magnific-popup.css\">\r\n");
      out.write("<!-- Magnific popup style (http://dimsemenov.com/plugins/magnific-popup/) -->\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css1/templatemo-style.css\">\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!-- Content -->\r\n");
      out.write("<div class=\"cd-hero\">\r\n");
      out.write("  <ul class=\"cd-hero-slider\">\r\n");
      out.write("    <!-- autoplay -->\r\n");
      out.write("    <li class=\"selected\">\r\n");
      out.write("      <div class=\"cd-full-width\">\r\n");
      out.write("        <div class=\"container-fluid js-tm-page-content\" data-page-no=\"5\">\r\n");
      out.write("          <div class=\"tm-contact-page\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("              <div class=\"col-xs-12\">\r\n");
      out.write("                <h2 class=\"tm-section-title\">Welcome back to us</h2>\r\n");
      out.write("                <p class=\"tm-text tm-font-w-400 m-b-3\">The Bible tell us how to live WeLife</p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <!-- contact form -->\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("              <form action=\"");
      out.print(request.getContextPath());
      out.write("/Login\" method=\"post\" class=\"tm-contact-form\">\r\n");
      out.write("                <div class=\"col-xs-12 col-sm-6 col-md-6 col-lg-6 col-xl-6\">\r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                    <input type=\"text\" id=\"name\" name=\"username\" class=\"form-control\" placeholder=\"Your Name\"  required/>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                    <input type=\"password\" id=\"psd\" name=\"password\" class=\"form-control\" placeholder=\"Your Password\"  required/>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-xs-12 col-sm-6 col-md-6 col-lg-6 col-xl-6\">\r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                    <textarea id=\"contact_message\" name=\"contact_message\" class=\"form-control\" rows=\"4\" placeholder=\"So How is the day today?\" required></textarea>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>           \r\n");
      out.write("                <div class=\"col-xs-12\">\r\n");
      out.write("                  <button type=\"submit\" class=\"pull-xs-centre tm-submit-btn\">Login</button>\r\n");
      out.write("                </div>\r\n");
      out.write("              </form>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- .cd-full-width --> \r\n");
      out.write("    </li>\r\n");
      out.write("  </ul>\r\n");
      out.write("  <!-- .cd-hero-slider --> \r\n");
      out.write("  \r\n");
      out.write("</div>\r\n");
      out.write("<!-- .cd-hero --> \r\n");
      out.write("\r\n");
      out.write("<!-- Preloader, https://ihatetomatoes.net/create-custom-preloading-screen/ -->\r\n");
      out.write("<div id=\"loader-wrapper\">\r\n");
      out.write("  <div id=\"loader\"></div>\r\n");
      out.write("  <div class=\"loader-section section-left\"></div>\r\n");
      out.write("  <div class=\"loader-section section-right\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- load JS files --> \r\n");
      out.write("<script src=\"js1/jquery-1.11.3.min.js\"></script> <!-- jQuery (https://jquery.com/download/) --> \r\n");
      out.write("<!--<script src=\"ja/tether.min.js\"></script> <!-- Tether for Bootstrap (http://stackoverflow.com/questions/34567939/how-to-fix-the-error-error-bootstrap-tooltips-require-tether-http-github-h) --> \r\n");
      out.write("<script src=\"js1/bootstrap.min.js\"></script> <!-- Bootstrap js (v4-alpha.getbootstrap.com/) --> \r\n");
      out.write("<script src=\"js1/hero-slider-main.js\"></script> <!-- Hero slider (https://codyhouse.co/gem/hero-slider/) --> \r\n");
      out.write("<script src=\"js1/jquery.magnific-popup.min.js\"></script> <!-- Magnific popup (http://dimsemenov.com/plugins/magnific-popup/) --> \r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("            function adjustHeightOfPage(pageNo) {\r\n");
      out.write("               \r\n");
      out.write("                // Get the page height\r\n");
      out.write("                var totalPageHeight = 15 + $('.cd-slider-nav').height()\r\n");
      out.write("                                        + $(\".cd-hero-slider li:nth-of-type(\" + pageNo + \") .js-tm-page-content\").height() + 160\r\n");
      out.write("                                        + $('.tm-footer').height();\r\n");
      out.write("\r\n");
      out.write("                // Adjust layout based on page height and window height\r\n");
      out.write("                if(totalPageHeight > $(window).height()) \r\n");
      out.write("                {\r\n");
      out.write("                    $('.cd-hero-slider').addClass('small-screen');\r\n");
      out.write("                    $('.cd-hero-slider li:nth-of-type(' + pageNo + ')').css(\"min-height\", totalPageHeight + \"px\");\r\n");
      out.write("                }\r\n");
      out.write("                else \r\n");
      out.write("                {\r\n");
      out.write("                    $('.cd-hero-slider').removeClass('small-screen');\r\n");
      out.write("                    $('.cd-hero-slider li:nth-of-type(' + pageNo + ')').css(\"min-height\", \"100%\");\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            /*\r\n");
      out.write("                Everything is loaded including images.\r\n");
      out.write("            */\r\n");
      out.write("            $(window).load(function(){\r\n");
      out.write("\r\n");
      out.write("                adjustHeightOfPage(1); // Adjust page height\r\n");
      out.write("\r\n");
      out.write("                /* Gallery pop up\r\n");
      out.write("                -----------------------------------------*/\r\n");
      out.write("                $('.tm-img-gallery').magnificPopup({\r\n");
      out.write("                    delegate: 'a', // child items selector, by clicking on it popup will open\r\n");
      out.write("                    type: 'image',\r\n");
      out.write("                    gallery:{enabled:true}                \r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("                /* Collapse menu after click \r\n");
      out.write("                -----------------------------------------*/\r\n");
      out.write("                $('#tmNavbar a').click(function(){\r\n");
      out.write("                    $('#tmNavbar').collapse('hide');\r\n");
      out.write("\r\n");
      out.write("                    adjustHeightOfPage($(this).data(\"no\")); // Adjust page height       \r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("                /* Browser resized \r\n");
      out.write("                -----------------------------------------*/\r\n");
      out.write("                $( window ).resize(function() {\r\n");
      out.write("                    var currentPageNo = $(\".cd-hero-slider li.selected .js-tm-page-content\").data(\"page-no\");\r\n");
      out.write("                    adjustHeightOfPage( currentPageNo );\r\n");
      out.write("                });\r\n");
      out.write("        \r\n");
      out.write("                // Remove preloader\r\n");
      out.write("                // https://ihatetomatoes.net/create-custom-preloading-screen/\r\n");
      out.write("                $('body').addClass('loaded');\r\n");
      out.write("                           \r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("        </script>\r\n");
      out.write("</body>\r\n");
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

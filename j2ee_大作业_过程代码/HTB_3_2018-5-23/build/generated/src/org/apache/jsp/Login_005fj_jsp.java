package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_005fj_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("   <head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<title>Flat - Responsive HTML Template</title>\n");
      out.write("<!-- load stylesheets -->\n");
      out.write("<link rel=\"stylesheet\" href=\"http://fonts.useso.com/css?family=Open+Sans:300,400\">\n");
      out.write("<!-- Google web font \"Open Sans\" -->\n");
      out.write("<link rel=\"stylesheet\" href=\"font-awesome-4.6.3/css/font-awesome.min.css\">\n");
      out.write("<!-- Font awesome -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css1/bootstrap.min.css\">\n");
      out.write("<!-- Bootstrap style -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css1/hero-slider-style.css\">\n");
      out.write("<!-- Hero slider style (https://codyhouse.co/gem/hero-slider/) -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css1/magnific-popup.css\">\n");
      out.write("<!-- Magnific popup style (http://dimsemenov.com/plugins/magnific-popup/) -->\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"css1/templatemo-style.css\">\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<!-- Content -->\n");
      out.write("<div class=\"cd-hero\">\n");
      out.write("  <ul class=\"cd-hero-slider\">\n");
      out.write("    <!-- autoplay -->\n");
      out.write("    <li class=\"selected\">\n");
      out.write("      <div class=\"cd-full-width\">\n");
      out.write("        <div class=\"container-fluid js-tm-page-content\" data-page-no=\"5\">\n");
      out.write("          <div class=\"tm-contact-page\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-xs-12\">\n");
      out.write("                <h2 class=\"tm-section-title\">Welcome back to us</h2>\n");
      out.write("                <p class=\"tm-text tm-font-w-400 m-b-3\">The Bible tell us how to live WeLife</p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <!-- contact form -->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <!--\n");
      out.write("              <form action=\"Navigation.html\" method=\"post\" class=\"tm-contact-form\">\n");
      out.write("                  -->\n");
      out.write("                   <form action=\"/HTB_3_2018-5-23/Login_handle2\" method=\"post\" class=\"tm-contact-form\">\n");
      out.write("                <div class=\"col-xs-12 col-sm-6 col-md-6 col-lg-6 col-xl-6\">\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" id=\"name\" name=\"name\" class=\"form-control\" placeholder=\"Your Name\"  required/>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <input type=\"password\" id=\"psd\" name=\"psd\" class=\"form-control\" placeholder=\"Your Password\"  required/>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xs-12 col-sm-6 col-md-6 col-lg-6 col-xl-6\">\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <textarea id=\"contact_message\" name=\"contact_message\" class=\"form-control\" rows=\"4\" placeholder=\"So How is the day today?\" required></textarea>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("              \n");
      out.write("                \n");
      out.write("                <div class=\"col-xs-12\">\n");
      out.write("                  <button type=\"submit\" class=\"pull-xs-centre tm-submit-btn\">Login</button>\n");
      out.write("                </div>\n");
      out.write("              </form>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- .cd-full-width --> \n");
      out.write("    </li>\n");
      out.write("  </ul>\n");
      out.write("  <!-- .cd-hero-slider --> \n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("<!-- .cd-hero --> \n");
      out.write("\n");
      out.write("<!-- Preloader, https://ihatetomatoes.net/create-custom-preloading-screen/ -->\n");
      out.write("<div id=\"loader-wrapper\">\n");
      out.write("  <div id=\"loader\"></div>\n");
      out.write("  <div class=\"loader-section section-left\"></div>\n");
      out.write("  <div class=\"loader-section section-right\"></div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- load JS files --> \n");
      out.write("<script src=\"js1/jquery-1.11.3.min.js\"></script> <!-- jQuery (https://jquery.com/download/) --> \n");
      out.write("<!--<script src=\"ja/tether.min.js\"></script> <!-- Tether for Bootstrap (http://stackoverflow.com/questions/34567939/how-to-fix-the-error-error-bootstrap-tooltips-require-tether-http-github-h) --> \n");
      out.write("<script src=\"js1/bootstrap.min.js\"></script> <!-- Bootstrap js (v4-alpha.getbootstrap.com/) --> \n");
      out.write("<script src=\"js1/hero-slider-main.js\"></script> <!-- Hero slider (https://codyhouse.co/gem/hero-slider/) --> \n");
      out.write("<script src=\"js1/jquery.magnific-popup.min.js\"></script> <!-- Magnific popup (http://dimsemenov.com/plugins/magnific-popup/) --> \n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("            function adjustHeightOfPage(pageNo) {\n");
      out.write("               \n");
      out.write("                // Get the page height\n");
      out.write("                var totalPageHeight = 15 + $('.cd-slider-nav').height()\n");
      out.write("                                        + $(\".cd-hero-slider li:nth-of-type(\" + pageNo + \") .js-tm-page-content\").height() + 160\n");
      out.write("                                        + $('.tm-footer').height();\n");
      out.write("\n");
      out.write("                // Adjust layout based on page height and window height\n");
      out.write("                if(totalPageHeight > $(window).height()) \n");
      out.write("                {\n");
      out.write("                    $('.cd-hero-slider').addClass('small-screen');\n");
      out.write("                    $('.cd-hero-slider li:nth-of-type(' + pageNo + ')').css(\"min-height\", totalPageHeight + \"px\");\n");
      out.write("                }\n");
      out.write("                else \n");
      out.write("                {\n");
      out.write("                    $('.cd-hero-slider').removeClass('small-screen');\n");
      out.write("                    $('.cd-hero-slider li:nth-of-type(' + pageNo + ')').css(\"min-height\", \"100%\");\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /*\n");
      out.write("                Everything is loaded including images.\n");
      out.write("            */\n");
      out.write("            $(window).load(function(){\n");
      out.write("\n");
      out.write("                adjustHeightOfPage(1); // Adjust page height\n");
      out.write("\n");
      out.write("                /* Gallery pop up\n");
      out.write("                -----------------------------------------*/\n");
      out.write("                $('.tm-img-gallery').magnificPopup({\n");
      out.write("                    delegate: 'a', // child items selector, by clicking on it popup will open\n");
      out.write("                    type: 'image',\n");
      out.write("                    gallery:{enabled:true}                \n");
      out.write("                });\n");
      out.write("\n");
      out.write("                /* Collapse menu after click \n");
      out.write("                -----------------------------------------*/\n");
      out.write("                $('#tmNavbar a').click(function(){\n");
      out.write("                    $('#tmNavbar').collapse('hide');\n");
      out.write("\n");
      out.write("                    adjustHeightOfPage($(this).data(\"no\")); // Adjust page height       \n");
      out.write("                });\n");
      out.write("\n");
      out.write("                /* Browser resized \n");
      out.write("                -----------------------------------------*/\n");
      out.write("                $( window ).resize(function() {\n");
      out.write("                    var currentPageNo = $(\".cd-hero-slider li.selected .js-tm-page-content\").data(\"page-no\");\n");
      out.write("                    adjustHeightOfPage( currentPageNo );\n");
      out.write("                });\n");
      out.write("        \n");
      out.write("                // Remove preloader\n");
      out.write("                // https://ihatetomatoes.net/create-custom-preloading-screen/\n");
      out.write("                $('body').addClass('loaded');\n");
      out.write("                           \n");
      out.write("            });\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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

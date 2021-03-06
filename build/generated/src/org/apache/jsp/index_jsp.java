package org.apache.jsp;

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
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <meta name=\"author\" content=\"\" />\n");
      out.write("        <title>Salvaguardando el medio ambiente</title>\n");
      out.write("        <!-- Favicon-->\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"assets/favicon.ico\" />\n");
      out.write("        <!-- Font Awesome icons (free version)-->\n");
      out.write("        <script src=\"https://use.fontawesome.com/releases/v5.15.3/js/all.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <!-- Google fonts-->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Merriweather+Sans:400,700\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <!-- Third party plugin CSS-->\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/magnific-popup.js/1.1.0/magnific-popup.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- Core theme CSS (includes Bootstrap)-->\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\" />\n");
      out.write("    </head>\n");
      out.write("    <body id=\"page-top\">\n");
      out.write("        <!-- Navigation-->\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light fixed-top py-3\" id=\"mainNav\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <a class=\"navbar-brand js-scroll-trigger\" href=\"#page-top\">Conoce y denuncia a la persona irresponsable</a>\n");
      out.write("                <button class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"><span class=\"navbar-toggler-icon\"></span></button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n");
      out.write("                    <ul class=\"navbar-nav ml-auto my-2 my-lg-0\">\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link js-scroll-trigger\" href=\"#about\">Acerca</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link js-scroll-trigger\" href=\"#services\">Informaci??n</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link js-scroll-trigger\" href=\"#portfolio\">Evidencias</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link js-scroll-trigger\" href=\"#contact\">Portal de denuncias</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <!-- Masthead-->\n");
      out.write("        <header class=\"masthead\">\n");
      out.write("            <div class=\"container h-100\">\n");
      out.write("                <div class=\"row h-100 align-items-center justify-content-center text-center\">\n");
      out.write("                    <div class=\"col-lg-10 align-self-end\">\n");
      out.write("                        <h1 class=\"text-uppercase text-white font-weight-bold\">SALVAGUARDANDO EL MEDIO AMBIENTE EN EL MUNICIPIO DE XOCHITLAN</h1>\n");
      out.write("                        <hr class=\"divider my-4\" />\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-8 align-self-baseline\">\n");
      out.write("                        <p class=\"text-white-75 font-weight-light mb-5\">La contaminaci??n por basura se define como la acumulaci??n de residuos s??lidos en los distintos ecosistemas de la Tierra, en este caso en la comunidad de Huahuaxtla, contaminan con basura el camino que conduce a un rio</p>\n");
      out.write("                        <a class=\"btn btn-primary btn-xl js-scroll-trigger\" href=\"#about\">Conoce m??s informaci??n acerca de la contaminaci??n</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <!-- About-->\n");
      out.write("        <section class=\"page-section bg-primary\" id=\"about\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row justify-content-center\">\n");
      out.write("                    <div class=\"col-lg-8 text-center\">\n");
      out.write("                        <h2 class=\"text-white mt-0\">??Qu?? es la contaminaci??n por basura?</h2>\n");
      out.write("                        <hr class=\"divider light my-4\" />\n");
      out.write("                        <p class=\"text-white-50 mb-4\">La contaminaci??n por basura es aquella que implica da??os al suelo, aire y agua por la acumulaci??n de residuos no deseados. Se considera que la basura est?? conformada por desechos depositados de forma incorrecta y concentra tanto residuos s??lidos, como l??quidos.\n");
      out.write("La generaci??n de basura es una consecuencia inevitable de las actividades humanas, pero desafortunadamente toda basura provoca impactos negativos medioambientales, y en general, puede contaminar cualquier entorno de cualquier ??mbito: hogares, oficinas, f??bricas??? En la actualidad, los seres humanos est??n plagados de residuos peligrosos.\n");
      out.write("La creciente generaci??n de residuos derivados de la actividad humana constituye un grave problema social y ambiental que se ha convertido en una cuesti??n de suma importancia hacia la que se est??n dirigiendo pol??ticas de intervenci??n, informaci??n y gesti??n.\n");
      out.write("</p>\n");
      out.write("                        <a class=\"btn btn-light btn-xl js-scroll-trigger\" href=\"#services\">Informaci??n de causas y consecuencias</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- Services-->\n");
      out.write("        <section class=\"page-section\" id=\"services\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h2 class=\"text-center mt-0\">Causas y consecuencias de la contaminaci??n por basura</h2>\n");
      out.write("                <hr class=\"divider my-4\" />\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-3 col-md-6 text-center\">\n");
      out.write("                        <div class=\"mt-5\">\n");
      out.write("                            <i class=\"fas fa-4x fa-gem text-primary mb-4\"></i>\n");
      out.write("                            <h3 class=\"h4 mb-2\">Causas</h3>\n");
      out.write("                            <p class=\"text-muted mb-0\">*El crecimiento poblacional</p>\n");
      out.write("                            <p class=\"text-muted mb-0\">*El crecimiento econ??mico</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-md-6 text-center\">\n");
      out.write("                        <div class=\"mt-5\">\n");
      out.write("                            <i class=\"fas fa-4x fa-laptop-code text-primary mb-4\"></i>\n");
      out.write("                            <h3 class=\"h4 mb-2\">Causas</h3>\n");
      out.write("                            <p class=\"text-muted mb-0\">*La sociedad consumista</p>\n");
      out.write("                            <p class=\"text-muted mb-0\">*El manejo incorrecto de los desechos</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-md-6 text-center\">\n");
      out.write("                        <div class=\"mt-5\">\n");
      out.write("                            <i class=\"fas fa-4x fa-globe text-primary mb-4\"></i>\n");
      out.write("                            <h3 class=\"h4 mb-2\">Consecuencias</h3>\n");
      out.write("                            <p class=\"text-muted mb-0\">*Ocupaci??n del espacio</p>\n");
      out.write("                            <p class=\"text-muted mb-0\">*Deterioro del paisaje</p>\n");
      out.write("                            <p class=\"text-muted mb-0\">*Contaminaci??n del suelo, agua y aire</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-md-6 text-center\">\n");
      out.write("                        <div class=\"mt-5\">\n");
      out.write("                            <i class=\"fas fa-4x fa-heart text-primary mb-4\"></i>\n");
      out.write("                            <h3 class=\"h4 mb-2\">Consecuencias</h3>\n");
      out.write("                            <p class=\"text-muted mb-0\">*Mayor riesgo de incendios</p>\n");
      out.write("                            <p class=\"text-muted mb-0\">*Enfermedades o muerte en seres vivos</p>\n");
      out.write("                            <p class=\"text-muted mb-0\">*Sobreexplotaci??n de recursos naturales</p>\n");
      out.write("                            <p class=\"text-muted mb-0\">*Malos olores</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- Portfolio-->\n");
      out.write("        <div id=\"portfolio\">\n");
      out.write("            <div class=\"container-fluid p-0\">\n");
      out.write("                <div class=\"row no-gutters\">\n");
      out.write("                    <div class=\"col-lg-4 col-sm-6\">\n");
      out.write("                        <a class=\"portfolio-box\" href=\"assets/img/portfolio/fullsize/basura1.jpg\">\n");
      out.write("                            <img class=\"img-fluid\" src=\"assets/img/portfolio/thumbnails/basura1.jpg\" alt=\"...\" />\n");
      out.write("                            <div class=\"portfolio-box-caption\">\n");
      out.write("                                <div class=\"project-category text-white-50\">Contaminaci??n en rios</div>\n");
      out.write("                                <div class=\"project-name\">Nunca dejes tu basura en el agua!</div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 col-sm-6\">\n");
      out.write("                        <a class=\"portfolio-box\" href=\"assets/img/portfolio/fullsize/basura2.jpg\">\n");
      out.write("                            <img class=\"img-fluid\" src=\"assets/img/portfolio/thumbnails/basura2.jpg\" alt=\"...\" />\n");
      out.write("                            <div class=\"portfolio-box-caption\">\n");
      out.write("                                <div class=\"project-category text-white-50\">Todos tenemos que ayudar</div>\n");
      out.write("                                <div class=\"project-name\">Colabora con tu comunidad para juntar la basura!</div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 col-sm-6\">\n");
      out.write("                        <a class=\"portfolio-box\" href=\"assets/img/portfolio/fullsize/basura3.jpg\">\n");
      out.write("                            <img class=\"img-fluid\" src=\"assets/img/portfolio/thumbnails/basura3.jpg\" alt=\"...\" />\n");
      out.write("                            <div class=\"portfolio-box-caption\">\n");
      out.write("                                <div class=\"project-category text-white-50\">Los animales no tienen la culpa</div>\n");
      out.write("                                <div class=\"project-name\">La resposabilidad la tienes t??, como cuidadano!</div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 col-sm-6\">\n");
      out.write("                        <a class=\"portfolio-box\" href=\"assets/img/portfolio/fullsize/basura4.jpg\">\n");
      out.write("                            <img class=\"img-fluid\" src=\"assets/img/portfolio/thumbnails/basura4.jpg\" alt=\"...\" />\n");
      out.write("                            <div class=\"portfolio-box-caption\">\n");
      out.write("                                <div class=\"project-category text-white-50\">Caminos para los rios llenos de basura</div>\n");
      out.write("                                <div class=\"project-name\">Esto impide el paso satisfecho de los visitantes!</div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 col-sm-6\">\n");
      out.write("                        <a class=\"portfolio-box\" href=\"assets/img/portfolio/fullsize/basura5.jpg\">\n");
      out.write("                            <img class=\"img-fluid\" src=\"assets/img/portfolio/thumbnails/basura5.jpg\" alt=\"...\" />\n");
      out.write("                            <div class=\"portfolio-box-caption\">\n");
      out.write("                                <div class=\"project-category text-white-50\">La basura puede provocar incedios</div>\n");
      out.write("                                <div class=\"project-name\">Esto destruye los recursos naturales!</div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 col-sm-6\">\n");
      out.write("                        <a class=\"portfolio-box\" href=\"assets/img/portfolio/fullsize/basura6.jpg\">\n");
      out.write("                            <img class=\"img-fluid\" src=\"assets/img/portfolio/thumbnails/basura6.jpg\" alt=\"...\" />\n");
      out.write("                            <div class=\"portfolio-box-caption p-3\">\n");
      out.write("                                <div class=\"project-category text-white-50\">Tenga respeto por la comuidad</div>\n");
      out.write("                                <div class=\"project-name\">Si observa el contenedor lleno,</div>\n");
      out.write("                                <div class=\"project-name\">espere al cami??n de la basura!</div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Call to action-->\n");
      out.write("        <section class=\"page-section bg-dark text-white\">\n");
      out.write("            <div class=\"container text-center\">\n");
      out.write("                <h1 class=\"mb-4\">Causas y consecuencias a nivel global</h1>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div class=\"container text-left\">\n");
      out.write("                <h2 class=\"h4 mb-2\">Causas</h2>\n");
      out.write("                <h3 class=\"h4 mb-2\">*Emisiones y vertidos industriales a la atm??sfera y a la hidrosfera</h3>\n");
      out.write("                <h3 class=\"h4 mb-2\">*Producci??n de energ??a con combustibles f??siles y otras fuentes no renovables</h3>\n");
      out.write("                <h3 class=\"h4 mb-2\">*Uso indiscriminado de pl??sticos y otros materiales derivados del petr??leo</h3>\n");
      out.write("                <h3 class=\"h4 mb-2\">*Liberaci??n de pl??sticos y objetos no biodegradables en espacios naturales</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container text-right\">\n");
      out.write("                <h2 class=\"h4 mb-2\">Consecuencias</h2>\n");
      out.write("                <h3 class=\"h4 mb-2\">*Calentamiento global, tambi??n conocido como cambio clim??tico</h3>\n");
      out.write("                <h3 class=\"h4 mb-2\">*La temperatura del planeta va aumentando de manera progresiva, tanto la temperatura atmosf??rica como la de mares y oc??anos</h3>\n");
      out.write("                <h3 class=\"h4 mb-2\">*Supone un riesgo para la salud de los seres vivos que habitan los ecosistemas contaminados, incluyendo a los seres humanos</h3>\n");
      out.write("                <h3 class=\"h4 mb-2\">*Destrucci??n de ecosistemas.</h3>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- Contact-->\n");
      out.write("        <section class=\"page-section\" id=\"contact\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row justify-content-center\">\n");
      out.write("                    <div class=\"col-lg-8 text-center\">\n");
      out.write("                        <h2 class=\"mt-0\">No te quedes callado, denuncia!</h2>\n");
      out.write("                        <hr class=\"divider my-4\" />\n");
      out.write("                        <p class=\"text-muted mb-5\">En este apartartado pueden encontrar los numeros de las autoridades municipales y nuestro correo electronico para atenderte</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-4 ml-auto text-center mb-5 mb-lg-0\">\n");
      out.write("                        <i class=\"fas fa-phone fa-3x mb-3 text-muted\"></i>\n");
      out.write("                        <div>\"Presidencia municipal\" > 233 314 9006 </div>\n");
      out.write("                        <div>\"DIF municipal\" > 233 314 9347 </div>\n");
      out.write("                        <div>\"Polic??a municipal > 233 314 9140 </div>\n");
      out.write("                        <div>\"Polic??a Estatal vial\" > 233 314 9291 </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 mr-auto text-center\">\n");
      out.write("                        <i class=\"fas fa-envelope fa-3x mb-3 text-muted\"></i>\n");
      out.write("                        <!-- Make sure to change the email address in BOTH the anchor text and the link target below!-->\n");
      out.write("                        <div> Tambien te puedes comunicar desde nuestro correo </div>\n");
      out.write("                        <a class=\"d-block\" href=\"mailto:salvaambientexochi202@gmail.com\">salvaambientexochi202@gmail.com</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- Footer-->\n");
      out.write("        <footer class=\"bg-light py-5\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"small text-center text-muted\">\n");
      out.write("                    Copyright &copy;\n");
      out.write("                    <!-- This script automatically adds the current year to your website footer-->\n");
      out.write("                    <!-- (credit: https://updateyourfooter.com/)-->\n");
      out.write("                    <script>\n");
      out.write("                        document.write(new Date().getFullYear());\n");
      out.write("                    </script>\n");
      out.write("                    - Company Name\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        <!-- Bootstrap core JS-->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <!-- Third party plugin JS-->\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/animejs/3.2.1/anime.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/magnific-popup.js/1.1.0/jquery.magnific-popup.min.js\"></script>\n");
      out.write("        <!-- Core theme JS-->\n");
      out.write("        <script src=\"js/scripts.js\"></script>\n");
      out.write("    </body>\n");
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

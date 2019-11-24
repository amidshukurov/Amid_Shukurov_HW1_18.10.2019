package classroom.web11_23_19;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class TheSimplestServer {
  public static void main(String[] args) throws Exception {
    Server server = new Server(9001);
    ServletContextHandler handler = new ServletContextHandler();
    handler.addServlet(HelloServlet.class, "/hello/*");
    handler.addServlet(LoginServlet.class, "/login/*");
    handler.addServlet(HelpServlet.class, "/help/*");
    handler.addServlet(FileServlet.class, "/file/*");
    handler.addServlet(CalculatorServlet.class, "/calc/*");
    handler.addServlet(FileServlet.class, "/*");
    //handler.addServlet(Servlet404.class, "/*");
    server.setHandler(handler);
    server.start();
    server.join();
  }
}

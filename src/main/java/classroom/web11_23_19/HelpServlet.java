package classroom.web11_23_19;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelpServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String sa = req.getParameter("a");
      String sb = req.getParameter("b");
      String path = req.getPathInfo();
      String query = req.getQueryString();
    try (PrintWriter writer = resp.getWriter()) {

      writer.println("<H1>Help Page </H1>");
      writer.printf("a= %s <br>", sa);
      writer.printf("b= %s <br>", sb);
        writer.printf("path = %s <br>", path);
        writer.printf("qery= %s<br>", query);
    }
  }
}

package classroom.web11_23_19;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import static classroom.web11_23_19.Calc.*;

public class CalculatorServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String sa = req.getParameter("a");
    String sb = req.getParameter("b");
   int add= add(Integer.parseInt(sa),Integer.parseInt(sb));
   int subt= subt(Integer.parseInt(sa),Integer.parseInt(sb));
   int mulp= mult(Integer.parseInt(sa),Integer.parseInt(sb));
   double div = div(Integer.parseInt(sa),Integer.parseInt(sb));

    try (PrintWriter writer = resp.getWriter()) {
      writer.println("<H1>Calculator</H1>");
      writer.printf("Addition = %d<br>",add);
      writer.printf("Subtraction = %d<br>",subt);
      writer.printf("Multiplication = %d<br>",mulp);
      writer.printf("Division = %f<br>",div);
    }
  }

}

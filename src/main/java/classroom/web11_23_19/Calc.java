package classroom.web11_23_19;

public class Calc {
    CalculatorServlet calServ = new CalculatorServlet();
   public static int add(int a, int b){
        return a+b;
    }
    public static int subt(int a, int b){
        return a-b;
    }
    public static int mult(int a, int b){
        return a*b;
    }
    public static double div(int a, int b){
       if (b!=0) {
           return a/b;
       }
       return 0.0;
    }


}

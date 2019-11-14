package step;

import java.util.Iterator;

public class Application {
  public static void main(String[] args) {
    Console console = new SystemConsole();
    Database database = new Database();
    Core app = new Core(console, database);

    Cities city =  new Cities();
    Iterator<String> it = city.iterator();
    while (it.hasNext()) {
      System.out.printf(">> %s <<\n", it.next());
    }
   app.run();
  }
}

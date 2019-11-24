package classroom.web11_23_19;

public class AuthHash implements Auth {


  @Override
  public boolean check(String name, String password) {
    if(name.equals("Amid") && password.equals("123")) {
      return true;
    }

    return false;
  }
}

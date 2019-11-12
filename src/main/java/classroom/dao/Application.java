package classroom.dao;

public class Application {
  public static void main(String[] args) {

    DAO<Person> pps =
        new DAOPersonHashMap();
//        new DAOPersonSQL();
    DAO<Pizza> pzs =
        new DAOPizzaHashMap();
//        new DAOPizzaSQL();

    Person p1 = new Person(1, "Alex", 33);
    Person p2 = new Person(2, "Natale", 44);
    Pizza pz1 = new Pizza(112, 30, 45);
    Pizza pz2 = new Pizza(113, 60, 90);
    pps.put(p1);
    pps.put(p2);
    pzs.put(pz1);
    pzs.put(pz2);
    Pizza pizza1 = pzs.get(112);
    Pizza pizza2 = pzs.get(113);
   pzs.delete(112);
    System.out.println(pizza1);
    System.out.println(pizza2);
    System.out.println(pzs.getAll());
    System.out.println(pps.getAll());


  }
}

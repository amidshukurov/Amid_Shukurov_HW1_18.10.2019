package classroom.dao;

import java.util.*;

public class DAOPizzaHashMap implements DAO<Pizza> {

  private Map<Integer, Pizza> storage = new HashMap<>();
  //private List<Pizza> storage2 = new ArrayList<>();

  @Override
  public void put(Pizza object) {
    storage.put(object.getId(), object);
  }

  @Override
  public Pizza get(int id) {
    return storage.get(id);
  }

  @Override
  public void delete(int id) {
        storage.remove(id);
    }

  @Override
  public List<Pizza> getAll() {
    Set<Map.Entry<Integer, Pizza>> entries = storage.entrySet();
    List<Pizza> result = new ArrayList<>();
    for (Map.Entry<Integer, Pizza> p: entries){
      result.add(p.getValue());
    }
    return result;
}
}

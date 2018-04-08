package springboot.demo.lib.model;

public interface RestaurantRepository<Restaurant, String> extends Repository<Restaurant, String> {

  boolean containsName(String name);

}

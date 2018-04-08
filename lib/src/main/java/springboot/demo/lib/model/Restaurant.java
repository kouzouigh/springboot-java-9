package springboot.demo.lib.model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant extends BaseEntity<String> {

  private List<Table> tables = new ArrayList<>();

  protected Restaurant(String id, String name, List<Table> tables) {
    super(id, name);
    this.tables = tables;
  }

  @Override
  public String toString() {
    return new StringBuilder("{id: ")
      .append(id)
      .append(", name: ")
      .append(name)
      .append(", tables:")
      .append(tables)
      .append("}")
      .toString();
  }

}
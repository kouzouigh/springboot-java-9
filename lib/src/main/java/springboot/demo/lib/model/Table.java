package springboot.demo.lib.model;

import java.math.BigInteger;

public class Table extends BaseEntity<BigInteger> {

  private final int capacity;

  protected Table(BigInteger id, String name, int capacity) {
    super(id, name);
    this.capacity = capacity;
  }
}

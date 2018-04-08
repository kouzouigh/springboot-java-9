package springboot.demo.lib.model;

public abstract class BaseEntity<T> extends Entity<T> {

  private final boolean isModified;

  protected BaseEntity(T id, String  name) {
    super.id = id;
    super.name = name;
    this.isModified = false;
  }
}

package springboot.demo.lib.model;

import java.util.Collection;

public interface ReadOnlyRepository<TE, T> {

  boolean contains(T id);

  Entity<T> get(T id);

  Collection<TE> getAll();
}

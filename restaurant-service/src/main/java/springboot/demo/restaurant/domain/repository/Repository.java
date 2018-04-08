package springboot.demo.restaurant.domain.repository;

public interface Repository<TE, T> extends ReadOnlyRepository<TE, T> {

  /**
   *
   * @param entity
   */
  void add(TE entity);

  /**
   *
   * @param id
   */
  void remove(T id);

  /**
   *
   * @param entity
   */
  void update(TE entity);
}
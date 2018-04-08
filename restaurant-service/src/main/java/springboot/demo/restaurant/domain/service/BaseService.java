package springboot.demo.restaurant.domain.service;

import springboot.demo.restaurant.domain.repository.Repository;

import java.util.Collection;

/**
 *
 * @param <TE>
 * @param <T>
 */
public abstract class BaseService<TE, T> extends ReadOnlyBaseService<TE, T> {

  private Repository<TE, T> _repository;

  BaseService(Repository<TE, T> repository) {
    super(repository);
    _repository = repository;
  }

  /**
   *
   * @param entity
   * @throws Exception
   */
  public void add(TE entity) throws Exception {
    _repository.add(entity);
  }

  /**
   *
   * @return
   */
  public Collection<TE> getAll() {
    return _repository.getAll();
  }
}
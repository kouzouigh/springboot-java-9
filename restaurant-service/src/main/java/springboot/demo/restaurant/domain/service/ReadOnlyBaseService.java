package springboot.demo.restaurant.domain.service;

import springboot.demo.restaurant.domain.repository.ReadOnlyRepository;

/**
 *
 * @param <TE>
 * @param <T>
 */
public abstract class ReadOnlyBaseService<TE, T> {

  private ReadOnlyRepository<TE, T> repository;

  ReadOnlyBaseService(ReadOnlyRepository<TE, T> repository) {
    this.repository = repository;
  }
}
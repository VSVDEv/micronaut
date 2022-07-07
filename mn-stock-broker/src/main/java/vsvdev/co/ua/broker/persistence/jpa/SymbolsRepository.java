package vsvdev.co.ua.broker.persistence.jpa;

import java.util.List;

import vsvdev.co.ua.broker.persistence.model.SymbolEntity;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface SymbolsRepository extends CrudRepository<SymbolEntity, Integer> {

  List<SymbolEntity> findAll();

}

package com.epam.taskspringproject.services.base;

import com.epam.taskspringproject.entities.base.BaseEntity;

import java.util.List;
import java.util.Optional;

public interface CRUDService<E extends BaseEntity> {

    Optional<E> findById(Long id);

    List<E> findAll();

    E save(E entity);

    E update(E entity, long id);

    void delete(Long id);
}

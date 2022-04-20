package com.epam.taskspringproject.repositories;

import com.epam.taskspringproject.entities.TagEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends CrudRepository<TagEntity,Long> {
}

package com.epam.taskspringproject.repositories;

import com.epam.taskspringproject.entities.GiftCertificateEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GiftCertificateRepository extends CrudRepository<GiftCertificateEntity,Long> {

}

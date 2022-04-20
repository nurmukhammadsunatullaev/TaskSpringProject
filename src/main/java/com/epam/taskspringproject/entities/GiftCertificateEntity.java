package com.epam.taskspringproject.entities;

import com.epam.taskspringproject.entities.base.AuditableEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;


@Getter
@Setter
@Entity
public class GiftCertificateEntity extends AuditableEntity {
    private String name;
    private String description;
    private Double price;
    private Integer duration;

}

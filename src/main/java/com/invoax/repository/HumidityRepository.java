package com.invoax.repository;

import java.util.List;
import com.invoax.model.Humidity;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "hate_humidity", path = "hate_humidity")
public interface HumidityRepository extends MongoRepository<Humidity, String> {

}
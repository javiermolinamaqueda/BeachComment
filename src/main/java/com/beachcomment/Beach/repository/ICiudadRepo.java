package com.beachcomment.Beach.repository;

import com.beachcomment.Beach.models.Ciudad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICiudadRepo extends CrudRepository<Ciudad,Long> {

}

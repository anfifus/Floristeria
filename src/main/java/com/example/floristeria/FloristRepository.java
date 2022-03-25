package com.example.floristeria;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FloristRepository extends CrudRepository<Florist,Long> {
}

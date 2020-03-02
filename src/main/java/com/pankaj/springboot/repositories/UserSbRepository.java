package com.pankaj.springboot.repositories;

import org.springframework.data.repository.CrudRepository;
import com.pankaj.springboot.bean.UserSb;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserSbRepository extends CrudRepository<UserSb, Long> {

}
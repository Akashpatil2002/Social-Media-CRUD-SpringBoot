package com.web.Social_Media_Crud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.Social_Media_Crud.Entities.User;

public interface UserDao extends JpaRepository<User, Integer> {

}

package com.web.Social_Media_Crud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.Social_Media_Crud.Entities.Follow;

public interface FollowDao extends JpaRepository<Follow, Integer> {

}

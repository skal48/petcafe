package com.puppycafe.stamp.repository;

import com.puppycafe.stamp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {

  @Query("SELECT u.email FROM User u WHERE u.email = :email")
  boolean existsByEmail(@Param("email") String email);
}

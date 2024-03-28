package com.puppycafe.stamp.repository;

import com.puppycafe.stamp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<User, Long> {

}

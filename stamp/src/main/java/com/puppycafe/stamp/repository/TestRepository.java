package com.puppycafe.stamp.repository;

import com.puppycafe.stamp.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, Long> {

}

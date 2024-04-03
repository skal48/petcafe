package com.puppycafe.stamp.repository;

import com.puppycafe.stamp.entity.Cafe;
import com.puppycafe.stamp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CafeRepository extends JpaRepository<Cafe, Long> {
}

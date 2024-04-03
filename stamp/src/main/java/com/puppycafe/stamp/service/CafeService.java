package com.puppycafe.stamp.service;

import com.puppycafe.stamp.entity.Cafe;
import com.puppycafe.stamp.entity.User;
import com.puppycafe.stamp.repository.TestRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CafeService {
    List<Cafe> findAll();
}

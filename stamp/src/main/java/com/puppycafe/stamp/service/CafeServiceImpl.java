package com.puppycafe.stamp.service;

import com.puppycafe.stamp.entity.Cafe;
import com.puppycafe.stamp.repository.CafeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CafeServiceImpl implements CafeService{
  @Autowired
  CafeRepository cafeRepository;
  @Override
  public List<Cafe> findAll() {
    return cafeRepository.findAll();
  }
}

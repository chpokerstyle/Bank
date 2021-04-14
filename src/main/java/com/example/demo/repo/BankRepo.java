package com.example.demo.repo;

import com.example.demo.model.entity.BankEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepo extends JpaRepository<BankEntity,Long> {
}

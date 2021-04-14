package com.example.demo.repo;

import com.example.demo.model.entity.OfferEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferRepo extends JpaRepository<OfferEntity, Long> {
}

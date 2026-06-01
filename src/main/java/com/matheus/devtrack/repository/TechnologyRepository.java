package com.matheus.devtrack.repository;

import com.matheus.devtrack.entity.Technology;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnologyRepository extends JpaRepository<Technology, Long> {
}

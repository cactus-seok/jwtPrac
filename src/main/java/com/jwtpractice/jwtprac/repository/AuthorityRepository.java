package com.jwtpractice.jwtprac.repository;

import com.jwtpractice.jwtprac.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
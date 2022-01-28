package com.vimal.springexpensetracker.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vimal.springexpensetracker.models.Balance;

public interface BalanceRepository extends JpaRepository<Balance, Long> {

}

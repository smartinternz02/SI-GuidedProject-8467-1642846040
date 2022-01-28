package com.vimal.springexpensetracker.services;

import com.vimal.springexpensetracker.models.Balance;

public interface BalanceService {
	public Balance saveBalance(Balance balance);
	public Balance createBalance();
}

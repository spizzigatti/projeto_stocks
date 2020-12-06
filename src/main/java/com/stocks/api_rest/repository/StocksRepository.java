package com.stocks.api_rest.repository;

import com.stocks.api_rest.models.Stocks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StocksRepository extends JpaRepository<Stocks, Long> {
    Stocks findByName(String name);
}

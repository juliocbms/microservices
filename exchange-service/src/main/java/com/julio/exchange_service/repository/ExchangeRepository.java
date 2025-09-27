package com.julio.exchange_service.repository;

import com.julio.exchange_service.model.Exchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeRepository extends JpaRepository<Exchange,Long> {

    Exchange findByFromAndTo(String from, String to);
}

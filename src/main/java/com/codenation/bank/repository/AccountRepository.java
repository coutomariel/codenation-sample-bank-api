package com.codenation.bank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codenation.bank.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
	
	List<Account> findAccountsByClientId(Long id);

}

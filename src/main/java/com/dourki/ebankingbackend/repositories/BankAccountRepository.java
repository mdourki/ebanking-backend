package com.dourki.ebankingbackend.repositories;

import com.dourki.ebankingbackend.entities.BankAccount;
import com.dourki.ebankingbackend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}

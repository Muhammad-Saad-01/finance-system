package io.github.thepragmaticsquad.fs.repository;

import io.github.thepragmaticsquad.fs.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long>{
    
}

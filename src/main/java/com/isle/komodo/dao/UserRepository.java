package com.isle.komodo.dao;

import com.isle.komodo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface UserRepository extends JpaRepository<User, BigInteger> {

    User findByUsernameAndPassword(String username,String password);
}

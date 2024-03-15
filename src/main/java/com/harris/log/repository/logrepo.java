package com.harris.log.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harris.log.domain.login;

@Repository
public interface logrepo extends JpaRepository<login,String>
{
login findByUsernameAndPassword(String username , String password);
}

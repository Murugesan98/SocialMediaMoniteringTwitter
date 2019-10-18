package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Jpainterface extends JpaRepository<Bean, Long>
{
	   @Query(value = "SELECT count(*) from twitterdata where journey = 'homeservice' " , nativeQuery = true)
	   int homeservice();
	   @Query(value = "SELECT count(*) from twitterdata where journey = 'payments' " , nativeQuery = true)
	   int payments();
	   @Query(value = "SELECT count(*) from twitterdata where journey = 'smartmeter' " , nativeQuery = true)
	   int smartmeter();
	   @Query(value = "SELECT count(*) from twitterdata where journey = 'installation' " , nativeQuery = true)
	   int installation();
}

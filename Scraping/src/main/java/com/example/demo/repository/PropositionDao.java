package com.example.demo.repository;

import java.util.List;

import com.example.demo.entity.Proposition;

public interface PropositionDao {
	
	List<Proposition> findAll();

	void insert(Proposition proposition);
	
	void delete();

}

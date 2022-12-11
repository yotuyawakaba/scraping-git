package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Proposition;


public interface ScrapingService {
	
	List<Proposition> findAll();

	void insert(Proposition proposition);

	void delete();

}

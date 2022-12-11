package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Proposition;
import com.example.demo.repository.PropositionDao;

@Service
public class ScrapingServiceImpl implements ScrapingService {
	
	private final PropositionDao dao;
	
	public ScrapingServiceImpl(PropositionDao dao) {
		this.dao = dao;
	}

	@Override
	public List<Proposition> findAll() {
		return dao.findAll();
	}

	@Override
	public void insert(Proposition proposition) {
		dao.insert(proposition);

	}

	@Override
	public void delete() {
		dao.delete();

	}

}

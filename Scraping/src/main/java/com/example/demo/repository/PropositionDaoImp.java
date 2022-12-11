package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Proposition;

@Repository
public class PropositionDaoImp implements PropositionDao {

	private final JdbcTemplate jdbcTemplate;

	public PropositionDaoImp(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Proposition> findAll() {
		String sql = "SELECT id, title, fee, place, outline, source_of_information, url FROM proposition";
		List<Map<String, Object>> resultList = jdbcTemplate.queryForList(sql);
		List<Proposition> list = new ArrayList<Proposition>();
		
		
		for(Map<String, Object> result : resultList) {
			Proposition proposition = new Proposition();
			proposition.setId((int)result.get("id"));
			proposition.setTitle((String)result.get("title"));
			proposition.setFee((String)result.get("fee"));
			proposition.setPlace((String)result.get("place"));
			proposition.setOutline((String)result.get("outline"));
			proposition.setSource_of_information((String)result.get("source_of_information"));
			proposition.setUrl((String)result.get("url"));
			list.add(proposition);
		}
		
		return list;
	}

	@Override
	public void insert(Proposition proposition) {
		jdbcTemplate.update("INSERT INTO proposition(title, fee, place, outline, source_of_information, url) VALUES(?, ?, ?, ?, ?, ?)",
				proposition.getTitle(), proposition.getFee(), proposition.getPlace(), proposition.getOutline(), proposition.getSource_of_information(), proposition.getUrl());
	}

	@Override
	public void delete() {
		jdbcTemplate.update("DELETE FROM proposition");

	}

}

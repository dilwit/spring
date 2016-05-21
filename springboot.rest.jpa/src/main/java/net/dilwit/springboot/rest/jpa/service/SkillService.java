package net.dilwit.springboot.rest.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;

import net.dilwit.springboot.rest.jpa.model.Skill;

public class SkillService extends BasicServiceOperationsImpl<Skill> {
	
	@Autowired
	@Qualifier(value="skillRepo")
	private JpaRepository<Skill, Integer> repo;

	@Override
	protected JpaRepository<Skill, Integer> getRepo() {
		return repo;
	}
}

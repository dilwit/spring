package net.dilwit.springboot.rest.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import net.dilwit.springboot.rest.jpa.model.Skill;

public interface SkillRepo extends JpaRepository<Skill, Integer> {

}

package net.dilwit.springboot.rest.jpa.service;

import java.util.List;

public interface BasicServiceOperations<T> {

	void createOrUpdate(T t);
	T read(int id);
	void delete(int id);
	
	List<T> list();
}

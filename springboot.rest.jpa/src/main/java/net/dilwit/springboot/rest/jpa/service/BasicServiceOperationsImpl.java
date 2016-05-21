package net.dilwit.springboot.rest.jpa.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

public abstract class BasicServiceOperationsImpl<T> extends BaseService implements BasicServiceOperations<T> {
	
	@Override
	public void createOrUpdate(T t) {
		TransactionSynchronizationManager.isActualTransactionActive();
		getRepo().save(t);
	}

	@Override
	@Transactional(readOnly=true)
	public T read(int id) {
		TransactionSynchronizationManager.isActualTransactionActive();
		return getRepo().findOne(id);
	}

	@Override
	public void delete(int id) {
		TransactionSynchronizationManager.isActualTransactionActive();
		getRepo().delete(id);	
	}

	@Override
	public List<T> list() {
		TransactionSynchronizationManager.isActualTransactionActive();
		return getRepo().findAll();
	}

	abstract protected JpaRepository<T, Integer>getRepo();	
}

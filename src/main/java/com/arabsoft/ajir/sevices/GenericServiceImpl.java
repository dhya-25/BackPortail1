package com.arabsoft.ajir.sevices;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class GenericServiceImpl<T,ID extends Serializable> implements  GenericService<T,ID> {
	  @Autowired
	    private JpaRepository<T, ID> repository;

	    @Override
	    public T save(T entity) {
	        return repository.save(entity);
	    }

	    @Override
	    public Optional<T> findById(ID id) {
	        return repository.findById(id);
	    }

	    @Override
	    public List<T> findAll() {
	        return repository.findAll();
	    }

	    @Override
	    public void deleteById(ID id) {
	        repository.deleteById(id);
	    }
}

package com.trueway.mobile.website.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class BaseRepository<T> implements JpaRepository<T, Long> {

	@Override
	public Page<T> findAll(final Pageable pageable) {
		return this.findAll(pageable);
	}

	@Override
	public long count() {
		return this.count();
	}

	@Override
	public void delete(T entity) {
		this.delete(entity);
	}

	@Override
	public void deleteAll() {
		this.deleteAll();
		
	}

	@Override
	public void deleteAll(Iterable<? extends T> entity) {
		this.deleteAll(entity);
		
	}

	@Override
	public void deleteById(Long id) {
		this.deleteById(id);
		
	}

	@Override
	public boolean existsById(Long id) {
		return this.existsById(id);
	}

	@Override
	public Optional<T> findById(Long id) {
		
		return this.findById(id);
	}

	@Override
	public <S extends T> S save(S entity) {
		
		return this.save(entity);
	}

	@Override
	public <S extends T> long count(Example<S> entity) {
		return this.count(entity);
	}

	@Override
	public <S extends T> boolean exists(Example<S> entity) {
		
		return this.exists(entity);
	}

	@Override
	public <S extends T> Page<S> findAll(Example<S> entity, Pageable pageable) {
		
		return this.findAll(entity, pageable);
	}

	@Override
	public <S extends T> Optional<S> findOne(Example<S> entity) {
		return this.findOne(entity);
	}

	@Override
	public void deleteAllInBatch() {
		this.deleteAllInBatch();
		
	}

	@Override
	public void deleteInBatch(Iterable<T> entity) {
		this.deleteInBatch(entity);
		
	}

	@Override
	public List<T> findAll() {
		return this.findAll();
	}

	@Override
	public List<T> findAll(Sort sort) {
		
		return this.findAll(sort);
	}
	

	@Override
	public <S extends T> List<S> findAll(Example<S> entity) {
		return this.findAll(entity);
	}

	@Override
	public <S extends T> List<S> findAll(Example<S> entity, Sort sort) {
		return this.findAll(entity, sort);
	}

	@Override
	public List<T> findAllById(Iterable<Long> ids) {
		return this.findAllById(ids);
	}

	@Override
	public void flush() {
		this.flush();
		
	}

	@Override
	public T getOne(Long id) {
		return this.getOne(id);
	}

	@Override
	public <S extends T> List<S> saveAll(Iterable<S> entity) {
		// TODO Auto-generated method stub
		return this.saveAll(entity);
	}

	@Override
	public <S extends T> S saveAndFlush(S entity) {
		
		return this.saveAndFlush(entity);
	}

}

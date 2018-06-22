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
public class PhoneRepository implements JpaRepository<PhoneRepository, Long> {

	@Override
	public Page<PhoneRepository> findAll(final Pageable pageable) {
		return this.findAll(pageable);
	}

	@Override
	public long count() {
		return this.count();
	}

	@Override
	public void delete(PhoneRepository PhoneRepository) {
		this.delete(PhoneRepository);
	}

	@Override
	public void deleteAll() {
		this.deleteAll();
		
	}

	@Override
	public void deleteAll(Iterable<? extends PhoneRepository> PhoneRepository) {
		this.deleteAll(PhoneRepository);
		
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
	public Optional<PhoneRepository> findById(Long id) {
		
		return this.findById(id);
	}

	@Override
	public <S extends PhoneRepository> S save(S PhoneRepository) {
		
		return this.save(PhoneRepository);
	}

	@Override
	public <S extends PhoneRepository> long count(Example<S> PhoneRepository) {
		return this.count(PhoneRepository);
	}

	@Override
	public <S extends PhoneRepository> boolean exists(Example<S> PhoneRepository) {
		
		return this.exists(PhoneRepository);
	}

	@Override
	public <S extends PhoneRepository> Page<S> findAll(Example<S> PhoneRepository, Pageable pageable) {
		
		return this.findAll(PhoneRepository, pageable);
	}

	@Override
	public <S extends PhoneRepository> Optional<S> findOne(Example<S> PhoneRepository) {
		return this.findOne(PhoneRepository);
	}

	@Override
	public void deleteAllInBatch() {
		this.deleteAllInBatch();
		
	}

	@Override
	public void deleteInBatch(Iterable<PhoneRepository> PhoneRepository) {
		this.deleteInBatch(PhoneRepository);
		
	}

	@Override
	public List<PhoneRepository> findAll() {
		return this.findAll();
	}

	@Override
	public List<PhoneRepository> findAll(Sort sort) {
		
		return this.findAll(sort);
	}
	

	@Override
	public <S extends PhoneRepository> List<S> findAll(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends PhoneRepository> List<S> findAll(Example<S> PhoneRepository, Sort sort) {
		return this.findAll(PhoneRepository, sort);
	}

	@Override
	public List<PhoneRepository> findAllById(Iterable<Long> ids) {
		return this.findAllById(ids);
	}

	@Override
	public void flush() {
		this.flush();
		
	}

	@Override
	public PhoneRepository getOne(Long id) {
		return this.getOne(id);
	}

	@Override
	public <S extends PhoneRepository> List<S> saveAll(Iterable<S> PhoneRepository) {
		// TODO Auto-generated method stub
		return this.saveAll(PhoneRepository);
	}

	@Override
	public <S extends PhoneRepository> S saveAndFlush(S PhoneRepository) {
		
		return this.saveAndFlush(PhoneRepository);
	}

}

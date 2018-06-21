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
public class PlanRepository implements JpaRepository<PlanRepository, Long> {

	@Override
	public Page<PlanRepository> findAll(final Pageable pageable) {
		return this.findAll(pageable);
	}

	@Override
	public long count() {
		return this.count();
	}

	@Override
	public void delete(PlanRepository planRepository) {
		this.delete(planRepository);
	}

	@Override
	public void deleteAll() {
		this.deleteAll();
		
	}

	@Override
	public void deleteAll(Iterable<? extends PlanRepository> planRepository) {
		this.deleteAll(planRepository);
		
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
	public Optional<PlanRepository> findById(Long id) {
		
		return this.findById(id);
	}

	@Override
	public <S extends PlanRepository> S save(S planRepository) {
		
		return this.save(planRepository);
	}

	@Override
	public <S extends PlanRepository> long count(Example<S> planRepository) {
		return this.count(planRepository);
	}

	@Override
	public <S extends PlanRepository> boolean exists(Example<S> planRepository) {
		
		return this.exists(planRepository);
	}

	@Override
	public <S extends PlanRepository> Page<S> findAll(Example<S> planRepository, Pageable pageable) {
		
		return this.findAll(planRepository, pageable);
	}

	@Override
	public <S extends PlanRepository> Optional<S> findOne(Example<S> planRepository) {
		return this.findOne(planRepository);
	}

	@Override
	public void deleteAllInBatch() {
		this.deleteAllInBatch();
		
	}

	@Override
	public void deleteInBatch(Iterable<PlanRepository> planRepository) {
		this.deleteInBatch(planRepository);
		
	}

	@Override
	public List<PlanRepository> findAll() {
		return this.findAll();
	}

	@Override
	public List<PlanRepository> findAll(Sort sort) {
		
		return this.findAll(sort);
	}
	

	@Override
	public <S extends PlanRepository> List<S> findAll(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends PlanRepository> List<S> findAll(Example<S> planRepository, Sort sort) {
		return this.findAll(planRepository, sort);
	}

	@Override
	public List<PlanRepository> findAllById(Iterable<Long> ids) {
		return this.findAllById(ids);
	}

	@Override
	public void flush() {
		this.flush();
		
	}

	@Override
	public PlanRepository getOne(Long id) {
		return this.getOne(id);
	}

	@Override
	public <S extends PlanRepository> List<S> saveAll(Iterable<S> planRepository) {
		// TODO Auto-generated method stub
		return this.saveAll(planRepository);
	}

	@Override
	public <S extends PlanRepository> S saveAndFlush(S planRepository) {
		
		return this.saveAndFlush(planRepository);
	}

}

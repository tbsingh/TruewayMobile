package com.trueway.mobile.website.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.trueway.mobile.website.entity.Image;
import com.trueway.mobile.website.entity.MobilePhone;
import com.trueway.mobile.website.repo.ImageRepository;

@Service
public class ImageService {
	@Autowired
	private ImageRepository repository;

	public Image saveImage(Image image) {
		return repository.saveAndFlush(image);
	}
	
	public ImageRepository getRepository() {
		return repository;
	}

	public void setRepository(ImageRepository repository) {
		this.repository = repository;
	}

	public Image find(Long imageId) {
		Image filterBy = new Image();
		filterBy.setId(imageId);
		Example<Image> example = Example.of(filterBy);
		Optional<Image> result = repository.findOne(example);
		return result.orElse(null);
	}

	public List<Image> getActiveImages() {
		return repository.findAll();
	}

}

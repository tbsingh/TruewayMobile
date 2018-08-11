package com.trueway.mobile.website.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.trueway.mobile.website.entity.AppUser;
import com.trueway.mobile.website.entity.Image;
import com.trueway.mobile.website.service.ImageService;
import com.trueway.mobile.website.service.UserService;

@RestController
@RequestMapping({"/truway/mobile"})
public class ImageController {
	 @Autowired
	 private ImageService service;
	
	 @PostMapping(path = {"/v1/images"})
	 Long createImage(@RequestParam("file") MultipartFile file){
		 Image imageSaved=null;
		 try {
			byte[] bytes = file.getBytes();
			Image image = new Image();
			image.setName(file.getName());
			image.setDescription(file.getOriginalFilename());
			image.setImage(bytes);
			imageSaved = service.saveImage(image);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return imageSaved == null? 0 : imageSaved.getId();
	}
	 @GetMapping(path = "/v1/images/{imgeId}")
	 Image getImage(@PathVariable("imgeId") String imageId){
		 return service.find(Long.parseLong(imageId));
	}
}
	
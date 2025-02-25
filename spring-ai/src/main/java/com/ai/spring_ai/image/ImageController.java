package com.ai.spring_ai.image;

import java.io.IOException;

import org.springframework.ai.image.ImageResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class ImageController {
	private ImageService imageService;
	public ImageController(ImageService imageService) {
		super();
		this.imageService = imageService;
	}
	@GetMapping("generate-image")
	public void generateImage(@RequestParam String prompt,HttpServletResponse response) {
		ImageResponse imageResponse= imageService.generateImageWithOpenAI(prompt);
		String imageUrl= imageResponse.getResult().getOutput().getUrl();
		try {
			response.sendRedirect(imageUrl);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	@GetMapping("generate-image-stability")
	public void generateImageStablilty(@RequestParam String prompt,HttpServletResponse response) {
		ImageResponse imageResponse= imageService.generateImageWithStabilityAI(prompt);
		String imageUrl= imageResponse.getResult().getOutput().getUrl();
		try {
			response.sendRedirect(imageUrl);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

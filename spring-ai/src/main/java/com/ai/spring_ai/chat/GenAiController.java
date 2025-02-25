package com.ai.spring_ai.chat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenAiController {
	ChatService chatService;
	public GenAiController(ChatService chatService) {
		super();
		this.chatService = chatService;
	}
	@GetMapping("ask-ai")
	public String getResponse(@RequestParam String prompt) {
		return chatService.getRespone(prompt);
	}
	@GetMapping("ask-ai-options")
	public String getResponseOptions(@RequestParam String prompt) {
		return chatService.getRespone(prompt);
	}
}

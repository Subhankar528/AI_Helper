package com.ai.spring_ai.chat;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.openai.OpenAiChatOptions;
import org.springframework.stereotype.Service;
@Service
public class ChatService {

	private final ChatModel chatmodel;

	public ChatService(ChatModel chatmodel) {
		super();
		this.chatmodel = chatmodel;
	}
	public String getRespone(String prompt) {
		return chatmodel.call(prompt);
	}
	public String getResponseOptions(String prompt) {
		ChatResponse response= chatmodel.call(
				new Prompt(
		        prompt,
		        OpenAiChatOptions.builder()
		            .model("gpt-4o")
		            .temperature(0.4)
		        .build()
		    ));
		return response.getResult().getOutput().getText();
	}
}

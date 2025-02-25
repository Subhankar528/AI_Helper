package com.ai.spring_ai.recipeGen;

import java.util.Map;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.stereotype.Service;

@Service
public class Recipe {
	private final ChatModel chatModel ;

	public Recipe(ChatModel chatModel) {
		super();
		this.chatModel = chatModel;
 	}
	 public String createRecipe(String ingredients,String cusine,String dietaryRestriction) {
		 var template = """
		 		I want to create a recipe using the following ingredient: {ingredients}.
		 		The cusine type I prefer is {cusine}.
		 		Please consider the following dietary restriction;{dietaryRestriction}.
		 		PLease prvovide me with a detailed recipe including title,list of ingredients,and cooking instructions
		 		""";
		 PromptTemplate promptTemplate =new PromptTemplate(template);
		 Map<String,Object> params=Map.of(
				 "ingredients",ingredients,
				 "cusine",cusine,
				 "dietaryRestriction",dietaryRestriction
				 );
		 Prompt prompt=promptTemplate.create(params);
		return chatModel.call(prompt).getResult().getOutput().getText();
	 }
}

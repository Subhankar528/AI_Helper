package com.ai.spring_ai.image;

import org.springframework.ai.image.ImagePrompt;
import org.springframework.ai.image.ImageResponse;
import org.springframework.ai.openai.OpenAiImageModel;
import org.springframework.ai.stabilityai.StabilityAiImageModel;
import org.springframework.ai.stabilityai.api.StabilityAiImageOptions;
import org.springframework.stereotype.Service;

@Service
public class ImageService {
    private final OpenAiImageModel openAiImageModel;
    private final StabilityAiImageModel stabilityAiImageModel;

    public ImageService(OpenAiImageModel openAiImageModel, StabilityAiImageModel stabilityAiImageModel) {
        this.openAiImageModel = openAiImageModel;
        this.stabilityAiImageModel = stabilityAiImageModel;
    }

    // Generate image using OpenAI
    public ImageResponse generateImageWithOpenAI(String prompt) {
        return openAiImageModel.call(new ImagePrompt(prompt));
    }

    // Generate image using Stability AI
    public ImageResponse generateImageWithStabilityAI(String prompt) {
        return stabilityAiImageModel.call(
            new ImagePrompt(prompt, StabilityAiImageOptions.builder()
                .stylePreset("cinematic")
                .N(4)
                .height(1024)
                .width(1024)
                .build())
        );
    }
}

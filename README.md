# Cuision - AI-Powered Recipe Generator

## 🌐 Live Demo
[Cuision](https://cuision.netlify.app)

## 📌 Project Overview
Cuision is an AI-powered recipe generator built primarily using **Spring Boot** and **Spring AI**, leveraging OpenAI's API to provide intelligent recipe suggestions and answers to cooking-related queries. The backend is responsible for processing user inputs and generating responses, while a minimal **React** frontend serves as the interface.

## 🚀 Key Features
- **Ask AI**: Get AI-powered responses to cooking-related inquiries using OpenAI's API.
- **Create Recipe**: Generate customized recipes based on user-provided ingredients and preferences.
- **Image Generation**: (Currently unavailable due to OpenAI API credit limitations) Generate food images based on AI-generated recipes.

## 📸 Screenshots
![Screenshot](https://github.com/user-attachments/assets/3e556e71-79d8-4081-ae9d-1d8a3798681a)
![Screenshot](https://github.com/user-attachments/assets/676c2c8b-fbb9-47df-87a9-6c4040696685)
![Screenshot](https://github.com/user-attachments/assets/1d5ff0ac-7dea-421e-877f-c9199965eb43)
![Screenshot](https://github.com/user-attachments/assets/781f5361-4e0b-4074-8b3e-f26adf3c9370)
![Screenshot](https://github.com/user-attachments/assets/a6b67329-8cb4-4ee9-9b0f-eed2b84c7908)
![Screenshot](https://github.com/user-attachments/assets/f916c34b-b8a5-46ef-be76-11a64da2c2f4)

## 🛠️ Technology Stack
### Backend (Core Focus):
- **Spring Boot**
- **Spring AI** (Integration with OpenAI API)
- **Dockerized JAR for containerized execution**
- **Deployed on Render**

### Frontend:
- Minimal **React** interface
- Deployed on **Netlify**

## 🏗️ Backend Installation & Setup
1. Clone the backend repository:
   ```sh
   git clone <backend-repo-url>
   cd backend
   ```
2. Build and package the application:
   ```sh
   mvn clean package
   ```
3. Create and run a Docker container:
   ```sh
   docker build -t cuision-backend .
   docker run -p 8080:8080 cuision-backend
   ```

## 📡 Deployment Details
- **Backend**: Hosted on Render (Dockerized for streamlined deployment)
- **Frontend**: Hosted on Netlify ([Cuision](https://cuision.netlify.app))

## 🛑 Known Issues
- **Image generation functionality is currently unavailable** due to OpenAI API credit exhaustion.

## 📌 Future Enhancements
- Implement optimizations for API usage to ensure consistent availability.
- Improve backend performance and scalability.
- Introduce advanced AI-powered recipe customization features.
- Consider adding a database for storing user preferences and generated recipes.

---
**Developed by**: Subhankar Poddar


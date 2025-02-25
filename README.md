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
*(Add relevant screenshots here)*

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


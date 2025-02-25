import React, { useState } from "react";
import "./App.css";
import ChatComponent from "./components/ChatComponent";
import RecipeGenerator from "./components/RecipeGenerator";
import ImageGenerator from "./components/ImageGenerator";

function App() {
  const [activeTab, setActiveTab] = useState('chat');

  return (
    <div className="App">
      <h1 className="app-title">Creative AI Suite</h1>

      {/* Navigation Tabs */}
      <div className="tabs">
        <button
          className={activeTab === "chat" ? "active" : ""}
          onClick={() => setActiveTab("chat")}
        >
          Chat
        </button>
        <button
          className={activeTab === "recipe-generator" ? "active" : ""}
          onClick={() => setActiveTab("recipe-generator")}
        >
          Recipe Generator
        </button>
        <button
          className={activeTab === "image-generator" ? "active" : ""}
          onClick={() => setActiveTab("image-generator")}
        >
          Image Generator
        </button>
      </div>

      {/* Content Section */}
      <div className="tab-content">
        {activeTab === "image-generator" && <ImageGenerator />}
        {activeTab === "chat" && <ChatComponent />}
        {activeTab === "recipe-generator" && <RecipeGenerator />}
      </div>
    </div>
  );
}

export default App;

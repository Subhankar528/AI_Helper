import React, { useState } from "react";

function ChatComponent() {
  const [prompt, setPrompt] = useState("");
  const [chatHistory, setChatHistory] = useState([]);
  const [loading, setLoading] = useState(false);

  const askAI = async () => {
    if (!prompt.trim()) return;
    setLoading(true);
    console.log("Loading started...");

    try {
      const response = await fetch(`${process.env.REACT_APP_API_URL}/ask-ai?prompt=${prompt}`);
      let data = await response.text();

      data = data
        .replace(/###\s*/g, "")
        .replace(/\*\*(.*?)\*\*/g, "$1")
        .replace(/[_*~`]/g, "")
        .replace(/\n{2,}/g, " ")
        .trim();

      setChatHistory((prevHistory) => [
        ...prevHistory,
        { query: prompt, response: data },
      ]);
    } catch (error) {
      console.error("Error generating response:", error);
      setChatHistory((prevHistory) => [
        ...prevHistory,
        { query: prompt, response: "⚠️ Error fetching response." },
      ]);
    } finally {
      setLoading(false);
      setPrompt("");
      console.log("Loading finished...");
    }
  };

  return (
    <div>
      <h2>Talk to AI...</h2>

      {/* Input & Button */}
      <input
        type="text"
        value={prompt}
        onChange={(e) => setPrompt(e.target.value)}
        placeholder="Enter a prompt for AI"
      />
      <button onClick={askAI} disabled={loading}>
        {loading ? "Thinking..." : "Ask AI"}
      </button>

      {/* Loading Spinner */}
      {loading && <div className="loading-spinner"></div>}

      {/* Chat History */}
      <div className="output">
        {chatHistory.map((chat, index) => (
          <div key={index}>
            <p className="chat-query">You: {chat.query}</p>
            <pre className="recipe-text">{chat.response}</pre>
          </div>
        ))}
      </div>
    </div>
  );
}

export default ChatComponent;

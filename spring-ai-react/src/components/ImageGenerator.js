import React, { useState } from "react";

const ImageGenerator = () => {
  const [images, setImages] = useState([]);
  const [error, setError] = useState("");
  const [hasAttempted, setHasAttempted] = useState(false); 

  const generateImage = () => {
    setHasAttempted(true); 
    setError("⚠️ Insufficient balance for API request.");
    setImages([]); 
  };

  return (
    <div className={`generator-container ${hasAttempted ? "show-placeholder" : ""}`}>
      <h2>Generate Image...</h2>
      <input type="text" placeholder="Enter image prompt..." />
      <button onClick={generateImage}>Generate Image</button>

      {hasAttempted && error && <p className="error-message">{error}</p>}

      <div className="image-grid">
        {images.length > 0 ? (
          images.map((image, index) => (
            <img key={index} src={image} alt={`Generated ${index}`} />
          ))
        ) : (
          hasAttempted && (
            <div className="placeholder-container">
              <img src="https://via.placeholder.com/200" alt="Placeholder" />
              <img src="https://via.placeholder.com/200" alt="Placeholder" />
              <img src="https://via.placeholder.com/200" alt="Placeholder" />
            </div>
          )
        )}
      </div>
    </div>
  );
};

export default ImageGenerator;

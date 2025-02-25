import React, { useState } from "react";

function RecipeGenerator() {
  const [ingredients, setIngredients] = useState('');
  const [cusine, setCusine] = useState('');
  const [dietaryRestriction, setDietaryRestriction] = useState('');
  const [recipe, setRecipe] = useState('');
  const [loading, setLoading] = useState(false); 

  const createRecipe = async () => {
    setLoading(true); 
    try {
      const response = await fetch(`${process.env.REACT_APP_API_URL}/recipe-generator?ingredients=${ingredients}&cusine=${cusine}&dietaryRestriction=${dietaryRestriction}`);
      const data = await response.text();
      console.log(data);
      setRecipe(data);
    } catch (error) {
      console.error("Error generating response", error);
      setRecipe("Failed to generate recipe. Please try again.");
    } finally {
      setLoading(false); 
    }
  };

  return (
    <div>
      <h2>Create a Recipe...</h2>
      <input
        type="text"
        value={ingredients}
        onChange={(e) => setIngredients(e.target.value)}
        placeholder="Enter ingredients (comma separated)"
      />
      <input
        type="text"
        value={cusine}
        onChange={(e) => setCusine(e.target.value)}
        placeholder="Enter cuisine type"
      />
      <input
        type="text"
        value={dietaryRestriction}
        onChange={(e) => setDietaryRestriction(e.target.value)}
        placeholder="Enter dietary restriction"
      /><br />
      <button onClick={createRecipe} disabled={loading}>
        {loading ? "Generating..." : "Create Recipe"}
      </button>
      
      
      {loading && <div className="loading-spinner"></div>}

      <div className="output">
        <pre className="recipe-text">{recipe}</pre>
      </div>
    </div>
  );
}

export default RecipeGenerator;

package com.example.cookbook

class Recipes {
    private var RecipeName: String? = null
    private var RecipeIngredients: String? = null
    private var RecipeMethodTitle: String? = null
    private var Recipe: String? = null
    private var Thumbnail: Int? = null

    public fun Recipes(recipeName: String?, recipeIngredients: String?, recipeMethodTitle: String?, recipe: String?, thumbnail: Int?) {
        RecipeName = recipeName
        RecipeIngredients = recipeIngredients
        RecipeMethodTitle = recipeMethodTitle
        Recipe = recipe
        Thumbnail = thumbnail
    }

    public fun getRecipeName(): String? {
        return this.RecipeName
    }

    public fun getRecipeIngredients(): String? {
        return this.RecipeIngredients
    }

    public fun getRecipeMethodTitle(): String? {
        return this.RecipeMethodTitle
    }

    public fun getRecipe(): String? {
        return this.Recipe
    }

    public fun getThumbnail(): Int? {
        return this.Thumbnail
    }
}
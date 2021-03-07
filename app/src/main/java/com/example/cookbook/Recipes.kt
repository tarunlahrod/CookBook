package com.example.cookbook

class Recipes(recipeName: String?, recipeIngredients: String?, recipeMethodTitle: String?, recipe: String?, thumbnail: Int?) {
    private var RecipeName: String? = recipeName
    private var RecipeIngredients: String? = recipeIngredients
    private var RecipeMethodTitle: String? = recipeMethodTitle
    private var Recipe: String? = recipe
    private var Thumbnail: Int? = thumbnail

//    public fun Recipes (recipeName: String?, recipeIngredients: String?, recipeMethodTitle: String?, recipe: String?, thumbnail: Int?) {
//        RecipeName = recipeName
//        RecipeIngredients = recipeIngredients
//        RecipeMethodTitle = recipeMethodTitle
//        Recipe = recipe
//        Thumbnail = thumbnail
//    }

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
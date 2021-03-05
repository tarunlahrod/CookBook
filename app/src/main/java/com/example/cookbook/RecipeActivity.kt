package com.example.cookbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RecipeActivity : AppCompatActivity() {

    private var mRecipeName: TextView? = null
    private var mRecipeIngredients: TextView? = null
    private var mRecipeMethodTitle: TextView? = null
    private var mRecipe: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe)

        mRecipeName = findViewById(R.id.text_recipeName)
        mRecipeIngredients = findViewById(R.id.text_ingredients)
        mRecipeMethodTitle = findViewById(R.id.text_method)
        mRecipe = findViewById(R.id.text_recipe)

        var Title: String? = intent.getStringExtra("RecipeName")
        var Ingredients: String? = intent.getStringExtra("RecipeIngredients")
        var MethodTitle: String? = intent.getStringExtra("RecipeMethodTitle")
        var Recipe: String? = intent.getStringExtra("Recipe")

        mRecipeName!!.text = Title
        mRecipeIngredients!!.text = Ingredients
        mRecipeMethodTitle!!.text = MethodTitle
        mRecipe!!.text = Recipe

    }
}
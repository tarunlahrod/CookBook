package com.example.cookbook

import android.app.Activity
import android.icu.text.CaseMap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {

    private var myRecyclerView: RecyclerView? = null
    private var myRVAdapter: RecyclerViewAdapter? = null

//    var recipes1: List<Recipes>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        supportActionBar?.title = "Home"

        var recipes1: List<Recipes>? = null

        recipes1 = ArrayList<Recipes>()
        recipes1.add(Recipes("Dosa", "Maida, water, leaves", "Method ka title", "step1\n" + "step2\n" + "done!\n", R.drawable.dosa))
        recipes1.add(Recipes("Momos", "Maida, Chicken, Mayonnaise", "Momos banane ka tareeka", "step1\n" + "step2\n" + "done!\n", R.drawable.momos))
        recipes1.add(Recipes("Chicken", "Chicken, Chicken masala, Butter, Curd", "How to make Butter Chicken", "step1\n" + "step2\n" + "done!\n", R.drawable.chicken))

        myRecyclerView = findViewById(R.id.recyclerView_id)
        myRVAdapter = RecyclerViewAdapter(this, recipes1)
        myRecyclerView?.layoutManager = GridLayoutManager(this, 1)
        myRecyclerView?.adapter = myRVAdapter
    }
}
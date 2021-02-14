package com.mandeepdhillon.cookit

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*


data class Recipe(val name:String, val imageURL:String, val steps: List<String>)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recipe_list.layoutManager = LinearLayoutManager(this)

        val recipes = listOf(
                Recipe("Chocolate Chip Cookies", "https://images.pexels.com/photos/230325/pexels-photo-230325.jpeg", listOf("Step 1", "Step 2")),
                Recipe("Best Brownies", "https://images.pexels.com/photos/45202/brownie-dessert-cake-sweet-45202.jpeg", listOf("Step 1", "Step 2", "Step 3")),
                Recipe("Banana Bread", "https://images.pexels.com/photos/830894/pexels-photo-830894.jpeg", listOf("Step 1", "Step 2"))
        )

        recipe_list.adapter = RecipeAdapter(recipes)

    }
}

private class RecipeAdapter(val recipes: List<Recipe>, val context: Context): RecyclerView.Adapter<RecipeViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

}

private class RecipeViewHolder(view: View): RecyclerView.ViewHolder(view)
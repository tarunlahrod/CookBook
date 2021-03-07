package com.example.cookbook

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(mContext: Context?, mData: List<Recipes>?): RecyclerView.Adapter<RecyclerViewAdapter.MyHolder>() {

    private var mContext: Context? = mContext
    private var mData:List<Recipes>? = mData

//    public fun RecyclerViewAdapter(mContext: Context?, mData: List<Recipes>?) {
//        this.mContext = mContext
//        this.mData = mData
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        var view: View? = null
        var mInflater: LayoutInflater? = LayoutInflater.from(mContext)
        view = mInflater?.inflate(R.layout.cardview_recipe, parent, false)
        return MyHolder(view)
    }

    override fun getItemCount(): Int {
        return mData!!.size
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.recipeTitle?.text = mData?.get(position)?.getRecipeName()
        holder.img_recipeThumbnail?.setImageResource(mData?.get(position)?.getThumbnail()!!)
        holder.cardView?.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                var intent: Intent = Intent(mContext, RecipeActivity::class.java)

                intent.putExtra("Name", mData?.get(position)?.getRecipeName())
                intent.putExtra("Ingredients", mData?.get(position)?.getRecipeIngredients())
                intent.putExtra("MethodTitle", mData?.get(position)?.getRecipeMethodTitle())
                intent.putExtra("Recipe", mData?.get(position)?.getRecipe())

                mContext?.startActivity(intent)
            }
        })
    }

    class MyHolder(itemView : View?) : RecyclerView.ViewHolder(itemView!!) {

        var recipeTitle: TextView? = null
        var cardView: CardView? = null
        var img_recipeThumbnail: ImageView? = null

        public fun MyHolder(itemView : View)
        {
            super.itemView

            recipeTitle = itemView.findViewById(R.id.text_recipeName)
            img_recipeThumbnail = itemView.findViewById(R.id.recipe_img_id)
            cardView = itemView.findViewById(R.id.cardview_id)
        }
    }
}
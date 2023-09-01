package com.example.recipeapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recipeapp.Models.Ingredient;
import com.example.recipeapp.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class InstructionIngredientsAdapter extends RecyclerView.Adapter<InstructionIngredientViewHolder>{
    Context context;
    List<Ingredient> list;

    public InstructionIngredientsAdapter(Context context, List<Ingredient> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public InstructionIngredientViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new InstructionIngredientViewHolder(LayoutInflater.from(context).inflate(R.layout.list_instruction_steps_items,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull InstructionIngredientViewHolder holder, int position) {

        holder.textView_instruction_steps_item.setText(list.get(position).name);
        holder.textView_instruction_steps_item.setSelected(true);
        Picasso.get().load("https://spoonacular.com/cdn/ingredients_100x100/"+list.get(position).image).into(holder.imageView_instruction_steps_items);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
class InstructionIngredientViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView_instruction_steps_items;
    TextView textView_instruction_steps_item;
    public InstructionIngredientViewHolder(@NonNull View itemView) {
        super(itemView);

        textView_instruction_steps_item = itemView.findViewById(R.id.textView_instruction_steps_item);
        imageView_instruction_steps_items = itemView.findViewById(R.id.imageView_instruction_steps_items);
    }
}

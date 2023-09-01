package com.example.recipeapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recipeapp.Models.Equipment;
import com.example.recipeapp.Models.Ingredient;
import com.example.recipeapp.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class InstructionEquipemtsAdapter extends RecyclerView.Adapter<InstrumentEquipementsViewHolder>{
    Context context;
    List<Equipment> list;

    public InstructionEquipemtsAdapter(Context context, List<Equipment> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public InstrumentEquipementsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new InstrumentEquipementsViewHolder(LayoutInflater.from(context).inflate(R.layout.list_instruction_steps_items,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull InstrumentEquipementsViewHolder holder, int position) {

        holder.textView_instruction_steps_item.setText(list.get(position).name);
        holder.textView_instruction_steps_item.setSelected(true);
        Picasso.get().load("https://spoonacular.com/cdn/equipment_100x100/"+list.get(position).image).into(holder.imageView_instruction_steps_items);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
class InstrumentEquipementsViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView_instruction_steps_items;
    TextView textView_instruction_steps_item;
    public InstrumentEquipementsViewHolder(@NonNull View itemView) {
        super(itemView);

        textView_instruction_steps_item = itemView.findViewById(R.id.textView_instruction_steps_item);
        imageView_instruction_steps_items = itemView.findViewById(R.id.imageView_instruction_steps_items);
    }
}

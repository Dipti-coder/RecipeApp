package com.example.recipeapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recipeapp.Models.Step;
import com.example.recipeapp.R;

import java.util.List;

public class InstructionsStepsAdapter extends RecyclerView.Adapter<InstructionStepsViewHolder>{

    Context context;
    List<Step> list;

    public InstructionsStepsAdapter(Context context, List<Step> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public InstructionStepsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new InstructionStepsViewHolder(LayoutInflater.from(context).inflate(R.layout.list_instruction_steps,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull InstructionStepsViewHolder holder, int position) {

        holder.textView_instruction_step_number.setText(String.valueOf(list.get(position).number));
        holder.textView_instruction_step_title.setText(list.get(position).step);

        holder.recycler_instruction_ingredients.setHasFixedSize(true);
        holder.recycler_instruction_ingredients.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
        InstructionIngredientsAdapter ingredientsAdapter = new InstructionIngredientsAdapter(context, list.get(position).ingredients);
        holder.recycler_instruction_ingredients.setAdapter(ingredientsAdapter);


        holder.recycler_instruction_equipments.setHasFixedSize(true);
        holder.recycler_instruction_equipments.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        InstructionEquipemtsAdapter instructionEquipemtsAdapter = new InstructionEquipemtsAdapter(context, list.get(position).equipment);
        holder.recycler_instruction_equipments.setAdapter(instructionEquipemtsAdapter);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
class InstructionStepsViewHolder extends RecyclerView.ViewHolder {

    TextView textView_instruction_step_number,textView_instruction_step_title;
    RecyclerView recycler_instruction_equipments,recycler_instruction_ingredients;
    public InstructionStepsViewHolder(@NonNull View itemView) {
        super(itemView);

        textView_instruction_step_number = itemView.findViewById(R.id.textView_instruction_step_number);
        textView_instruction_step_title = itemView.findViewById(R.id.textView_instruction_step_title);
        recycler_instruction_equipments = itemView.findViewById(R.id.recycler_instruction_equipments);
        recycler_instruction_ingredients = itemView.findViewById(R.id.recycler_instruction_ingredients);
    }
}

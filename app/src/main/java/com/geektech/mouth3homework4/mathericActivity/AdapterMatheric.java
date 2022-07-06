package com.geektech.mouth3homework4.mathericActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geektech.mouth3homework4.R;
import com.geektech.mouth3homework4.onClickItem;

import java.util.ArrayList;

public class AdapterMatheric extends RecyclerView.Adapter<ViewHolderMatheric> {

    private ArrayList<Matheric> dataMatheric;
    private onClickItem onClickItem;
    private Context context;

    public AdapterMatheric(ArrayList<Matheric> dataMatheric, onClickItem onClickItem, Context context) {
        this.dataMatheric = dataMatheric;
        this.onClickItem = onClickItem;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolderMatheric onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderMatheric(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_matheric, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderMatheric holder, @SuppressLint("RecyclerView") int position) {
        holder.onBind(dataMatheric.get(position), context);
        holder.itemView.setOnClickListener(view -> onClickItem.onClick(position));
    }

    @Override
    public int getItemCount() {
        return dataMatheric.size();
    }
}

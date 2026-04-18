package com.universidad.libreramvil;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class GeneroAdapter extends RecyclerView.Adapter<GeneroAdapter.GeneroViewHolder> {

    private List<String> generos;

    public GeneroAdapter(List<String> generos) {
        this.generos = generos;
    }

    @NonNull
    @Override
    public GeneroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_generos, parent, false);
        return new GeneroViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull GeneroViewHolder holder, int position) {
        holder.tvGeneroItem.setText(generos.get(position));
    }

    @Override
    public int getItemCount() {
        return generos != null ? generos.size() : 0;
    }

    static class GeneroViewHolder extends RecyclerView.ViewHolder {
        TextView tvGeneroItem;

        public GeneroViewHolder(@NonNull View itemView) {
            super(itemView);
            tvGeneroItem = itemView.findViewById(R.id.tvGeneroItem);
        }
    }
}

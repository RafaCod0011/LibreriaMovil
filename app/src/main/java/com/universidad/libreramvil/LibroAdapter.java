package com.universidad.libreramvil;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.universidad.libreramvil.databinding.ItemBinding;
import com.universidad.libreramvil.modelo.Libro;

import java.util.List;

public class LibroAdapter extends RecyclerView.Adapter<LibroAdapter.ViewHolderLibro> {

    private List<Libro> libros;

    public LibroAdapter(List<Libro> libros, Context context, LayoutInflater li){
        this.libros = libros;
    }

    @NonNull
    @Override
    public ViewHolderLibro onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ItemBinding binding = ItemBinding.inflate(inflater, parent, false);

        return new ViewHolderLibro(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderLibro holder, int position) {

        Libro l = libros.get(position);

        holder.binding.imgPortada.setImageResource(l.getTapa());
        holder.binding.tvTitulo.setText(l.getTitulo());
        holder.binding.tvAutor.setText(l.getAutor());
        holder.binding.tvInfoExtra.setText(l.getAnioPublicacion() + " - " + l.getEditorial());
    }

    @Override
    public int getItemCount() {
        return libros.size();
    }

    public class ViewHolderLibro extends RecyclerView.ViewHolder{

        ItemBinding binding;

        public ViewHolderLibro(ItemBinding binding) {
            super(binding.getRoot());

            this.binding = binding;
        }
    }


}

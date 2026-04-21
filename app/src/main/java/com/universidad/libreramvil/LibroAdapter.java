package com.universidad.libreramvil;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.universidad.libreramvil.databinding.ItemBinding;
import com.universidad.libreramvil.modelo.Libro;

import java.util.List;

public class LibroAdapter extends RecyclerView.Adapter<LibroAdapter.ViewHolderLibro> {

    private List<Libro> libros;

    private OnItemClickListener listener;

    // Contrato
    public interface OnItemClickListener {
        void onItemClick(String titulo);
    }
    public LibroAdapter(List<Libro> libros,OnItemClickListener listener){
        this.libros = libros;
        this.listener = listener;
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


        // Aca hacemos uso del metodo de la interface
        holder.itemView.setOnClickListener(v -> {
            if (listener != null) {
                listener.onItemClick(l.getTitulo());
            }
        });

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

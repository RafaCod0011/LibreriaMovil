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


        //Agregamos la funcionalidad de tomar el texto del item y pegarlo en el
        //buscador, para esto tomamos el activity desde el contexto, y le pasa
        //el titulo del libro..
        //La Activity va a recibir el texto, pero lo va a pegar, sino que se lo pasa
        //al view model, quien recibe el titulo, actualiza el liveData
        //para que despues el observer del activity lo pegue

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getContext() instanceof BuscadorActivity) {
                    BuscadorActivity activity = (BuscadorActivity) v.getContext();
                    activity.actualizarTexto(l.getTitulo());
                }
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

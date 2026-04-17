package com.universidad.libreramvil;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.universidad.libreramvil.modelo.Libro;

import java.util.List;

public class LibroAdapter extends RecyclerView.Adapter<LibroAdapter.ViewHolderLibro> {

    private List<Libro> libros;

    private Context context;

    private LayoutInflater li;
    public LibroAdapter(List<Libro> libros, Context context, LayoutInflater li){
        this.libros = libros;
        this.context = context;
        this.li = li;
    }

    @NonNull
    @Override
    public ViewHolderLibro onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = li.inflate(R.layout.item, parent, false);

        return new ViewHolderLibro(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderLibro holder, int position) {

        Libro l = libros.get(position);

        holder.imgLibro.setImageResource(l.getTapa());
        holder.txtTitulo.setText(l.getTitulo());
        holder.txtAutor.setText(l.getAutor());
        holder.txtInfo.setText(l.getAnioPublicacion() + " - " + l.getEditorial());
    }

    @Override
    public int getItemCount() {
        return libros.size();
    }

    public class ViewHolderLibro extends RecyclerView.ViewHolder{

        ImageView imgLibro;
        TextView txtTitulo, txtAutor, txtInfo;

        public ViewHolderLibro(@NonNull View itemView) {
            super(itemView);

            imgLibro = itemView.findViewById(R.id.img_portada);
            txtTitulo = itemView.findViewById(R.id.tv_titulo);
            txtAutor = itemView.findViewById(R.id.tv_autor);
            txtInfo = itemView.findViewById(R.id.tv_info_extra);
        }
    }


}

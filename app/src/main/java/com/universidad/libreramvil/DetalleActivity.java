package com.universidad.libreramvil;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;

import com.universidad.libreramvil.databinding.ActivityBuscadorBinding;
import com.universidad.libreramvil.databinding.ActivityDetalleBinding;
import com.universidad.libreramvil.modelo.Libro;

import java.util.List;

public class DetalleActivity extends AppCompatActivity {

    private DetalleActivityViewModel vm;
    private ActivityDetalleBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        b = ActivityDetalleBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());
        vm= new ViewModelProvider(this).get(DetalleActivityViewModel.class);

        //Creamos un grid de 2 columnas para organizar los generos.
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        b.rvGeneros.setLayoutManager(layoutManager);


        b.btVolver.setOnClickListener(v -> finish());

        vm.getLibroRecuperado().observe(this, new Observer<Libro>() {
            @Override
            public void onChanged(Libro libro) {
                b.imgPortada.setImageResource(libro.getTapa());
                b.tvTitulo.setText(libro.getTitulo());
                b.tvAutor.setText(libro.getAutor());
                b.tvPaginas.setText(String.valueOf(libro.getCantidadPaginas()));
                b.tvFecha.setText(String.valueOf(libro.getAnioPublicacion()));
                b.tvDescripcion.setText(libro.getSinopsis());

                // RecyclerView de los generos.
                GeneroAdapter adapter = new GeneroAdapter(libro.getGeneros());
                b.rvGeneros.setAdapter(adapter);

                //cargarGeneros(libro.getGeneros());
            }
        });

        vm.mostrarLibro(getIntent());


    }

    // Esto se usa para mostrar los generos si es que usamos campos TextView
    /*private void cargarGeneros(List<String> generos) {
        b.tvGenero1.setText(getGenero(generos, 0));
        b.tvGenero2.setText(getGenero(generos, 1));
        b.tvGenero3.setText(getGenero(generos, 2));
        b.tvGenero4.setText(getGenero(generos, 3));
        b.tvGenero5.setText(getGenero(generos, 4));
    }

    private String getGenero(List<String> generos, int index) {
        if (generos != null && index < generos.size()) {
            return generos.get(index);
        }
        return "";
    }*/
}
package com.universidad.libreramvil;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.universidad.libreramvil.databinding.ActivityBuscadorBinding;
import com.universidad.libreramvil.databinding.ActivityDetalleBinding;
import com.universidad.libreramvil.modelo.Libro;

public class DetalleActivity extends AppCompatActivity {

    private DetalleActivityViewModel vm;
    private ActivityDetalleBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        b = ActivityDetalleBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());
        vm= new ViewModelProvider(this).get(DetalleActivityViewModel.class);

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
            }
        });

        vm.mostrarLibro(getIntent());
    }
}
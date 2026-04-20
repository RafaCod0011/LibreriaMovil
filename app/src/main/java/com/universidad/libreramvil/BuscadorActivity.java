package com.universidad.libreramvil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

import com.universidad.libreramvil.databinding.ActivityBuscadorBinding;
import com.universidad.libreramvil.modelo.Libro;


public class BuscadorActivity extends AppCompatActivity {

private BuscadorActivityViewModel vm;
private ActivityBuscadorBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //queda inflado el binding
        b = ActivityBuscadorBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());
        //queda inicializado el viewmodel
        vm = new ViewModelProvider(this).get(BuscadorActivityViewModel.class);

        b.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        vm.getListaLibros().observe(this, lista -> {

            LibroAdapter adapter = new LibroAdapter(lista, this, getLayoutInflater());
            b.recyclerView.setAdapter(adapter);
        });


        vm.getTextoBuscador().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String nuevoTexto) {
                // Cuando el LiveData cambia, el EditText se actualiza solo
                b.etBuscar.setText(nuevoTexto);
            }
        });



        //Le ponemos un listener al boton buscar, que al presionarse ejecuta
        b.btBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String titulo = b.etBuscar.getText().toString();
                vm.buscarLibro(titulo);
            }
        });


        //Observamos el resultado del VM
        vm.getLibroBuscadoMutable().observe(this, new Observer<Libro>() {
                    @Override
                    public void onChanged(Libro libro) {
                        if (libro !=null) {
                            Intent intent = new Intent(BuscadorActivity.this, DetalleActivity.class);
                            //Para poder hacer esto, le agregamos implementamos Serializable a Libro
                            intent.putExtra("Libro", libro);
                            startActivity(intent);
                        }else {
                            Toast.makeText(BuscadorActivity.this, "No se encontró el libro", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }

    public void actualizarTexto(String titulo) {
        vm.setTextoBuscador(titulo);
    }

}
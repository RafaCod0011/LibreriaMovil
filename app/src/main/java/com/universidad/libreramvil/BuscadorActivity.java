package com.universidad.libreramvil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
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
        //mv.getPersonasMutable().observe(this, new Observer<List<Persona>>() {

        //Le ponemos un listener al boton buscar, que al presionarse ejecuta
        //en el viewmodel el metodo buscarLibro
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
}
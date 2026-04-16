package com.universidad.libreramvil;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;

import com.universidad.libreramvil.databinding.ActivityBuscadorBinding;

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

        //
        //Se podría seguir incorporando Observador, y Listeners
        //



    }
}
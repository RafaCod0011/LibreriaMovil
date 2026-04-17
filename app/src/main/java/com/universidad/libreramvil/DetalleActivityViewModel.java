package com.universidad.libreramvil;

import android.app.Application;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.universidad.libreramvil.modelo.Libro;

public class DetalleActivityViewModel extends AndroidViewModel {

    private MutableLiveData<Libro> libroRecuperado= new MutableLiveData<>();
    public DetalleActivityViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<Libro> getLibroRecuperado(){return libroRecuperado;}

    public void mostrarLibro(Intent intent){
        Libro l = (Libro) intent.getSerializableExtra("Libro");
        if (l != null){
            libroRecuperado.setValue(l);
        }
    }
}

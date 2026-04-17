package com.universidad.libreramvil;
import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.universidad.libreramvil.modelo.Libro;
import com.universidad.libreramvil.repositorio.LibroRepositorio;

import java.util.List;

public class BuscadorActivityViewModel extends AndroidViewModel {

    private MutableLiveData<Libro> libroBuscadoMutable;
    private MutableLiveData<List<Libro>> listaLibrosMutable;
    private LibroRepositorio repositorio;



    public BuscadorActivityViewModel(@NonNull Application application) {
        super(application);
        repositorio = new LibroRepositorio();
        Log.d("LISTA", "Repositorio creado");
        libroBuscadoMutable = new MutableLiveData<>();

        listaLibrosMutable = new MutableLiveData<>();
        listaLibrosMutable.setValue(repositorio.obtenerLibros());

    }

    public LiveData<Libro>getLibroBuscadoMutable(){
        return libroBuscadoMutable;
    }

    public LiveData<List<Libro>> getListaLibros() {
        return listaLibrosMutable;
    }

    public void buscarLibro(String titulo) {
        if (titulo != null && !titulo.trim().isEmpty()) {
            Libro resultado = repositorio.buscarPorTitulo(titulo);
            libroBuscadoMutable.setValue(resultado);
        } else {
            libroBuscadoMutable.setValue(null);
        }
    }





}

package com.example.mislugares;

import com.example.mislugares.datos.LugaresLista;
import com.example.mislugares.datos.RepositorioLugares;
import com.example.mislugares.modelo.GeoPunto;
import com.example.mislugares.modelo.Lugar;

public class Principal {


    public static void main(String[] args) {

        RepositorioLugares lugares = new LugaresLista();
        for (int i=0;i<lugares.dimensión(); i++){
            System.out.println(lugares.elemento(i).toString());
        }
    }
}
package com.ort.tp5_;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Fragment

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class actividadprincipal extends AppCompatActivity {

    FragmentManager administrador;
    FragmentTransaction Transacciones;

    String ciudadingresada_;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_actividadprincipal);

        Fragment miingreso;
        miingreso= new Fragment ();
        administrador=getFragmentManager ();
        Transacciones=administrador.beginTransaction ();
        Transacciones.replace (R.id.alojador, miingreso);
        Transacciones.commit ();
    }
    public void recibirdatos(String ciudad){
        ciudadingresada_=ciudad;
    }
    public String verciudad(){
        return ciudadingresada_;
    }
}
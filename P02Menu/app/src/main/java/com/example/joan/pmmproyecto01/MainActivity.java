package com.example.joan.pmmproyecto01;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends Activity {

    ListViewAdapter adapter;

    String[] titulo = new String[]{
            "PERFIL",
            "JUEGO",
            "INSTRUCCIONES",
            "INFO"
    };

    int[] imagenes = {
            R.drawable.ic_account_circle_white_24dp,
            R.drawable.ic_extension_white_24dp,
            R.drawable.ic_description_white_24dp,
            R.drawable.ic_info_white_24dp
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView lista = (ListView) findViewById(R.id.listView);
        adapter = new ListViewAdapter(this, titulo, imagenes);
        lista.setAdapter(adapter);


    }
}
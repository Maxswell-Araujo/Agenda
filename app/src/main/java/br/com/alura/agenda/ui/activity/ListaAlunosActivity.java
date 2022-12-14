/*
Nesta aula, aprendemos a:

    adicionar Views via código Java e via arquivo estático;
    implementar layouts que apresentam listas;
    utilizar AdapterViews em específico o ListView.
 */
package br.com.alura.agenda.ui.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.alura.agenda.R;

public class ListaAlunosActivity extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos);
        setTitle("Lista de Alunos");
        List<String> alunos = new ArrayList<>(
                Arrays.asList("Alex", "Fran", "José", "Maxswell"));
        ListView listaDeAlunos = findViewById(R.id.activity_lista_alunos_listview);
        listaDeAlunos.setAdapter(new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                alunos));



    }
}

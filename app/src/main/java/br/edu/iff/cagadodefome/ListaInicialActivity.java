package br.edu.iff.cagadodefome;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kamik on 22/10/2017.
 */

public class ListaInicialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.content_main);
        //código para a lista
        ListView lista = (ListView) findViewById(R.id.listaInicial);
        List<Estabelecimento> estabelecimentos = todosOsEstabelecimentos();
        AdapterListaInicial adapterListaInicial = new AdapterListaInicial(estabelecimentos, this);
        lista.setAdapter(adapterListaInicial);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                switch(position){
                    case 0:
                        intent = new Intent(getBaseContext(), MainActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(getBaseContext(), MainActivity.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(getBaseContext(), MainActivity.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(getBaseContext(), MainActivity.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(getBaseContext(), MainActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }

    private List<Estabelecimento> todosOsEstabelecimentos(){
        return new ArrayList<>(Arrays.asList(
                new Estabelecimento("Pizzas", 0, R.drawable.pizza),
                new Estabelecimento("Lanches", 1, R.drawable.hamburger),
                new Estabelecimento("Bebidas", 2, R.drawable.bebida1),
                new Estabelecimento("Ajuda", 3, android.R.drawable.ic_menu_help),
                new Estabelecimento("Configurações", 4, android.R.drawable.ic_menu_manage)));
    }
}

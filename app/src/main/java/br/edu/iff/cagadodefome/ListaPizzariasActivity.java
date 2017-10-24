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
 * Created by kamik on 23/10/2017.
 */

public class ListaPizzariasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_pizzarias);
        //código para a lista
        ListView lista = (ListView) findViewById(R.id.listaPizzarias);
        List<Pizzaria> pizzarias = todasAsPizzarias();
        AdapterListaPizza adapterListaPizza = new AdapterListaPizza(pizzarias, this);
        lista.setAdapter(adapterListaPizza);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                switch (position) {
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

    private List<Pizzaria> todasAsPizzarias() {
        return new ArrayList<>(Arrays.asList(
                new Pizzaria("La Parma Pizza", "Fechado", "Seg - Sab: 10h - 02h", "(22)998772751", R.drawable.pizza, 0),
                new Pizzaria("Pizzaria Massas e Cia", "Aberto", "Seg - Sab: 18h - 02h", "(22)998772751", R.drawable.pizza_, 1),
                new Pizzaria("Pizzaria Italiana", "Aberto", "Seg - Sab: 18h - 02h", "(22)998772751", R.drawable.pizza, 2),
                new Pizzaria("Pizzaria do Mamão", "Aberto", "Seg - Sab: 18h - 02h", "(22)998772751", R.drawable.pizza_, 3),
                new Pizzaria("Pizzaria Massas e Cia", "Aberto", "Seg - Sab: 18h - 02h", "(22)998772751", R.drawable.pizza, 4)));
    }
}
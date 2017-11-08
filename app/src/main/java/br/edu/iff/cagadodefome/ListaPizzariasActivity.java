package br.edu.iff.cagadodefome;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
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

        setContentView(R.layout.main_pizzarias2);

        /*Toolbar toolbar2 = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar2);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar2, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Lembrar de adicionar funcionalidade!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view2);
        navigationView.setNavigationItemSelectedListener(this);
*/

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Lembrar de adicionar funcionalidade!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

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
                        intent = new Intent(getBaseContext(), ActivityPizzaria.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(getBaseContext(), ActivityPizzaria.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(getBaseContext(), ActivityPizzaria.class);
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
/*
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.drawer_main) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        } else if (id == R.id.drawer_pizzas) {
            //Intent intent = new Intent(this, ListaPizzariasActivity.class);
            //startActivity(intent);
        } else if (id == R.id.drawer_lanches) {
            Intent intent = new Intent(this, ListaInicialActivity.class);
            startActivity(intent);
        } else if (id == R.id.drawer_bebidas) {
            Intent intent = new Intent(this, ListaInicialActivity.class);
            startActivity(intent);
        } else if (id == R.id.drawer_ajuda) {
            Intent intent = new Intent(this, ListaInicialActivity.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
*/
    private List<Pizzaria> todasAsPizzarias() {
        return new ArrayList<>(Arrays.asList(
                new Pizzaria("La Parma Pizza", "Fechado", "Seg - Sab: 10h - 02h", "(22)998772751", R.drawable.pizza, 0),
                new Pizzaria("Pizzaria Massas e Cia", "Aberto", "Seg - Sab: 18h - 02h", "(22)998772751", R.drawable.pizza_, 1),
                new Pizzaria("Pizzaria Italiana", "Aberto", "Seg - Sab: 18h - 02h", "(22)998772751", R.drawable.pizza, 2),
                new Pizzaria("Pizzaria do Mamão", "Aberto", "Seg - Sab: 18h - 02h", "(22)998772751", R.drawable.pizza_, 3),
                new Pizzaria("Pizzaria Massas e Cia", "Aberto", "Seg - Sab: 18h - 02h", "(22)998772751", R.drawable.pizza, 4)));
    }
}
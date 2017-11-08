package br.edu.iff.cagadodefome;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Lembrar de adicionar funcionalidade!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

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
                        intent = new Intent(getBaseContext(), ListaPizzariasActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(getBaseContext(), ListaPizzariasActivity.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(getBaseContext(), ListaPizzariasActivity.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(getBaseContext(), ListaPizzariasActivity.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(getBaseContext(), ListaPizzariasActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }

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
            if(getClass()==MainActivity.class){
                //faça nada
            }else{
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
            }
        } else if (id == R.id.drawer_pizzas) {
            Intent intent = new Intent(this, ListaPizzariasActivity.class);
            startActivity(intent);
        } else if (id == R.id.drawer_lanches) {
            Intent intent = new Intent(this, ListaPizzariasActivity.class);
            startActivity(intent);
        } else if (id == R.id.drawer_bebidas) {
            Intent intent = new Intent(this, ListaPizzariasActivity.class);
            startActivity(intent);
        } else if (id == R.id.drawer_ajuda) {
            Intent intent = new Intent(this, ListaPizzariasActivity.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
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

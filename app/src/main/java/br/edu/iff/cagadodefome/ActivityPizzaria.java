package br.edu.iff.cagadodefome;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kamik on 24/10/2017.
 */

public class ActivityPizzaria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizzaria);

        ListView lista = (ListView) findViewById(R.id.listaPizzasPizzarias);
        List<Cardapio> cardapios = cardapioPizzaria();
        AdapterListaCardapio adapterListaCardapio = new AdapterListaCardapio(cardapios, this);
        lista.setAdapter(adapterListaCardapio);

        ListView lista2 = (ListView) findViewById(R.id.listaBebidasPizzarias);
        List<Cardapio> cardapios2 = cardapioBebida();
        AdapterListaCardapio adapterListaCardapio2 = new AdapterListaCardapio(cardapios2, this);
        lista2.setAdapter(adapterListaCardapio2);

        ListView lista3 = (ListView) findViewById(R.id.listaLanchesPizzarias);
        List<Cardapio> cardapios3 = cardapioLanche();
        AdapterListaCardapio adapterListaCardapio3 = new AdapterListaCardapio(cardapios3, this);
        lista3.setAdapter(adapterListaCardapio3);

        ListView lista4 = (ListView) findViewById(R.id.listaOutrosPizzarias);
        List<Cardapio> cardapio4 = cardapioOutros();
        AdapterListaCardapio adapterListaCardapio4 = new AdapterListaCardapio(cardapio4, this);
        lista4.setAdapter(adapterListaCardapio4);
    }

    private List<Cardapio> cardapioPizzaria(){
        return new ArrayList<>(Arrays.asList(
                new Cardapio("Pizza Americana", "Mussarela, presunto, bacon em cubo, ovo, azeitona e orégano - Peq. 4 fatias, Média 4 fatias", "R$22,00"),
                new Cardapio("Pizza Calabresa", "Mussarela, calabresa, cebola, azeitona e orégano - Peq. 4 fatias, Média 4 fatias, Grande 6 fatias, Família 8 fatias, Gigante 16 fatias.", "R$23,00"),
                new Cardapio("Pizza Quatro Queijos", "Mussarela, parmesão, provolone, catupiry, azeitona e orégano - Peq. 4 fatias, Média 4 fatias, Grande 6 fatias, Família 8 fatias, Gigante 16 fatias.", "R$22,00")));
    }
    private List<Cardapio> cardapioBebida(){
        return new ArrayList<>(Arrays.asList(
                new Cardapio("Coca cola", "2 litros (retornável)", "R$4,50"),
                new Cardapio("Guaraná Antártica", "2 litros (retornável)", "R$4,50"),
                new Cardapio("Fanta Laranja", "2 litros", "R$6,50"),
                new Cardapio("Sprite", "2 litros", "R$6,50")));
    }
    private List<Cardapio> cardapioLanche(){
        return new ArrayList<>(Arrays.asList(
                new Cardapio("Hamburguer", "Pão, alface, tomate, carne, batata, milho", "R$15,00"),
                new Cardapio("X tudo", "Pão, alface, tomate, 2 carnes, 2 ovos, 2 queijos, 2 presuntos, batata e milho", "R$10,00)")));
    }
    private List<Cardapio> cardapioOutros(){
        return new ArrayList<>(Arrays.asList(
                new Cardapio("Hamburguer", "Pão, alface, tomate, carne, batata, milho", "R$15,00"),
                new Cardapio("X tudo", "Pão, alface, tomate, 2 carnes, 2 ovos, 2 queijos, 2 presuntos, batata e milho", "R$10,00)")));
    }
}

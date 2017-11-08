package br.edu.iff.cagadodefome;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by kamik on 24/10/2017.
 */

public class AdapterListaCardapio extends BaseAdapter {
    private final List<Cardapio> cardapios;
    private final Activity act;

    public AdapterListaCardapio(List<Cardapio> cardapios, Activity act){
        this.cardapios = cardapios;
        this.act = act;
    }

    @Override
    public int getCount() {
        return cardapios.size();
    }

    @Override
    public Object getItem(int position) {
        return cardapios.get(position);
    }

    @Override
    public long getItemId(int position) {
        long x = 0;
        x = cardapios.size();
        x = (x%2)+1;
        return x;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = act.getLayoutInflater().inflate(R.layout.lista_personalizada_cardapio, parent, false);

        Cardapio cardapio = cardapios.get(position);
        TextView nome = (TextView) view.findViewById(R.id.nomeProduto);
        TextView descricao = (TextView) view.findViewById(R.id.detalhesProduto);
        TextView preco = (TextView) view.findViewById(R.id.precoProduto);

        nome.setText(cardapio.getNome());
        descricao.setText(cardapio.getDescricao());
        preco.setText(cardapio.getPreco());

        return view;
    }
}

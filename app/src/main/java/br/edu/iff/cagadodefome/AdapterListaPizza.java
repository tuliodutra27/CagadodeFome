package br.edu.iff.cagadodefome;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by kamik on 23/10/2017.
 */

public class AdapterListaPizza extends BaseAdapter {

    private final List<Pizzaria> pizzarias;
    private final Activity act;

    public AdapterListaPizza(List<Pizzaria> pizzarias, Activity act){
        this.pizzarias = pizzarias;
        this.act = act;
    }

    @Override
    public int getCount() {
        return pizzarias.size();
    }

    @Override
    public Object getItem(int position) {
        return pizzarias.get(position);
    }

    @Override
    public long getItemId(int position) {
        long x = 0;
        x = pizzarias.size();
        x = (x%2)+1;
        return x;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = act.getLayoutInflater().inflate(R.layout.lista_personalizada_pizzaria, parent, false);

        Pizzaria pizzaria = pizzarias.get(position);
        TextView nome = (TextView) view.findViewById(R.id.nomePizzaria);
        ImageView imagem = (ImageView) view.findViewById(R.id.imagemPizzaria);
        TextView status = (TextView) view.findViewById(R.id.statusPizzaria);
        TextView funcionamento = (TextView) view.findViewById(R.id.horarioFuncionamentoPizzaria);
        TextView telefone = (TextView) view.findViewById(R.id.telefonePizzaria);

        nome.setText(pizzaria.getNome());
        imagem.setImageResource(pizzaria.getImagem());
        status.setText(pizzaria.getStatus());
        funcionamento.setText(pizzaria.getHorario_funcionamento());
        telefone.setText(pizzaria.getTelefone());
        return view;
    }
}

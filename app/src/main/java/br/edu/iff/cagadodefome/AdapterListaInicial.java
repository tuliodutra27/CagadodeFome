package br.edu.iff.cagadodefome;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by kamik on 22/10/2017.
 */

public class AdapterListaInicial extends BaseAdapter {

    private final List<Estabelecimento> estabelecimentos;
    private final Activity act;

    public AdapterListaInicial(List<Estabelecimento> estabelecimentos, Activity act){
        this.estabelecimentos = estabelecimentos;
        this.act = act;
    }


    @Override
    public int getCount() {
        return estabelecimentos.size();
    }

    @Override
    public Object getItem(int position) {
        return estabelecimentos.get(position);
    }

    @Override
    public long getItemId(int position) {
        Estabelecimento estabelecimento = null;
        return estabelecimento.getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = act.getLayoutInflater().inflate(R.layout.lista_personalizada_inicio, parent, false);

        Estabelecimento estabelecimento = estabelecimentos.get(position);
        TextView nome = (TextView) view.findViewById(R.id.textoTelaInicial);
        ImageView imagem = (ImageView) view.findViewById(R.id.imagemListaInicial);

        nome.setText(estabelecimento.getNome());
        imagem.setImageResource(estabelecimento.getImagem());

        return view;
    }
}

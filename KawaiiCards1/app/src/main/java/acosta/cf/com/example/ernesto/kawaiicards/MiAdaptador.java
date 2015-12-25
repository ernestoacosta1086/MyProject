package acosta.cf.com.example.ernesto.kawaiicards;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Ernesto on 23/12/2015.
 */
public class MiAdaptador extends RecyclerView.Adapter<MiAdaptador.MiHolder> {

    private List<MiClaseParaLosDatos> items;

    public MiAdaptador(List<MiClaseParaLosDatos> items) {
        this.items = items;
    }

    @Override
    public MiHolder onCreateViewHolder(ViewGroup vistaGrupo, int tipo) {
        View v = LayoutInflater.from(vistaGrupo.getContext()).inflate(R.layout.tarjeta, vistaGrupo, false);
        return new MiHolder(v);//That is the famous inflater, here is the inflater my view
    }

    @Override
    public void onBindViewHolder(MiHolder holder, int posicion) {

        holder.imagen.setImageResource(items.get(posicion).getImagen());
        holder.nombre.setText(items.get(posicion).getNombre());
        holder.visitas.setText("Visitas:" + String.valueOf(items.get(posicion).getVisitas()));
        //This method stablish the relations of the Holder and the data
    }

    @Override
    public int getItemCount() {
        return items.size(); //Here is the cant of times will be show in the list, in this case cant of items elements
    }

    public static class MiHolder extends RecyclerView.ViewHolder {
        // Campos respectivos de un item
        @Bind(R.id.imagen)
        public ImageView imagen;

        @Bind(R.id.nombre)
        public TextView nombre;

        @Bind(R.id.visitas)
        public TextView visitas;

        public MiHolder(View v) {
            super(v);

            ButterKnife.bind(this,v);

        }
    }
}

package acosta.cf.com.example.ernesto.kawaiicards;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    /*
    Declarar instancias globales
    */

    @Bind(R.id.reciclador)
    RecyclerView recycler;

    @Bind(R.id.toolbar)
    Toolbar toolbar;

    private RecyclerView.Adapter adapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        // Inicializar Animes
        List<MiClaseParaLosDatos> items = new ArrayList<>();



        items.add(new MiClaseParaLosDatos(R.drawable.angel, "Angel Beats", 230));
        items.add(new MiClaseParaLosDatos(R.drawable.death, "Death Note", 456));
        items.add(new MiClaseParaLosDatos(R.drawable.fate, "Fate Stay Night", 342));
        items.add(new MiClaseParaLosDatos(R.drawable.nhk, "Welcome to the NHK", 645));
        items.add(new MiClaseParaLosDatos(R.drawable.suzumiya, "Suzumiya Haruhi", 459));
        ButterKnife.bind(this);
        // Obtener el Recycler
//        recycler = (RecyclerView) findViewById(R.id.reciclador);
        recycler.setHasFixedSize(true);

        // Usar un administrador para LinearLayout
        RecyclerView.LayoutManager lManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);

        // Crear un nuevo adaptador
        adapter = new MiAdaptador(items);
        recycler.setAdapter(adapter);


        toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(getBaseContext(),RecyclerActivity.class);
                startActivity(myIntent);
                
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


}

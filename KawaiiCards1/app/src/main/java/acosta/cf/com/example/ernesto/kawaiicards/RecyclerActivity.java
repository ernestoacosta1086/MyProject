package acosta.cf.com.example.ernesto.kawaiicards;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class RecyclerActivity extends AppCompatActivity {
    @Bind(R.id.reciclador)
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //This method show the arrow in the action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        // Inicializar Animes
        List<MiClaseParaLosDatos> items = new ArrayList<>();
        items.add(new MiClaseParaLosDatos(R.drawable.angel, "Angel Beats", 230));
        items.add(new MiClaseParaLosDatos(R.drawable.death, "Death Note", 456));
        items.add(new MiClaseParaLosDatos(R.drawable.fate, "Fate Stay Night", 342));
        items.add(new MiClaseParaLosDatos(R.drawable.nhk, "Welcome to the NHK", 645));
        items.add(new MiClaseParaLosDatos(R.drawable.suzumiya, "Suzumiya Haruhi", 459));

        recycler.setHasFixedSize(true);

        // Usar un administrador para LinearLayout
        RecyclerView.LayoutManager lManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);

        // Crear un nuevo adaptador
        recycler.setAdapter(new MiAdaptador(items));

    }

}

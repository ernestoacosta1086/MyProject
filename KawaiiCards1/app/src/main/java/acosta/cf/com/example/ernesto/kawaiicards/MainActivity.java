package acosta.cf.com.example.ernesto.kawaiicards;

import android.content.Intent;
import android.graphics.Color;
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
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.BindColor;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.button_recycler)
    List<Button> button_recycer;

    @Bind(R.id.google_maps_button)
    Button button_google_map;

    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.button_recycler)
    public void toRecyclerAct(){
        Intent intent = new Intent(getBaseContext(), RecyclerActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.google_maps_button)
    public void toGoogleAct(){
        Intent intent = new Intent(getBaseContext(), GoogleMapsActivity.class);
        startActivity(intent);
    }

}

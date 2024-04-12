package com.tutorials.lab2_6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Hero> mHeros;
    private RecyclerView mRecyclerHero;
    private HeroAdapter mHeroAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerHero = findViewById(R.id.recyclerHero);
        mHeros = new ArrayList<>();
        createHeroList();
        mHeroAdapter = new HeroAdapter(this, mHeros);
        mRecyclerHero.setAdapter(mHeroAdapter);
        mRecyclerHero.setLayoutManager(new LinearLayoutManager(this));
    }

    private void createHeroList() {
        mHeros.add(new Hero("LUFFY", R.drawable.img));
        mHeros.add(new Hero("LUFFY1", R.drawable.img_1));
        mHeros.add(new Hero("LUFFY2", R.drawable.img_2));
        mHeros.add(new Hero("LUFFY3", R.drawable.img_3));
        mHeros.add(new Hero("LUFFY4", R.drawable.img_4));
        mHeros.add(new Hero("LUFFY5", R.drawable.img_5));
        mHeros.add(new Hero("LUFFY6", R.drawable.img_6));
        mHeros.add(new Hero("LUFFY7", R.drawable.img_7));
        mHeros.add(new Hero("LUFFY8", R.drawable.img_8));
        mHeros.add(new Hero("LUFFY9", R.drawable.img_9));
    }

}

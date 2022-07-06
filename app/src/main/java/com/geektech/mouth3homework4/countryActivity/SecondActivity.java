package com.geektech.mouth3homework4.countryActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.load.engine.Resource;
import com.geektech.mouth3homework4.R;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    private int position;
    private ArrayList<Country> dataCountry;
    private RecyclerView recyclerView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        position = getIntent().getIntExtra("Africa14", 100);
        load();
        initRecycleView();
    }

    private void initRecycleView() {
        recyclerView2 = findViewById(R.id.recycleViewSecond);
        AdapterCountry adapter2 = new AdapterCountry(dataCountry, this);
        recyclerView2.setAdapter(adapter2);
    }

    private void load() {
        dataCountry = new ArrayList<>();
        switch (position) {
            case 0:
                dataCountry.add(new Country(R.drawable.ic_dz, "Алжир", "Алжир"));
                dataCountry.add(new Country(R.drawable.ic_ma, "Рабат", "Марокко"));
                dataCountry.add(new Country(R.drawable.ic_tn, "Тунис", "Тунис"));
                dataCountry.add(new Country(R.drawable.ic_eg, "Каир", "Египет"));
                dataCountry.add(new Country(R.drawable.ic_za, "Кейптаун", "ЮАР"));
                break;
            case 1:
                dataCountry.add(new Country(R.drawable.ic_ru, "Москва", "Россия"));
                dataCountry.add(new Country(R.drawable.ic_de, "Берлин", "Германия"));
                dataCountry.add(new Country(R.drawable.ic_it, "Рим", "Италия"));
                dataCountry.add(new Country(R.drawable.ic_gb, "Лондон", "Великобритания"));
                dataCountry.add(new Country(R.drawable.ic_es, "Мадрид", "Испания"));
                break;
            case 2:
                dataCountry.add(new Country(R.drawable.ic_us, "Вашингтон", "США"));
                dataCountry.add(new Country(R.drawable.ic_ca, "Оттава", "Канада"));
                dataCountry.add(new Country( R.drawable.ic_it,"Мехико", "Мексика"));
                dataCountry.add(new Country(R.drawable.ic_cu, "Гавана", "Куба"));
                dataCountry.add(new Country(R.drawable.ic_cr, "Сан-Хосе", "Коста-Рика"));
                break;
            case 3:
                dataCountry.add(new Country(R.drawable.ic_br, "Бразилиа", "Бразилия"));
                dataCountry.add(new Country(R.drawable.ic_co, "Каракас", "Венесуэла"));
                dataCountry.add(new Country(R.drawable.ic_cl, "Чили", "Сантьяго"));
                dataCountry.add(new Country(R.drawable.ic_pe, "Лима", "Перу"));
                dataCountry.add(new Country(R.drawable.ic_bo, "Сукре", "Боливия"));
                break;
            case 4:
                dataCountry.add(new Country(R.drawable.ic_au, "Канберра", "Австралия"));
                dataCountry.add(new Country(R.drawable.ic_nz, "Веллингтон", "Новая Зеландия"));
                dataCountry.add(new Country(R.drawable.ic_fk, "Сува", "Фиджи"));
                dataCountry.add(new Country(R.drawable.ic_vu, "Порт-Вила", "Вануату"));
                dataCountry.add(new Country(R.drawable.ic_to, "Нукуалофа", "Тонга"));
                break;
            default:
                break;
        }
    }
}
package com.toto.sdsb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.toto.sdsb.adapter.PasaranListAdapter;
import com.toto.sdsb.model.PasaranList;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {
    private Button btnBack;
    private Button txtUsername,txtIpaddress,txtBalance;
    private RecyclerView recycleview_pasaran;
    private List<PasaranList> homePasaranList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_home);

        btnBack = findViewById(R.id.btnBack);
        recycleview_pasaran = findViewById(R.id.recycleview_pasaran);


        homePasaranList = new ArrayList<>();


        homePasaranList.add(new PasaranList(1234,"HONGKONG","PERIODE:#123-HK","21 Dec 2022 | 02:00 WIB","ONLINE"));
        homePasaranList.add(new PasaranList(1235,"SINGAPORE","PERIODE:#123-SGP","21 Dec 2022 | 02:00 WIB","ONLINE"));
        homePasaranList.add(new PasaranList(1236,"SYDNEY","PERIODE:#123-SYD","21 Dec 2022 | 02:00 WIB","ONLINE"));
        homePasaranList.add(new PasaranList(1237,"CAMBODIA","PERIODE:#123-CAM","21 Dec 2022 | 02:00 WIB","ONLINE"));
        homePasaranList.add(new PasaranList(1238,"BULLSEYE","PERIODE:#123-BULL","21 Dec 2022 | 02:00 WIB","ONLINE"));
        homePasaranList.add(new PasaranList(1239,"TAIWAN","PERIODE:#123-BULL","21 Dec 2022 | 02:00 WIB","ONLINE"));
        homePasaranList.add(new PasaranList(1240,"GONGJU DAY","PERIODE:#123-BULL","21 Dec 2022 | 02:00 WIB","ONLINE"));
        homePasaranList.add(new PasaranList(1241,"GONGJU NIGHT","PERIODE:#123-BULL","21 Dec 2022 | 02:00 WIB","ONLINE"));

        PasaranListAdapter pasaranListAdapter = new PasaranListAdapter(this,homePasaranList);
        recycleview_pasaran.setLayoutManager(new GridLayoutManager(this,2));
        recycleview_pasaran.setAdapter(pasaranListAdapter);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
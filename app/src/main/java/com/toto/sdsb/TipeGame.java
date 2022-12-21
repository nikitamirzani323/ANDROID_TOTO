package com.toto.sdsb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.Toolbar;

public class TipeGame extends AppCompatActivity {
    String pasaran_id, pasaran_nm, pasaran_periode, pasaran_date;
    Toolbar toolbar;
    ImageView img_close;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipe_game);

        toolbar = findViewById(R.id.myToolbar);
        img_close = findViewById(R.id.img_close);

        pasaran_id = getIntent().getStringExtra("pasaran_id");
        pasaran_nm = getIntent().getStringExtra("pasaran_nm");
        pasaran_periode = getIntent().getStringExtra("pasaran_periode");
        pasaran_date = getIntent().getStringExtra("pasaran_date");

        Toast.makeText(this,pasaran_id+" - "+pasaran_nm,Toast.LENGTH_LONG).show();

        img_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent intent = new Intent(getApplicationContext(), Home.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });
    }


}
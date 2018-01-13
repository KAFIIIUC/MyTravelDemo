package com.example.user.mytraveldemo;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    ActionBar actionBar;
    Button coxBtn,bandarbanBtn,dhakaBtn,sylhetBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        actionBar = getSupportActionBar();
        actionBar.hide();

        coxBtn = (Button) findViewById(R.id.btnCoxId);
        bandarbanBtn = (Button) findViewById(R.id.btnBandorbanId);
        dhakaBtn = (Button) findViewById(R.id.btnDhakaId);
        sylhetBtn = (Button) findViewById(R.id.btnSylhetId);


        coxBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("city_name","cox");
                startActivity(intent);
            }
        });

        bandarbanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("city_name","ban");
                startActivity(intent);
            }
        });

        dhakaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("city_name","dhaka");
                startActivity(intent);
            }
        });

        sylhetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("city_name","sylhet");
                startActivity(intent);
            }
        });




    }
}

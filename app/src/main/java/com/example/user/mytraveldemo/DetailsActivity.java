package com.example.user.mytraveldemo;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    ImageView cityImage;
    TextView cityName,cityDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        cityImage = (ImageView) findViewById(R.id.cityImageId);
        cityName = (TextView) findViewById(R.id.textCityName);
        cityDescription = (TextView) findViewById(R.id.txtDescriptionId);

        String getCityNo = getIntent().getExtras().getString("city_name");

        if (getCityNo.equals("cox")){

            cityImage.setImageResource(R.drawable.cox_bazar);
            cityName.setText(R.string.city_cox);
            cityDescription.setText(R.string.des_cox);
        }

        else if (getCityNo.equals("ban")){

            cityImage.setImageResource(R.drawable.nilgiri_bandarbab);
            cityName.setText(R.string.city_ban);
            cityDescription.setText(R.string.des_ban);
        }

        else if (getCityNo.equals("dhaka")){

            cityImage.setImageResource(R.drawable.gulsan_lake_dhaka);
            cityName.setText(R.string.city_dhaka);
            cityDescription.setText(R.string.des_dhaka);
        }

        else if (getCityNo.equals("sylhet")){

            cityImage.setImageResource(R.drawable.sylhet);
            cityName.setText(R.string.city_sylhet);
            cityDescription.setText(R.string.des_sylhet);
        }



    }
}

package com.example.devcom.weatherapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WeatherInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_info);

        TextView city = findViewById(R.id.tv_city);
        TextView weather = findViewById(R.id.tvWeatherCondition);
        TextView humidity = findViewById(R.id.tv_humidity);
        TextView breeze = findViewById(R.id.tv_wind);
        TextView temperature = findViewById(R.id.textViewDegree);
        TextView pressure = findViewById(R.id.tv_pressure);

        city.setText(getIntent().getExtras().getString("Text"));

        boolean humi = getIntent().getExtras().getBoolean("Humidity");
        boolean wind = getIntent().getExtras().getBoolean("Wind");
        boolean temp = getIntent().getExtras().getBoolean("Temp");
        boolean weath_cond = getIntent().getExtras().getBoolean("Weather");
        boolean press = getIntent().getExtras().getBoolean("Press");

        if(humi) humidity.setVisibility(View.VISIBLE);
        if(wind) breeze.setVisibility(View.VISIBLE);
        if(temp) temperature.setVisibility(View.VISIBLE);
        if(weath_cond) weather.setVisibility(View.VISIBLE);
        if(press) pressure.setVisibility(View.VISIBLE);
    }


}

package com.example.devcom.weatherapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;

public class InquiryActivity extends AppCompatActivity {
    EditText city;
    Switch humi, wind, temp, weath_cond, press;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inquituy);

        city = findViewById(R.id.et_city);
        humi = findViewById(R.id.sw_humidity);
        wind = findViewById(R.id.sw_wind);
        temp = findViewById(R.id.sw_temp);
        weath_cond = findViewById(R.id.sw_weather);
        press = findViewById(R.id.sw_pressure);
    }

    public void clickBtn(View view) {
            Intent intent = new Intent(InquiryActivity.this, WeatherInfoActivity.class);
            intent.putExtra("Text", city.getText().toString());
            intent.putExtra("Humidity", humi.isChecked());
            intent.putExtra("Wind", wind.isChecked());
            intent.putExtra("Temp", temp.isChecked());
            intent.putExtra("Weather", weath_cond.isChecked());
            intent.putExtra("Press", press.isChecked());
            startActivity(intent);
    }
}

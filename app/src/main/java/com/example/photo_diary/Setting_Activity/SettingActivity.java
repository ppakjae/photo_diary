package com.example.photo_diary.Setting_Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.photo_diary.R;

public class SettingActivity extends AppCompatActivity {

    ImageButton back, save;
    ImageButton text, weather, location, date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        back = (ImageButton)findViewById(R.id.setting_back_btn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //전 페이지로 돌아가기 (사이즈 조절 페이지)
                finish();
            }
        });

        back = (ImageButton)findViewById(R.id.setting_back_btn);
        save = (ImageButton)findViewById(R.id.setting_save_btn);
        text = (ImageButton)findViewById(R.id.setting_text_btn);
        weather = (ImageButton)findViewById(R.id.setting_weather_btn);
        location = (ImageButton)findViewById(R.id.setting_location_btn);
        date = (ImageButton)findViewById(R.id.setting_date_btn);

    }
}

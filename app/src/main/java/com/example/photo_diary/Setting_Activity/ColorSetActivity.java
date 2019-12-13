package com.example.photo_diary.Setting_Activity;

import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.example.photo_diary.R;

import yuku.ambilwarna.AmbilWarnaDialog;

import static android.graphics.BlendMode.COLOR;

public class ColorSetActivity extends AppCompatActivity {
    ImageView colorView;
    int tColor, n=0;
    ImageButton colorPlus;
    ImageButton colorBlack, colorBlue, colorGreen, colorOrange, colorRed, colorSkyblue, colorWhite, colorYellow;
    ImageButton back,next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        colorView = findViewById(R.id.colorView);
        colorPlus = (ImageButton)findViewById(R.id.color_plus);
        colorBlack = (ImageButton)findViewById(R.id.color_black);
        colorBlue = (ImageButton)findViewById(R.id.color_blue);
        colorGreen = (ImageButton)findViewById(R.id.color_green);
        colorOrange = (ImageButton)findViewById(R.id.color_orange);
        colorRed = (ImageButton)findViewById(R.id.color_red);
        colorSkyblue = (ImageButton)findViewById(R.id.color_skyblue);
        colorWhite = (ImageButton)findViewById(R.id.color_white);
        colorYellow = (ImageButton)findViewById(R.id.color_yellow);

        back = (ImageButton)findViewById(R.id.color_back_btn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //전 페이지로 돌아가기 (사이즈 조절 페이지)
                finish();
            }
        });
        next = (ImageButton)findViewById(R.id.color_save_btn);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //setting 페이지로
                Intent intent = new Intent(getApplicationContext(),SettingActivity.class);
                startActivity(intent);
            }
        });

        tColor = ContextCompat.getColor(ColorSetActivity.this, R.color.colorAccent);
        colorPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n=1;
                openColorPicker();
            }
        });
        colorBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colorView.setBackgroundColor((ColorSetActivity.this).getResources().getColor(R.color.authBlack));
                colorView.setBackgroundColor(Color.rgb(0,0,0));
            }
        });
        colorBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorView.setBackgroundColor(Color.rgb(15, 0, 222));
            }
        });
        colorGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorView.setBackgroundColor(Color.rgb(0, 220, 65));
            }
        });
        colorOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorView.setBackgroundColor(Color.rgb(255, 105, 18));
            }
        });
        colorRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorView.setBackgroundColor(Color.rgb(255, 13, 13));
            }
        });
        colorSkyblue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorView.setBackgroundColor(Color.rgb(19, 153, 255));
            }
        });
        colorWhite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorView.setBackgroundColor(Color.rgb(255, 255, 255));
            }
        });
        colorYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorView.setBackgroundColor(Color.rgb(255, 214, 9));
            }
        });
    }

    public void openColorPicker() {
        AmbilWarnaDialog colorPicker = new AmbilWarnaDialog(this, tColor, new AmbilWarnaDialog.OnAmbilWarnaListener() {
            @Override
            public void onCancel(AmbilWarnaDialog dialog) {

            }

            @Override
            public void onOk(AmbilWarnaDialog dialog, int color) {
                tColor = color;
                if( n == 1) {
                    colorView.setBackgroundColor(tColor);
                }
            }
        });
        colorPicker.show();
    }

}

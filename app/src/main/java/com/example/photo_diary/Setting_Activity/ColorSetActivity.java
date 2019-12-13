package com.example.photo_diary.Setting_Activity;

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

public class ColorSetActivity extends AppCompatActivity {
    ImageView colorView;
    int tColor, n=0;
    ImageButton colorPlus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        colorView = findViewById(R.id.colorView);
        tColor = ContextCompat.getColor(ColorSetActivity.this, R.color.colorAccent);
        colorPlus = (ImageButton)findViewById(R.id.color_plus);
        colorPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n=1;
                openColorPicker();
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

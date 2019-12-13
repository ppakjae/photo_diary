package com.example.photo_diary.Setting_Activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.photo_diary.R;

public class SizeSetActivity extends AppCompatActivity {

    ImageButton cancle, next;
    ImageButton size916, size34, size11, crop;
    ImageView view;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_size);

        view=(ImageView)findViewById(R.id.sizeView);

        size916=(ImageButton)findViewById(R.id.size_916_btn);
        size34=(ImageButton)findViewById(R.id.size_34_btn);
        size11=(ImageButton)findViewById(R.id.size_11_btn);
        crop=(ImageButton)findViewById(R.id.size_crop_btn);

        cancle=(ImageButton)findViewById(R.id.size_cancle_btn);
        cancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //전 페이지로 돌아가기 (main)
                finish();
            }
        });
        next = (ImageButton)findViewById(R.id.size_save_btn);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //text면 color로

                //unsplash면 setting 페이지로
                Intent intent = new Intent(getApplicationContext(),SettingActivity.class);
                startActivity(intent);
            }
        });

        size916.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch(motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        size916.setBackgroundResource(R.drawable.size9_16);
                        //사이즈 9:16 으로 자르기

                        break;
                    case MotionEvent.ACTION_UP:
                        size916.setBackgroundResource(R.drawable.size9_16_g);
                        break;
                }
                return false;
            }
        });
        size34.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch(motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        size34.setBackgroundResource(R.drawable.size3_4);
                        //사이즈 3:4 으로 자르기

                        break;
                    case MotionEvent.ACTION_UP:
                        size34.setBackgroundResource(R.drawable.size3_4_g);
                        break;
                }
                return false;
            }
        });
        size11.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch(motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        size11.setBackgroundResource(R.drawable.size1_1);
                        //사이즈 1:1 으로 자르기

                        break;
                    case MotionEvent.ACTION_UP:
                        size11.setBackgroundResource(R.drawable.size1_1_g);
                        break;
                }
                return false;
            }
        });
        crop.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch(motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        crop.setBackgroundResource(R.drawable.crop);
                        //사이즈 자유롭게 자르기

                        break;
                    case MotionEvent.ACTION_UP:
                        crop.setBackgroundResource(R.drawable.crop_g);
                        break;
                }
                return false;
            }
        });


    }
}

/*
*  private ImageView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultView = (ImageView) findViewById(R.id.result_image);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_select) {
            resultView.setImageDrawable(null);
            Crop.pickImage(this);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent result) {
        if (requestCode == Crop.REQUEST_PICK && resultCode == RESULT_OK) {
            beginCrop(result.getData());
        } else if (requestCode == Crop.REQUEST_CROP) {
            handleCrop(resultCode, result);
        }
    }

    private void beginCrop(Uri source) {
        Uri destination = Uri.fromFile(new File(getCacheDir(), "cropped"));
        Crop.of(source, destination).asSquare().start(this);
    }

    private void handleCrop(int resultCode, Intent result) {
        if (resultCode == RESULT_OK) {
            resultView.setImageURI(Crop.getOutput(result));
        } else if (resultCode == Crop.RESULT_ERROR) {
            Toast.makeText(this, Crop.getError(result).getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
*
*
* */
package com.example.jiguang;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MeiNvActivity extends AppCompatActivity {

    private ImageView mImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mei_nv);
        initView();
    }

    private void initView() {
        mImage = (ImageView) findViewById(R.id.image);
        String stringExtra = getIntent().getStringExtra("url");
        Glide.with(this).load(stringExtra).into(mImage);
    }
}

package com.leon.loopviewpager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.leon.loopviewpagerlib.FunBanner;

public class MainActivity extends AppCompatActivity {

    private String[] images = {"image/home01.jpg","image/home02.jpg","image/home03.jpg","image/home04.jpg","image/home05.jpg","image/home06.jpg","image/home07.jpg","image/home08.jpg"};

    private FunBanner mFunBanner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFunBanner = (FunBanner) findViewById(R.id.loop_view);
        mFunBanner.setImageUrlHost("http://10.0.2.2:8080/GooglePlayServer/image?name=");
        mFunBanner.setImageUrls(images);
    }
}

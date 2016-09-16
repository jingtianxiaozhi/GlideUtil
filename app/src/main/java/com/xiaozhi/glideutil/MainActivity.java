package com.xiaozhi.glideutil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.xiaozhi.glideutil_core.GlideUtil;

public class MainActivity extends AppCompatActivity {

    private ImageView tv_glide_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_glide_show = (ImageView) findViewById(R.id.tv_glide_show);

        //GlideUtil.load(MainActivity.this, R.mipmap.ic_launcher, tv_glide_show);
        GlideUtil.load(MainActivity.this, "http://od2a9alnw.bkt.clouddn.com/173129833995395.jpg", tv_glide_show);
    }
}

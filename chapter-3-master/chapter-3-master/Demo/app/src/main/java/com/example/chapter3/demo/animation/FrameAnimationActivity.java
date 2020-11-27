package com.example.chapter3.demo.animation;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.example.chapter3.demo.R;

/**
 * @author yangjie
 * @date 2019-07-03
 */
public class FrameAnimationActivity extends AppCompatActivity {
    private ImageView mImage;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_animation);
        setTitle(getResources().getString(R.string.frame_animation_activity));
        mImage = findViewById(R.id.image_frame);
        mImage.setBackgroundResource(R.drawable.anim_list);
        AnimationDrawable drawable = (AnimationDrawable) mImage.getBackground();
        drawable.start();
    }
}

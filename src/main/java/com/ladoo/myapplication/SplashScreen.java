package com.ladoo.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.kosalgeek.asynctask.MainActivity;

public class SplashScreen extends Activity implements AnimationListener {


    ImageView InventoSplash;
    Animation animFadein;
    Animation animMove;
    MediaPlayer player;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.splashscreen);
        InventoSplash = (ImageView)findViewById(R.id.kleinventoimage);
        animFadein = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);


        // set animation listener
        animFadein.setAnimationListener(this);


        // start the animation
        InventoSplash.setVisibility(View.VISIBLE);
        InventoSplash.startAnimation(animFadein);



    }


    @Override
    public void onAnimationEnd(Animation animation) {
        // Take any action after completing the animation
        // check for fade in animation
        if (animation == animFadein) {
            Intent DashBoard=new Intent(SplashScreen.this,DashBoardActivity.class);
            startActivity(DashBoard);

        }
        }
    @Override
    public void onAnimationStart(Animation animation) {
        // TODO Auto-generated method stub

    }


    @Override
    public void onAnimationRepeat(Animation animation) {
        // TODO Auto-generated method stub


    }
    @Override
    public void onPause()
    {
        super.onPause();
        finish();

    }

}

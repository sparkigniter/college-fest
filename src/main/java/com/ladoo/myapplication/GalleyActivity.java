package com.ladoo.myapplication;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import java.util.Timer;
import java.util.TimerTask;

public class GalleyActivity extends AppCompatActivity {
  int i = 0;
  ImageView GalleryImage;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_galley);
    GalleryImage = (ImageView) findViewById(R.id.ImageGallery);


  }

  public void GalleryShow(View view) {
    if (i == 8) {
      GalleryImage.setImageResource(R.mipmap.pic1);
      i = 0;
    } else if (i == 0) {
      GalleryImage.setImageResource(R.mipmap.pic2);
    } else if (i == 1) {
      GalleryImage.setImageResource(R.mipmap.pic3);
    } else if (i == 2) {

      GalleryImage.setImageResource(R.mipmap.pic4);
    } else if (i == 3) {
      GalleryImage.setImageResource(R.mipmap.pic5);
    } else if (i == 4) {
      GalleryImage.setImageResource(R.mipmap.pic6);
    } else if (i == 5) {
      GalleryImage.setImageResource(R.mipmap.pic7);
    } else if (i == 6) {
      GalleryImage.setImageResource(R.mipmap.pic8);
    } else if(i==7)
    {
      GalleryImage.setImageResource(R.mipmap.inventosong);
    }
    i++;
  }
}


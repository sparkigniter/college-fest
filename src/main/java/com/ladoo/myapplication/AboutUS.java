package com.ladoo.myapplication;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AboutUS extends AppCompatActivity {
TextView VikasAbout,SantoshAbout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_developers);
      //  Typeface faceContent = Typeface.createFromAsset(getAssets(), "fonts/contentfont.ttf#");
        VikasAbout=(TextView)findViewById(R.id.TextVikasAbout);
        SantoshAbout=(TextView)findViewById(R.id.TextSantoshAbout);
     //   VikasAbout.setTypeface(faceContent);
        VikasAbout.setText("Android Developer\nVikas M B\n</ developers@vebmate.com >");
    //    SantoshAbout.setTypeface(faceContent);
        SantoshAbout.setText("PHP Developer\nSantosh D\n</ developers@vebmate.com >");
    }
}

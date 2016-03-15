package com.ladoo.myapplication;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Sponsors extends AppCompatActivity {
TextView Sponsor1,Sponsor2,Sponser3,Sponsor4,Sponsor5,Sponsor6,Sponsor7,Sponsor8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sponsors);
        Sponsor1=(TextView)findViewById(R.id.TextSponser1);
        Sponsor2=(TextView)findViewById(R.id.TextSponsor2);
        Sponser3=(TextView)findViewById(R.id.TextSponsor3);
        Sponsor4=(TextView)findViewById(R.id.TextSponsor4);
        Sponsor5=(TextView)findViewById(R.id.TextSponsor5);
        Sponsor6=(TextView)findViewById(R.id.TextSponsor6);
        Sponsor7=(TextView)findViewById(R.id.TextSponsor7);
        Sponsor8=(TextView)findViewById(R.id.TextSponsor8);


        Typeface faceContent = Typeface.createFromAsset(getAssets(), "fonts/contentfont.ttf");
        Sponsor1.setTypeface(faceContent);
        Sponsor2.setTypeface(faceContent);
        Sponser3.setTypeface(faceContent);
        Sponsor4.setTypeface(faceContent);
        Sponsor5.setTypeface(faceContent);
        Sponsor6.setTypeface(faceContent);
        Sponsor7.setTypeface(faceContent);
        Sponsor8.setTypeface(faceContent);

        Sponsor1.setText("T.I.M.E Institute");
        Sponsor2.setText("Mr.Karan Javali");
        Sponser3.setText("LakeView Hospital,Belgaum");
        Sponsor4.setText("Biba");
        Sponsor5.setText("Vebmate (Tech Support)");
        Sponsor6.setText("Safe Helmets");
        Sponsor7.setText("Crease Wise");
        Sponsor8.setText("Cane Cafe");

    }
}

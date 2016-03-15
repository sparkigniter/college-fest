package com.ladoo.myapplication;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class TermsAndConditions extends AppCompatActivity {
    TextView Termheader, Term1, Term2, Term3, Term4;
    Button ButtonRegister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_and_conditions);
        Typeface faceHead = Typeface.createFromAsset(getAssets(), "fonts/fonteventdetails.ttf");
        Typeface faceContent = Typeface.createFromAsset(getAssets(), "fonts/contentfont.ttf");

        Termheader = (TextView) findViewById(R.id.TermRuleHeader);
        Term1 = (TextView) findViewById(R.id.TermRule1);
        Term2 = (TextView) findViewById(R.id.TermRule2);
        Term3 = (TextView) findViewById(R.id.TermRule3);
        Term4=(TextView)findViewById(R.id.TermRule4);


        ButtonRegister = (Button) findViewById(R.id.AgreeButton);

        Termheader.setTypeface(faceHead);
        Termheader.setText("Terms and Conditions");

        Term1.setTypeface(faceContent);
        Term1.setText("1.For 'FEW' team events, you have to register individually and form the team after arriving college.");
        Term2.setTypeface(faceContent);
        Term2.setText("2.Registration for the events can be done only once using a contact number.Please verify before registering for any events");
        Term3.setTypeface(faceContent);
        Term3.setText("3.For further event details and clarifications,please contact the event coordinators");
        Term4.setTypeface(faceContent);
        Term4.setText("4.App calculates the original amount, 10% off is availed, once you show up to the respective event coordinators.");


    }


    public void EnterRegister(View view)
    {
        Intent EnterRegister=new Intent(TermsAndConditions.this,RegisterActivity.class);
        startActivity(EnterRegister);
    }
}

package com.ladoo.myapplication;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AboutInvento extends AppCompatActivity {
  TextView AboutInventoText,AboutInventoSlogan,AboutInventoFooter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_invento);
        Typeface faceContent = Typeface.createFromAsset(getAssets(), "fonts/contentfont.ttf");
        AboutInventoText=(TextView)findViewById(R.id.InventoAboutText);
        AboutInventoSlogan=(TextView)findViewById(R.id.AboutInventoSlogan);
        AboutInventoFooter=(TextView)findViewById(R.id.AboutInventoFooter);
        AboutInventoText.setTypeface(faceContent);
        AboutInventoSlogan.setTypeface(faceContent);
        AboutInventoFooter.setTypeface(faceContent);
        AboutInventoSlogan.setText("'Success is when you discover your passion and go for it with everything you have'");
        AboutInventoText.setText("“INVENTO 2K16” is a momentous technical fest conducted by KLE Dr. M S Sheshgiri College of Engineering and Technology, Belagavi, Karnataka, India- to encourage budding engineers and managers across the country. It is hosted every year in the month of March. INVENTO signifying “Ability to be Creative- imbibe thoughtfulness – hunger to concoct”. It is a platform to unleash the potential of the students from all disciplines and all over India. This is what is needed in youngsters to get into the “ Make in India” vision. The aim of the event is to elucidate the major engineering and business activities through different events thus to elicit the diverse responses from the rapt and admiring students. Undoubtedly this event is a beacon of light for all those who can balance and blend their skills with palatable and innovative ideas accompanied with verve.\n\nA melting pot of activities and events topped with cultural and entertainment. A mega annual technical fest with 40 plus events, from 11 departments conducted for two days, with more than 20 stalls to tickle your taste buds, seduce your buying power and with an expected participation of more than 6000 students and staff. How can we forget the prizes worth Rs. 4.0 lakhs to be won!!!  You deserve to be there… Ab nahi to Kab?.\n\n 2016 being the Centenary year for KLE Society, INVENTO 2016 has a lot in store for you with big surprises.");
        AboutInventoFooter.setText("Register today!!\n\nBe a part of the Magnanimous event.");



    }
}

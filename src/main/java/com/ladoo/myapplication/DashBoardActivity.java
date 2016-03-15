package com.ladoo.myapplication;

import android.app.ActionBar;
import android.content.Intent;
import android.hardware.Camera;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

import com.kosalgeek.asynctask.MainActivity;

public class DashBoardActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_dash_board);




    }
    public void EnterEvents(View view)
    {
        Intent Events=new Intent(DashBoardActivity.this,EventsTabbedActivity.class);
        startActivity(Events);
    }
    public void EnterGallery(View view)
    {

               Intent Gallery=new Intent(DashBoardActivity.this,GalleyActivity.class);
        startActivity(Gallery);
    }
    public void RegisterEnter(View view)
    {
        Intent Register=new Intent(DashBoardActivity.this,RegisterItemsSelected.class);
        startActivity(Register);

    }
    public void EnterShare(View view)
    {
        Intent Share=new Intent(DashBoardActivity.this,Facebook.class);
        startActivity(Share);
    }
    public void EnterAboutInvento(View view)
    {
        Intent AboutEnvento=new Intent(DashBoardActivity.this,AboutInvento.class);
        startActivity(AboutEnvento);

    }
    public void EnterSponsors(View view)
    {
        Intent Sponsors=new Intent(DashBoardActivity.this,Sponsors.class);
        startActivity(Sponsors);
    }
   public void EnterSchedule(View view)
   {
       Intent Schedule=new Intent(DashBoardActivity.this,Schedule.class);
       startActivity(Schedule);
   }
public void AboutDevelopers(View view)
{
    Intent AboutDevelopers=new Intent(DashBoardActivity.this,AboutUS.class);
    startActivity(AboutDevelopers);
}
}

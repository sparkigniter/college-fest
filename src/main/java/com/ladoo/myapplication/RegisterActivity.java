package com.ladoo.myapplication;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.kosalgeek.asynctask.AsyncResponse;
import com.kosalgeek.asynctask.PostResponseAsyncTask;

import java.util.HashMap;

import static java.lang.Integer.parseInt;

public class RegisterActivity extends AppCompatActivity implements AsyncResponse{

    EditText UserName, College, Email, Phoneno;

    private static String Events,PricesOfEvents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        RegisterItemsSelected SelectedEvents=new RegisterItemsSelected();
        Events= SelectedEvents.EventItems;
        PricesOfEvents=SelectedEvents.EventsPrice;
        UserName = (EditText) findViewById(R.id.EditTextRegisterName);
        College = (EditText) findViewById(R.id.EditTextRegisterCollege);
        Email = (EditText) findViewById(R.id.EditTextRegisterEmail);
        Phoneno = (EditText) findViewById(R.id.EditTextRegisterPhoneno);
        Phoneno.setInputType(InputType.TYPE_CLASS_NUMBER);



    }
    public void OnClickRegister(View view) {

        LayoutInflater inflater = getLayoutInflater();
        View v = inflater.inflate(R.layout.toast_stop_layout,
                (ViewGroup) findViewById(R.id.relativetoast));
        if (UserName.length() == 0) {

            Toast toastimage = new Toast(this);
            toastimage.setView(v);
            toastimage.show();
            Toast.makeText(RegisterActivity.this, "Please Enter Correct UserName", Toast.LENGTH_LONG).show();
            return;
        }
        if (College.length() == 0) {
            Toast toastimage = new Toast(this);
            toastimage.setView(v);
            toastimage.show();
            Toast.makeText(RegisterActivity.this, "Please Enter Correct College Name", Toast.LENGTH_LONG).show();
            return;
        }
        if (Email.length() < 10) {
            Toast toastimage = new Toast(this);
            toastimage.setView(v);
            toastimage.show();
            Toast.makeText(RegisterActivity.this, "Please Enter Correct Email", Toast.LENGTH_LONG).show();
            return;
        }
        if (Phoneno.length() < 10) {
            Toast toastimage = new Toast(this);
            toastimage.setView(v);
            toastimage.show();
            Toast.makeText(RegisterActivity.this, "Please Enter Correct Phone Number", Toast.LENGTH_LONG).show();
            return;
        }
        HashMap<String, String> postData = new HashMap<String, String>();
        postData.put("username", UserName.getText().toString());
        postData.put("college", College.getText().toString() );
        postData.put("email", Email.getText().toString());
        postData.put("phone", Phoneno.getText().toString());
        postData.put("events",Events);
        postData.put("cost",PricesOfEvents);
        PostResponseAsyncTask task = new PostResponseAsyncTask(RegisterActivity.this, postData);
        task.execute("http://vebmate.com/app_reg.php");
    }
    @Override
    public void processFinish(String s) {

        if(s.equals("success"))
            Toast.makeText(this,"Successfully registered",Toast.LENGTH_LONG).show();
        else if(s.equals("error"))
            Toast.makeText(this,"Already Registered",Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this,"Connection failed",Toast.LENGTH_LONG).show();
   }

}


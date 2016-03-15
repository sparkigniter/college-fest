package com.ladoo.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RegisterItemsSelected extends ActionBarActivity  {
ArrayList<String> selecteditems=new ArrayList<>();
    int[] price={400,100,600,100,600,800,50,600,100,600,200,300,200,100,400,300,50,50,200,200,100,200,100,200,225,225,150,200,300,200,100,100,60,100,150,150,150,100,300,50,200,50,50,50,100,100,50,100,50,50,100};
    String[] Events={"Show Bizz","Cut Throat","Feel The Beat(Group)","Feel the Beat(Solo)","Rock of the Range","Vogue","Smash it up","Tales of the Street","Duke and Duchess","Symphonious","Tech Fiever","Grand Stand","Paper presentation","Wits and Voice","Hackathon","Technico Caza","Clash of LANs(Need for Speed)","Clash of LANs(FIFA)","Clash of LANs(Counter Strike)","Techno Quiz","Dare to Win","Tycoon's","Cryptohunt","Ludus Thronis","Tech fuza","Biz-wiz","Lucky Ladder","Techo Gang","Death Race","Mecho Marketing","Civil war","Double Trouble","Scary house(Single)","Scary house(Two People)","Scary house(Three People)","Micro Byte","Ele Puzzle","Guide and Grab","Crime Scene Investigation","Bio Modelling","Lagori","Pratikrti","Akriti","Tuk Tuk Goda","Ad-Mime","Just for Fun","Vegetable and fruit Salad Duration with Theme","Encrypt","Frame a Vision","Minute to win(Head to Head)","Minute to win(Last Man Standing)"};

public  static  String items = "";
    public static int totalprice=0;
    public static String EventItems="";
    public static String EventsPrice="";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_items_selected);
        ListView ch1=(ListView)findViewById(R.id.eventsCheckableList);
        ch1.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);


        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.register_events_row_layout,R.id.chekViewEvents,Events);
        ch1.setAdapter(adapter);
        ch1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = ((TextView) view).getText().toString();
                if (selecteditems.contains(selectedItem)) {
                    selecteditems.remove(selectedItem);
                } else {
                    selecteditems.add(selectedItem);
                }

            }

        });

    }
    public void SelectEventItems(View view)
    {
        items="";
         totalprice = 0;
        EventItems="";
        for (String item : selecteditems) {
            items += "-" + item + "\n";
            EventItems+=item+",";
            totalprice = totalprice + price[Arrays.asList(Events).indexOf(item)];
        }
        Toast.makeText(RegisterItemsSelected.this,"You have selected \n" + items + "\n Total price is " + totalprice, Toast.LENGTH_LONG).show();

    }
    public void EnterTermsAndConditions(View view)
    {
        items="";
        totalprice = 0;
        EventItems="";
        EventsPrice="";
        for (String item : selecteditems) {
            items += "-" + item + "\n";
            EventItems+=item+",";
            EventsPrice+=price[Arrays.asList(Events).indexOf(item)]+",";
            totalprice = totalprice + price[Arrays.asList(Events).indexOf(item)];

        }
        if(items=="")
        {
            Toast.makeText(RegisterItemsSelected.this,"No items Selected",Toast.LENGTH_LONG).show();
        }
        else {
            Intent TermsandConditions = new Intent(RegisterItemsSelected.this, TermsAndConditions.class);
            startActivity(TermsandConditions);
        }
    }

}

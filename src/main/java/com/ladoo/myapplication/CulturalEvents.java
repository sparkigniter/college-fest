package com.ladoo.myapplication;


import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import static android.widget.Toast.*;


/**
 * A simple {@link Fragment} subclass.
 */
public class CulturalEvents extends Fragment{
    public  static int Position=-1;
    private ListView CulturalListView;
    private String[] CulturalEvents={"Show Bizz(Movie Making)","Cut Throat(Solo Singing)","Feel The Beat(Dance)","Rock the Range(Battle of Bands)","Vogue(The Fashion show)","Smash it up(Dubsmash)","Tales of the Street(Street play)","Duke and Duchess(Mr. and Miss. Invento)","Symphonious","Tech Fiever","Grand Stand","Paper Presentation","Wits and Voice"};

    public CulturalEvents() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView=inflater.inflate(R.layout.fragment_cultural_events, container, false);
       CulturalListView=(ListView)rootView.findViewById(R.id.CulturalEventsListView);
        ArrayAdapter<String> CulturalEventsAdapter=new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_list_item_1,CulturalEvents);
        CulturalListView.setAdapter(CulturalEventsAdapter);
        CulturalListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Position=position;
                Intent CulturalEvents = new Intent();
                CulturalEvents.setClass(getActivity(), EventDetails.class);
                getActivity().startActivity(CulturalEvents);
            }
        });
        return rootView;

    }

}


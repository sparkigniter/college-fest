package com.ladoo.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class TechnicalEvents extends Fragment {
     public static int Position=-1;
    private ListView TechicalListView;
    private String[] TechnicalEvents = {"Hackathon","Technico Caza","Civil war","Double Trouble","Techno Gang","Death Race","Tycoon's","Cryptohunt","Techno Quiz","Tech Fuza","Biz-Wiz","Micro Byte","Ele Puzzle","Crime Scene Investigation","Bio-Modelling","Pratikriti","Akriti","Ad-Mime","Just for Fun","Encrypt","Frame a Vision"};

    public TechnicalEvents() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_technical_events, container, false);
        TechicalListView = (ListView) rootView.findViewById(R.id.TechnicalEventsListView);
        ArrayAdapter<String> TechnicalEventsAdapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_list_item_1, TechnicalEvents);
        TechicalListView.setAdapter(TechnicalEventsAdapter);
        TechicalListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                     Position=position;
                Intent TechEvents = new Intent();
                TechEvents.setClass(getActivity(), EventDetails.class);
                getActivity().startActivity(TechEvents);
            }
        });
        return rootView;
    }
}




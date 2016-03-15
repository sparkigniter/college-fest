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
public class NonTechnicalEvents extends Fragment {
    public static int Position=-1;
    private ListView NonTechicalListView;
    private String[] NonTechnicalEvents={"Scary House","Mecho Marketing","Ludus Thronis","Clash of LANs","Dare to Win","Lucky Ladder","Guide and Grab","Lagori","Tuk Tuk Ghoda","Vegetable and Fruit salad duration with theme","Minute to win"};
    public NonTechnicalEvents() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView=inflater.inflate(R.layout.fragment_non_technical_events, container, false);
        NonTechicalListView=(ListView)rootView.findViewById(R.id.NonTechnicalEventsListView);
        ArrayAdapter<String> NonTechnicalEventsAdapter=new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_list_item_1,NonTechnicalEvents);
        NonTechicalListView.setAdapter(NonTechnicalEventsAdapter);
        NonTechicalListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Position=position;
                Intent NonTechEvents = new Intent();
                NonTechEvents.setClass(getActivity(), EventDetails.class);
                getActivity().startActivity(NonTechEvents);

            }
        });


        return rootView;
    }

}

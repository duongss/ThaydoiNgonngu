package com.example.admin.thaydoingonngu.quanlysach;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.admin.thaydoingonngu.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class listFragmenta extends ListFragment {



    private String dataArray[];
    private String dataArray2[];
    public listFragmenta() {
        dataArray = new String[] { "Van", "Su", "Toan","Tieng Anh" };
     //   dataArray2 = new String[] { "Van", "Su", "Toan","Tieng Anh" };
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ListAdapter listAdapter = new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1, dataArray);
        setListAdapter(listAdapter);
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onListItemClick(ListView list, View v, int position, long id) {


    }

}

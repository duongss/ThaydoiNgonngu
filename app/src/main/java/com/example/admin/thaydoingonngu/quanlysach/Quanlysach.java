package com.example.admin.thaydoingonngu.quanlysach;


import android.support.v4.app.FragmentTransaction;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import android.support.v4.app.ListFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.admin.thaydoingonngu.R;

public class Quanlysach extends AppCompatActivity {
    Button btn1dangnhap;
    Button btn2dangky;
    EditText editText1;
    EditText editText2;
    FragmentManager  fragmentManager;
    listFragmenta s= new listFragmenta();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quanlysach);
        btn1dangnhap=findViewById(R.id.dangnhap);



        btn1dangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              Mobookfrag();

            }
        });
    }
    public void Mobookfrag()
    {    fragmentManager = this.getSupportFragmentManager();
        FragmentTransaction  fragmentTransaction = fragmentManager.beginTransaction();
        listFragmenta newGamefragment = new listFragmenta();
        fragmentTransaction.add(R.id.fragment,newGamefragment);
        fragmentTransaction.commit();

    }
}





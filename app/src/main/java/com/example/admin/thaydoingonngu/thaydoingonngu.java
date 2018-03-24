package com.example.admin.thaydoingonngu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class thaydoingonngu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thaydoingonngu);
        TextView textView=findViewById(R.id.text1);
        textView.setText(R.string.msg1);
    }
}

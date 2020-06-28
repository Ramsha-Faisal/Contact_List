package com.example.contact_list;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.content.Context;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[];
    int images[] = {R.drawable.phoneee, R.drawable.phoneee, R.drawable.phoneee, R.drawable.phoneee, R.drawable.phoneee,
            R.drawable.phoneee, R.drawable.phoneee, R.drawable.phoneee, R.drawable.phoneee, R.drawable.phoneee };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycle);
        s1 = getResources().getStringArray(R.array.Contacts);
       // s2 = getResources().getStringArray(R.array.detail);
        recycle_adapter rec_adp = new recycle_adapter(this, s1, images);
        recyclerView.setAdapter(rec_adp);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }

}
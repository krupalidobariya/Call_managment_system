package com.example.call_managment_system;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


public class HomeActivity extends AppCompatActivity {
    ListView listView;
    String[] numberword ={"Dashboard","Employee","Customer","Product","Call Details","Assign Call","Report"};
    int[] number = {0,0,0,0,0,0,0};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        MainAdapter adapter = new MainAdapter(HomeActivity.this,numberword,number);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent =new Intent(HomeActivity.this, MainActivity3.class);
                intent.putExtra("word",numberword[position]);
                intent.putExtra("value",number[position]);
                startActivity(intent);
            }
        });
    }


}

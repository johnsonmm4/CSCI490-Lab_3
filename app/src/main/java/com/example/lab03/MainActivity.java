package com.example.lab03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.class_schedule);

        final String [] classList = {"Fiction Writing", "Princ. of AI", "Machine Learning",
                               "Programming Ethics", "Computer Graphics", "Russian Literature",
                               "Script Analysis", "Capstone Practicum", "Underwater Basket Weaving",
                               "Trigonometry"};

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                                                classList);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast toast1 = Toast.makeText(getApplicationContext(),
                        "Clicked on " + classList[position], Toast.LENGTH_SHORT);
                toast1.show();
            }

        });
    }
}

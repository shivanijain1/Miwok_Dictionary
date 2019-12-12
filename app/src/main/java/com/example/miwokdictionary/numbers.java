package com.example.miwokdictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_numbers);
    ArrayList <String> word = new ArrayList<String>();
        word.add("one");
        word.add("two");
        word.add("three");
        word.add("four");
        word.add("five");
        word.add("six");
        word.add("seven");
        word.add("eight");
        word.add("nine");
        word.add("ten");
    /*LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
    int index=0;
    int l=word.size();
    while (index<l){
    TextView wordView = new TextView(this);
    wordView.setText(word.get(index++));
    rootView.addView(wordView); }*/
    ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,word);

    ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
}

}

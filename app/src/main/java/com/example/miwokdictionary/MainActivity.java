package com.example.miwokdictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clicknumberlist (View view)  {
        Intent i = new Intent(this,numbers.class) ;
        startActivity(i);
    }
    public void clickcolorlist(View view){
        Intent i= new Intent (this, Colors.class);
        startActivity(i);

    }

    public void clickfamilylist (View view)  {
        Intent i = new Intent(this,Family_Members.class) ;
        startActivity(i);
}
    public void clickphraseslist (View view)  {
        Intent i = new Intent(this,Phrases.class) ;
        startActivity(i);
}
}
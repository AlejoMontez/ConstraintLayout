package com.example.aula7.constraintlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.aula7.constraintlayout.Views.Main2Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void NextWindow(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);

    }

}

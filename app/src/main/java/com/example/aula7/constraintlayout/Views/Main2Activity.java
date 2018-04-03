package com.example.aula7.constraintlayout.Views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.aula7.constraintlayout.MainActivity;
import com.example.aula7.constraintlayout.R;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void NextWindow(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}

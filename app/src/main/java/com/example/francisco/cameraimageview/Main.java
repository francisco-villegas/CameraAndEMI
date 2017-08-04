package com.example.francisco.cameraimageview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity implements View.OnClickListener {
    Button btn1, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Change Title
        setTitle("Main window");

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btn1:
                Intent intent = new Intent(this,CameraProject.class);
                startActivity(intent);
                break;
            case R.id.btn2:
                Intent intent2 = new Intent(this,EMIProject.class);
                startActivity(intent2);
                break;
        }
    }
}

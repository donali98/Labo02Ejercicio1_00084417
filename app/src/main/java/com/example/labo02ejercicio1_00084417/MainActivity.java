package com.example.labo02ejercicio1_00084417;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private LinearLayout mLinearLayout;
    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLinearLayout = findViewById(R.id.mLinearLayout);
        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int viewId  = v.getId();
        switch (viewId){
            case R.id.btn1:
                Toast.makeText(MainActivity.this,"btn1",Toast.LENGTH_SHORT).show();
        }
    }
}

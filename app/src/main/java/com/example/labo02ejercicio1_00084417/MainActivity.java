package com.example.labo02ejercicio1_00084417;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private EditText txt1,txt2;
    private TextView txv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);

        btn1 = findViewById(R.id.btn1);
        txv1 = findViewById(R.id.txv1);
        //btn1.setOnClickListener(this);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                txv1.setText(txt1.getText());
            }

        });

        btn1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                txv1.setText(txt2.getText());

                return false;
            }
        });
    }

    /*@Override
    public void onClick(View v) {
        int viewId  = v.getId();
        switch (viewId){
            case R.id.btn1:
                txv1.setText(txt1.getText());
            break;
        }
    }*/
}

package com.dohuukhang.thithu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button[] btn = new Button[13];
    TextView tex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tex = findViewById(R.id.text);
        GridLayout Grv = (GridLayout) this.findViewById(R.id.Grv);
        for (int i = 1; i <= 12; i++){
            btn[i] = new Button(this);
            if(i == 10){
                btn[i].setText("*");
                btn[i].setId(i);
            } else
            if(i == 11){
                btn[i].setText("0");
                btn[i].setId(i);
            } else
            if(i == 12){
                btn[i].setText("#");
                btn[i].setId(i);
            } else{
                btn[i].setId(i);
                btn[i].setText(""+i);
            }
            btn[i].setOnClickListener(this);
            Grv.addView(btn[i]);
        }
    }

    @Override
    public void onClick(View view) {
        int x = view.getId();
        Button btn = findViewById(view.getId());
        String text = tex.getText().toString();
        text += btn.getText().toString();
        tex.setText(text);
    }
}
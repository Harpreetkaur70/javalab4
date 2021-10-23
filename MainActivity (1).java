package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button inc_a,inc_b,dec_a,dec_b,reset;
RadioButton value_1,value_2,value_3,value_6;
TextView score_a,score_b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inc_a=findViewById(R.id.inc_a);
        inc_a.setOnClickListener(this);
        inc_b=findViewById(R.id.inc_b);
        dec_a=findViewById(R.id.dec_a);
        dec_b=findViewById(R.id.dec_b);
        reset=findViewById(R.id.reset);
        value_1=findViewById(R.id.radio_1);
        value_2=findViewById(R.id.radio_2);
        value_3=findViewById(R.id.radio_3);
        value_6=findViewById(R.id.radio_6);
        inc_b.setOnClickListener(this);
        dec_a.setOnClickListener(this);
        dec_b.setOnClickListener(this);
        score_a=findViewById(R.id.score_a);
        score_b=findViewById(R.id.score_b);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           score_a.setText("");
           score_b.setText("");
            }
        });
    }

    @Override
    public void onClick(View v) {
        String score_team_a= score_a.getText().toString();
        String score_team_b=score_b.getText().toString();
        int val=0,val2=0;
        try {
             val = Integer.parseInt(score_team_a);
             val2=Integer.parseInt(score_team_b);
        }catch (NumberFormatException ex){

        }

        if(value_1.isChecked()){
            if(v.getId()==R.id.inc_a){
                score_team_a=String.valueOf(val+1);
            }else if(v.getId()==R.id.inc_b){
                score_team_b=String.valueOf(val2+1);
            }else if(v.getId()==R.id.dec_a){
                score_team_a=String.valueOf(val-1);
            }else {
                score_team_b=String.valueOf(val2-1);
            }
        }else if(value_2.isChecked()){
            if(v.getId()==R.id.inc_a){
                score_team_a=String.valueOf(val+2);
            }else if(v.getId()==R.id.inc_b){
                score_team_b=String.valueOf(val2+2);
            }else if(v.getId()==R.id.dec_a){
                score_team_a=String.valueOf(val-2);
            }else {
                score_team_b=String.valueOf(val2-2);
            }
        }else if(value_3.isChecked()){
            if(v.getId()==R.id.inc_a){
                score_team_a=String.valueOf(val+3);
            }else if(v.getId()==R.id.inc_b){
                score_team_b=String.valueOf(val2+3);
            }else if(v.getId()==R.id.dec_a){
                score_team_a=String.valueOf(val-3);
            }else {
                score_team_b=String.valueOf(val2-3);
            }
        }else if(value_6.isChecked()){
            if(v.getId()==R.id.inc_a){
                score_team_a=String.valueOf(val+6);
            }else if(v.getId()==R.id.inc_b){
                score_team_b=String.valueOf(val2+6);
            }else if(v.getId()==R.id.dec_a){
                score_team_a=String.valueOf(val-6);
            }else {
                score_team_b=String.valueOf(val2-6);
            }
        }


        score_a.setText(score_team_a);
        score_b.setText(score_team_b);


    }
}
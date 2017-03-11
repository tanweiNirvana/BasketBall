package com.example.a46146.basketball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button ABtn1;//A team score 1
    private Button ABtn2;//A team score 2
    private Button ABtn3;//A team score 3
    private Button BBtn1;//B team score 1
    private Button BBtn2;//B team score 2
    private Button BBtn3;//B team score 3
    private Button Reset;//reset A and B team score
    private TextView A_score;//display A team score
    private TextView B_score;//display B team score
    private int ANum=0;//record A team score
    private int BNum=0;//record B team score
    private ButtonListener buttonListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();         //initialize View
        setListener();      //create a Listener
    }

    private void setListener() {
        //create a Listener
        buttonListener=new ButtonListener();
        ABtn1.setOnClickListener(buttonListener);
        ABtn2.setOnClickListener(buttonListener);
        ABtn3.setOnClickListener(buttonListener);
        BBtn1.setOnClickListener(buttonListener);
        BBtn2.setOnClickListener(buttonListener);
        BBtn3.setOnClickListener(buttonListener);
        Reset.setOnClickListener(buttonListener);
    }

    private void initView() {
        //initialize View
        ABtn1= (Button) findViewById(R.id.A_penalty_shot);
        ABtn2= (Button) findViewById(R.id.A_Goal);
        ABtn3= (Button) findViewById(R.id.A_Three_point_ball);
        BBtn1= (Button) findViewById(R.id.B_penalty_shot);
        BBtn2= (Button) findViewById(R.id.B_Goal);
        BBtn3= (Button) findViewById(R.id.B_Three_point_ball);
        A_score= (TextView) findViewById(R.id.A_score);
        B_score= (TextView) findViewById(R.id.B_score);
        Reset= (Button) findViewById(R.id.reset);
    }

    class ButtonListener implements OnClickListener{

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.A_penalty_shot:
                    A_score.setText(""+(ANum+=1));
                    break;
                case R.id.A_Goal:
                    A_score.setText(""+(ANum+=2));
                    break;
                case R.id.A_Three_point_ball:
                    A_score.setText(""+(ANum+=3));
                    break;
                case R.id.B_penalty_shot:
                    B_score.setText(""+(BNum+=1));
                    break;
                case R.id.B_Goal:
                    B_score.setText(""+(BNum+=2));
                    break;
                case R.id.B_Three_point_ball:
                    B_score.setText(""+(BNum+=3));
                    break;
                case R.id.reset:
                    A_score.setText(""+(ANum=0));
                    B_score.setText(""+(BNum=0));
                    break;
            }
        }
    }
}

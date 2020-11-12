package com.umg.enjoyhelloworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class DecisionActivity extends AppCompatActivity {

    private int mode;


    private TextView decisionStory;
    private Button decisionButton1;
    private Button decisionButton2;
    private Button decisionButton3;


    private Decision decision;
    private int decisionId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decision);
        decisionStory=findViewById(R.id.decisionStory);

        readMode();
        randomPositions();
        randomDecision();
        setContent();
    }



    private void readMode()
    {
        mode=MainActivity.mode;
    }


    private void randomPositions()
    {

       int buttonsPosition=new Random().nextInt(6)+1;

       switch(buttonsPosition)
       {
           case 1:
               buttonsSet1();
               break;
           case 2:
               buttonsSet2();
               break;
           case 3:
               buttonsSet3();
               break;
           case 4:
               buttonsSet4();
               break;
           case 5:
               buttonsSet5();
               break;
           case 6:
               buttonsSet6();
               break;
       }

        decisionButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkDecision(1);
            }
        });

        decisionButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkDecision(2);

            }
        });

        decisionButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkDecision(3);

            }
        });

    }
    private void buttonsSet1()
    {
        decisionButton1 =findViewById(R.id.decision1);
        decisionButton2=findViewById(R.id.decision2);
        decisionButton3=findViewById(R.id.decision3);
    }
    private void buttonsSet2()
    {
        decisionButton1 =findViewById(R.id.decision1);
        decisionButton2=findViewById(R.id.decision3);
        decisionButton3=findViewById(R.id.decision2);
    }
    private void buttonsSet3()
    {
        decisionButton1 =findViewById(R.id.decision2);
        decisionButton2=findViewById(R.id.decision1);
        decisionButton3=findViewById(R.id.decision3);
    }
    private void buttonsSet4()
    {
        decisionButton1 =findViewById(R.id.decision2);
        decisionButton2=findViewById(R.id.decision3);
        decisionButton3=findViewById(R.id.decision1);
    }
    private void buttonsSet5()
    {
        decisionButton1 =findViewById(R.id.decision3);
        decisionButton2=findViewById(R.id.decision1);
        decisionButton3=findViewById(R.id.decision2);
    }
    private void buttonsSet6()
    {
        decisionButton1 =findViewById(R.id.decision3);
        decisionButton2=findViewById(R.id.decision2);
        decisionButton3=findViewById(R.id.decision1);
    }


    private void randomDecision()
    {
        int decisionCount=Data.easyModeData.size();

        if(decisionCount>0)
        {
             decisionId = new Random().nextInt(decisionCount);

            switch (mode) {
                case 1:
                    decision = Data.easyModeData.get(decisionId);
                    break;
                case 2:
                    decision = Data.mediumModeData.get(decisionId);
                    break;
                case 3:
                    decision = Data.hardModeData.get(decisionId);
                    break;
            }

        }
        else
        win();

    }



    private void setContent()
    {
        decisionStory.setText(decision.getDescription());
        decisionButton1.setText(decision.getOption1());
        decisionButton2.setText(decision.getOption2());
        decisionButton3.setText(decision.getOption3());
    }



    private void checkDecision(int pressedButton)
    {
       switch (mode) {
           case 1:
               next(pressedButton,true);
               break;
           case 2:
               if(pressedButton==1||pressedButton==2)
                   next(pressedButton,true);
               else
                   next(pressedButton,false);
               break;
           case 3:
               if(pressedButton==1)
                   next(pressedButton,true);
               else
                   next(pressedButton,false);

               break;
       }

    }

    private void next( int pressedButton, boolean isGood)
    {
        String result=null;
        switch (pressedButton)
        {
            case 1:
               result= decision.getResult1();
               break;
            case 2:
               result= decision.getResult2();
               break;
            case 3:
               result= decision.getResult3();
               break;
        }

        if(isGood==true)
        {
            Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
            Data.easyModeData.remove(decisionId);
            Data.mediumModeData.remove(decisionId);
            Data.hardModeData.remove(decisionId);
            if(Data.easyModeData.size()==0)
                win();
            else {
                Intent intent = new Intent(this, StoryActivity.class);
                intent.putExtra("description",result);
                startActivity(intent);
            }
        }
        else
        {
            MainActivity.mode = 0;
            Toast.makeText(this,"Nie udało się- "+result, Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }


    }
    private void win()
    {
        MainActivity.mode = 0;
        Toast.makeText(this, "Wygraliście! Udało się Wam poradzić ze wszystkimi problemami.", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }
}
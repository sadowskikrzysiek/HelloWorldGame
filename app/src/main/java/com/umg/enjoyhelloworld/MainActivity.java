package com.umg.enjoyhelloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public static int mode;
   /*
    1-easy
    2-medium
    3-hard
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void selectEasy(View view)
    {
        mode=1;
        startGame();

    }
    public void selectMedium(View view)
    {
        mode=2;
        startGame();
    }
    public void selectHard(View view)
    {
        mode=3;
        startGame();
    }
    private void startGame()
    {
        Data.setData();
        Intent intent = new Intent(this, StoryActivity.class);
        startActivity(intent);
    }
    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        this.finishAffinity();
    }
}
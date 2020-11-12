package com.umg.enjoyhelloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class StoryActivity extends AppCompatActivity {

    private TextView gameStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        gameStory=findViewById(R.id.gameStory);
        setContent();
    }

    private void setContent()
    {
        String description;
        if(getIntent().getStringExtra("description")!=null)
         description=getIntent().getStringExtra("description");
        else
            description=getString(R.string.startStory);

        gameStory.setText(description);

    }

    public void next(View view)
    {
        if(MainActivity.mode==0)
        {

            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        else
        {
            Intent intent = new Intent(this, DecisionActivity.class);
            startActivity(intent);
        }

    }
    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }

}
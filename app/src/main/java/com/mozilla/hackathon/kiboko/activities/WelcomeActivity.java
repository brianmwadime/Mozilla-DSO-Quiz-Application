package com.mozilla.hackathon.kiboko.activities;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mozilla.hackathon.kiboko.R;

public class WelcomeActivity extends ActionBarActivity {
    TextView btnSw,btnEn;
    LinearLayout layout;
    EditText prompt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        layout = (LinearLayout)findViewById(R.id.welcome_layout);

        setTitle("");
        btnEn = (TextView)findViewById(R.id.btn_en);
        btnEn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(layout.isShown()){
                    layout.setVisibility(View.GONE);
                    layout = (LinearLayout)findViewById(R.id.name_prompt_layout);
                    layout.setVisibility(View.VISIBLE);
                    initializeNamePromptElements("en");
                    //Show text in English
                }
            }
        });

        btnSw = (TextView)findViewById(R.id.btn_sw);
        btnSw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(layout.isShown()){
                    layout.setVisibility(View.GONE);
                    layout = (LinearLayout)findViewById(R.id.name_prompt_layout);
                    layout.setVisibility(View.VISIBLE);
                    initializeNamePromptElements("sw");
                    //Show text in Swahili

                }
            }
        });
    }

    public void initializeNamePromptElements(String locale){
        prompt = (EditText)findViewById(R.id.name_field);
        //if get focus then change color
        if(locale.equals("sw")){

        }else if(locale.equals("en")){

        }

        Button next_btn = (Button)findViewById(R.id.next_btn);
        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WelcomeActivity.this,SelectActionActivity.class );
                String name= prompt.getText().toString();
                intent.putExtra("name",name);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_welcome, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

package com.example.forcebag;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class NoteDisplayController extends AppCompatActivity {

    TextView title;
    TextView content;



    //Note Display Activity

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        setContentView(R.layout.activity_simple_note_creation);
        content=findViewById(R.id.big_content);
        title=findViewById(R.id.big_title);
        getExtras();




    }


    public void getExtras()
    {
        if(getIntent().hasExtra("Title"))
            title.setText(getIntent().getStringExtra("Title"));

        if(getIntent().hasExtra("Content"))
            content.setText(getIntent().getStringExtra("Content"));



    }


    public void ReturnPresssed(View view)
    {
         finish();

    }
}

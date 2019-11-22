package com.example.forcebag;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import java.util.List;

public class MenuController extends AppCompatActivity {

    int index;

        //Menu Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        setContentView(R.layout.menu);

        getExtras();

    }

    private void getExtras() {

        if(getIntent().hasExtra("Index"))
            index=getIntent().getIntExtra("Index",0);
    }


    public void testButton(View view)
    {
        Intent temp=new Intent(this,NoteController.class);
        temp.putExtra("Index",index);
        startActivity(temp);

    }


    public void optionMenuClicked(View view)
    {
        Intent intent=new Intent(this,OptionMenuController.class);
        startActivity(intent);



    }





}

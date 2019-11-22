package com.example.forcebag;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.List;

public class NoteController extends AppCompatActivity {

    int index;
    List<Note> list;


    //Note List Activity

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        setContentView(R.layout.note_menu);
        index=-1;
        list=NoteListHolder.getList();
       // list=ReadAndWrite.loadFiles("Data.txt",this);

        getIndex();
        initRecycleView();


    }

    public void getIndex()
    {
        if(getIntent().hasExtra("Index"))
            index=getIntent().getIntExtra("Index",0);
    }


    private void initRecycleView()
    {
        RecyclerView recycleView=findViewById(R.id.recycler_view);
        NoteAdapter adabter=new NoteAdapter(this,list,index);
        recycleView.setAdapter(adabter);
        recycleView.setLayoutManager(new LinearLayoutManager(this));
    }






}

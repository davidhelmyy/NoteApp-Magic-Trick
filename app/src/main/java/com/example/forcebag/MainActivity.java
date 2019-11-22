package com.example.forcebag;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {


    EditText pass;
    int index;
    String number = new String();
    int counter = 0;

    //Password Activity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);


        setContentView(R.layout.activity_main);
        pass = (EditText) findViewById(R.id.passBox);
        NoteListHolder temp=NoteListHolder.getInstance();


    }


    public void NumberClicked(View view) {

        int temp=0;

        if (view.getId() == R.id.btn0) {
            number += "0";
            temp=0;

        }

        if (view.getId() == R.id.btn1) {
            number += "1";
            temp=1;
        }
        if (view.getId() == R.id.btn2) {
            number += "2";
            temp=2;
        }
        if (view.getId() == R.id.btn3) {
            number += "3";
            temp=3;
        }
        if (view.getId() == R.id.btn4) {
            number += "4";
            temp=4;
        }
        if (view.getId() == R.id.btn5) {
            number += "5";
            temp=5;
        }
        if (view.getId() == R.id.btn6) {
            number += "6";
            temp=6;
        }
        if (view.getId() == R.id.btn7) {
            number += "7";
            temp=7;
        }
        if (view.getId() == R.id.btn8) {

            number += "8";
            temp=8;
        }
        if (view.getId() == R.id.btn9) {
            number += "9";
            temp=9;
        }

        pass.setText(number);
        EditIndex(temp);
        counter++;

        if (counter == 4) {
            Finished();

        }

    }


    public void EditIndex(int x)
    {
        if (counter<2)
        {
            if(counter==0)
                index=x*10;

            else
                index+=x;

        }
    }






   public void Finished()
   {

    //   String tempIndex=pass.getText().toString();
     //index=Integer.valueOf(tempIndex)%100;



       counter=0;
       pass.setText("");
       number="";

       if(index==0)
           index=100;

       Intent temp=new Intent(this,MenuController.class);
       temp.putExtra("Index",index);
       startActivity(temp);
   }



  public void DeleteClicked(View view)
  {

      counter=0;
      pass.setText("");
      number="";
      index=0;
  }








}

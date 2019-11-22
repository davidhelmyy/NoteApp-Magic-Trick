package com.example.forcebag;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;





public class OptionMenuController extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        setContentView(R.layout.option_menu);


    }



    public void addNoteDialog(View temp){

    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);


    final EditText et = new EditText(this);
    final TextView view=new TextView(this);

            et.setPadding(5,5,5,5);
            et.setHint("Enter List here");
            et.setGravity(Gravity.CENTER);

            et.setBackgroundColor(getResources().getColor(android.R.color.transparent));

    // set prompts.xml to alertdialog builder
            alertDialogBuilder.setView(et);
            alertDialogBuilder.setTitle("Add Note");

    // set dialog message
            alertDialogBuilder.setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
        public void onClick(DialogInterface dialog, int id) {

                NoteListHolder.addNote(et.getText().toString());
                Toast toast = Toast.makeText(getApplicationContext(),"Note Added",Toast.LENGTH_SHORT);
                toast.show();



            }
    });

    // create alert dialog
    AlertDialog alertDialog = alertDialogBuilder.create();
    // show it
            alertDialog.show();


}

    public void editForceNumber(View temp)
    {

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);


    final EditText et = new EditText(this);
    final EditText et2 = new EditText(this);
    final TextView view=new TextView(this);
    final LinearLayout layout=new LinearLayout(this);

    layout.setOrientation(LinearLayout.VERTICAL);
    layout.addView(et);
    layout.addView(et2);



            et.setPadding(5,5,5,5);
            et.setHint("Enter Index");
            et.setGravity(Gravity.CENTER);
            et.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_SIGNED);
            et.setBackgroundColor(getResources().getColor(android.R.color.transparent));



            et2.setPadding(5,5,5,5);
            et2.setHint("Enter New Number");
            et2.setGravity(Gravity.CENTER);
            et2.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_SIGNED);
            et2.setBackgroundColor(getResources().getColor(android.R.color.transparent));



    // set prompts.xml to alertdialog builder
            alertDialogBuilder.setView(layout);
            alertDialogBuilder.setTitle("Change Force");

    // set dialog message
            alertDialogBuilder.setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
        public void onClick(DialogInterface dialog, int id) {

                int index=Integer.valueOf(et.getText().toString());
                int number=Integer.valueOf(et2.getText().toString());

                NoteListHolder.changeForce(index,number);

            Toast toast = Toast.makeText(getApplicationContext(),"Force Changed",Toast.LENGTH_SHORT);
            toast.show();



        }
    });

    // create alert dialog
    AlertDialog alertDialog = alertDialogBuilder.create();
    // show it
            alertDialog.show();


}

    public void deleteAlartDialogue(View temp)
    {


            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);


            final EditText et = new EditText(this);


            et.setPadding(5,5,5,5);
            et.setHint("Enter Index");
            et.setGravity(Gravity.CENTER);
            et.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_SIGNED);
            et.setBackgroundColor(getResources().getColor(android.R.color.transparent));



            // set prompts.xml to alertdialog builder
            alertDialogBuilder.setView(et);
            alertDialogBuilder.setTitle("Delete Notes");

            // set dialog message
            alertDialogBuilder.setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {

                    int index=Integer.valueOf(et.getText().toString());
                    NoteListHolder.deleteNote(index);

                    Toast toast = Toast.makeText(getApplicationContext(),"Note deleted",Toast.LENGTH_SHORT);
                    toast.show();



                }
            });

            // create alert dialog
            AlertDialog alertDialog = alertDialogBuilder.create();
            // show it
            alertDialog.show();


        }



        public void editNote(View t)
        {


            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);


            final EditText et = new EditText(this);
            final EditText title=new EditText(this);
            final EditText et2=new EditText(this);
            final LinearLayout layout=new LinearLayout(this);

            layout.setOrientation(LinearLayout.VERTICAL);
            layout.addView(et);
            layout.addView(title);
            layout.addView(et2);



            et.setPadding(5,5,5,5);
            et.setHint("Enter Index");
            et.setGravity(Gravity.CENTER);
            et.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_SIGNED);
            et.setBackgroundColor(getResources().getColor(android.R.color.transparent));

            title.setPadding(5,5,5,5);
            title.setText("Enter Title");
            title.setGravity(Gravity.CENTER);
            title.setBackgroundColor(getResources().getColor(android.R.color.transparent));

            et2.setPadding(5,5,5,5);
           et2.setText("Enter Note");
            et2.setGravity(Gravity.CENTER);
            et2.setBackgroundColor(getResources().getColor(android.R.color.transparent));



            // set prompts.xml to alertdialog builder
            alertDialogBuilder.setView(layout);
            alertDialogBuilder.setTitle("Edit Note");

            // set dialog message
            alertDialogBuilder.setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {

                    int index=Integer.valueOf(et.getText().toString());
                  String s=et2.getText().toString();
                  String titleName=title.getText().toString();


                    NoteListHolder.editNote(titleName,s,index);

                    Toast toast = Toast.makeText(getApplicationContext(),"Note edited",Toast.LENGTH_SHORT);
                    toast.show();



                }
            });

            // create alert dialog
            AlertDialog alertDialog = alertDialogBuilder.create();
            // show it
            alertDialog.show();

        }




        public void ReArrange(View view)
        {

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);


            final EditText et = new EditText(this);
            final EditText et2=new EditText(this);

            final LinearLayout layout=new LinearLayout(this);

            layout.setOrientation(LinearLayout.VERTICAL);
            layout.addView(et);
            layout.addView(et2);

            et.setPadding(5,5,5,5);
            et.setHint("Enter Index 1");
            et.setGravity(Gravity.CENTER);
            et.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_SIGNED);
            et.setBackgroundColor(getResources().getColor(android.R.color.transparent));

            et2.setPadding(5,5,5,5);
            et2.setHint("Enter Index 2");
            et2.setGravity(Gravity.CENTER);
            et2.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_SIGNED);
            et2.setBackgroundColor(getResources().getColor(android.R.color.transparent));

            // set prompts.xml to alertdialog builder
            alertDialogBuilder.setView(layout);

            alertDialogBuilder.setTitle("Change Order");

            // set dialog message
            alertDialogBuilder.setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {

                    int index=Integer.valueOf(et.getText().toString());
                    int index2=Integer.valueOf(et2.getText().toString());


                    NoteListHolder.Rearrange(index,index2);

                    Toast toast = Toast.makeText(getApplicationContext(),"Re-Arranged",Toast.LENGTH_SHORT);
                    toast.show();



                }
            });

            // create alert dialog
            AlertDialog alertDialog = alertDialogBuilder.create();
            // show it
            alertDialog.show();


        }




        public void exitPressed(View view)
        {
            finish();
        }
}

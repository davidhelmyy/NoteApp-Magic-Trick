package com.example.forcebag;



import android.content.Context;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;


public class ReadAndWrite {

    public static void writeToFile(String data, Context context,String fileName) {
        try {

            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(context.openFileOutput(fileName, Context.MODE_PRIVATE));
            outputStreamWriter.write(data);
            outputStreamWriter.close();
        }
        catch (IOException e) {
            Toast toast=Toast.makeText(context,"error writing file",Toast.LENGTH_SHORT);
            toast.show();

        }
    }



    public static String readFromFile(Context context,String fileName) {


        String ret="";
        try {
            InputStream inputStream = context.openFileInput(fileName);

            if ( inputStream != null ) {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String receiveString = "";
                StringBuilder stringBuilder = new StringBuilder();

                while ( (receiveString = bufferedReader.readLine()) != null ) {
                    stringBuilder.append(receiveString);

                }


                ret=stringBuilder.toString();
                inputStream.close();

            }
        }
        catch (FileNotFoundException e) {
            Toast toast = Toast.makeText(context, "File not found", Toast.LENGTH_SHORT);
            toast.show();



        } catch (IOException e) {
            Toast toast=Toast.makeText(context,"Error reading file",Toast.LENGTH_SHORT);
            toast.show();
        }

        return ret;
    }





    public static List<Note> loadFiles(String name, Context context)
    {
        List <Note>  temp=new ArrayList<>();
        String tempString=new String();

       tempString= readFromFile(context,name);
       List<String> FileNames=newLineRemover(tempString);


       for(int i=0;i<FileNames.size();++i)
       {
          String data=readFromFile(context,FileNames.get(i));
           temp.add(new Note(newLineRemover(data)));
       }


        return temp;
    }



    public static List<String> newLineRemover(String s)
    {

        List<String> temp=new ArrayList<>();

        String[] lines = s.split(",");
        for (String line : lines) {
           temp.add(line);
        }

        return temp;


    }


    public static void SaveAll(Context context,List<Note> list,String Filename)
    {
        List<String> FileNames=new ArrayList<>();

        for(int i=0;i<list.size();++i)
        {
            String name=list.get(i).getTitle()+".txt";
            String data=NewlineAdder(list.get(i).getList());

            writeToFile(data,context,name);
            FileNames.add(name);

        }

        String data=NewlineAdder(FileNames);
        writeToFile(data,context,Filename);

    }




    public static String NewlineAdder(List<String> list)
    {
        String temp="";

        for(int i=0;i<list.size();++i)
            temp+=list.get(i)+",";


        return temp;
    }







}

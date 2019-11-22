package com.example.forcebag;

import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class NoteListHolder {

    private static List<Note> list;
    private static NoteListHolder instance=new NoteListHolder();

    private NoteListHolder()
    {
      try{
            list=ReadAndWrite.loadFiles("Data.txt",GlobalContext.getContext());
             }catch (Exception e)
       {
         Toast toast= Toast.makeText(GlobalContext.getContext(),"error reading files",Toast.LENGTH_SHORT);
           toast.show();
            list=FileReader.InitLists();
            ReadAndWrite.SaveAll(GlobalContext.getContext(),list,"Data.txt");
        }
    }


    public static void changeForce(int index,int number)
    {
       Note temp=list.get(index);
       temp.changeForce(number);
       list.set(index,temp);
       ReadAndWrite.SaveAll(GlobalContext.getContext(),list,"Data.txt");

    }

    public static void deleteNote(int index)
    {
        if(index<list.size())
        {list.remove(index);
            ReadAndWrite.SaveAll(GlobalContext.getContext(),list,"Data.txt");
        }
    }

    public static void addNote(String data)
    {
        if(!data.matches(""))
        { list.add(new Note(newLineRemover(data)));
          ReadAndWrite.SaveAll(GlobalContext.getContext(),list,"Data.txt");
        }
    }

    public static String Requestupdate(int index)
    {
        return ReadAndWrite.NewlineAdder(list.get(index).getList());

    }

    public static void update(List<String> data,int index)
    {
        list.set(index,new Note(data));
        ReadAndWrite.SaveAll(GlobalContext.getContext(),list,"Data.txt");
    }


    public static void editNote(String title,String s,int index)
    {
        List<String> temp=new ArrayList<>();

        //takes new note as a string and convert it to a list
        temp=newLineRemover(s);
        //add title to note

        temp.add(0,title);

        temp=numberRemoval(temp);
        update(temp,index);


    }



    public static List<Note> getList(){return NoteListHolder.list;}

        public static void setList(List<Note> list)
        {
            NoteListHolder.list=list;
        }


        public static NoteListHolder getInstance(){
        return instance;
        }


        //to read from files
        //to update note

        public static List<String> newLineRemover(String s)
        {
            List<String> temp=new ArrayList<>();

            String[] lines = s.split("\n");
            for (String line : lines) {
                temp.add(line);
            }

            return temp;

        }


    public static List<String> numberRemoval(List<String> s)
    {

        for (int i=1;i<s.size();i++)
        {
            String temp=s.get(i);

           String x[] =temp.split("-",1);
           s.set(i,x[1]);
        }


        return s;
    }



        public static void Rearrange(int index,int index2)
        {



           Note temp=list.get(index);
           list.set(index,list.get(index2));
           list.set(index2,temp);




        }



}

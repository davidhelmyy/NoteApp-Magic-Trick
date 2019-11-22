package com.example.forcebag;

import java.util.ArrayList;
import java.util.List;

public class Note {


//considering forced note at index 1 and title at index 0

    private List<String> list; //List of words

    private String title;
    private String content;

    public Note(List<String> list)
    {
        this.list=list;
        title=list.get(0);



    }

    //transform list of sentences to a string of item with title and numbered
    //put force item in the given index

    private void getNotes(int index)
    {

        String Note=new String();
        index=index+1;
        int temp=0;
        if(index>list.size()-1);
        temp=1;

            if(this.list!=null&&list.size()>2)
            {

                for(int i=2;i<list.size();i++) {
                    if(i==index)
                    {
                        Note += (i-1) + "-" + list.get(1);
                        Note+="\n";
                        temp=i;

                    }

                    else {
                        Note += (i - 1) + "-" + list.get(i);
                        Note += "\n";
                    }


                }


                Note += list.size()-1 + "-" + list.get(temp);
                Note += "\n";
            }

        this.content= Note;
    }



    public String  getContent(int index)
    {
        getNotes(index);
        return this.content;
    }


    public void changeForce(int n)
    {
        String temp=list.get(1);
        list.set(1,list.get(n+1));
        list.set(n+1,temp);
    }




    public String getTitle()
    {
        return this.title;
    }


    public List<String> getList(){return this.list;}
}

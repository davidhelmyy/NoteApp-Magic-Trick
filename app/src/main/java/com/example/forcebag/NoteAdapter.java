package com.example.forcebag;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.ViewHolder>{


    private  List<Note> list=new ArrayList<>();
    private Context context;
    private int index;

   public NoteAdapter(Context context,List list,int index)
   {
       this.context=context;
       this.index=index;
       this.list=list;
   }




    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int i) {

       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.solvent_list,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int i) {

       viewHolder.title.setText(list.get(i).getTitle());
       viewHolder.content.setText(list.get(i).getContent(index));

       viewHolder.parent.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Intent intent=new Intent(context,NoteDisplayController.class);
               intent.putExtra("Title",list.get(i).getTitle());
               intent.putExtra("Content",list.get(i).getContent(index));
               context.startActivity(intent);
           }
       });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView title;
        TextView content;
        RelativeLayout parent;

        public ViewHolder( View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.note_title);
            content=itemView.findViewById(R.id.note_content);
            parent=itemView.findViewById(R.id.note_layout);


        }
    }
}

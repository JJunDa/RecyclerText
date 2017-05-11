package com.example.administrator.recyclertext;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2017/4/2 0002.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

    private List<Student> stuList;
    public MyAdapter(List<Student> stuList){
        this.stuList = stuList;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView stuImg;
        TextView stuName;

        public ViewHolder(View itemView) {
            super(itemView);
            stuImg = (ImageView) itemView.findViewById(R.id.stu_img);
            stuName = (TextView) itemView.findViewById(R.id.stu_name);
        }
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.stu_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Student stu = stuList.get(position);
        holder.stuImg.setImageResource(stu.imgId);
        holder.stuName.setText(stu.name);
    }

    @Override
    public int getItemCount() {
        return stuList.size();
    }


}

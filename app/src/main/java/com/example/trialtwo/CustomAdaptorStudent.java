package com.example.trialtwo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class CustomAdaptorStudent extends RecyclerView.Adapter<CustomAdaptorStudent.MyViewHolder> {

    Context context;
    ArrayList<user> userArrayList;

    public CustomAdaptorStudent(Context context, ArrayList<user> userArrayList) {
        this.context = context;
        this.userArrayList = userArrayList;
    }

    @NonNull
    @Override
    public CustomAdaptorStudent.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.data_layout,parent,false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdaptorStudent.MyViewHolder holder, int position) {

        user user = userArrayList.get(position);

        holder.FullName.setText(user.FullName);
        holder.Email.setText(user.Email);
        holder.MobileNo.setText(user.MobileNo);
        holder.Course.setText(user.Course);


    }

    @Override
    public int getItemCount() {
        return userArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView FullName,Email,MobileNo,Course;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            FullName = itemView.findViewById(R.id.getNameId);
            Email = itemView.findViewById(R.id.getEmailId);
            Course = itemView.findViewById(R.id.getCourseId);
            MobileNo = itemView.findViewById(R.id.getNumId);


        }
    }
}

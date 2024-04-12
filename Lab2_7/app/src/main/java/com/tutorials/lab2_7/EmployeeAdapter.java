package com.tutorials.lab2_7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.ViewHolder> {

    private ArrayList<Employee> employeeArrayList ;
    private Context context;
    public EmployeeAdapter(ArrayList<Employee> employeeArrayList, Context context) {
        this.employeeArrayList = employeeArrayList;
        this.context = context;
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvFullName;
        TextView tvPosition;
        ImageView ivManager;
        LinearLayout llParent;
        public ViewHolder (@NonNull View itemView) {
            super(itemView);
            tvFullName = itemView.findViewById(R.id.item_employee_tv_fullname);
            tvPosition = itemView.findViewById(R.id.item_employee_tv_position);
            ivManager = itemView.findViewById(R.id.item_employee_iv_manager);
            llParent = itemView.findViewById(R.id.item_employee_ll_parent);
        }
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view  = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_employee, viewGroup ,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Employee employee = employeeArrayList.get(position);
        if (employee.getFullName()!=null)
            holder.tvFullName.setText(employee.getFullName());
        else holder.tvFullName.setText("");

        if (employee.isManager()){
            holder.ivManager.setVisibility(View.VISIBLE);
            holder.tvPosition.setVisibility(View.GONE);
        }
        else
        {
            holder.ivManager.setVisibility(View.GONE);
            holder.tvPosition.setVisibility(View.VISIBLE);
            holder.tvPosition.setText(context.getString(R.string.staff));
        }
        if (position%2==0)
        {
            holder.llParent.setBackgroundResource(R.color.white);
        }
        else
        {
            holder.llParent.setBackgroundResource(R.color.light_blue);
        }
    }
    @Override
    public int getItemCount() {
        return employeeArrayList.size();
    }

}
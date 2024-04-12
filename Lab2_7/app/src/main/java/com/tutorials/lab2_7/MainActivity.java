package com.tutorials.lab2_7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText etID,etName;
    CheckBox cbIsAManager;
    Button btnAdd;
    RecyclerView rvEmployee = null;
    ArrayList<Employee> arrEmployee = new ArrayList<Employee>();
    EmployeeAdapter adapter = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employee);
        etID = (EditText) findViewById(R.id.etID);
        etName = (EditText) findViewById(R.id.etName);
        cbIsAManager = (CheckBox) findViewById(R.id.cbIsAManager);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        rvEmployee = (RecyclerView) findViewById(R.id.rvEmployee);
        arrEmployee = new ArrayList<Employee>();
        adapter = new EmployeeAdapter(arrEmployee,this);
        rvEmployee.setAdapter(adapter);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ID = etID.getText()+"";
                String Name = etName.getText()+"";
                boolean Manager = false;
                if(cbIsAManager.isChecked()) Manager = true;
                Employee emp = new Employee();
                emp.setId(ID);
                emp.setFullName(Name);
                emp.setManager(Manager);
                arrEmployee.add(emp);
                adapter.notifyDataSetChanged();
                etID.setText("");
                etName.setText("");
                etID.requestFocus();
            }
        });
    }
}
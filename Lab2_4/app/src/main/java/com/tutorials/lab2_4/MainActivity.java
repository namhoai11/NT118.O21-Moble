package com.tutorials.lab2_4;

import  androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText edtID,edtName;
    CheckBox cbIsAManager;
    Button btnAdd;
    ListView lvEmployee = null;
    ArrayList<Employee> arrEmployee = new ArrayList<Employee>();
    EmployeeAdapter adapter = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employee);

        edtID = (EditText) findViewById(R.id.edtId);
        edtName = (EditText) findViewById(R.id.edtName);
        cbIsAManager = (CheckBox) findViewById(R.id.chbxManager);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        lvEmployee = (ListView) findViewById(R.id.lvEmployee);
        arrEmployee = new ArrayList<Employee>();
        adapter = new EmployeeAdapter(this,R.layout.item_employee,arrEmployee);
        lvEmployee.setAdapter(adapter);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ID = edtID.getText()+"";
                String Name = edtName.getText()+"";
                boolean Manager = false;
                if(cbIsAManager.isChecked()) Manager = true;
                Employee emp = new Employee();
                emp.setId(ID);
                emp.setFullName(Name);
                emp.setManager(Manager);
                arrEmployee.add(emp);
                adapter.notifyDataSetChanged();
                edtID.setText("");
                edtName.setText("");
                edtID.requestFocus();
            }
        });
    }
}
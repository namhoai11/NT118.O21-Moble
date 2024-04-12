//package com.tutorials.lab2_4
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.view.View
//import android.widget.Button
//import android.widget.CheckBox
//import android.widget.EditText
//import android.widget.ListView
//import java.util.ArrayList
//
//class MainActivity : AppCompatActivity() {
//    private lateinit var edtID: EditText
//    private lateinit var edtName: EditText
//    private lateinit var cbIsAManager: CheckBox
//    private lateinit var btnAdd: Button
//    private var lvEmployee: ListView? = null
//    private var arrEmployee: ArrayList<Employee> = ArrayList()
//    private var adapter: EmployeeAdapter? = null
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.employee)
//
//        edtID = findViewById(R.id.edtId)
//        edtName = findViewById(R.id.edtName)
//        cbIsAManager = findViewById(R.id.chbxManager)
//        btnAdd = findViewById(R.id.btnAdd)
//        lvEmployee = findViewById(R.id.lvEmployee)
//        adapter = EmployeeAdapter(this, R.layout.item_employee, arrEmployee)
//        lvEmployee?.adapter = adapter
//
//        btnAdd.setOnClickListener {
//            val ID = edtID.text.toString()
//            val Name = edtName.text.toString()
//            val Manager = cbIsAManager.isChecked
//            val emp = Employee()
//            emp.id = ID
//            emp.fullName = Name
//            emp.isManager = Manager
//            arrEmployee.add(emp)
//            adapter?.notifyDataSetChanged()
//            edtID.text.clear()
//            edtName.text.clear()
//            edtID.requestFocus()
//        }
//    }
//}

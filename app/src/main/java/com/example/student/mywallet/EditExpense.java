package com.example.student.mywallet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import Database.WalletDBhelper;

public class EditExpense extends AppCompatActivity {

    WalletDBhelper db;
    EditText addexpences ,note ;
    TextView category ;
    private String AddExpenses ,Note , Category ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_expense);

        db = new WalletDBhelper(this);
        addexpences = findViewById( R.id.editText3);
        note = findViewById( R.id.editText13);
        category = findViewById( R.id.textView71);
    }

    public  void addExpense(View view){
        AddExpenses = addexpences.getText().toString().trim();
        Note = note.getText().toString().trim();
        Category = category.getText().toString().trim();

        boolean result = db.addExpences( AddExpenses , Note , Category );
        if(result == true){
            Toast.makeText(getApplicationContext(),"Data Added ",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(getApplicationContext(),"Data failed",Toast.LENGTH_LONG).show();
        }

    }

    public void addData1(View view){
        Intent intent = new Intent(EditExpense.this,Daily.class);
        startActivity(intent);
    }
    public void addData2(View view){
        Intent intent = new Intent(EditExpense.this,DashboardExpensesCate.class);
        startActivity(intent);
    }

    public void addData3(View view){
        Intent intent = new Intent(EditExpense.this,DasboardIncomeCate.class);
        startActivity(intent);
    }

    public void addData4(View view){
        Intent intent = new Intent(EditExpense.this,My_Wallet_Repot.class);
        startActivity(intent);
    }

    public void addData5(View view){
        Intent intent =new Intent(EditExpense.this,Expensses_details.class);
        startActivity(intent);
    }
}
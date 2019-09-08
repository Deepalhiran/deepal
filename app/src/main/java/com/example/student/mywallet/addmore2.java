package com.example.student.mywallet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import Database.WalletDBhelper;
import Model.Users;

public class addmore2 extends AppCompatActivity {

    WalletDBhelper db;
    EditText editText6ishu;
    TextView data2;
    private String name2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addmore2);

        editText6ishu = findViewById(R.id.editText6ishu);
        data2 = findViewById(R.id.data2);
        db = new WalletDBhelper(this);

        data2.setText("");
        int count2 = 1;

        ArrayList<Users> u2 = db.readAllInfor2();
        for(Users users : u2){
            data2.append( count2 + " " + users.getUname() + "\n");
            count2++;
        }
    }

    public void addExpensesCat(View view){
        name2 = editText6ishu.getText().toString();

        boolean result = db.addeXPENSESCategory(name2);
        if(result == true){
            Toast.makeText(getApplicationContext(),"Data Added ",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(getApplicationContext(),"Data failed",Toast.LENGTH_LONG).show();
        }
        displayExpensesInfro(view);
    }

    public void displayExpensesInfro(View view){
        data2.setText("");
        int count = 1;

        ArrayList<Users> u = db.readAllInfor2();
        for(Users users : u){
            data2.append( count + " " + users.getUname() + "\n");
            count++;
        }
    }

    public void deleteexpensesCat(View view){
        name2 = editText6ishu.getText().toString();
        db.ExpensescatDelete(name2);
        displayExpensesInfro(view);
    }

    public void updateCexpensesncome(View view){
        name2 = editText6ishu.getText().toString();
        db.ExpensesCatUpdate(name2);
        displayExpensesInfro(view);
    }

}

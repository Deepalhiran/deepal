package com.example.student.mywallet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

import Database.WalletDBhelper;
import Model.Users;

public class Acoounteditupdate extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acoounteditupdate);


    }

























    public void account(View view) {
        Intent intent = new Intent(Acoounteditupdate.this, AddExpenses.class);
        startActivity(intent);
    }

    public void addData1(View view) {
        Intent intent = new Intent(Acoounteditupdate.this, Daily.class);
        startActivity(intent);
    }

    public void addData2(View view) {
        Intent intent = new Intent(Acoounteditupdate.this, expenses_category.class);
        startActivity(intent);
    }

    public void addData3(View view) {
        Intent intent = new Intent(Acoounteditupdate.this, income_category.class);
        startActivity(intent);
    }

    public void addData4(View view) {
        Intent intent = new Intent(Acoounteditupdate.this, My_Wallet_Repot.class);
        startActivity(intent);
    }
}

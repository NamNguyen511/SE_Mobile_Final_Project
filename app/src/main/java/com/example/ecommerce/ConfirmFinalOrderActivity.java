package com.example.ecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class ConfirmFinalOrderActivity extends AppCompatActivity {

    private EditText nameEditText, phoneEditText, addressEditText, cityEditText;
    private Button confirmOrderBtn;

    private String totalAmount  = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_final_order);

        confirmOrderBtn = (Button) findViewById(R.id.confirm_final_order_btn);
        nameEditText = (EditText) findViewById(R.id.order_name);
        phoneEditText = (EditText) findViewById(R.id.order_phone_number);
        addressEditText = (EditText) findViewById(R.id.order_address);
        cityEditText = (EditText) findViewById(R.id.order_city);

        totalAmount = getIntent().getStringExtra("Total Price : ");

    }
}

package com.example.currency_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner sp1, sp2;
    EditText et1, et2;
    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.first_edit_id);

        sp1 = findViewById(R.id.first_spinner_id);
        sp2 = findViewById(R.id.second_spinner_id);
        calculate= findViewById(R.id.calculate_id);

        String[] from = {"USD"};
        ArrayAdapter ad = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad);


        String[] to = {"BDT", "INR"};
        ArrayAdapter aad = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item, to);
        sp2.setAdapter(aad);




    }

    public void calculate(View view) {

        Double total;
        Double amount = Double.parseDouble(et1.getText().toString());

        if (sp1.getSelectedItem().toString()== "USD" && sp2.getSelectedItem().toString()=="BDT")
        {
            total = amount*85;
            Toast.makeText(getApplicationContext(),total.toString(), Toast.LENGTH_LONG).show();
        }
        if (sp1.getSelectedItem().toString()== "USD" && sp2.getSelectedItem().toString()=="INR")
        {
            total = amount*70;
            Toast.makeText(getApplicationContext(),total.toString(), Toast.LENGTH_LONG).show();
        }



    }
}
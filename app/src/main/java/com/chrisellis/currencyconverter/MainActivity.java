package com.chrisellis.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void convertCurrency(View view){
        //get dollar amount from user input
        EditText currency = (EditText) findViewById(R.id.currency);
        //convert to double
        Double dollarAmount = Double.parseDouble(currency.getText().toString());
        //convert to Great British Poundd
        Double greatBritishPounds = dollarAmount * .75;
        //log dollar amount for testing
        //Log.i("Info", currency1.toString());
        //Log.i("Info", conversionRate.toString());
        //Log.i("Info", greatBritishPounds.toString());

        Toast.makeText(MainActivity.this, String.format("%.2f", greatBritishPounds), Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

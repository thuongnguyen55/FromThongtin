package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText plName, plSdt, plCt;
    TextView txtht;
    RadioButton rdNam, rdNu;
    Spinner entries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plSdt = (EditText) findViewById(R.id.plSdt);
        plName = (EditText) findViewById(R.id.plName);
        plCt = (EditText) findViewById(R.id.plCt);
        txtht = (TextView) findViewById(R.id.txtht);
        entries = (Spinner) findViewById(R.id.entries);
        rdNam = (RadioButton) findViewById(R.id.rdNam);
        rdNu = (RadioButton) findViewById(R.id.rdNu);
    }

    public void display(View v) {
        String a = plName.getText().toString() + "\n" + plSdt.getText().toString() + "\n" + entries.getSelectedItem().toString() + "\n" + plCt.getText().toString();
        if(rdNam.isChecked()==true){
            a += "\n" + rdNam.getText().toString();
        }
        else{
            a += "\n" + rdNu.getText().toString();
        }

        txtht.setText(a);
        plName.setText("");
        plSdt.setText("");
        plCt.setText("");
    }

    public void exitApp(View v){
        System.exit(0);
    }
}
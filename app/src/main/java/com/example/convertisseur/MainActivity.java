package com.example.convertisseur;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner sp1,sp2;
    EditText ed1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=findViewById(R.id.txtamount);
        sp1=findViewById(R.id.spfrom);
        sp2=findViewById(R.id.spto);
        b1=findViewById(R.id.btn1);

        String[] from = {"Dinar"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad);

        String[] to = {"Euro","USD"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double tot;
                double amount = Double.parseDouble(ed1.getText().toString());
               if(sp1.getSelectedItem().toString() == "Dinar" && sp2.getSelectedItem().toString() == "Euro")
                {
                    tot = amount*0.31;
                    Toast.makeText(getApplicationContext(),tot+"",Toast.LENGTH_LONG).show();

                }

               else if(sp1.getSelectedItem().toString() == "Dinar" && sp2.getSelectedItem().toString() == "USD")
                {
                    tot = amount*0.31;
                    Toast.makeText(getApplicationContext(),tot+"",Toast.LENGTH_LONG).show();
                }


            }
        });

    }
}
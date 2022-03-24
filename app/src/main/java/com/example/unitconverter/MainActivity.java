package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton button1;
    ImageButton button2;
    ImageButton button3;
    TextView view1;
    TextView view2;
    TextView view3;
    TextView view4;
    TextView view5;
    TextView view6;
    EditText editText;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner);

        List<String> Selection = new ArrayList<String>();
        Selection.add("Metre");
        Selection.add("Celsius");
        Selection.add("Kilograms");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Selection);
        dataAdapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);


        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        view1 = findViewById(R.id.view1);
        view2 = findViewById(R.id.view2);
        view3 = findViewById(R.id.view3);
        view4 = findViewById(R.id.view4);
        view5 = findViewById(R.id.view5);
        view6 = findViewById(R.id.view6);
        editText = findViewById(R.id.number);



        button1.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                String getContent = spinner.getSelectedItem().toString();
                double n1 = Double.parseDouble(editText.getText().toString());
                 double b = n1*100;
                 double c = n1*3.28;
                 double d = n1*39.37;
                if (getContent.equals("Metre"))
                {

                view1.setText("Centimetre");
                view2.setText("Foot");
                view3.setText("Inch");
                view4.setText(String.format("%.2f",b));
                view5.setText(String.format("%.2f",c));
                view6.setText(String.format("%.2f",d));
                }
                else
                Toast.makeText(MainActivity.this, "Please select the correct conversion icon. ", Toast.LENGTH_LONG).show();

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {
                String getContent = spinner.getSelectedItem().toString();


                if (getContent.equals("Celsius"))
                {
                    double n1 = Double.parseDouble(editText.getText().toString());
                    double b = n1*1.8+32;
                    double c = n1+273.15;

                view1.setText("Fahrenheit");
                view2.setText("Kelvin");
                view3.setText("");
                view4.setText(String.format("%.2f",b));
                view5.setText(String.format("%.2f",c));
                view6.setText("");


                }
                else
                Toast.makeText(MainActivity.this, "Please select the correct conversion icon. ", Toast.LENGTH_LONG).show();

            }
        });
              button3.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View view) {
                String getContent = spinner.getSelectedItem().toString();
                double n1 = Double.parseDouble(editText.getText().toString());
                double b = n1*1000;
                double c = n1*35.27;
                double d = n1*2.20;

                if (getContent.equals("Kilograms"))
                {

                view1.setText("Gram");
                view2.setText("Ounce(Oz)");
                view3.setText("Pound(lb)");
                view4.setText(String.format("%.2f",b));
                view5.setText(String.format("%.2f",c));
                view6.setText(String.format("%.2f",d));

                }
                else
                Toast.makeText(MainActivity.this, "Please select the correct conversion icon. ", Toast.LENGTH_LONG).show();

            }
        });









    }
}
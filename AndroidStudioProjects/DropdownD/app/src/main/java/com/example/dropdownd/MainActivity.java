package com.example.dropdownd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    Spinner spinner,spinner2;

    ArrayAdapter<CharSequence> adapter,adapter1;
    private String[] paths = {"England", "Canada", "India"};
    private Integer[] firstSalaray = {1, 20, 9};
    private Integer[] captial = {20,200,90};
    String userSelectedIndex,score = "";
    TextView result,result2;
    Integer i=0;
    Integer dddd = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.result);
        result2 = findViewById(R.id.result2);

        spinnerOne();

    spinnerTwo();
    }


    //Spinner one

    private void spinnerOne() {

         spinner = findViewById(R.id.spinner);

        // Create an ArrayAdapter using the string array and a default spinner layout
        adapter = new ArrayAdapter<CharSequence>(this,
                android.R.layout.simple_spinner_dropdown_item, paths);

        // Specify the layout to use when the list of choices appears

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                userSelectedIndex = firstSalaray[position].toString();

                result.setText(userSelectedIndex);


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

    }

    //Spinner one

    private void spinnerTwo() {

         spinner2 = findViewById(R.id.spinner2);

        // Create an ArrayAdapter using the string array and a default spinner layout
        adapter1 = new ArrayAdapter<CharSequence>(this,
                android.R.layout.simple_spinner_dropdown_item, Integer.parseInt(captial.toString()));

        // Specify the layout to use when the list of choices appears

        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        spinner2.setAdapter(adapter1);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {



                switch (position){
                    case 0:


                        break;
                    case 1:

                        break;
                        default:
                            break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

    }
}

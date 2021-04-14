package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner mainSpinner, fromUnitSpinner, toUnitSpinner;
    String fromUnit, toUnit;
    private EditText input;
    private Button button;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainSpinner = (Spinner) findViewById(R.id.mainSpinner);
        fromUnitSpinner = (Spinner) findViewById(R.id.fromUnitSpinner);
        toUnitSpinner = (Spinner) findViewById(R.id.toUnitSpinner);
        button = (Button) findViewById(R.id.convertButton);
        input = (EditText) findViewById(R.id.inputEditText);
        result = (TextView) findViewById(R.id.outputTextView);

       mainSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedType = parent.getItemAtPosition(position).toString();
                switch (selectedType) {
                    case "Weight":
                        // assigning items List defined in string.xml to the FromUnit and ToUnit Spinners
                        fromUnitSpinner.setAdapter(new ArrayAdapter<String>(MainActivity.this,
                                android.R.layout.simple_spinner_dropdown_item,
                                getResources().getStringArray(R.array.WeightUnits)));
                        toUnitSpinner.setAdapter(new ArrayAdapter<String>(MainActivity.this,
                                android.R.layout.simple_spinner_dropdown_item,
                                getResources().getStringArray(R.array.WeightUnits)));

                        break;

                    case "Length":
                        fromUnitSpinner.setAdapter(new ArrayAdapter<String>(MainActivity.this,
                                android.R.layout.simple_spinner_dropdown_item,
                                getResources().getStringArray(R.array.LengthUnits)));

                        toUnitSpinner.setAdapter(new ArrayAdapter<String>(MainActivity.this,
                                android.R.layout.simple_spinner_dropdown_item,
                                getResources().getStringArray(R.array.LengthUnits)));
                        break;

                    case "Volume":
                        fromUnitSpinner.setAdapter(new ArrayAdapter<String>(MainActivity.this,
                                android.R.layout.simple_spinner_dropdown_item,
                                getResources().getStringArray(R.array.VolumeUnits)));

                        toUnitSpinner.setAdapter(new ArrayAdapter<String>(MainActivity.this,
                                android.R.layout.simple_spinner_dropdown_item,
                                getResources().getStringArray(R.array.VolumeUnits)));
                        break;

                    case "Temperature":
                        fromUnitSpinner.setAdapter(new ArrayAdapter<String>(MainActivity.this,
                                android.R.layout.simple_spinner_dropdown_item,
                                getResources().getStringArray(R.array.TemperatureUnits)));
                        toUnitSpinner.setAdapter(new ArrayAdapter<String>(MainActivity.this,
                                android.R.layout.simple_spinner_dropdown_item,
                                getResources().getStringArray(R.array.TemperatureUnits)));
                        break;
                }

                //set divSpinner Visibility to Visible
                mainSpinner.setVisibility(View.VISIBLE);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // remain the default or previous type visible
            }
        });

        fromUnitSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                fromUnit = parent.getItemAtPosition(position).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // remain the default or previous type visible
            }

        });

        toUnitSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                toUnit = parent.getItemAtPosition(position).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // remain the default or previous type visible
            }

        });

        button.setOnClickListener(v -> {

            int thousand = 1000;
            double thousandInverse = 0.001;
            double lakhInverse = 0.000001;
            int tenLakh = 1000000;
            double centigrade = 1.8;
            double fahrenheit = 0.555;

            int inputValue = Integer.parseInt(input.getText().toString());
            String resultMessage = "";
            if (input.getText().toString().equals(""))
            {
                resultMessage = "Error";
                result.setTextColor(Color.RED);

            }
            else if (fromUnit.equals(toUnit))
            {
                resultMessage = String.format("%d", inputValue);
            }
            else if (fromUnit.equals("Kilometer") && toUnit.equals("Meter"))
            {
                int kilometer = inputValue *thousand;
                resultMessage = String.format("%d",kilometer);
            }
            else if (fromUnit.equals("Kilometer") && toUnit.equals("Inch"))
            {
                double kilometer = inputValue *3280.84;
                resultMessage = String.format("%f",kilometer);
            }
            else if (fromUnit.equals("Kilometer") && toUnit.equals("Feet"))
            {
                double kilometer = inputValue *39370.1;
                resultMessage = String.format("%f",kilometer);
            }
            else if (fromUnit.equals("Meter") && toUnit.equals("Kilometer"))
            {
                double meter = inputValue *thousandInverse;
                resultMessage = String.format("%f",meter);
            }
            else if (fromUnit.equals("Meter") && toUnit.equals("Inch"))
            {
                double meter = inputValue *39.370;
                resultMessage = String.format("%f",meter);
            }
            else if (fromUnit.equals("Meter") && toUnit.equals("Feet"))
            {
                double meter = inputValue *3.280;
                resultMessage = String.format("%f",meter);
            }
            else if (fromUnit.equals("Inch") && toUnit.equals("Kilometer"))
            {
                double inch = inputValue *2.54e-5;
                resultMessage = String.format("%f",inch);
            }
            else if (fromUnit.equals("Inch") && toUnit.equals("Feet"))
            {
                double inch = inputValue *0.0833;
                resultMessage = String.format("%f",inch);
            }
            else if (fromUnit.equals("Inch") && toUnit.equals("Meter"))
            {
                double inch = inputValue *0.0254;
                resultMessage = String.format("%f",inch);
            }
            else if (fromUnit.equals("Feet") && toUnit.equals("Inch"))
            {
                int feet = inputValue *12;
                resultMessage = String.format("%d",feet);
            }
            else if (fromUnit.equals("Feet") && toUnit.equals("Kilometer"))
            {
                double feet = inputValue *0.000304;
                resultMessage = String.format("%f", feet);
            }
            else if (fromUnit.equals("Feet") && toUnit.equals("Meter"))
            {
                double ton = inputValue *0.304;
                resultMessage = String.format("%f", ton);
            }
            else if (fromUnit.equals("Kilogram") && toUnit.equals("Gram"))
            {
                int g = inputValue * thousand;
                resultMessage = String.format("%d",g);

            }
            else if (fromUnit.equals("Kilogram") && toUnit.equals("Ton"))
            {
                Double ton = inputValue * thousandInverse;
                resultMessage = String.format("%f", ton);
            }
            else if (fromUnit.equals("Gram") && toUnit.equals("Ton"))
            {
                Double gram = inputValue * lakhInverse;
                resultMessage = String.format("%f", gram);
            }
            else if (fromUnit.equals("Gram") && toUnit.equals("Kilogram"))
            {
                Double gram = inputValue * thousandInverse;
                resultMessage = String.format("%f", gram);
            }
            else if (fromUnit.equals("Ton") && toUnit.equals("Gram"))
            {
                int tonne = inputValue * tenLakh;
                resultMessage = String.format("%d", tonne);
            }
            else if (fromUnit.equals("Ton") && toUnit.equals("Kilogram"))
            {
                int tonne = inputValue *thousand;
                resultMessage = String.format("%d",tonne);
            }
            else if (fromUnit.equals("Liter") && toUnit.equals("Milliliter"))
            {
                int liter = inputValue *thousand;
                resultMessage = String.format("%d",liter);
            }
            else if (fromUnit.equals("Milliliter") && toUnit.equals("Liter"))
            {
                double ton = inputValue *thousandInverse;
                resultMessage = String.format("%f",ton);
            }
            else if (fromUnit.equals("Centigrade") && toUnit.equals("Fahrenheit"))
            {
                double fahrenHeit = (centigrade*inputValue)+32;
                resultMessage = String.format("%f",fahrenHeit);
            }
            else if (fromUnit.equals("Fahrenheit") && toUnit.equals("Centigrade"))
            {
                double centiGrade = fahrenheit*(inputValue-32);
                resultMessage = String.format("%f",centiGrade);
            }
            else{
                //To do Nothing
            }

            result.setText(resultMessage);

        });
    }
}
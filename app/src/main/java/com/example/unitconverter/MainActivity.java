package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner mainSpinner, fromUnitSpinner, toUnitSpinner;
    String selectedType, fromUnit, toUnit;
    private EditText input;
    private Button button;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) throws NumberFormatException {
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
                selectedType = parent.getItemAtPosition(position).toString();
                switch (selectedType) {
                    case "Length":
                        fromUnitSpinner.setAdapter(new ArrayAdapter<String>(MainActivity.this,
                                android.R.layout.simple_spinner_dropdown_item,
                                getResources().getStringArray(R.array.LengthUnits)));

                        toUnitSpinner.setAdapter(new ArrayAdapter<String>(MainActivity.this,
                                android.R.layout.simple_spinner_dropdown_item,
                                getResources().getStringArray(R.array.LengthUnits)));
                        break;

                    case "Weight":
                        // assigning items List defined in string.xml to the FromUnit and ToUnit Spinners
                        fromUnitSpinner.setAdapter(new ArrayAdapter<String>(MainActivity.this,
                                android.R.layout.simple_spinner_dropdown_item,
                                getResources().getStringArray(R.array.WeightUnits)));
                        toUnitSpinner.setAdapter(new ArrayAdapter<String>(MainActivity.this,
                                android.R.layout.simple_spinner_dropdown_item,
                                getResources().getStringArray(R.array.WeightUnits)));

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
        try {
            button.setOnClickListener(v -> {

                if(input.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this,"Enter the value", Toast.LENGTH_SHORT).show();
                    return;
                }
                int inputValue = Integer.parseInt(input.getText().toString());

                Converter converter = new Converter();
                String resultMessage = converter.calculateOutput(inputValue, selectedType, fromUnit, toUnit);
                Log.e("Spinner", "onCreate: resultMessage" + resultMessage);
                result.setText(resultMessage);

            });
        }
        catch(NumberFormatException e) {
        }
    }
}

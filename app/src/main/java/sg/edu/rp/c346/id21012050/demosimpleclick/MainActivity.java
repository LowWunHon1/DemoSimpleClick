package sg.edu.rp.c346.id21012050.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button buttonDisplay;
    EditText editTextInput;
    TextView textViewDisplay;
    ToggleButton toggleButtonEnabled;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonDisplay = findViewById(R.id.buttonDisplay);
        editTextInput = findViewById(R.id.editTextInput);
        textViewDisplay = findViewById(R.id.textViewDisplay);
        toggleButtonEnabled = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.radioGroupGender);

        buttonDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt = editTextInput.getText().toString();
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.radioButtonGenderMale){
                    rgGender.check(R.id.radioGroupGender);
                    txt = "He says " + editTextInput.getText().toString();

                }
                else{
                    rgGender.check(R.id.radioGroupGender);
                    txt = "She says " + editTextInput.getText().toString();

                }
                textViewDisplay.setText(txt);
            }
        });

        toggleButtonEnabled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleButtonEnabled.isChecked()) {
                    editTextInput.setEnabled(true);
                }
                else {
                    editTextInput.setEnabled(false);
                }

            }
        });



    }
}
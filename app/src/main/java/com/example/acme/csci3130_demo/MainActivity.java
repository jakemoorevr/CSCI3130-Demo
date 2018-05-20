package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String text;

    EditText textInput;
    Button button;
    TextView displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInput = (EditText) findViewById(R.id.editText);

        button = (Button) findViewById(R.id.button);
        displayText = (TextView) findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = textInput.getText().toString();
                displayText.setText(text);
                showToast(text);
            }
        });
    }

    private void showToast (String text) {
        Toast.makeText(MainActivity.this, "Copying "+text, Toast.LENGTH_SHORT).show();
    }




}

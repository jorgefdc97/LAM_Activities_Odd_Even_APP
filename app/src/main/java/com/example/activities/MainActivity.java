package com.example.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        Intent intent;
        TextInputEditText inputText = findViewById(R.id.insertText);

        int number = Integer.parseInt(inputText.getText().toString());

        if(number%2 != 0){
            intent = new Intent(this, MainActivity2.class);
        }else{
            intent = new Intent(this, MainActivity3.class);
        }

        startActivity(intent);
    }

    public void onResume(){
        EditText editText;

        super.onResume();
        editText = findViewById(R.id.insertText);
        editText.setText("");
    }
}
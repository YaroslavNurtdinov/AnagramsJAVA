package com.example.firstlesson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public EditText userInput, ignoredChars;
    public TextView result;
    public Button btnResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userInput = findViewById(R.id.editTextTextPersonName);
        ignoredChars = findViewById(R.id.editTextTextPersonName2);
        result = findViewById(R.id.textView);
        btnResult = findViewById(R.id.button);
    }

    public void onClickStart(View view) {
        String sourceString = userInput.getText().toString();
        String ignoredCharsString = ignoredChars.getText().toString();
        result.setText(First_Lesson.rotate(sourceString, ignoredCharsString));
    }
}











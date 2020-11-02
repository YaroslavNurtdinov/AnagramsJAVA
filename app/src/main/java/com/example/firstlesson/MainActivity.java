package com.example.firstlesson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public EditText edit_text_input, edit_text_ignore;
    public TextView text_view_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit_text_input = (EditText) findViewById(R.id.edit_text_main_input);
        edit_text_ignore = (EditText) findViewById(R.id.edit_text_ignore_input);
        text_view_result = (TextView) findViewById(R.id.text_view_main);


        edit_text_input.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) { }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                text_view_result = (TextView) findViewById(R.id.text_view_main);
                String edit_text_input_String = edit_text_input.getText().toString();
                String edit_text_ignore_String = edit_text_ignore.getText().toString();

                text_view_result.setText(Anagrams.rotate(edit_text_input_String, edit_text_ignore_String));
            }
        });
    }



}











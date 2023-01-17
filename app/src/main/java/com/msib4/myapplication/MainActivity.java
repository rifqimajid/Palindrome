package com.msib4.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.*;

import android.os.Bundle;

import com.google.android.material.button.MaterialButtonToggleGroup;

public class MainActivity extends AppCompatActivity {

    private TextView textViewStatus;
    private EditText editTextInputWord;
    EditText editTextInputName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_screen);

        textViewStatus = findViewById(R.id.textViewStatus);
        editTextInputWord = findViewById(R.id.editTextTextInputWord);

        editTextInputName = findViewById(R.id.editTextTextInputName);
    }

    public void buttonCheckPalindrome(View view){

        char[] charInput = editTextInputWord.getText().toString().toCharArray();
        int intLength = charInput.length;

        boolean isPalindrome = true;

        for (int i=0; i<intLength/2; i++){
            if (charInput[i] != charInput[intLength-1-i]){
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome){
            textViewStatus.setText("Palindrome");
        }else{
            textViewStatus.setText("Not Palindrome");
        }
    }
}
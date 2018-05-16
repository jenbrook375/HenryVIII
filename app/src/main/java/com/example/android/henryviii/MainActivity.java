package com.example.android.henryviii;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.android.henryviii.R;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the Submit button is clicked.
     */
    public void submit(View view) {
        int score = 0;

        /** Question 1 correct answer field England*/
        EditText text = findViewById(R.id.question1);
        String answer = text.getText().toString();

        if (answer.equals("ENGLAND")) {
            score = score + 1;
        }

        /** Question 2 correct answer (cspain)*/
        RadioButton answer_2;
        answer_2 = findViewById(R.id.cspain);
        answer_2.isChecked();
        if (answer_2.isChecked()) {
            score = score + 1;
        }

        /** Question 3 correct answer(elizabeth)*/
        RadioButton answer_3;
        answer_3 = findViewById(R.id.elizabeth);
        answer_3.isChecked();
        if (answer_3.isChecked()) {
            score = score + 1;
        }

        /** Question 4 correct answer(birth)*/
        RadioButton answer_4;
        answer_4 = findViewById(R.id.birth);
        answer_4.isChecked();
        if (answer_4.isChecked()) {
            score = score + 1;
        }

        /** Question 5 correct answer(friends)*/
        RadioButton answer_5;
        answer_5 = findViewById(R.id.friends);
        answer_5.isChecked();
        if (answer_5.isChecked()) {
            score = score + 1;
        }

        /** Question 6 correct answer(fornication)*/
        RadioButton answer_6;
        answer_6 = findViewById(R.id.fornication);
        answer_6.isChecked();
        if (answer_6.isChecked()) {
            score = score + 1;
        }

        /** Question 7 correct answer(outlived)*/
        RadioButton answer_7;
        answer_7 = findViewById(R.id.outlived);
        answer_7.isChecked();
        if (answer_7.isChecked()) {
            score = score + 1;
        }

        // extra credit quest 1 checkbox
        CheckBox  checkbox_1= (CheckBox) findViewById(R.id.chkbx_1);
        boolean  excr_1= checkbox_1.isChecked();

        // adds 1 point if extra credit question is checked
        if (excr_1){
            score = score + 1;
        }

        // extra credit quest 2 checkbox
        CheckBox checkbox_2 = (CheckBox) findViewById(R.id.chkbx_2);
        boolean excr_2 = checkbox_2.isChecked();

        // adds 1 point if extra credit question is checked
        if (excr_2) {
            score = score + 1;
        }

        // extra credit quest 3 checkbox
        CheckBox checkbox_3 = (CheckBox) findViewById(R.id.chkbx_3);
        boolean excr_3 = checkbox_3.isChecked();

        // adds 1 point if extra credit question is checked
        if (excr_3) {
            score = score + 1;
        }

          if (score >= 7) {
            Toast.makeText(this, R.string.perfect,Toast.LENGTH_LONG).show();
        } else if (score == 6) {
            Toast.makeText(this, R.string.history, Toast.LENGTH_LONG).show();
        } else if (score == 5) {
            Toast.makeText(this, R.string.thanks, Toast.LENGTH_LONG).show();
        }
        else if (score <=4){
            Toast.makeText(this, R.string.less,Toast.LENGTH_LONG).show();
          }
    }

}






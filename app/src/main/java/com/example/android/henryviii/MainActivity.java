package com.example.android.henryviii;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.android.henryviii.R;


public class MainActivity extends AppCompatActivity {

    int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the Submit button is clicked.
     */
    public void submit(View view) {

        /** Question 1 (england)*/
        RadioButton england;
        england = findViewById(R.id.england);
        england.isChecked();
        if (england.isChecked()) {
            score = score + 1;
            Log.v("MyActivity", "score" + score);
        }

        /** Question 2 (cspain)*/
        RadioButton cspain;
        cspain = findViewById(R.id.cspain);
        cspain.isChecked();
        if (cspain.isChecked()) {
            score = score + 1;
        }

        /** Question 3 (elizabeth)*/
        RadioButton elizabeth;
        elizabeth = findViewById(R.id.elizabeth);
        elizabeth.isChecked();
        if (elizabeth.isChecked()) {
            score = score + 1;
        }

        /** Question 4 (birth)*/
        RadioButton birth;
        birth = findViewById(R.id.birth);
        birth.isChecked();
        if (birth.isChecked()) {
            score = score + 1;
        }

        /** Question 5 (friends)*/
        RadioButton friends;
        friends = findViewById(R.id.friends);
        friends.isChecked();
        if (friends.isChecked()) {
            score = score + 1;
        }

        /** Question 6 (fornication)*/
        RadioButton fornication;
        fornication = findViewById(R.id.fornication);
        fornication.isChecked();
        if (fornication.isChecked()) {
            score = score + 1;
        }

        /** Question 7 (outlived)*/
        RadioButton a7;
        a7 = findViewById(R.id.a7);
        a7.isChecked();
        if (a7.isChecked()) {
            score = score + 1;
        }


          if (score == 7) {
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






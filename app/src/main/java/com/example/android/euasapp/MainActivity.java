package com.example.android.euasapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton opt1;
    RadioButton opt2;
    RadioButton opt3;
    RadioButton opt4;
    RadioButton opt5;
    int answer = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public int onRadioButtonClicked(View view) {

        // Check to see if a button has been clicked.
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked.
        switch (view.getId()) {
            // Option 1 was picked
            case R.id.opt1:
                if (checked) {
                    answer += 0;
                }
                    break;
            // Option 2 was picked
            case R.id.opt2:
                if (checked){
                    answer += 0;
                }
                    break;
            // Option 3 was picked
            case R.id.opt3:
                if (checked) {
                    answer += 0;
                }
                    break;
            // Option 4 was picked
            case R.id.opt4:
                if (checked) {
                    answer = answer + 1;
                    return answer;
                }
                break;
            //Option 5 was picked
            case R.id.opt5:
                if (checked){
                    answer += 0;
                }
                    break;
        }



        public void submitTest(View view) {
            answer = (RadioButton) findViewById(R.id.opt4);
    }


    /**
     * This method displays the result on the screen./method is defined
     */
    private void displayAnswer(int mass) {
        TextView resultTextView = findViewById(R.id.result);
        resultTextView.setText(String.format(getString(R.string.displayAnswer), mass));
    }
}






package com.example.register;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.view.View;
import android.widget.EditText;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void onBtnClick (View view) {
            TextView textViewFirst = findViewById

                            (R.id.textViewFirst);
            EditText editTxtFirst =  findViewById

                            (R.id.editTxtFirst);
            editTxtFirst.getText().toString();

            textViewFirst.setText(editTxtFirst.getText().toString());





            TextView textViewLast = findViewById

                            (R.id.textViewLast);
            EditText editTxtLast =  findViewById

                            (R.id.editTxtLast);
            editTxtLast.getText().toString();

            textViewLast.setText(editTxtLast.getText().toString());






            TextView textViewEmail = findViewById

                            (R.id.textViewEmail);
            EditText editTxtEmail =  findViewById

                            (R.id.editTxtEmail);
            editTxtEmail.getText().toString();

            textViewEmail.setText(editTxtEmail.getText().toString());





    }
}
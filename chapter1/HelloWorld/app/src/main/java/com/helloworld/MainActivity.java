package com.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.TextValueSanitizer;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = findViewById(R.id.textView);
        final Button button = findViewById(R.id.btn1);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.d("MainActivity","clicked");
                textView.setText("clicked");
            }
        });

    }
}

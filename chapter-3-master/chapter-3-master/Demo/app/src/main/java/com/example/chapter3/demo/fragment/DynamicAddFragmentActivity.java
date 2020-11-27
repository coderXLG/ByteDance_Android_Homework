package com.example.chapter3.demo.fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.chapter3.demo.R;

public class DynamicAddFragmentActivity extends AppCompatActivity {
    private Button mReplace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_add_fragment);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragment_container, new FragmentA())
                .commit();

        mReplace = findViewById(R.id.btn_replace_fragment);
        mReplace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
//                transaction.addToBackStack(null);
                transaction.replace(R.id.fragment_container,new FragmentB());
                transaction.commit();
//
//                getSupportFragmentManager()
//                        .beginTransaction()
//                        .replace(R.id.fragment_container, new FragmentB())
//                        .commit();
//
            }
        });
    }
}

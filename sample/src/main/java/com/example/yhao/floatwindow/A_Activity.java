package com.example.yhao.floatwindow;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.yhao.fixedfloatwindow.R;

public class A_Activity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        setTitle("A");
    }

    public void change(View view) {
        startActivity(new Intent(this, B_Activity.class));
    }
}

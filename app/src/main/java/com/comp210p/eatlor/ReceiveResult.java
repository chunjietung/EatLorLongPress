package com.comp210p.eatlor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveResult extends AppCompatActivity {

    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_result);
        Intent intent = getIntent();
        String passResult = intent.getExtras().getString("new");
        resultView = (TextView) findViewById(R.id.resultView);
        resultView.setText(passResult);
    }
}

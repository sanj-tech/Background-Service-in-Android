package com.jsstech.serviceexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button start, stop, next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (Button) findViewById(R.id.start);
        stop = (Button) findViewById(R.id.stop);
        next = (Button) findViewById(R.id.next);

        start.setOnClickListener(this);
        stop.setOnClickListener(this);
        next.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.start:
                startService(new Intent(this, MyService.class));
                break;
            case R.id.stop:
                stopService(new Intent(this, MyService.class));
                break;

            case R.id.next:
                Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);
                startActivity(intent);

                break;
        }

    }
}
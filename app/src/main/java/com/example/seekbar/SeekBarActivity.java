package com.example.seekbar;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SeekBarActivity extends AppCompatActivity {

    public static void start(Context context) {
        context.startActivity(new Intent(context, SeekBarActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar);
    }
}

package com.aiden.storagescope;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentProvider;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mQueryRequestBtn = null;
    private ContentProvider mContentProvider = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    
}
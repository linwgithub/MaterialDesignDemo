package com.linw.materialdesigndemo;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    View mainView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainView = findViewById(R.id.drawer_layout);
    }

    public void showSnackBar(View view) {
        Snackbar.make(mainView,"I am SnackBar",Snackbar.LENGTH_SHORT).show();
    }

    public void showSnackBarWithAction(View view) {
        Snackbar.make(mainView,"I am SnackBar",Snackbar.LENGTH_SHORT).setAction("Action", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Toast frome SnackBar", Toast.LENGTH_LONG).show();
            }
        }).show();
    }
}

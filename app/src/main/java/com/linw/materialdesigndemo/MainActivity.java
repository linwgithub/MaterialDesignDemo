package com.linw.materialdesigndemo;

import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    View mainView;
    NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainView = findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        setNavigationClickListener();
    }

    /**
     * 侧滑菜单点击响应
     */
    private void setNavigationClickListener() {
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_item_home:
                        Snackbar.make(mainView, "首页", Snackbar.LENGTH_LONG).show();
                        break;
                    case R.id.navigation_item_blog:
                        Snackbar.make(mainView, "博客", Snackbar.LENGTH_LONG).show();
                        break;
                    case R.id.navigation_item_about:
                        Snackbar.make(mainView, "关于", Snackbar.LENGTH_LONG).show();
                        break;
                }
                return false;
            }
        });
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

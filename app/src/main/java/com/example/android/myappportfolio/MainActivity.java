package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void launchApp(View view) {
         switch (view.getId()) {
            case R.id.app1:
                // handle app1 button  click;
                String string1 = getString(R.string.app_1);
                Toast.makeText(MainActivity.this,
                        "This button will launch " + string1 + "!", Toast.LENGTH_LONG).show();
                break;
            case R.id.app2:
                // handle app2 button click;
                String string2 = getString(R.string.app_2);
                Toast.makeText(MainActivity.this,
                        "This button will launch " + string2 + "!", Toast.LENGTH_LONG).show();
                break;
            // handle app3 button  click;
            case R.id.app3:
                String string3 = getString(R.string.app_3);
                Toast.makeText(MainActivity.this,
                        "This button will launch " + string3 + "!", Toast.LENGTH_LONG).show();
                break;
            // handle app4 button click;
            case R.id.app4:
                String string4 = getString(R.string.app_4);
                Toast.makeText(MainActivity.this,
                        "This button will launch " + string4 + "!", Toast.LENGTH_LONG).show();
                break;
            // handle app5 button click;
            case R.id.app5:
                String string5 = getString(R.string.app_5);
                Toast.makeText(MainActivity.this,
                        "This button will launch " + string5 + "!", Toast.LENGTH_LONG).show();
            default:
        }
    }
}

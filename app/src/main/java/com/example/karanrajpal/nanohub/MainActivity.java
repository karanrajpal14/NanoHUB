package com.example.karanrajpal.nanohub;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
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

    public void showToast(View view) {
        Button button = (Button) view;
        switch (view.getId()) {
            case (R.id.popular_movies_button):
                Toast.makeText(getApplicationContext(), button.getText().toString() + " project is under development", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.stock_hawk_button):
                Toast.makeText(getApplicationContext(), button.getText().toString() + " project is under development", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.build_it_bigger_button):
                Toast.makeText(getApplicationContext(), button.getText().toString() + " project is under development", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.make_your_app_material_button):
                Toast.makeText(getApplicationContext(), button.getText().toString() + " project is under development", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.go_ubiquitous_button):
                Toast.makeText(getApplicationContext(), button.getText().toString() + " project is under development", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.capstone_button):
                Toast.makeText(getApplicationContext(), button.getText().toString() + " project is under development", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}

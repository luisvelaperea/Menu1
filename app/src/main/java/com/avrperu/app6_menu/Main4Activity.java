package com.avrperu.app6_menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu j) {
        getMenuInflater().inflate(R.menu.menuuno,j);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.opcion1:
                startActivity(new Intent(this,MainActivity.class));
                return true;
            case R.id.opcion2:
                startActivity(new Intent(this,Main2Activity.class));
                return true;
            case R.id.opcion3:
                startActivity(new Intent(this,Main4Activity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }
}

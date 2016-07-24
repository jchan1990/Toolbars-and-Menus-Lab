package com.example.qube.toolbars_and_menus_lab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class TED extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ted);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.ted_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case android.R.id.home:
                onNavigateUp();
                return true;

            case R.id.back:
                startActivity(new Intent(TED.this, MainActivity.class));
                Toast.makeText(TED.this, "Bye bye now", Toast.LENGTH_SHORT).show();
                finish();
                return true;

            case R.id.tedTalk:
                startActivity(new Intent(TED.this, MainActivity.class));
                Toast.makeText(TED.this, "Bye bye now", Toast.LENGTH_SHORT).show();
                finish();
                return true;

            case R.id.share:
                Toast.makeText(TED.this, "Sharing is caring", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.bookbark:
                Toast.makeText(TED.this, "Save this", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.download:
                Toast.makeText(TED.this, "Downloading files now", Toast.LENGTH_SHORT).show();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

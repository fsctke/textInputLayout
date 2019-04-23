package com.example.edittexter;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toolbar myToolBar;
    TextInputEditText user;
    TextInputEditText pass;
    ConstraintLayout myConstraintLayout;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myConstraintLayout = findViewById(R.id.myConstraint);
        myConstraintLayout.setOnContextClickListener(null);


// user and pass variables need to be declared (TextInputEditText)
        user = (TextInputEditText) findViewById(R.id.text1);
        pass = (TextInputEditText) findViewById(R.id.text2);

        user.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                System.out.println(s);
            }
        });


        //change styles.xml theme to NoActionBar, create a toolbar in visual mode link it to the code below in onCreate override
        myToolBar = findViewById(R.id.myToolbar);
        setSupportActionBar(myToolBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    //rightclick res folder>new>android resource file>menu
    //add this code in mainactivity class after closing onCreate override
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.item1) {
            Toast.makeText(this, "item1 clicked", Toast.LENGTH_SHORT).show();
            //right click java folder->new>activity>empty Activity
            //   Intent myIntent = new Intent(getApplicationContext(), popUpPage1.class);
            //   startActivity(myIntent);

        } else if (id == R.id.item2) {

            Toast.makeText(this, "item2 clicked", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.searcher) {

            Toast.makeText(this, "item3 clicked", Toast.LENGTH_SHORT).show();


        }

        return super.onOptionsItemSelected(item);
    }


}

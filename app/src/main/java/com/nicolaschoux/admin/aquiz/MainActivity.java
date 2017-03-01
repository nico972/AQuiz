package com.nicolaschoux.admin.aquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void make(View view){
        Intent intent = new Intent(this, CreateQuestion.class);
        startActivity(intent);


    }

    public void practice(View view){
        Intent intent = new Intent(this,Practice.class);

        startActivity(intent);


    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
//dfhksdjfhlkjshdf dflkajhsdf
//Hello world !


//Hello

//This is Jules
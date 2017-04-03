package com.nicolaschoux.admin.aquiz;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //Button addQuestion;

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

       /* addQuestion = (Button) findViewById(R.id.addq);
        addQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);

                View mView = getLayoutInflater().inflate(R.layout.question, null);

            }
        }); */
    }
}
//dfhksdjfhlkjshdf dflkajhsdf
//Hello world !


//Hello

//This is Jules
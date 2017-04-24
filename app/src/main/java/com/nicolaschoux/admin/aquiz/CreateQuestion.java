package com.nicolaschoux.admin.aquiz;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateQuestion extends AppCompatActivity {


	EditText input ;
	Button ShowBtn;
	//This is while I am waiting for Jules to actually create the pop up box that will let you enter the question and the answer
    private static String question_entered = "What is the capital of France ? ";
    private static String answer_entered = "Paris";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_question);
		OnClickQuestion();
		OnClickAnswer();



		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("Enter Your Question");
		builder.setIcon(R.mipmap.ic_launcher);
		builder.setMessage("Enter your question here");



		input = new EditText(this);

		builder.setView(input);

		builder.setPositiveButton("Save", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				String txt= input.getText().toString();
				Toast.makeText(getApplicationContext(),txt,Toast.LENGTH_SHORT).show();
				dialog.dismiss();
			}
		});


		builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {

			}
		});

		// CREATE THE DIALOG
		final AlertDialog ad = builder.create();

		ShowBtn =(Button) findViewById(R.id.question_button);

		ShowBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				ad.show();

			}
		});


	}




   public void OnClickQuestion(){
	   final Button question_button = (Button)findViewById(R.id.question_button);
	   question_button.setOnClickListener(new View.OnClickListener(){
		   @Override
		   public void onClick(View view) {
			   question_button.setText(question_entered);
		   }
	   });
   }

   public void OnClickAnswer(){
   		final Button answer_button = (Button)findViewById(R.id.answer_button);
   		answer_button.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View view) {
				answer_button.setText(answer_entered);
			}

   		});
   }


		

	
	/*
    @Override
	public void onClick(View view) {
	    super.onClick(view);
	    switch (view.getId()) {

	    case R.id.question_button:
	    question_button.setText("This is the new question !"); 
	    break;

	    case R.id.answer_button:
	    answer_button.setText("This is the new answer ! "); 
	    break;
	   
	    }
	}
	*/
   
}

 //Option 1 for the button ! 
    /*
    Button question_button = (Button)findViewById(R.id.question_button);
    question_button.setOnClickListener(new OnClickListener() {
    	@Override
   		public void onClick(View v) {
      	// question_button was clicked!
   			question_button.setText("This is the new question !"); 
    	}
    }); 

    Button answer_button = (Button)findViewById(R.id.answer_button);
    question_button.setOnClickListener(new OnClickListener()){
    	@Override
    	public void onClick(View v) {
      	// question_answer was clicked!
   			answer_button.setText("This is the new answer ! "); 
    	}

    });
    */ 


/*
  @Override
public void onClick(View view) {
    super.onClick(view);
    switch (view.getId()) {
    case R.id.download:
    //code..
    break;
    case R.id.play:
    //code..
    break;
    case R.id.pause:
        //code..
    break;
    default:
        //code..
    break;
    }
}


*/
package com.nicolaschoux.admin.aquiz;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreateQuestion extends AppCompatActivity {
	//This is while I am waiting for Jules to actually create the pop up box that will let you enter the question and the answer
    private static String question_entered = "What is the capital of France ? ";
    private static String answer_entered = "Paris";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_question);
		OnClickQuestion();
		OnClickAnswer();

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
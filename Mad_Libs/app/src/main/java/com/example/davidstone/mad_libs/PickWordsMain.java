package com.example.davidstone.mad_libs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class PickWordsMain extends AppCompatActivity {

    private List<EditText> answers;
    private Button submit;


    public static final String EXTRA_ENTRIES_STORAGE = "EXTRA_ENTRIES_STORAGE";



    EditText mFirstAdjective;
    EditText mSecondAdjective;
    EditText mFirstNoun;
    EditText mSecondNoun;
    EditText mAnimals;
    EditText mGameName;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_words_main);

/*
        mFirstAdjective = (EditText) findViewById(R.id.adjective1);
        mSecondAdjective = (EditText) findViewById(R.id.adjective2);
        mFirstNoun = (EditText) findViewById(R.id.noun1);
        mSecondNoun = (EditText) findViewById(R.id.noun2);
        mAnimals = (EditText) findViewById(R.id.animals);
        mGameName = (EditText) findViewById(R.id.name);
        mSubmit = (Button) findViewById(R.id.submit);   */

        answers = new ArrayList<>();
        answers.add((EditText) findViewById(R.id.noun1));
        answers.add((EditText) findViewById(R.id.noun2));
        answers.add((EditText) findViewById(R.id.adjective1));
        answers.add((EditText) findViewById(R.id.adjective2));
        answers.add((EditText) findViewById(R.id.animals));
        answers.add((EditText) findViewById(R.id.name));

        submit = (Button) findViewById(R.id.submit);
        View.OnClickListener clickSubmit = new View.OnClickListener() {
            public void onClick(View view) {

                Intent intent = new Intent(view.getContext(), Result.class);

                int i = 0;
                for (EditText answer: answers) {
                    String key = EXTRA_ENTRIES_STORAGE + i;
                    intent.putExtra(key, answer.getText().toString());
                    i++;
                }
                    //will pass a kind of keyset paramete
                // intent.putExtra("Extra_Sender, "John Smith")
                //the manually pass values into IDs in the XML file
                startActivity(intent);
            }
    };
        submit.setOnClickListener(clickSubmit);
    }
}

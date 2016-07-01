package com.example.davidstone.mad_libs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    private TextView mTextView;
    private Button mButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        mTextView = (TextView) findViewById(R.id.results);


        String[] entries = new String[6];
        String result = "";
        for (int i = 0; i < entries.length; i++) {
            String key = PickWordsMain.EXTRA_ENTRIES_STORAGE + i;
            entries[i] = intent.getStringExtra(key);
        }


        result = String.format(getString(R.string.givenText), entries[0], entries[1], entries[2], entries[3], entries[4], entries[5]);
        mTextView.setText(result);

  /*      mButton.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick (View view){
            startActivity(new Intent(view.getContext(), PickWordsMain.class));
        }

    }); */
}
}




//get string >> put values from intent into string and output the new string
/*String[] answers = new String[6];
 +        String finalMadLib = "";
 +        for (int i = 0; i < answers.length; i++) {
 +            String key = WordEntryActivity.EXTRA_ENTRIES_KEY_BASE + i;
 +            answers[i] = intent.getStringExtra(key);
 +            Log.d("Mad Lib", key);
 +        }
 +
 +
 + finalMadLib = String.format(getString(R.string.mad_lib1), answers[0], answers[1], answers[2], answers[3], answers[4], answers[5]);
 + mTextView.setText(finalMadLib);*/
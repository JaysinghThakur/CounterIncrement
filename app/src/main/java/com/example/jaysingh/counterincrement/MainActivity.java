package com.example.jaysingh.counterincrement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button ourButton;
    private TextView ourMessage;
    private int numTimesClicked = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ourButton = (Button) findViewById(R.id.button);
        ourMessage = (TextView) findViewById(R.id.textView);


        ourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                numTimesClicked = numTimesClicked + 1;
                String result = "The button got tapped " + numTimesClicked + " time";
                if(numTimesClicked != 1) {
                    result += "s...";
                }
                ourMessage.setText(result);

            }
        });



    }
}

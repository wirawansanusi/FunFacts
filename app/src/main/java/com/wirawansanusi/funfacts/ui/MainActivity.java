package com.wirawansanusi.funfacts.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.wirawansanusi.funfacts.model.ColorPallete;
import com.wirawansanusi.funfacts.model.FunFacts;
import com.wirawansanusi.funfacts.R;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    FunFacts funFacts;
    ColorPallete colorPallete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Init view from layout activity
        final TextView factTextView = (TextView) findViewById(R.id.factTextView);
        final View relativeLayout = findViewById(R.id.relativeLayout);
        final Button showFactButton = (Button) findViewById(R.id.factButton);

        // Init Models
        final FunFacts funFacts = new FunFacts();
        final ColorPallete colorPallete = new ColorPallete();

        // Get total fact
        final int totalFact = funFacts.getTotalFact();

        // Add a listener attached to the button
        showFactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Generate random number
                Random random = new Random();
                int randomNumber = random.nextInt(totalFact);

                // Get the correspondence fact & color
                String fact = funFacts.getFact(randomNumber);
                int color = colorPallete.getColor(randomNumber);

                // Assign it into the view
                factTextView.setText(fact);
                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
            }
        });
    }
}

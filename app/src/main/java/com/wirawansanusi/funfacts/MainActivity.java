package com.wirawansanusi.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    FunFacts funFacts;
    ColorPallete colorPallete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView factTextView = (TextView) findViewById(R.id.factTextView);
        final View relativeLayout = (View) findViewById(R.id.relativeLayout);
        final Button showFactButton = (Button) findViewById(R.id.factButton);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                funFacts = new FunFacts();
                String fact = funFacts.getFact();
                colorPallete = new ColorPallete();
                int color = colorPallete.getColor();

                factTextView.setText(fact);
                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
            }
        };
        showFactButton.setOnClickListener(listener);
    }
}

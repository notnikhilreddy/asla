package com.example.nikhilreddy.ass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Chap4_3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chap4_3);

        final CardView chap4_3_1Card = (CardView) findViewById(R.id.chap4_3_1Card);
        final CardView chap4_3_2Card = (CardView) findViewById(R.id.chap4_3_2Card);
        final CardView chap4_3_3Card = (CardView) findViewById(R.id.chap4_3_3Card);
        final CardView chap4_3_4Card = (CardView) findViewById(R.id.chap4_3_4Card);

        chap4_3_1Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap4_3Activity.this, displayContent.class);
                display_intent.putExtra("topic",4_3_1);
                startActivity(display_intent);
            }
        });
        chap4_3_2Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap4_3Activity.this, displayContent.class);
                display_intent.putExtra("topic",4_3_1);
                startActivity(display_intent);
            }
        });
        chap4_3_3Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap4_3Activity.this, displayContent.class);
                display_intent.putExtra("topic",4_3_3);
                startActivity(display_intent);
            }
        });
        chap4_3_4Card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent display_intent = new Intent(Chap4_3Activity.this, displayContent.class);
                display_intent.putExtra("topic",4_3_4);
                startActivity(display_intent);
            }
        });
    }
}

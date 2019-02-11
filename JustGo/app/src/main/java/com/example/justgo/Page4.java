package com.example.justgo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Page4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_4);

        final ImageView yes_pressed = (ImageView) findViewById(R.id.yes_pressed);
        final ImageView no_pressed = (ImageView) findViewById(R.id.no_pressed);

        // 클릭시 선택된다.
        yes_pressed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yes_pressed.setPressed(true);
            }
        });
        no_pressed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                no_pressed.setPressed(true);
            }
        });
    }
}

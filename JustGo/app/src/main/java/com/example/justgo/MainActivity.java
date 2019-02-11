package com.example.justgo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CheckBox coffee_selected = (CheckBox) findViewById(R.id.coffee_selected);
        final CheckBox lotto_selected = (CheckBox) findViewById(R.id.lotto_selected);
        final CheckBox traffic_selected = (CheckBox) findViewById(R.id.traffic_selected);
        final CheckBox smoke_selected = (CheckBox) findViewById(R.id.smoke_selected);
        final CheckBox drink_selected = (CheckBox) findViewById(R.id.drink_selected);
        final ImageView next_pressed = (ImageView) findViewById(R.id.next_pressed);

        // 클릭시 선택된다.
        coffee_selected.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (((CheckBox)view).isChecked()) {
                    // TODO : CheckBox is checked.
                    coffee_selected.setSelected(true);
                } else {
                    // TODO : CheckBox is unchecked.
                    coffee_selected.setSelected(false);
                }

            }
        });
        lotto_selected.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (((CheckBox)view).isChecked()) {
                    // TODO : CheckBox is checked.
                    lotto_selected.setSelected(true);
                } else {
                    // TODO : CheckBox is unchecked.
                    lotto_selected.setSelected(false);
                }
            }
        });
        traffic_selected.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (((CheckBox)view).isChecked()) {
                    // TODO : CheckBox is checked.
                    traffic_selected.setSelected(true);
                } else {
                    // TODO : CheckBox is unchecked.
                    traffic_selected.setSelected(false);
                }
            }
        });
        smoke_selected.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (((CheckBox)view).isChecked()) {
                    // TODO : CheckBox is checked.
                    smoke_selected.setSelected(true);
                } else {
                    // TODO : CheckBox is unchecked.
                    smoke_selected.setSelected(false);
                }
            }
        });
        drink_selected.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (((CheckBox)view).isChecked()) {
                    // TODO : CheckBox is checked.
                    drink_selected.setSelected(true);
                } else {
                    // TODO : CheckBox is unchecked.
                    drink_selected.setSelected(false);
                }
            }
        });
        next_pressed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next_pressed.setPressed(true);
            }
        });
    }



}

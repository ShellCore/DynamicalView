package com.shellcore.android.dynamicalview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int countTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countTextView = 0;

        final LinearLayout linearLayout = (LinearLayout) findViewById(R.id.lnr_content);

        final Button button = (Button) findViewById(R.id.btn_add_element);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeBackgroundColor(linearLayout);
                addTextView(linearLayout);
            }
        });
    }

    private void changeBackgroundColor(LinearLayout linearLayout) {
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        linearLayout.setBackgroundColor(color);
    }

    private void addTextView(LinearLayout linearLayout) {
        TextView txtView = new TextView(this);
        txtView.setText("Text view " + countTextView++);
        txtView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        linearLayout.addView(txtView);
    }
}

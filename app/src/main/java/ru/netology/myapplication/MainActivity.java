package ru.netology.myapplication;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout linLayout = findViewById(R.id.root);

        LinearLayout.LayoutParams lpView =
                new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT);

        lpView.gravity = Gravity.CENTER;
        lpView.weight = 1;
        lpView.leftMargin = 1;

        TextView tv = new TextView(this);
        tv.setText("TextView");
        tv.setGravity(Gravity.CENTER);

        tv.setLayoutParams(lpView);

        linLayout.addView(tv);

        Button btn = new Button(this);
        btn.setText("Button");

        linLayout.addView(btn, lpView);
    }
}

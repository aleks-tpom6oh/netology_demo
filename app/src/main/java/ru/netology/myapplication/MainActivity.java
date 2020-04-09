package ru.netology.myapplication;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example9);

        TextView textViewFromCode = new TextView(this);

        textViewFromCode.setText("Text");

        RelativeLayout.LayoutParams relativeLp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        relativeLp.addRule(RelativeLayout.BELOW, R.id.b98);
        relativeLp.addRule(RelativeLayout.ALIGN_PARENT_END);

        textViewFromCode.setLayoutParams(relativeLp);

        ViewGroup root = findViewById(R.id.root);

        root.addView(textViewFromCode);


        /*RelativeLayout root = findViewById(R.id.root);

        TextView newButton = new TextView(this);
        newButton.setText("From code");

        RelativeLayout.LayoutParams lpView =
                new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);
        lpView.addRule(RelativeLayout.BELOW, R.id.field5);
        lpView.addRule(RelativeLayout.CENTER_HORIZONTAL);

        newButton.setLayoutParams(lpView);

        root.addView(newButton);*/

              /*  Button signup = findViewById(R.id.signup);
        final Button login = findViewById(R.id.login);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (login.getVisibility() == View.VISIBLE) {
                    login.setVisibility(View.GONE);
                } else {
                    login.setVisibility(View.VISIBLE);
                }
            }
        });*/

       /* RelativeLayout linLayout = findViewById(R.id.root);

        RelativeLayout.LayoutParams lpView =
                new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                        9000);

        lpView.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        lpView.leftMargin = 1;

        TextView tv = new TextView(this);
        tv.setText("TextView");
        tv.setGravity(Gravity.CENTER);

        tv.setLayoutParams(lpView);

        linLayout.addView(tv);

        Button btn = new Button(this);
        btn.setText("Button");

        linLayout.addView(btn, lpView);*/
    }


}

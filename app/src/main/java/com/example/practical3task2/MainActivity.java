package com.example.practical3task2;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    int value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Even Counter (02, 14, 43)");
        Button increment_btn = findViewById(R.id.increment_btn), reset_btn = findViewById(R.id.reset_btn);
        TextView txt = findViewById(R.id.counter_view);
        value = Integer.parseInt(txt.getText().toString());
        increment_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value +=2;
                txt.setText(String.valueOf(value));
            }
        });
        reset_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value = 0;
                txt.setText(String.valueOf(value));
            }
        });
    }
}

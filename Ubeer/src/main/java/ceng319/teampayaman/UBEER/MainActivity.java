package ceng319.teampayaman.UBEER;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ceng319.teampayaman.UBEER.R;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button;
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                Intent x = new Intent(MainActivity.this,ActivityLogin.class);
                startActivity(x);
                break;
        }
    }
}
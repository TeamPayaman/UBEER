package ceng319.teampayaman.UBEER;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityLogin extends AppCompatActivity implements View.OnClickListener {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button button = findViewById(R.id.loginBtn);
        button.setOnClickListener(this);
    }
    public void onClick(View view) {
        Intent i = new Intent(ActivityLogin.this,ubeermain.class);
        startActivity(i);
    }
}
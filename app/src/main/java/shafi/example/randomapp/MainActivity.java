package shafi.example.randomapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnThrowJab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnThrowJab = findViewById(R.id.btnThrowJab);

        final Boxer firstBoxer = new Boxer();
        btnThrowJab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                firstBoxer.throwJab();
                Toast.makeText(MainActivity.this,firstBoxer.throwJab(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}

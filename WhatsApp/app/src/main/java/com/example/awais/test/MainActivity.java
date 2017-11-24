package com.example.awais.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static Button sign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sign=(Button) findViewById(R.id.next);
        sign.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {

                        try{
                            Intent intent = new Intent("com.example.awais.test.mainPage");
                            startActivity(intent);
                        }
                        catch (Exception e){
                            Toast.makeText(MainActivity.this,"Exception in intent",Toast.LENGTH_SHORT).show();
                        }

                    }

        });

}

}
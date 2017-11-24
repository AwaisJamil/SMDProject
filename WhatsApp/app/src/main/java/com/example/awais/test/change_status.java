package com.example.awais.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class change_status extends AppCompatActivity {

    TextView sign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_status);

        sign=(TextView) findViewById(R.id.textView7);
        sign.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {

                        try{
                            Intent intent = new Intent("com.example.awais.test.status2");
                            startActivity(intent);
                        }
                        catch (Exception e){
                            Toast.makeText(change_status.this,"Exception in intent",Toast.LENGTH_SHORT).show();
                        }

                    }

                });
    }
}

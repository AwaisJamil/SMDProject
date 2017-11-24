package com.example.awais.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class setting extends AppCompatActivity {

    private TextView sign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        sign=(TextView) findViewById(R.id.tv_profile_features);
        sign.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {

                        try{
                            //Intent intent =new Intent("com.example.awais.myapplication.gallery");
                            //startActivity(intent);

                            Intent intent = new Intent("com.example.awais.test.updateProfileF");
                            startActivity(intent);
                        }
                        catch (Exception e){
                            Toast.makeText(setting.this,"Exception in intent",Toast.LENGTH_SHORT).show();
                        }

                    }

                });
    }
}

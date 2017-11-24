package com.example.awais.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class updateProfileF extends AppCompatActivity {

    private TextView sign,sign2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_profile_f);

        sign=(TextView) findViewById(R.id.name);
        sign.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {

                        try{
                            Intent intent = new Intent("com.example.awais.test.changeUName");
                            startActivity(intent);
                        }
                        catch (Exception e){
                            Toast.makeText(updateProfileF.this,"Exception in intent",Toast.LENGTH_SHORT).show();
                        }

                    }

                });

        sign2=(TextView) findViewById(R.id.status);
        sign2.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {

                        try{
                            Intent intent = new Intent("com.example.awais.test.change_status");
                            startActivity(intent);
                        }
                        catch (Exception e){
                            Toast.makeText(updateProfileF.this,"Exception in intent",Toast.LENGTH_SHORT).show();
                        }

                    }

                });



    }
}

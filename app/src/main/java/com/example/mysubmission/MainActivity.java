package com.example.mysubmission;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.elsunhoty.rulerpicker.lib.RulerView;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity {
    RulerView centimeter , inches;
    SwitchCompat sw;
    boolean isPossible = true;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        centimeter = findViewById(R.id.centimeter);
        btn = findViewById(R.id.signupButton);
        inches = findViewById(R.id.inches);
        inches.setVisibility(View.INVISIBLE);
        sw = findViewById(R.id.switch1);

        sw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isPossible){
                    inches.setVisibility(View.VISIBLE);
                    centimeter.setVisibility(View.INVISIBLE);
                    isPossible = false;
                }else{
                    inches.setVisibility(View.INVISIBLE);
                    centimeter.setVisibility(View.VISIBLE);
                    isPossible = true;
                }

            }
        });
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        bottomSheetDialog.setContentView(R.layout.bottom_dialog);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomSheetDialog.show();
            }
        });

    }
}
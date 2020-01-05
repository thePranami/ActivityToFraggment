package com.example.thepranami.actionbyradioaf;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    EditText e1, e2;
    RadioButton r1, r2, r3, r4;
    float value;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText)findViewById(R.id.ed1);
        e2 = (EditText)findViewById(R.id.ed2);
        r1 = (RadioButton)findViewById(R.id.add);
        r2 = (RadioButton)findViewById(R.id.sub);
        r3 = (RadioButton)findViewById(R.id.mul);
        r4 = (RadioButton)findViewById(R.id.div);


        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
       // Actionradio actionradio = new Actionradio();

                    r1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            if(isChecked) {
                                float n1, n2;
                                n1 = Float.parseFloat(e1.getText().toString());
                                n2 = Float.parseFloat(e2.getText().toString());
                                value = n1 + n2;
                            }
                        }
                    });
                    r2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            if(isChecked) {
                                float n1, n2;
                                n1 = Float.parseFloat(e1.getText().toString());
                                n2 = Float.parseFloat(e2.getText().toString());
                                value = n1 - n2;
                            }
                        }
                    });

                    r3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            if(isChecked) {
                                float n1, n2;
                                n1 = Float.parseFloat(e1.getText().toString());
                                n2 = Float.parseFloat(e2.getText().toString());
                                value = n1 * n2;
                            }
                        }
                    });
                    r4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            if(isChecked) {
                                float n1, n2;
                                n1 = Float.parseFloat(e1.getText().toString());
                                n2 = Float.parseFloat(e2.getText().toString());
                                value = n1 / n2;
                            }
                        }
                    });
                    Bundle bundle = new Bundle();
                    bundle.putFloat("num", value);
                    new Actionradio().setArguments(bundle);
                    fragmentTransaction.add(R.id.main_linear, new Actionradio());
                    fragmentTransaction.commit();
    }

}

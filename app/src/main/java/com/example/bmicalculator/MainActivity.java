package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtWeight,edtHeightft,edtHeightIn;
        Button btnCalculator;
        TextView txtResult;
        LinearLayout llMain;

        edtWeight=findViewById(R.id.edtWeight);
        edtHeightft=findViewById(R.id.edtHeightFt);
        edtHeightIn=findViewById(R.id.edtHeightIn);
        btnCalculator=findViewById(R.id.btnCalculator);
        txtResult=findViewById(R.id.txtResult);
        llMain=findViewById(R.id.llMain);

        btnCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              int wt = Integer.parseInt( edtWeight.getText().toString());
                int ft = Integer.parseInt( edtHeightft.getText().toString());
                int in = Integer.parseInt( edtHeightIn.getText().toString());

                int totalIn =ft*12 + in;
                double  totalCm=totalIn*2.53;
                double totalM=totalCm/100;
                double bmi=wt/(totalM*totalM);
                if(bmi>25)
                {
                    txtResult.setText("You are overweight");
                    llMain.setBackgroundColor(getResources().getColor(R.color.colorUw));

                }
                else if(bmi<18)
                {
                    txtResult.setText("You are UnderWeight");
                    llMain.setBackgroundColor(getResources().getColor(R.color.colorOW));
                }
                else
                {
                    txtResult.setText("You are healthy");
                    llMain.setBackgroundColor(getResources().getColor(R.color.colorH));

                }





            }
        });





    }
}
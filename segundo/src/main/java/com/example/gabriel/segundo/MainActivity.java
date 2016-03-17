package com.example.gabriel.segundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText numero1 = (EditText) findViewById(R.id.num1);
        final EditText numero2 = (EditText) findViewById(R.id.num2);
        final TextView resultado = (TextView) findViewById(R.id.resultado);
        final RadioGroup operacion = (RadioGroup) findViewById(R.id.operacion);
        Button calcular = (Button) findViewById(R.id.calcular);

       calcular.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               double nume1 =0;
               double nume2=0;
               double resultados =0;

               nume1=Double.parseDouble(numero1.getText().toString());
               nume2=Double.parseDouble(numero2.getText().toString());

               switch (operacion.getCheckedRadioButtonId())
               {
                   case R.id.suma:
                      resultados= nume1+nume2;
                      resultado.setText(String.valueOf(resultados));
                      break;
                   case R.id.resta:
                       resultados= nume1-nume2;
                       resultado.setText(String.valueOf(resultados));
                       break;
                   case R.id.multi:
                       resultados= nume1*nume2;
                       resultado.setText(String.valueOf(resultados));
                       break;
                   case R.id.divi:
                       resultados= nume1/nume2;
                       resultado.setText(String.valueOf(resultados));
                       break;


               }
           }
       });

    }
}

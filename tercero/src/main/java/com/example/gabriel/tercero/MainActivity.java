    package com.example.gabriel.tercero;

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
            final EditText num1= (EditText)findViewById(R.id.numero1);
            final EditText num2= (EditText)findViewById(R.id.numero2);
            final RadioGroup elejir= (RadioGroup)findViewById(R.id.elejir);
            Button calcular= (Button)findViewById(R.id.calcular);
            final TextView area= (TextView)findViewById(R.id.areas);

            calcular.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    double numero1=0;
                    double numero2=0;
                    double resultados=0;



                    switch (elejir.getCheckedRadioButtonId()) {

                        case R.id.cuadro:
                            numero1 = Double.parseDouble(num1.getText().toString());
                            resultados = numero1 * numero1;
                            area.setText(String.valueOf(resultados));

                            break;

                        case R.id.circulo:
                            numero1 = Double.parseDouble(num1.getText().toString());
                            resultados = Math.PI * numero1 * numero1;
                            area.setText(String.valueOf(resultados));

                            break;

                        case R.id.triangulo:
                            numero1 = Double.parseDouble(num1.getText().toString());
                            numero2 = Double.parseDouble(num2.getText().toString());
                            resultados = numero1 * numero2 / 2;
                            area.setText(String.valueOf(resultados));

                            break;

                        case R.id.rectangulo:
                            numero1 = Double.parseDouble(num1.getText().toString());
                            numero2 = Double.parseDouble(num2.getText().toString());
                            resultados = numero1 * numero2;
                            area.setText(String.valueOf(resultados));

                            break;


                    }
                    }
                });


            elejir.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    switch (checkedId) {

                        case R.id.cuadro:

                            num1.setVisibility(View.VISIBLE);
                            num2.setVisibility(View.INVISIBLE);
                            num1.setHint("Ingrese el lado");
                            area.setVisibility(View.VISIBLE);
                            num1.setText("");
                            num2.setText("");
                            break;

                        case R.id.circulo:

                            num1.setVisibility(View.VISIBLE);
                            num2.setVisibility(View.INVISIBLE);
                            num1.setHint("Ingrese el radio");
                            area.setVisibility(View.VISIBLE);
                            num1.setText("");
                            num2.setText("");

                            break;

                        case R.id.triangulo:

                            num1.setVisibility(View.VISIBLE);
                            num1.setHint("Ingrese la altura");
                            num2.setVisibility(View.VISIBLE);
                            num2.setHint("Ingrese la base");
                            area.setVisibility(View.VISIBLE);
                            num1.setText("");
                            num2.setText("");
                            break;

                        case R.id.rectangulo:

                            num1.setVisibility(View.VISIBLE);
                            num1.setHint("Ingrese la base");
                            num2.setVisibility(View.VISIBLE);
                            num2.setHint("Ingrese la altura");
                            area.setVisibility(View.VISIBLE);
                            num1.setText("");
                            num2.setText("");
                            break;

                    }


                }
            });
            }
        }

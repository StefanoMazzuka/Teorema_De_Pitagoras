package Stefano.Mazzuka.Teorema.de.Pitagoras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.stefanomazzuka.teorema.de.pitagoras.R;

public class ActivityHipotenusa extends AppCompatActivity implements View.OnClickListener{
    Button calcular;
    EditText catetoA, catetoB;
    TextView hipotenusa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hipotenusa);

        calcular = findViewById(R.id.buttonCalcular);
        catetoA = findViewById(R.id.editTextCatetoA);
        catetoB = findViewById(R.id.editTextCatetoB);
        hipotenusa = findViewById(R.id.textViewHipotenusa);

        calcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonCalcular:
                try {
                    double valorCatetoA = Double.parseDouble(catetoA.getText().toString());
                    double valorCatetoB = Double.parseDouble(catetoB.getText().toString());

                    if (valorCatetoA < 0 || valorCatetoB < 0)
                        Toast.makeText(getApplicationContext(), "ERROR: Introduce solo números racionales positivos Ejemplo: 3.4", Toast.LENGTH_LONG).show();

                    else {
                        double resultado = Math.sqrt((Math.pow(valorCatetoA, 2))+(Math.pow(valorCatetoB, 2)));
                        hipotenusa.setText("Valor de la Hipotenusa: " + resultado);
                    }

                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "ERROR: Introduce solo números racionales positivos Ejemplo: 3.4", Toast.LENGTH_LONG).show();
                }

                break;
            default:
                break;
        }
    }
}

package Stefano.Mazzuka.Teorema.de.Pitagoras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.stefanomazzuka.teorema.de.pitagoras.R;

public class ActivityCatetos extends AppCompatActivity implements View.OnClickListener{
    Button calcular;
    EditText hipotenusa, cateto;
    TextView catetoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catetos);

        calcular = findViewById(R.id.buttonCalcular2);
        cateto = findViewById(R.id.editTextCateto);
        hipotenusa = findViewById(R.id.editTextHipotenusa);
        catetoResultado = findViewById(R.id.textViewCatetoResultado);

        calcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonCalcular2:
                try {
                    double valorCateto = Double.parseDouble(cateto.getText().toString());
                    double valorHipotenusa = Double.parseDouble(hipotenusa.getText().toString());

                    if (valorCateto > valorHipotenusa)
                        Toast.makeText(getApplicationContext(), "ERROR: El valor del cateto no puede ser mayor que el de la Hipotenusa", Toast.LENGTH_LONG).show();

                    else if (valorCateto < 0 || valorHipotenusa < 0)
                        Toast.makeText(getApplicationContext(), "ERROR: Introduce solo números racionales positivos Ejemplo: 3.4", Toast.LENGTH_LONG).show();

                    else {
                        double resultado = Math.sqrt((Math.pow(valorHipotenusa, 2))-(Math.pow(valorCateto, 2)));
                        catetoResultado.setText("Valor del otro cateto: " + resultado);
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

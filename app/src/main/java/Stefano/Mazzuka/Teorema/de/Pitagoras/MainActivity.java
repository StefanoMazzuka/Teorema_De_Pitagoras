package Stefano.Mazzuka.Teorema.de.Pitagoras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.stefanomazzuka.teorema.de.pitagoras.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button buttonAB, buttonC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAB = findViewById(R.id.buttonAB);
        buttonC = findViewById(R.id.buttonC);

        buttonAB.setOnClickListener(this);
        buttonC.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonAB:
                Intent intent1 = new Intent(this, ActivityCatetos.class);
                startActivity(intent1);
                break;
            case R.id.buttonC:
                Intent intent2 = new Intent(this, ActivityHipotenusa.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
    }
}

package co.edu.unab.rozco.holamundo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tvTittle;
    private EditText etCorreo;
    private EditText etPassword;
    private Button btnIniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("CicloVida", "Ejecucando onCreate");

        etCorreo = findViewById(R.id.et_email_inicio);
        etPassword = findViewById(R.id.et_password_inicio);
        btnIniciar = findViewById(R.id.btIniciar);


        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usu = "jeffer@gmail.com";
                String pass = "jeffer123";


                String correo = etCorreo.getText().toString();
                String password = etPassword.getText().toString();

                if (correo.equals(usu) && password.equals(pass)) {
                    Toast.makeText(MainActivity.this, "Bienvenido " + correo, Toast.LENGTH_LONG).show();
                    Intent miIntencion = new Intent(MainActivity.this, ListadoActivity.class);
                    miIntencion.putExtra("email", correo);
                    startActivity(miIntencion);
                    finish();
                } else {
                    Toast.makeText(MainActivity.this, "Datos errados", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("CicloVida", "Ejecutando onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("CicloVida", "Ejecucando onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("CicloVida", "Ejecucando onPause");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("CicloVida", "Ejecucando onRestart");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("CicloVida", "Ejecucando onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}
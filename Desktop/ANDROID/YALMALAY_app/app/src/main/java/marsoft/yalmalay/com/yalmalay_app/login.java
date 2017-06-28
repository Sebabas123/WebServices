package marsoft.yalmalay.com.yalmalay_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void ingresa(View o){
        Toast.makeText(this, ((Button)o).getText(), Toast.LENGTH_LONG).show();
        Intent i = null;
        if(((Button)o).getText().toString().contains("Usuario")){
            Usuario.tipoUsuario = Usuario.USUARIO;
            i = new Intent(this, inicioUsuario.class);
        }else if(((Button)o).getText().toString().contains("Asociado")){
            Usuario.tipoUsuario = Usuario.ASOCIADO;
            i = new Intent(this, inicioAsociado.class);
        }
        startActivity(i);
        this.finish();
    }
}

package dcc196.ufjf.br.trabalho1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlanejamentosActivity extends AppCompatActivity {
    Button btnCadastro;
    //


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planejamentos);

        btnCadastro = (Button) findViewById(R.id.btn_cadastro);
        btnCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlanejamentosActivity.this, NovoPlanejamentoActivity.class);
                startActivity(intent);

            }
        });

    }
}

package dcc196.ufjf.br.trabalho1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;


public class NovoPlanejamentoActivity extends AppCompatActivity {

    private ListView listdisciplinas;
    public static Disciplina lista = new Disciplina();
    EditText ano, semestre, porcentagem;
    Button cadastro, cancelar, sair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_planejamento);
        listdisciplinas = (ListView) findViewById(R.id.list_Disciplinas);
        mostraLista();
        ano = (EditText) findViewById(R.id.edit_Ano);
        semestre = (EditText) findViewById(R.id.edit_Semestre);
        porcentagem = (EditText) findViewById(R.id.edit_Porcentagem);
        cadastro = (Button) findViewById(R.id.btn_Cadastrar);
        cancelar = (Button) findViewById(R.id.btn_Cancelar);
        sair = (Button) findViewById(R.id.btn_Sair);


        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NovoPlanejamentoActivity.this, PlanejamentosActivity.class);
                startActivityForResult(intent, 0);
            }
        });

        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    cadastro.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {


            if(validateEntry())
            {
                Intent intent = new Intent();
                intent.putExtra("disciplina",lista.getTitulo().getClass().getSuperclass());
                intent.putExtra("nome",ano.getText().toString());
                intent.putExtra("nome",semestre.getText().toString());
                intent.putExtra("cpf",porcentagem.getText().toString());

                setResult(Activity.RESULT_OK, intent);
                Toast.makeText(NovoPlanejamentoActivity.this,"Planejamento salvo com sucesso", Toast.LENGTH_SHORT).show();
                finish();
            }
            else
                Toast.makeText(NovoPlanejamentoActivity.this,"Por favor preencha todos os campos", Toast.LENGTH_LONG).show();
        }
    });
    }

    private void mostraLista()
    {
        ArrayAdapter<Disciplina> adapter = new ArrayAdapter<Disciplina>(this,android.R.layout.simple_list_item_1,lista.getDisciplina());
        listdisciplinas.setAdapter(adapter);

    }
    @Override
    protected void onResume()
    {
        super.onResume();

        mostraLista();
    }
    private boolean validateEntry()
    {
        return !(ano.getText().toString().isEmpty() || semestre.getText().toString().isEmpty() || porcentagem.getText().toString().isEmpty());
    }


}
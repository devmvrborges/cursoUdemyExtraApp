package toast.studio.com.mensagemtoast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/*
Aplicativo desenvolvido por Maurício Valentim Rodrigues Borges dia 19/01/2017
estudante de Ciência da computação na Faculdade de Jaguariúna.

DESCRIÇÃO: Apresentando a ferramenta Toast para aparecer algumas mensagens na tela
durante ao pressionar um botão

Desenvolvido durante o Curso Completo do Desenvolvedor Android - Crie 15 Apps (UDEMY)
*/
public class MainActivity extends AppCompatActivity {

    private Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (Button) findViewById(R.id.botaoId);

        botao.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Texto que foi configurado para aparecer no Toast", Toast.LENGTH_SHORT).show();

            }
        });
    }
}

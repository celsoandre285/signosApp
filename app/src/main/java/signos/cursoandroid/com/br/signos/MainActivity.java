package signos.cursoandroid.com.br.signos;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private ListView listaItens;
    private ArrayAdapter<String> adapter;

    private String[] signos = {
            "Aries", "Touro", "Gemeos", "Cancer", "Leao", "Virgem",
            "Libra", "Escorpião", "Sagitario", "Capricórnio", "Aguario", "Peixes"
    };

    private String[] perfilSignos = {
            "Metido a honesto, se acha. Não consegue influenciar ninguém. Um completo ignorante.",
            "Materialista. As pessoas só te vêem como um pão-duro, cabeça-dura e estão certas.",
            "Duas caras, fofoqueiro, mentiroso e cara-de-pau. Você não é confiável.",
            "Chorão. Os outros são obrigados a te aguentar. Se acha solidário e compreensivo, o que faz de você um puxa-saco.",
            "é louco quer bater em todo mundo, esquenta a cabeça muito rápido e acha que tem razão.",
            "Metido a perfeccionista, observador. Não tem criatividade. Critica os outros, mas não se enxerga.",
            "Se acha equilibrado, idealista. Tem necessidade de lutar contra as injustiças. Só pensa em si. É um engomadinho metido.",
            "O pior. É vingativo, rancoroso, traidor, falso, egoísta, mentiroso, cínico e traiçoeiro. Só ama sua mãe e a si mesmo.",
            "Otimista e tende a confiar na sorte. Isso é bom, já que é imprudente, irresponsável, limitado e não possui talento.",
            "Metido a sério, conservador e politicamente correto. É falso, ambicioso e safado. Gosta de manter as aparências.",
            "Tem uma mente inventiva. Mente e comete os mesmos erros porque é imbecil e teimoso. Adora ser o \"do contra\"",
            "Pensa que só você é esperto. Se acha inteligente. É impaciente, mal-educado e dá conselhos fúteis."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaItens = (ListView) findViewById(R.id.listviewid);
        adapter = new ArrayAdapter<String>(
                //contexto
                getApplicationContext(),
                //layout
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                //A coleção
                signos
        );

        listaItens.setAdapter(adapter);

        listaItens.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String perfil = perfilSignos[position];
                Toast.makeText(getApplicationContext(), perfil, Toast.LENGTH_SHORT).show();
            }
        });



    }


}

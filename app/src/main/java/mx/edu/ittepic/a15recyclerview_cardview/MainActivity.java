package mx.edu.ittepic.a15recyclerview_cardview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String[] albumes = {
            "Everything Was Beautiful And Nothing Hurt",
            "Violence",
            "Back",
            "A Real Labour Of Love",
            "Show",
            "El nefelibata"};

    String[] cantantes = {
            "Movy (2018)",
            "Editors (2018)",
            "Eminem (2004)",
            "UB40 (2018)",
            "Eminem (2002)",
            "M. Conciencia (2015)"};

    String[] canciones = {
            "01.\tMere Anarchy\t\n" +
                    "02.\tThe Waste of Suns\t\n" +
                    "03.\tLike a Motherless Child\t\n               ...",

            "01. Cold\n" +
                    "02. Hallelujah (So Low)\n" +
                    "03. Violence\t\n               ...",

            "01. Hellbound \n" +
                    "02. Nuttin' to Do \n" +
                    "03. She's the One\t\n               ...",

            "01. Curtains Up (Skit)\n" +
                    "02. White America\n" +
                    "03. Business\t\n               ...",

            "01.\tMaking Love\t\n" +
                    "02.\tShe Loves Me Now\t\n" +
                    "03.\tStrive\t\n            ...",

    "01.\t Intro Super\t\n" +
            "02.\tCirros\t\n" +
            "03.\tAltocúmulos\t\n            ..."};

    String[] imagenes = {
            "disco1",
            "disco2",
            "disco3",
            "disco4",
            "disco5",
            "disco6"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Best Store");

        // Crear referencias hacia el componente RecycleriView
        recyclerView = findViewById(R.id.recycler_id);

        // Crear un objeto de tipo RecyclerAdapter que areglos de cadenas
        adapter = new RecyclerAdapter(albumes,cantantes,canciones,imagenes);

        // Crea un objeto de tipo LinearLayoutManager
        layoutManager = new LinearLayoutManager(this);

        // Establecer el LayautManager
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        // Establecer el Adapter
        recyclerView.setAdapter(adapter);

    }
}

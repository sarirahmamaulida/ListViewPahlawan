package id.ac.poliban.mi.sari.listviewpahlawan;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
   private List<Hero> heroes = new ArrayList<>();
   private ListView lvHero;
   private BaseAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //koneksikan object dengan view
        lvHero = findViewById(R.id.lvHero);
        //ambil data dari CountryData dan berikan ke object countries
        heroes.addAll(HeroData.getAllHeroes());
        //buat object adapter dan kirim data countries sebagai
        //parameter di konstruktor CountryAdapter()
        adapter = new HeroAdapter(heroes);
        //pasang object adapter sebagai adapter lvCountry
        lvHero.setAdapter(adapter);
        //menambahkan kejadian ketika user mengklik salah satu item
        lvHero.setOnItemClickListener((parent, view, position, id) -> {
            new AlertDialog.Builder(this)
                    .setTitle("Negara yang Anda Pilih")
                    .setMessage("anda memilih: " +
                            heroes.get(position).getHeroName())
                    .setPositiveButton("OK", null).show();
        });
    }
}

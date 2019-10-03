package akarsejati.com.moviecatalogue;

import android.content.Intent;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private String[] dataJudul,dataRilis,dataStatus,dataDurasi,dataBahasa,dataSinopsis,dataAktor,dataKategori;
    private String[] dataCast1,dataCast2,dataCast3,dataCast4,dataCast5;
    private TypedArray dataPoster,Pto_cast1,Pto_cast2,Pto_cast3,Pto_cast4,Pto_cast5;
    protected KatalogFilmAdapter adapter;
    public ArrayList<KatalogFilm> katalogFilms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listKatalog = findViewById(R.id.lv_movie_catalogue);
        adapter = new KatalogFilmAdapter(this);
        listKatalog.setAdapter(adapter);
        siapkan();
        goItem();
        listKatalog.setOnItemClickListener(listener);
    }

    AdapterView.OnItemClickListener listener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int i, long I) {
            goItem();
            Intent keDetil = new Intent(MainActivity.this, DetilKatalog.class);
            keDetil.putExtra(DetilKatalog.EXTRA_KATALOG, katalogFilms.get(i));
            startActivity(keDetil);
        }
    };

    private void siapkan() {
        dataPoster = getResources().obtainTypedArray(R.array.dt_photo);
        Pto_cast1 = getResources().obtainTypedArray(R.array.pto_cast1);
        Pto_cast2 = getResources().obtainTypedArray(R.array.pto_cast2);
        Pto_cast3 = getResources().obtainTypedArray(R.array.pto_cast3);
        Pto_cast4 = getResources().obtainTypedArray(R.array.pto_cast4);
        Pto_cast5 = getResources().obtainTypedArray(R.array.pto_cast5);
        dataJudul = getResources().getStringArray(R.array.dt_judul);
        dataRilis = getResources().getStringArray(R.array.dt_rilis);
        dataStatus = getResources().getStringArray(R.array.dt_status);
        dataDurasi = getResources().getStringArray(R.array.dt_durasi);
        dataBahasa = getResources().getStringArray(R.array.dt_bahasa);
        dataSinopsis = getResources().getStringArray(R.array.dt_sinopsis);
        dataAktor = getResources().getStringArray(R.array.dt_pemain);
        dataKategori = getResources().getStringArray(R.array.dt_kategori);
        dataCast1 = getResources().getStringArray(R.array.dt_cast1);
        dataCast2 = getResources().getStringArray(R.array.dt_cast2);
        dataCast3 = getResources().getStringArray(R.array.dt_cast3);
        dataCast4 = getResources().getStringArray(R.array.dt_cast4);
        dataCast5 = getResources().getStringArray(R.array.dt_cast5);
    }

    private void goItem() {
        katalogFilms = new ArrayList<>();
        for (int i = 0; i < dataJudul.length; i++)
        {
            KatalogFilm katalogFilm = new KatalogFilm();
            katalogFilm.setPoster(dataPoster.getResourceId(i, -1));
            katalogFilm.setPicCast1(Pto_cast1.getResourceId(i, -1));
            katalogFilm.setPicCast2(Pto_cast2.getResourceId(i, -1));
            katalogFilm.setPicCast3(Pto_cast3.getResourceId(i, -1));
            katalogFilm.setPicCast4(Pto_cast4.getResourceId(i, -1));
            katalogFilm.setPicCast5(Pto_cast5.getResourceId(i, -1));
            katalogFilm.setJudulFilm(dataJudul[i]);
            katalogFilm.setRilis(dataRilis[i]);
            katalogFilm.setStatus(dataStatus[i]);
            katalogFilm.setDurasi(dataDurasi[i]);
            katalogFilm.setBahasa(dataBahasa[i]);
            katalogFilm.setSinopsis(dataSinopsis[i]);
            katalogFilm.setAktor(dataAktor[i]);
            katalogFilm.setKategori(dataKategori[i]);
            katalogFilm.setCast1(dataCast1[i]);
            katalogFilm.setCast2(dataCast2[i]);
            katalogFilm.setCast3(dataCast3[i]);
            katalogFilm.setCast4(dataCast4[i]);
            katalogFilm.setCast5(dataCast5[i]);
            katalogFilms.add(katalogFilm);
        }
        adapter.setKatalogFilms(katalogFilms);
    }
}

package akarsejati.com.moviecatalogue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;


public class DetilKatalog extends AppCompatActivity {
    public static final String EXTRA_KATALOG = "extra_katalog";
    ImageView Poster,PtoCast1,PtoCast2,PtoCast3,PtoCast4,PtoCast5;
    TextView Judul,Rilis,Status,Durasi,Bahasa,Sinopsis,Kategori;
    TextView movCast1,movCast2,movCast3,movCast4,movCast5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detil_katalog);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        KatalogFilm katalogFilm = getIntent().getParcelableExtra(EXTRA_KATALOG);

        if(katalogFilm!=null) {
            Poster = findViewById(R.id.iv_poster);
            Poster.setImageResource(katalogFilm.getPoster());
            PtoCast1 = findViewById(R.id.iv_cast1);
            PtoCast1.setImageResource(katalogFilm.getPicCast1());
            PtoCast2 = findViewById(R.id.iv_cast2);
            PtoCast2.setImageResource(katalogFilm.getPicCast2());
            PtoCast3 = findViewById(R.id.iv_cast3);
            PtoCast3.setImageResource(katalogFilm.getPicCast3());
            PtoCast4 = findViewById(R.id.iv_cast4);
            PtoCast4.setImageResource(katalogFilm.getPicCast4());
            PtoCast5 = findViewById(R.id.iv_cast5);
            PtoCast5.setImageResource(katalogFilm.getPicCast5());
            Judul = findViewById(R.id.tv_jdlFilm);
            Judul.setText(katalogFilm.getJudulFilm());
            Rilis = findViewById(R.id.tv_rls);
            Rilis.setText(katalogFilm.getRilis());
            Status = findViewById(R.id.tv_status);
            Status.setText(katalogFilm.getStatus());
            Durasi = findViewById(R.id.tv_drs);
            Durasi.setText(katalogFilm.getDurasi());
            Bahasa = findViewById(R.id.tv_bhs);
            Bahasa.setText(katalogFilm.getBahasa());
            Sinopsis = findViewById(R.id.tv_sin);
            Sinopsis.setText(katalogFilm.getSinopsis());
            Kategori = findViewById(R.id.tv_kat);
            Kategori.setText(katalogFilm.getKategori());
            movCast1 = findViewById(R.id.tv_cast1);
            movCast1.setText(katalogFilm.getCast1());
            movCast2 = findViewById(R.id.tv_cast2);
            movCast2.setText(katalogFilm.getCast2());
            movCast3 = findViewById(R.id.tv_cast3);
            movCast3.setText(katalogFilm.getCast3());
            movCast4 = findViewById(R.id.tv_cast4);
            movCast4.setText(katalogFilm.getCast4());
            movCast5 = findViewById(R.id.tv_cast5);
            movCast5.setText(katalogFilm.getCast5());
        }
    }
}

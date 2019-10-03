package akarsejati.com.moviecatalogue;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class KatalogFilmAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<KatalogFilm> katalogFilms;

    public void setKatalogFilms(ArrayList<KatalogFilm> katalogFilms) {
        this.katalogFilms = katalogFilms;
    }

    KatalogFilmAdapter(Context context) {
        this.context = context;
        katalogFilms = new ArrayList<>();
    }

    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return katalogFilms.size();
    }

    @Override
    public Object getItem(int i) {
        try {
            return katalogFilms.get(i);
        } catch (Error e) {
            return katalogFilms.isEmpty();
        }
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent){
        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.item_mv_catalogue,parent,false);

        }

        ViewHolder viewHolder = new ViewHolder(view);
        KatalogFilm katalogFilm = (KatalogFilm)getItem(i);
        viewHolder.bind(katalogFilm);
        return view;
    }

    private class ViewHolder{
        private ImageView  imgPoster;
        private TextView tvJudul, tvRilis, tvSinopsis, tvPemain, tvKategori;


        ViewHolder (View view){
            imgPoster = view.findViewById(R.id.img_poster);
            tvJudul = view.findViewById(R.id.txt_jdl);
            tvRilis = view.findViewById(R.id.txt_rls_mov);
            tvSinopsis = view.findViewById(R.id.txt_sin);
            tvPemain = view.findViewById(R.id.txt_dtl_ply);
            tvKategori = view.findViewById(R.id.txt_kat);
        }
        void bind (KatalogFilm katalogFilm){
            imgPoster.setImageResource(katalogFilm.getPoster());
            tvJudul.setText(katalogFilm.getJudulFilm());
            tvRilis.setText(katalogFilm.getRilis());
            tvSinopsis.setText(katalogFilm.getSinopsis());
            tvPemain.setText(katalogFilm.getAktor());
            tvKategori.setText(katalogFilm.getKategori());
        }
    }


}

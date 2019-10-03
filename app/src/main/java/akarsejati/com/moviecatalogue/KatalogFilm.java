package akarsejati.com.moviecatalogue;

import android.os.Parcel;
import android.os.Parcelable;

public class KatalogFilm implements Parcelable {
    private int Poster;
    private int PicCast1;
    private int PicCast2;
    private int PicCast3;
    private int PicCast4;
    private int PicCast5;
    private String Cast1,Cast2,Cast3,Cast4,Cast5;

    int getPicCast1() {
        return PicCast1;
    }

    void setPicCast1(int picCast1) {
        PicCast1 = picCast1;
    }

    int getPicCast2() {
        return PicCast2;
    }

    void setPicCast2(int picCast2) {
        PicCast2 = picCast2;
    }

    int getPicCast3() {
        return PicCast3;
    }

    void setPicCast3(int picCast3) {
        PicCast3 = picCast3;
    }

    int getPicCast4() {
        return PicCast4;
    }

    void setPicCast4(int picCast4) {
        PicCast4 = picCast4;
    }

    int getPicCast5() {
        return PicCast5;
    }

    void setPicCast5(int picCast5) {
        PicCast5 = picCast5;
    }

    String getCast1() {
        return Cast1;
    }

    void setCast1(String cast1) {
        Cast1 = cast1;
    }

    String getCast2() {
        return Cast2;
    }

    void setCast2(String cast2) {
        Cast2 = cast2;
    }

    String getCast3() {
        return Cast3;
    }

    void setCast3(String cast3) {
        Cast3 = cast3;
    }

    String getCast4() {
        return Cast4;
    }

    void setCast4(String cast4) {
        Cast4 = cast4;
    }

    String getCast5() {
        return Cast5;
    }

    void setCast5(String cast5) {
        Cast5 = cast5;
    }

    private String JudulFilm, Rilis, Status, Durasi, Bahasa, Sinopsis, Aktor, Kategori;

    int getPoster() {
        return Poster;
    }

    void setPoster(int poster) {
        Poster = poster;
    }

    String getJudulFilm() {
        return JudulFilm;
    }

    void setJudulFilm(String judulFilm) {
        JudulFilm = judulFilm;
    }

    String getRilis() {
        return Rilis;
    }

    void setRilis(String rilis) {
        Rilis = rilis;
    }

    String getStatus() {
        return Status;
    }

    void setStatus(String status) {
        Status = status;
    }

    String getDurasi() {
        return Durasi;
    }

    void setDurasi(String durasi) {
        Durasi = durasi;
    }

    String getBahasa() {
        return Bahasa;
    }

    void setBahasa(String bahasa) {
        Bahasa = bahasa;
    }

    String getSinopsis() {
        return Sinopsis;
    }

    void setSinopsis(String sinopsis) {
        Sinopsis = sinopsis;
    }

    String getAktor() {
        return Aktor;
    }

    void setAktor(String aktor) {
        Aktor = aktor;
    }

    String getKategori() {
        return Kategori;
    }

    void setKategori(String kategori) {
        Kategori = kategori;
    }

    KatalogFilm() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.Poster);
        dest.writeInt(this.PicCast1);
        dest.writeInt(this.PicCast2);
        dest.writeInt(this.PicCast3);
        dest.writeInt(this.PicCast4);
        dest.writeInt(this.PicCast5);
        dest.writeString(this.JudulFilm);
        dest.writeString(this.Rilis);
        dest.writeString(this.Status);
        dest.writeString(this.Durasi);
        dest.writeString(this.Bahasa);
        dest.writeString(this.Sinopsis);
        dest.writeString(this.Aktor);
        dest.writeString(this.Kategori);
        dest.writeString(this.Cast1);
        dest.writeString(this.Cast2);
        dest.writeString(this.Cast3);
        dest.writeString(this.Cast4);
        dest.writeString(this.Cast5);
    }

    private KatalogFilm(Parcel in) {
        this.Poster = in.readInt();
        this.PicCast1 = in.readInt();
        this.PicCast2 = in.readInt();
        this.PicCast3 = in.readInt();
        this.PicCast4 = in.readInt();
        this.PicCast5 = in.readInt();
        this.JudulFilm = in.readString();
        this.Rilis = in.readString();
        this.Status = in.readString();
        this.Durasi = in.readString();
        this.Bahasa = in.readString();
        this.Sinopsis = in.readString();
        this.Aktor = in.readString();
        this.Kategori = in.readString();
        this.Cast1 = in.readString();
        this.Cast2 = in.readString();
        this.Cast3 = in.readString();
        this.Cast4 = in.readString();
        this.Cast5 = in.readString();
    }

    public static final Creator<KatalogFilm> CREATOR = new Creator<KatalogFilm>() {
        @Override
        public KatalogFilm createFromParcel(Parcel source) {
            return new KatalogFilm(source);
        }

        @Override
        public KatalogFilm[] newArray(int size) {
            return new KatalogFilm[size];
        }
    };
}

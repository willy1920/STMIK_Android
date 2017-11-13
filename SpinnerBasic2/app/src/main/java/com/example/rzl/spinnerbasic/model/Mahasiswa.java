package com.example.rzl.spinnerbasic.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Rzl on 11/13/2017.
 */

public class Mahasiswa {
    @SerializedName("nim")
    public String nim;
    @SerializedName("nama")
    public String nama;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Mahasiswa(){

    }
}

package com.example.rzl.spinnerkuis.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Rzl on 11/20/2017.
 */

public class Mahasiswa {
    @SerializedName("nim")
    private String nim;
    @SerializedName("nama")
    private String nama;

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
}

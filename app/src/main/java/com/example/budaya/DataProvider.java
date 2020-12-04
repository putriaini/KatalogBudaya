package com.example.budaya;

import android.content.Context;

import com.example.budaya.model.Budaya;
import com.example.budaya.model.Rumah;
import com.example.budaya.model.Tari;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {

    private static List<Budaya> budayas = new ArrayList<>();

    private static List<Rumah>initDataRumah(Context ctx) {
        List<Rumah> rumahs = new ArrayList<>();
        rumahs.add(new Rumah("Krong Bade","Aceh","Merupakan Rumah adat tradisional yang memiliki tangga di bagian depan rumah dan tingginya berada beberapa meter dari tanah. .",R.drawable.krong_bade));
        rumahs.add(new Rumah("Bolon","Sumatera Utara","Merupakan rumah adat tradisonal yang memiliki Ciri khas bentuknya panggung, terdiri dari beberapa tiang penyangga bergaris tengah.",R.drawable.bol                                                                                                            on));
        rumahs.add(new Rumah("Gadang","Sumatra Barat","Merupakan Rumah adat ini yang memiliki bentuk puncak atap yang runcing, menyerupai tanduk kerbau. Dulunya atap ini dibuat dari bahan ijuk dan bisa bertahan sampai puluhan tahun.",R.drawable.gadang));
        rumahs.add(new Rumah("Selaso Jatuh Kembar","Riau","Merupakan Rumah adat yang memiliki ciri khas yakni berbentuk rumah panggung atau memiliki kolong.",R.drawable.selaso_jatoh_kembar));
        rumahs.add(new Rumah("Rakit Limas","Bangka Belitung","Merupakan Rumah adat daerah pulau, sehingga menambahkan pada aksen rakit, sebagai pembeda dan penanda, untuk mennjukan ciri khas bangka belitung bahwa banka belitung memiliki rumah adat yang berbeda dan unik.",R.drawable.rakit_limas));
        rumahs.add(new Rumah("Rakyat","Bengkulu","Merupakan Rumah adat yang cukup kompleks. Namun tidak sekompleks rumah adat jambi.",R.drawable.rakyat));
        return rumahs;
    }

    private static List<Tari> initDataTari(Context ctx) {
        List<Tari> taris = new ArrayList<>();
        taris.add(new Tari("Kecak","Bali"," Merupakan Tari kecak yang dibawakan oleh puluhan penari laki-laki yang duduk melingkar, mengangkat kedua tangannya, dan menyerukan “cak”.Tari ini menceritakan kisah Ramayana yang mendalam.",R.drawable.kecak));
        taris.add(new Tari("Jaipong","Jawa Barat","Meruapkan Tari tradisional asal Jawa Barat ini terkenal dengan gerakannya yang dinamis. Tarian ini sebenarnya merupakan gabungan dari pencak silat, Tari Ronggeng, dan Tari Ketuk Tilu.",R.drawable.jaipong));
        taris.add(new Tari("Zapin","Riau","Merupakan tari yang berasal dari Riau yang memiliki nilai-nilai ajaran Islam yang digunakan sebagai sarana dakwah.",R.drawable.zapin));
        taris.add(new Tari("Yapong","Betawi","Merupakan ciri khas kebudayaan masyarakat Betawi di Jakarta. Gerakan Tari Yapong ini sederhana, tapi sangat dinamis, eksotis, dan ekspresif.",R.drawable.yapong));
        taris.add(new Tari("Saman","Aceh","Merupakan Tarian Saman yang berasal dari suku Gayo dan menggunakan bahasa Gayo dalam setiap penampilannya. .",R.drawable.saman));
        taris.add(new Tari("Reog Ponorogo","Jawa Timur","Merupakan tarian bercerita tentang raja yang ingin melamar putri Kediri bernama Dewi Ragil Kuning. Namun, rencana ini pun dihadang oleh Raja Kediri..",R.drawable.reog_ponorogo));
        return taris;
    }
    private static void initAllMenus(Context ctx) {
        budayas.addAll(initDataRumah(ctx));
        budayas.addAll(initDataTari(ctx));

    }

    public static List<Budaya> getAllOrgan(Context ctx) {
        if (budayas.size() == 0) {
            initAllMenus(ctx);
        }
        return budayas;
    }

    public static List<Budaya> getMenusByTipe(Context ctx, String jenis) {
        List<Budaya> menusByType = new ArrayList<>();
        if (budayas.size() == 0) {
            initAllMenus(ctx);
        }
        for (Budaya o : budayas) {
            if (o.getJenis().equals(jenis)) {
                menusByType.add(o);
            }
        }
        return menusByType;
    }
}

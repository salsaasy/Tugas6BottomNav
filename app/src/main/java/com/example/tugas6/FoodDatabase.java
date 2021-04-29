package com.example.tugas6;

import java.util.ArrayList;

public class FoodDatabase {
    private static String[] foodNames = {
            "Rendang",
            "Mie Bangka",
            "Gudeg",
            "Rujak Cingur",
            "Soto Banjar",
            "Binte Biluhuta",
            "Bubur Manado",
            "Coto Makassar",
            "Ayam Betutu",
            "Papeda"
    };

    private static String[] foodDesc = {
            "Rendang adalah makanan khas Sumatera Barat. Masakan ini dihasilkan dari proses memasak suhu rendah dalam waktu lama menggunakan aneka rempah-rempah dan santan. Proses memasaknya memakan waktu berjam-jam (biasanya sekitar empat jam) hingga yang tinggal hanyalah potongan daging berwarna hitam pekat dan dedak. Dalam suhu ruangan, rendang dapat bertahan hingga berminggu-minggu. Rendang yang dimasak dalam waktu yang lebih singkat dan santannya belum mengering disebut kalio, berwarna cokelat terang keemasan.",
            "Mie bangka adalah makanan khas Kepulauan Bangka Belitung. Masakan ini lebih dikenal sebagai Mien di pulau asalnya dan merupakan jenis masakan Khek / Hakka. Mie Bangka disajikan dengan campuran tahu kok atau tahu asli Bangka dan taburan potongan ayam kecap yang dicincang. Ada juga taburan babi cincang (nonhalal). Sayuran menjadi pelengkap seperti biasa terdapat pada mie ayam, ada campuran seperti daun bawang dan tauge. Kelezatan, dan kemudahan penyajiannya membuat masakan ini sangat populer sehingga tersebar di banyak kota Indonesia.",
            "Gudeg adalah makanan khas Daerah Istimewa Yogyakarta yang terbuat dari nangka muda yang dimasak dengan santan. Perlu waktu berjam-jam untuk membuat masakan ini. Warna coklat biasanya dihasilkan oleh daun jati yang dimasak bersamaan. Gudeg biasanya dimakan dengan nasi dan disajikan dengan kuah santan kental (areh), ayam kampung, telur, tempe, tahu dan sambal goreng krecek.",
            "Rujak cingur adalah makanan khas Jawa Timur yang terbuat dari cingur (irisan mulut atau moncong sapi yang direbus), irisan beberapa jenis buah seperti timun, kerahi, bengkuang, mangga muda, nanas, kedondong, kemudian ditambah lontong, tahu, tempe, bendoyo, serta sayuran seperti kecambah/taoge, kangkung, dan kacang panjang. Semua bahan tadi dicampur dengan saus atau bumbu yang terbuat dari olahan petis udang, gula, cabai, kacang tanah, dan irisan tipis pisang yang diulek.",
            "Soto banjar adalah makanan khas Kalimantan Selatan dengan bahan utama ayam serta memiliki aroma harum rempah-rempah seperti kayu manis, biji pala, dan cengkih. Adakalanya pembuatan kuah soto banjar dapat dicampurkan dengan sedikit susu yang membuat warna kuahnya mejadi tidak bening, tetapi sedikit keruh. Soto ini berisi daging ayam yang sudah disuwir-suwir, dengan tambahan perkedel, kentang rebus, rebusan telur, potongan wortel dan ketupat.",
            "Binte Biluhuta atau Milu Siram adalah makanan khas Gorontalo. Makanan ini merupakan sup yang terdiri dari jagung, ikan atau udang yang di racik sedemikian rupa hingga menghasilkan suatu menu yang sangat lezat dan panas serta memiliki tiga rasa yang khas yakni manis, asin dan pedas. Karena berbahan dasar jagung, makanan ini dapat menghancurkan kolesterol khususnya kolesterol jahat (LDL) dalam tubuh. Kandungan karotenoid, bioflavonoid, dan vitamin C dalam jagung bekerja sebagai pengendali kadar kolesterol dan meningkatkan aliran darah dalam tubuh.",
            "Bubur manado atau Tinutuan adalah makanan khas Sulawesi Utara. Makanan ini merupakan campuran berbagai macam sayuran, tidak mengandung daging, sehingga makanan ini bisa menjadi makanan pergaulan antarkelompok masyarakat di Manado. Bahan pembuatan tinutuan sederhana. Tinutuan merupakan campuran berbagai macam sayuran yaitu labu kuning yang juga disebut sambiki, beras, singkong, bayam, kangkung, daun gedi, jagung, dan kemangi. Tinutuan juga dapat disajikan dengan ikan asin serta berbagai macam pelengkap hidangana lainnya.",
            "Coto adalah makanan khas Sulawesi Selatan. Makanan ini terbuat dari daging sapi yang biasanya ditambah dengan jeroan sapi seperti lidah, otak, limpa, paru, hati, jantung, babat dan lain-lain yang direbus dalam waktu yang lama. Rebusan jeroan bercampur daging sapi ini kemudian diiris-iris lalu dibumbui dengan bumbu yang diracik secara khusus. Coto dihidangkan dalam mangkuk dan dinikmati dengan bawang goreng, daun bawang, ketupat dan buras, yakni sejenis ketupat yang dibungkus daun pisang.",
            "Ayam betutu adalah makanan khas Bali yang dibuat dari daging ayam yang telah dibersihkan kemudian dibalurkan bumbu khas Bali yang dikenal dengan base genep di seluruh permukaan tubuh daging ayam dan sebagian lagi dimasukkan ke dalam rongga abdomennya. Daging ayam yang telah dibumbui tersebut kemudian direbus atau langsung dibakar hingga menghasilkan aroma yang khas. Aroma khas yang muncul disebabkan karena adanya pemanasan yang menyebabkan air dan lemak daging berantai pendek ikut menguap.",
            "Papeda adalah makanan khas Papua dan Maluku berupa bubur sagu berwarna putih dan bertekstur lengket menyerupai lem dengan rasa yang tawar. Karena rasanya yang tawar, papeda biasanya disajikan dengan ikan tongkol. Namun, papeda dapat juga dikombinasikan dengan ikan gabus, kakap merah, bubara, hingga ikan kue.Papeda merupakan makanan yang kaya serat, rendah kolesterol, dan cukup bernutrisi."
    };

    private static int[] foodImages = {
            R.drawable.rendang,
            R.drawable.mie_bangka,
            R.drawable.gudeg,
            R.drawable.rujak_cingur,
            R.drawable.soto_banjar,
            R.drawable.binte_biluhuta,
            R.drawable.bubur_manado,
            R.drawable.coto,
            R.drawable.ayam_betutu,
            R.drawable.papeda
    };

    static ArrayList<FoodModel> getListData(){
        ArrayList<FoodModel> list = new ArrayList<>();
        for (int position = 0; position < foodNames.length; position++){
            FoodModel food = new FoodModel();
            food.setName(foodNames[position]);
            food.setDesc(foodDesc[position]);
            food.setPhoto(foodImages[position]);
            list.add(food);
        }
        return list;
    }

}


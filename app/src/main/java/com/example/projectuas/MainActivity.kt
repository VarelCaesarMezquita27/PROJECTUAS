package com.example.projectuas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val namakotaList = listOf<mamalia>(
            mamalia(
                R.drawable.badak,
                namemamalia = "Badak",
                descmamalia = "Badak atau badak sumbu (Rhinocerotidae) adalah lima spesies hewan dari famili Rhinocerotidae, ordo Perissodactyla yang kesemuanya berasal dari Afrika dan Asia.",
                desc2mamalia = "Walaupun termasuk herbivora, badak adalah hewan yang berbahaya. Di India dan Nepal, badak merupakan penyebab utama kematian manusia, melebihi yang jumlah yang disebabkan oleh harimau dan macan tutul. Badak bahkan diketahui pernah menyerang gajah pembawa wisatawan."
            ),
            mamalia(
                R.drawable.domba,
                namemamalia = "Domba",
                descmamalia = "Domba adalah salah satu jenis hewan pertama yang dijinakkan untuk keperluan agrikultural dan dipelihara untuk dimanfaatkan rambut (disebut wol), daging, dan susunya.",
                desc2mamalia = "Jenis domba yang paling dikenal orang adalah domba peliharaan (Ovis aries), yang diduga keturunan dari moufflon liar dari Asia Tengah bagian Selatan dan Barat Daya."
            ),
            mamalia(
                R.drawable.gajah,
                namemamalia = "Gajah",
                descmamalia = "Gajah adalah mamalia besar dari famili Elephantidae dan ordo Proboscidea. Secara tradisional, terdapat dua spesies yang diakui, yaitu gajah afrika (Loxodonta africana) dan gajah asia (Elephas maximus), walaupun beberapa bukti menunjukkan bahwa gajah semak afrika dan gajah hutan afrika merupakan spesies yang berbeda (L. africana dan L. cyclotis).",
                desc2mamalia = "Gajah merupakan hewan herbivora yang dapat ditemui di berbagai habitat, seperti sabana, hutan, gurun, dan rawa-rawa. Mereka cenderung berada di dekat air. Gajah dianggap sebagai spesies kunci karena dampaknya terhadap lingkungan."
            ),
            mamalia(
                R.drawable.harimau,
                namemamalia = "Harimau",
                descmamalia = "Harimau (Panthera tigris) adalah spesies kucing terbesar yang masih hidup dari genus Panthera. Harimau memiliki ciri loreng yang khas pada bulunya, berupa garis-garis vertikal gelap pada bulu oranye, dengan bulu bagian bawah berwarna putih.",
                desc2mamalia = "Harimau adalah pemangsa puncak, mereka terutama memangsa ungulata seperti rusa dan babi celeng. Harimau adalah hewan teritorial dan umumnya merupakan pemangsa soliter yang penyendiri, tetapi tetap memiliki sisi sosial, mereka tetap tinggal di area-area yang berdekatan, untuk mendukung kebutuhan makanan dan membesarkan keturunannya."
            ),
            mamalia(
                R.drawable.kangguru,
                namemamalia = "Kangguru",
                descmamalia = "Kanguru (atau kangguru) adalah hewan mamalia yang memiliki kantung (marsupialia). Hewan ini termasuk hewan khas Australia. Kata kanguru diambil dari bahasa Aborigin gangguru.",
                desc2mamalia = "Kanguru mempunyai dua kaki belakang yang kuat, telapak kakinya yang besar didesain untuk meloncat. Kanguru biasa melompat dengan kecepatan 20–25 km/jam. Tapi mereka bisa melompat hingga kecepatannya menjadi 70 km/jam. Harapan hidup kanguru sekitar 9-18 tahun. Walau kadang-kadang ada kanguru yang bisa bertahan hidup hingga 28 tahun."
            ),
           mamalia(
                R.drawable.kelinci,
                namemamalia = "Kelinci",
                descmamalia = "Kelinci adalah hewan mamalia dari famili Leporidae, yang dapat ditemukan di banyak bagian bumi. Kelinci berkembang biak dengan cara beranak yang disebut vivipar.",
                desc2mamalia = "Dulunya, hewan ini adalah hewan liar yang hidup di Afrika hingga ke daratan Eropa. Pada perkembangannya, tahun 1912, kelinci diklasifikasikan dalam ordo Lagomorpha. Ordo ini dibedakan menjadi dua famili, yakni Ochtonidae (jenis pika yang pandai bersiul) dan Leporidae (termasuk di dalamnya jenis kelinci dan terwelu). "
            ),
            mamalia(
                R.drawable.koala,
                namemamalia = "Koala",
                descmamalia = "Koala (Phascolarctos cinereus) adalah salah satu binatang berkantung (marsupial) khas dari Australia dan merupakan wakil satu-satunya dari keluarga Phascolarctidae.",
                desc2mamalia = "Koala dapat ditemukan di sepanjang pesisir timur Australia mulai dari Adelaide sampai ke Semenanjung Cape York, dan sampai jauh ke pedalaman karena terdapat curah hujan yang cukup untuk mendukung hutan sebagai habitat yang cocok untuk koala."
            ),
            mamalia(
                R.drawable.monyet,
                namemamalia = "Monyet",
                descmamalia = "Monyet adalah istilah untuk semua anggota primata yang bukan prosimia (\"pra-kera\", seperti lemur dan tarsius) atau kera, baik yang tinggal di Dunia Lama maupun Dunia Baru. ",
                desc2mamalia = "Pengelompokan monyet bersifat parafiletik, karena monyet Dunia Lama (Cercopithecoidea) sebenarnya lebih dekat kekerabatan genetiknya dengan kera (Hominidae), daripada monyet Dunia Baru (Platyrrhini)."
            ),
            mamalia(
                R.drawable.panda,
                namemamalia = "Panda",
                descmamalia = "Panda adalah seekor mamalia yang biasanya diklasifikasikan ke dalam keluarga beruang, Ursidae, yang merupakan hewan asli Tiongkok Tengah. ",
                desc2mamalia = " Panda Raksasa tinggal di wilayah pegunungan, seperti Sichuan dan Tibet. Pada setengah abad ke-20 terakhir, panda menjadi semacam lambang negara Tiongkok, dan sekarang ditampilkan pada uang emas negara tersebut."
            ),
            mamalia(
                R.drawable.sapi,
                namemamalia = "Sapi",
                descmamalia = "api atau Lembu adalah hewan ternak anggota famili Bovidae dan subfamili Bovinae. Sapi dipelihara terutama untuk dimanfaatkan susu dan dagingnya sebagai pangan manusia.",
                desc2mamalia = "Kebanyakan Sapi merupakan keturunan dari jenis liar yang dikenal sebagai aurochs (dalam bahasa Jerman berarti \"Sapi Kuno\", nama ilmiah: Bos primigenius), yang sudah punah di Eropa sejak 1627. Namun, terdapat beberapa spesies sapi liar lain yang keturunannya didomestikasi, termasuk sapi bali yang juga diternakkan di Indonesia."
            ),

        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_mamalia)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = mamaliadapter(this, namakotaList) {
            val intent = Intent(this, detail_mamalia::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}





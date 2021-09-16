package com.tif.abdomenexcerciseapps.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tif.abdomenexcerciseapps.R
import kotlinx.android.synthetic.main.activity_teknik.*

class TeknikActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teknik)
        back.setOnClickListener {
            finish()
        }
        isiGerakan()

    }

    private fun isiGerakan(){
        if(intent.extras != null){
            val data = intent.getStringExtra("data1")
            if (data == "gerakan1"){
                imageGerakan.setImageResource(R.drawable.foto1)
                ivVideo.setOnClickListener {
                    val intent = Intent(this, TeknikVideoActivity::class.java)
                    intent.putExtra("data1", "gerakan1")
                    startActivity(intent)
                }
                tvName.setText("Gerakan 1")
                tvDesc.setText("    Gerakan pertama senam hamil adalah ibu posisi terlentang dengan beralas matras. Usahakan tidak menggunakan kasur busa atau matras yang empuk, karena akan mengganggu optimalisasi hasil senam. Pada posisi ini, punggung dan pinggang ibu akan terulur. Ketika umur kehamilan ibu bertambah, daerah punggung atau yang dinamakan tulang vertebra akan mengalami posisi melengkung atau tidak tegak serta posisi bahu akan membungkuk ke depan." +
                        "\n     Pada gerakan pertama ibu melakukan pengaturan pernafasan dengan cara menghirup udara melewati hidung dan mengeluarkan atau menghembuskan nafas melewati mulut. Kegiatan ini dilakukan selama 3 kali sampai dengan ibu rilex. ")
            }
            else if ( data == "gerakan2"){
                imageGerakan.setImageResource(R.drawable.foto2)
                ivVideo.setOnClickListener {
                    val intent = Intent(this, TeknikVideoActivity::class.java)
                    intent.putExtra("data1", "gerakan2")
                    startActivity(intent)

                }
                tvName.setText("Gerakan 2")
                tvDesc.setText("    Pada gerakan kedua, salah satu kaki ditekuk dan kaki yang lainnya dalam kondisi lurus. Pada gambar berikut, kaki kanan lurus. Terdapat tiga point penting disini yaitu telapak kaki, perut bagian bawah dan kepala ibu. Pada telapak kaki posisi yang diharapkan adalah tertarik kearah dalam menuju badan ibu hamil. Kemudian pada otot perut dilakukan pengencangan. Cara mengecek secara mandiri tindakan ini betul atau tidak adalah dengan memegang daerah panggul tapatnya bagian pantat dalam kondisi dikerutkan seperti menahan Buang Air Kecil (BAK). Jika hasilnya adalah mengkerut, maka tindakan sudah benar. Kemudian langkah selanjutnya adalah memperhatikan posisi kepala, saat bersamaan kepala diangkat menuju dada ibu hamil. Gerakan ini dilakukan 6 kali hitungan dengan menarik kaki lurus ke atas. " +
                        "\n     Tujuan gerakan ini adalah untuk memompa darah yang ada di ekstremitas inferior (daerah pusar perut ke ujung kaki) menuju jantung. Hal  ini bertujuan untuk melancarkan peredaran darah.")
            }
            else if ( data == "gerakan3"){
                imageGerakan.setImageResource(R.drawable.foto3)
                ivVideo.setOnClickListener {
                    val intent = Intent(this, TeknikVideoActivity::class.java)
                    intent.putExtra("data1", "gerakan3")
                    startActivity(intent)

                }
                tvName.setText("Gerakan 3")
                tvDesc.setText("    Gerakan ketiga adalah uji coba gerahan kedua. Maksud dari kalimat tersebut adalah teknik gerakan ketiga merupakan gerakan untuk pemula atau bisa dikatakan baru pertama kali melakukan senam ini. Hal ini bertujuan untuk membuat ibu hamil tidak bingung ketika senam abdomen exercise ini. Jadi point penting pada gerakan ini adalah kaki dan perut bagian bawah. Teknik ini dilakukan sebanayk 15 kali dengan durasi 6 ketukan. Pada pemula, jumlah gerakan disesuaikan dengan kemampuan." +
                        "\n     Dari gambar terlihat bahwa gerakan kaki, perut bagian bawah dan kepala terjadi dalam waktu yang bersamaan.")
            }
            else if ( data == "gerakan4"){
                imageGerakan.setImageResource(R.drawable.foto4)
                ivVideo.setOnClickListener {
                    val intent = Intent(this, TeknikVideoActivity::class.java)
                    intent.putExtra("data1", "gerakan4")
                    startActivity(intent)

                }
                tvName.setText("Gerakan 4")
                tvDesc.setText("    Setelah gerakan pada kaki kanan selesai dilakukan, maka gerakan dilanjutkan pada kaki kiri dengan teknik, durasi dan frekuensi  yang sama. Jika di tengah proses senam ibu hamil kelelahan, maka ibu hamil bisa beristirahat terlebih dahulu untuk minum.")
                   }
            else if ( data == "gerakan5"){
                imageGerakan.setImageResource(R.drawable.foto5)
                ivVideo.setOnClickListener {
                    val intent = Intent(this, TeknikVideoActivity::class.java)
                    intent.putExtra("data1", "gerakan5")
                    startActivity(intent)

                }
                tvName.setText("Gerakan 5")
                tvDesc.setText("    Selanjutnya adalah gerakan kelima, gerakan ini adalah gerakan inti untuk melatih kekuatan otot abdomen. Pada gerakan ini, otot yang akan dilatih adalah otot transfersus abdominis, otot diafragma dan otot pelvic. Tujuan gerakan ini adalah untuk menguatkan dan mengelastiskan otot abdomen dan otot uterus. Harapanya, ketika proses persalinan kontraksi uterus akan mampu bekerja secara optima dan gaya dorong yang dihasilkan oleh kontraksi uterus dan dorongan janin akan optimal. " +
                        "\n     Gerakan kelima diawali dengan mengencangkan perut bagian bawah dan menarik telapak kaki kearah dalam secara kuat. Gerakan dihitung sebanyak 6 kali ketukan dan dilakukan sebanyak 15 kali.")
            }
            else if ( data == "gerakan6"){
                imageGerakan.setImageResource(R.drawable.foto6)
                ivVideo.setOnClickListener {
                    val intent = Intent(this, TeknikVideoActivity::class.java)
                    intent.putExtra("data1", "gerakan6")
                    startActivity(intent)

                }
                tvName.setText("Gerakan 6")
                tvDesc.setText("    Gerakan keenam atau gerakan terakhir adalah kelanjutan dari gerakan kelima yang dilanjutkan dengan mengngkat kepala kea rah dada. Gerakn dilakukan selama 6 kali ketukan sebanyak 15 kali gerakan.")
                   }
        }
    }
}


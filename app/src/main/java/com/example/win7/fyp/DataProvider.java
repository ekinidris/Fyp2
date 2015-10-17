package com.example.win7.fyp;

/**
 * Created by Win7 on 9/20/2015.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataProvider {

    public static HashMap<String, List<String>> getInfo()
    {
        HashMap<String, List<String>> MoviesDetails = new HashMap<String, List<String>>();

        List<String> A1 = new ArrayList<String>();
        A1.add("2.1.1 Syarat dan kelayakan masuk bagi program Diploma dan Sarjana Muda ditentukan oleh Jawatankuasa Akademik Fakulti/Pusat Akademik dengan kelulusan Senat.\n" +
                "2.1.2 Pemilihan Pelajar\n" +
                "2.1.2.1 Pemilihan pelajar untuk kemasukan ke Program Pengajian diperakukan oleh Fakulti/Pusat Akademik.\n" +
                "2.1.2.2 Pemilihan pelajar untuk kemasukan ke program Pengajian Luar Kampus (PLK) diperakukan oleh Fakulti/Pusat Akademik.\n" +
                "2.1.2.3 Pemilihan pelajar untuk kemasukan ke Program Pengajian Jarak Jauh (e-PJJ)/Usahasama (PPU) diperakukan oleh Pengarah Institut Pendidikan Neo (iNED).\n" +
                "2.1.3 Calon yang memohon kemasukan ke program Sarjana Muda mestilah menduduki Malaysian University English Test (MUET) dan mencapai tahap yang ditetapkan oleh Universiti. Pelajar-pelajar antarabangsa mestilah mempunyai kelulusan TOEFL atau IELTS dengan tahap yang ditetapkan oleh Universiti.\n" +
                "2.1.4 Tawaran kemasukan untuk pelajar sepenuh masa dan PLK dikeluarkan oleh Bahagian Pengambilan Pelajar dan ianya sah untuk semester berkenaan sahaja. Tawaran kemasukan untuk pelajar separuh masa dikeluarkan oleh iNED.\n" +
                "2.1.5 Kemasukan pelajar baru bagi semua Program Pengajian adalah pada permulaan semester pengajian.\n" +
                "2.1.6 Pelajar tidak dibenarkan mendaftar lebih dari satu Program Pengajian pada suatu masa yang sama.\n" +
                "2.1.7 Pelajar sepenuh masa berikut tidak dibenarkan dan tidak akan dipertimbangkan permohon kemasukan semula pengajian pada taraf yang sama mana-mana program universiti:\n" +
                "2.1.7.1 Pelajar berstatus gagal dan diberhentikan/gugur taraf, Program Pra-Diploma.\n" +
                "2.1.7.2 Pelajar berstatus gagal dan diberhentikan/gugur taraf, Program Diploma.\n" +
                "2.1.7.3 Pelajar berstatus gagal dan diberhentikan/gugur taraf, Program Sarjana Muda.\n" +
                "2.1.8 Pelajar yang diberhentikan atas tindakan tatatertib tidak dibenarkan memohon kemasukan semula ke mana-mana program Universiti.\n" +
                "2.1.9 Pelajar yang menarik diri dari Universiti boleh memohon semula bagi kemasukan ke Program Pengajian yang lain.");

        List<String> A2 = new ArrayList<String>();
        A2.add("2.2.1 Status pelajar Universiti tertakluk kepada syarat-syarat berikut:\n" +
                "2.2.1.1 Mendaftar sebagai pelajar dengan Universiti untuk mengikuti Program Pengajian pada tarikh pendaftaran rasmi yang ditetapkan,\n" +
                "2.2.1.2 Menjelaskan yuran pengajian tidak lewat dari tarikh pendaftaran rasmi yang ditetapkan, dan\n" +
                "2.2.1.3 Mendaftar kursus yang ditetapkan dalam Pelan Pengajian untuk semester berkenaan dalam tempoh yang ditetapkan.\n" +
                "2.2.2 Bayaran pemprosesan sebanyak RM100.00 akan dikenakan kepada pelajar yang mendaftar dan menjelaskan yuran pengajian lewat dari tarikh pendaftaran rasmi tanpa kebenaran Universiti.\n" +
                "2.2.3 Pelajar yang telah memenuhi syarat Perkara 2.2.1 dan memohon menarik diri dalam tempoh 30 hari dari tarikh pendaftaran rasmi dibolehkan memohon pemulangan yuran pengajian dan perkhidmatan. Sila rujuk Jadual 7, Kadar Pemulangan Yuran Pelajar UiTM Yang Memohon Bercuti atau Berhenti dari Universiti (rujuk JKP178).");


        List<String> A3= new ArrayList<String>();
        A3.add("Pelajar akan diberikan status Gugur Taraf (GT) sekiranya tidak mematuhi Perkara 2.2.1.");

        List<String> KEPERLUAN_AKADEMIK = new ArrayList<String>();
        KEPERLUAN_AKADEMIK.add("Pelajar Diploma/Sarjana Muda dikehendaki memenuhi semua keperluan akademik berikut:\n" +
                "2.4.1 Kurikulum Pengajian\n" +
                "Pelajar dikehendaki mendaftar dan lulus semua kursus dalam komponen berikut:\n" +
                "2.4.1.1 Kursus Universiti\n" +
                "2.4.1.2 Kursus Teras\n" +
                "2.4.1.3 Kursus Minor dan/atau Elektif\n" +
                "(Sila rujuk Jadual 1 - Jadual 3)\n" +
                "2.4.2 Pra-syarat dan Ko-syarat\n" +
                "2.4.2.1 Fakulti mengenalpasti dan menetapkan kursus pra-syarat dalam program yang ditawarkan (jika berkaitan).\n" +
                "2.4.2.2 Fakulti mengenalpasti dan menetapkan kursus ko-syarat dalam program yang ditawarkan (jika berkaitan).2.4.3 Pemindahan Kredit Antara IPT\n" +
                "Pemindahan kredit antara IPT boleh dipohon melalui program pertukaran pelajar antara IPT.\n" +
                "2.4.3.1 Pelajar yang ingin memohon menyertai program pertukaran pelajar antara IPT perlulah mencapai HPNG sekurang-kurangnya 3.00.\n" +
                "2.4.3.2 Permohonan untuk program pertukaran pelajar antara IPT boleh dikemukakan menggunakan Borang Permohonan Pertukaran Pelajar Antara IPT.\n" +
                "2.4.3.3 Bagi setiap permohonan program pertukaran pelajar antara IPT yang diluluskan, pelajar perlu mendaftar dan membayar yuran pengekalan status sebagai pelajar Universiti sepanjang mengikuti kursus di IPT lain yang dipohon.\n" +
                "2.4.3.4 Permohonan untuk pemindahan kredit boleh dikemukakan menggunakan Borang HEA/RA/PD-2007-1[Pemindahan Kredit Antara IPT] setelah memenuhi syarat pemindahan kredit iaitu mendapat sekurang-kurangnya gred C atau mata gred 2.00 dan jumlah jam kredit yang dipindahkan tidak melebihi dari satu pertiga (1/3) jumlah kredit program yang diikuti di Universiti.\n" +
                "2.4.3.5 Jumlah maksimum unit kredit untuk dipindahkan tidak melebihi satu pertiga (1/3) jumlah unit kredit bagi Program Pengajian yang sedang diikuti.\n" +
                "2.4.3.6 Unit kredit, gred dan nilai gred kursus yang diperolehi akan dimasukkan dalam pengiraan PNG dan HPNG.\n" +
                "2.4.3.7 Kelulusan pertukaran pelajar dan pemindahan kredit akan diputuskan oleh Jawatankuasa Akademik Fakulti/Pusat Akademik/UiTM Negeri atau Jawatankuasa Kecil Akademik UiTM Cawangan yang mengendalikan kursus berkaitan.\n" +
                "2.4.4 Pemindahan Kredit Dalaman\n" +
                "Pemindahan Kredit Dalaman hendaklah dipohon bersekali dengan permohonan pertukaran program menggunakan Borang HEA/RA/ITC-2007-1 [Pemindahan Kredit Dalaman].\n" +
                "2.4.4.1 Semua gred kursus yang diperolehi pada Program Pengajian asal yang mempunyai kod kursus yang sama atau setara akan dipindahkan kepada Program Pengajian baru.\n" +
                "2.4.4.2 Pemindahan gred mengambil kira semua gred lulus dan gagal, termasuk gred FD, XX, YY dan ZZ.\n" +
                "2.4.4.3 Semua gred yang dipindahkan akan digunakan untuk pengiraan PNG dan HPNG pelajar pada Program Pengajian baru.\n" +
                "2.4.4.4 Jumlah maksimum unit kredit untuk dipindahkan tidak melebihi satupertiga (1/3) jumlah unit kredit bagi Program Pengajian yang sedang diikuti.\n" +
                "2.4.4.5 Tidak dibenarkan untuk pelajar yang telah berjaya memasuki program lain setelah berhenti atau diberikan status gagal dan diberhentikan dari satu program di UiTM.\n" +
                "2.4.4.6 Kelulusan permohonan dipertimbangkan oleh Jawatankuasa Akademik Fakulti/Pusat Akademik/UiTM Negeri atau Jawatankuasa Kecil Akademik UiTM Cawangan.\n" +
                "2.4.5 Pengecualian Kredit\n" +
                "Pelajar boleh memohon pengecualian kredit untuk sesuatu kursus mengikut peraturan yang telah ditetapkan oleh Universiti.\n" +
                "2.4.5.1 Syarat pengecualian kredit:\n" +
                "a) Pelajar yang gagal/tidak tamat/diberhentikan dari mana-mana Program Pengajian/Program IPT tidak layak diberi pengecualian kredit.\n" +
                "b) Jumlah maksimum unit kredit untuk dikecualikan tidak melebihi satu pertiga (1/3) jumlah unit kredit bagi Program Pengajian yang sedang diikuti.\n" +
                "c) Kursus yang dipohon untuk pengecualian kredit mempunyai pertindihan kandungan sekurang-kurangnya 75% dengan kursus yang ditawarkan kecuali kursus Universiti.\n" +
                "d) Kursus yang dipohon untuk pengecualian kredit hendaklah berstatus Lulus.\n" +
                "2.4.5.2 Prosedur pengecualian kredit adalah seperti berikut:\n" +
                "a) Permohonan pengecualian kredit hendaklah dibuat sekali sahaja dalam tempoh pengajian dan semasa semester pertama pengajian sahaja dengan mengisi Borang HEA/RA/PC-2000-1 [Pengecualian Kredit].\n" +
                "b) Borang permohonan pengecualian kredit hendaklah dimajukan kepada Fakulti/Pusat Akademik dalam tempoh 14 hari dari tarikh pendaftaran rasmi pelajar.\n" +
                "c) Jumlah unit kredit yang diberi pengecualian diiktiraf sebagai memenuhi syarat keperluan kredit bagi Program Pengajian, gred dan nilai gred kursus yang diberi pengecualian tidak diambil kira dalam penjanaan PNG dan HPNG.\n" +
                "d) Kelulusan pengecualian kredit akan dipertimbangkan oleh Jawatankuasa Akademik Fakulti/Pusat Akademik/UiTM Negeri atau Jawatankuasa Kecil Akademik UiTM Cawangan.\n" +
                "e) Keputusan permohonan pengecualian kredit akan dimaklumkan kepada pelajar selewat-lewatnya 28 hari bekerja selepas tarikh pendaftaran rasmi.\n" +
                "2.4.5.3 Permohonan pengecualian kredit bagi pelajar PLK dikenakan bayaran proses sebanyak RM100.00.");

        List<String>TEMPOH_PENGAJIAN = new ArrayList<String>();
        TEMPOH_PENGAJIAN.add("Tempoh pengajian bagi pelajar sepenuh masa adalah seperti berikut:\n" +
                "2.5.1 Program Diploma\n" +
                "Tiga (3) Tahun Sehingga enam (6) semester.\n" +
                "2.5.2 Program Sarjana Muda\n" +
                "2.5.2.1 Sehingga enam (6) semester bagi program tiga (3) tahun.\n" +
                "2.5.2.2 Sehingga lapan (8) semester bagi program empat (4) tahun.\n" +
                "[Perkara 2.5 berkuatkuasa pemakaiannya mulai kumpulan pelajar pengambilan Disember 2007].");

        List<String>MOD_PENGAJIAN = new ArrayList<String>();
        MOD_PENGAJIAN.add("2.6.1 Terdapat tiga (3) jenis Mod Pengajian\n" +
                "2.6.1.1 Sepenuh Masa\n" +
                "2.6.1.2 Sepenuh Masa Berlanjut (SML)\n" +
                "2.6.1.3 Separuh Masa\n" +
                "a) Pengajian Luar Kampus (PLK)\n" +
                "b) Pengajian Jarak Jauh secara Elektronik (e-PJJ)\n" +
                "2.6.2 Penukaran Mod Pengajian\n" +
                "2.6.2.1 Penukaran Mod Pengajian dari Sepenuh Masa ke Separuh Masa\n" +
                "Pelajar sepenuh masa boleh memohon untuk menukar mod pengajian ke separuh masa berdasarkan syarat- syarat berikut:\n" +
                "a) Permohonan dibuat untuk mengikuti Program Pengajian yang sama.\n" +
                "b) Pertukaran hanya dibenarkan sekali sahaja sepanjang tempoh pengajian.\n" +
                "c) Permohonan dikemukakan secara bertulis kepada Dekan/Rektor/ Pengarah iNED.\n" +
                "d) Permohonan dikemukakan dalam masa empat (4) minggu sebelum tarikh rasmi kuliah bermula pada semester berikutnya.\n" +
                "e) Tempoh pengajian semester sebelumnya diambil kira setara dengan tempoh pengajian mod separuh masa.\n" +
                "f) Permohonan pertukaran mod pengajian akan dipertimbangkan oleh Jawatankuasa Akademik Fakulti/Pusat Akademik/UiTM Negeri atau Jawatankuasa Kecil Akademik UiTM Cawangan." +
                "2.6.2.2 Penukaran Mod Pengajian dari Separuh Masa ke Sepenuh Masa.\n" +
                "Pelajar separuh masa boleh memohon untuk menukar mod pengajian ke sepenuh masa berdasarkan syarat- syarat berikut:\n" +
                "a) Pelajar mendapat biasiswa kerajaan/badan-badan berkanun/swasta dan/atau pegawai-pegawai kerajaan/swasta yang diberi cuti belajar untuk mengikuti program sepenuh masa.\n" +
                "b) Pelajar memenuhi syarat-syarat kemasukan pengajian sepenuh masa.\n" +
                "c) Pelajar tidak pernah disabitkan tindakan tatatertib.\n" +
                "d) Pelajar mesti menjelaskan bayaran tertunggak kepada Universiti.\n" +
                "e) Permohonan dikemukakan secara bertulis kepada Dekan/Rektor/ Pengarah iNED.\n" +
                "f) Permohonan dikemukakan dalam masa empat (4) minggu sebelum tarikh rasmi kuliah bermula pada semester berikutnya.\n" +
                "g) Pertukaran hanya dibenarkan sekali sahaja sepanjang tempoh pengajian.\n" +
                "h) Tempoh pengajian semester sebelumnya akan diambil kira setara dengan tempoh pengajian mod sepenuh masa.\n" +
                "i) Permohonan pertukaran mod pengajian akan dipertimbangkan oleh Jawatankuasa Akademik Fakulti/Pusat Akademik/UiTM Negeri atau Jawatankuasa Kecil Akademik UiTM Cawangan.\n" +
                "2.6.2.3 Penukaran Mod Pengajian dari Sepenuh Masa ke SML\n" +
                "Pelajar sepenuh masa ditukarkan mod pengajian secara automatik kepada SML sekiranya:\n" +
                "a) melebihi tempoh pengajian yang ditetapkan dalam Pelan Pengajian, dan\n" +
                "b) berstatus lulus dengan HPNG sekurang-kurangnya 2.00.\n" +
                "[Perkara 2.6.2.3 berkuatkuasa pemakaiannya mulai kumpulan pelajar pengambilan Disember 2007].\n" +
                "2.6.3 Mod Pengajian SML\n" +
                "2.6.3.1 Diberikan kepada pelajar dalam keadaan berikut:\n" +
                "a) seperti dalam Perkara 2.6.2.3, atau\n" +
                "b) apabila diluluskan permohonan Rayuan Meneruskan Pengajian setelah gagal dan diberhentikan dengan status D3 - D7.\n" +
                "2.6.3.2 Dikenakan yuran dan tempoh pengajian separuh masa (PLK).");

        List<String>CUTI_KHAS = new ArrayList<String>();
        CUTI_KHAS.add("2.7.1 Pelajar sepenuh masa boleh memohon cuti khas bagi tempoh maksimum dua (2) semester.\n" +
                "2.7.2 Pelajar sepenuh masa berlanjut dan separuh masa boleh memohon cuti2.7.3 Tempoh cuti khas yang diluluskan atas sebab kesihatan atau sebab-sebab lain yang difikirkan munasabah oleh Dekan/Rektor tidak diambil kira sebagai tempoh pengajian di Universiti.\n" +
                "2.7.4 Tempoh cuti khas yang diluluskan atas sebab-sebab selain dari yang ditetapkan dalam Perkara 2.7.3 adalah diambil kira sebagai tempoh pengajian di Universiti.\n" +
                "2.7.5 Permohonan cuti khas hendaklah dibuat dengan mengisi Borang HEA/RP/CK-01[Cuti Khas] kepada pihak Fakulti/Pusat Akademik/UiTM Negeri/UiTM Cawangan tidak lewat dari empat belas (14) hari bekerja sebelum peperiksaan akhir bermula. Permohonan cuti khas atas sebab kesihatan pelajar perlu disertakan dengan surat/laporan yang dikeluarkan oleh Pegawai Perubatan Universiti atau hospital kerajaan.\n" +
                "2.7.6 Bagi pelajar yang disediakan kemudahan perubatan oleh majikan, permohonan cuti khas atas sebab kesihatan perlu disertakan dengan surat/laporan yang dikeluarkan oleh Pegawai Perubatan dari Panel Perubatan majikan masing-masing atau hospital kerajaan.\n" +
                "2.7.7 Kelulusan untuk cuti khas akan dipertimbangkan oleh Dekan/Rektor bagi semester semasa sahaja.\n" +
                "2.7.8 Pelajar yang diluluskan cuti khas dan telah membayar yuran pengajian dikecualikan dari membayar yuran pengekalan status pada semester tersebut. Yuran pengajian yang telah dibayar boleh dibawa kehadapan tertakluk atas tujuan cuti khas berkaitan kesihatan sahaja.\n" +
                "2.7.9 Pelajar sepenuh masa yang belum membayar yuran pengajian perlu membayar RM55 dan pelajar PLK yang belum membuat pembayaran yuran pengajian perlu membayar RM45 untuk mengekalkan status sebagai pelajar (rujuk JKP 167).");

        List<String>PENANGGUHAN_PENGAJIAN = new ArrayList<String>();
        PENANGGUHAN_PENGAJIAN.add("Pelajar sepenuh masa boleh diberi status penangguhan pengajian dengan persetujuan Universiti atas sebab-sebab tertentu. Tempoh tersebut tidak diambil kira sebagai tempoh pengajian di Universiti.");

        List<String>R1 = new ArrayList<String>();
        R1.add("2.9.1 Pengajian seseorang pelajar boleh digantung oleh Universiti sebagaimana yang diperuntukkan dalam Akta 174 (Akta Institusi-Institusi Pelajaran (Tatatertib) 1976).\n" +
                "2.9.2 Penggantungan ini diambil kira sebagai tempoh pengajian");

        List<String>R2 = new ArrayList<String>();
        R2.add("2.10.1 Pendaftaran kursus mestilah dilakukan secara atas talian melalui Gerbang Maklumat Pelajar (i-Student Portal) dengan mengikut prosedur yang ditetapkan oleh Universiti." +
                "2.10.2 Jumlah jam kredit pelajar program Diploma dan Sarjana Muda hendaklah di antara 17 - 23 unit kredit kecuali semester latihan industri/pelajar semester akhir yang akan menamatkan pengajian.\n" +
                "2.10.3 Pelajar Sarjana Muda semester akhir yang berstatus Lulus dibenarkan mengambil maksimum 24 unit kredit dengan kelulusan Dekan/Rektor untuk menamatkan pengajian.\n" +
                "2.10.4 Jumlah kredit yang boleh diambil oleh pelajar Diploma berstatus Perhatian (sila rujuk Perkara 2.20.3) tidak lebih dari dua belas (12) untuk kredit dalam sesuatu semester.\n" +
                "2.10.5 Jumlah kredit yang boleh diambil oleh pelajar Sarjana Muda berstatus Perhatian (sila rujuk Perkara 2.20.3) tidak lebih dari lima belas (15) unit kredit dalam sesuatu semester.");

        List<String>R3 = new ArrayList<String>();
        R3.add("Pindaan pendaftaran kursus merangkumi:\n" +
                "2.11.1 Penambahan Kursus\n" +
                "Pelajar boleh menambah kursus secara atas talian dengan mengikut prosedur yang ditetapkan oleh Universiti.\n" +
                "2.11.2 Pengguguran Kursus\n" +
                "Pelajar boleh menggugur kursus secara atas talian dengan mengikut prosedur yang ditetapkan oleh Universiti.");

        List<String>R4 = new ArrayList<String>();
        R4.add("Pelajar dikehendaki membuat pengesahan pendaftaran kursus secara atas talian dan mencetak salinan pendaftaran kursus dalam tempoh empat belas (14) " +
                "hari selepas tarikh akhir pengguguran kursus. Sekiranya pelajar tidak membuat pengesahan, pendaftaran kursus tersebut dengan sendirinya dianggap sah dan muktamad.");

        List<String>R5 = new ArrayList<String>();
        R5.add("2.13.1 Pelajar diwajibkan menghadiri kuliah serta aktiviti pembelajaran lain seperti bengkel/tutorial/makmal/studio/medan/latihan amali/ praktikum/industri dan klinikal seperti yang ditetapkan dalam kurikulum.\n" +
                "2.13.2 Pelajar yang tidak mencapai kehadiran 80% dari jumlah jam temu untuk setiap kursus tanpa mendapat kebenaran bertulis dari Fakulti/Pusat Akademik/UiTM Negeri/UiTM Cawangan tidak dibenarkan menduduki peperiksaan akhir kursus.\n" +
                "2.13.3 Bagi kursus yang tiada peperiksaan akhir, kerja kursus tidak akan diberi penilaian.\n" +
                "2.13.4 Pelajar yang disebutkan dalam Perkara 2.13.2 dan Perkara 2.13.3 akan" +
                "diberikan Gred F (gagal) dengan status ZZ serta dikenakan bayaran pemprosesan sebanyak RM100.00.");

        List<String>R6 = new ArrayList<String>();
        R6.add("2.14.1 Pelajar perlu menyemak Penyata Kelayakan Menduduki Peperiksaan (Sementara) yang dipaparkan dalam i-Student Portal. Sebarang pindaan hendaklah mendapat pengesahan daripada Pengerusi Program/Penasihat Akademik dalam tempoh empat belas (14) hari selepas tarikh akhir gugur kursus.\n" +
                "2.14.2 Pelajar mesti membuat pengesahan ke atas Penyata Kelayakan Menduduki Peperiksaan (Sementara) melalui i-Student Portal. Sekiranya pelajar gagal berbuat demikian, penyata tersebut dengan sendirinya dianggap sah dan muktamad.\n" +
                "2.14.3 Cetakan rasmi Penyata Kelayakan Menduduki Peperiksaan (Muktamad) dicetak sendiri oleh pelajar melalui Gerbang Maklumat Pelajar UiTM (i-Student Portal) selepas semua urusan pendaftaran kursus dan pengesahan Penyata Kelayakan Menduduki Peperiksaan (Sementara) selesai. Sebarang pindaan tidak dibenarkan.\n" +
                "2.14.4 Pelajar yang gagal membawa Penyata Kelayakan Menduduki Peperiksaan bagi kursus yang melibatkan peperiksaan akhir tidak dibenarkan menduduki peperiksaan tersebut.");

        List<String>R7 = new ArrayList<String>();
        R7.add("2.15.1 Permohonan untuk tidak menduduki peperiksaan akhir bagi sesuatu kursus hendaklah dibuat kepada Dekan/Rektor sebelum peperiksaan untuk kursus tersebut dengan menyertakan dokumen/surat berkaitan.\n" +
                "2.15.2 Permohonan untuk tidak menduduki peperiksaan yang telah dijalankan bagi sesuatu kursus perlu dibuat kepada Dekan/Rektor dalam masa dua puluh empat (24) jam setelah tamatnya peperiksaan kursus tersebut dengan menyertakan sijil sakit yang dikeluarkan oleh doktor dari Pusat Kesihatan UiTM/klinik kerajaan/pusat kesihatan kerajaan/hospital kerajaan/Pegawai Perubatan dari Panel Perubatan majikan masing-masing.\n" +
                "2.15.3 Permohonan boleh dibuat secara bertulis atau menggunakan Borang HEA/RP/TMP-01[Kebenaran Tidak Menduduki Peperiksaan Akhir].\n" +
                "2.15.4 Jika permohonan diluluskan, pelajar akan diberi status XX bagi kursus tersebut.\n" +
                "2.15.5 Bagi permohonan yang tidak diluluskan, pelajar akan diberi status YY di mana markah kerja kursus yang diberi tidak diambilkira bagi kursus tersebut dan dikenakan bayaran pemprosesan sebanyak RM100.00.\n" +
                "2.15.6 Permohonan dipertimbangkan oleh Dekan/Rektor.");

        List<String>R8 = new ArrayList<String>();
        R8.add("Tarikh peperiksaan akhir diumumkan oleh Bahagian Hal Ehwal Peperiksaan.");

        List<String>R9 = new ArrayList<String>();
        R9.add("2.17.1 Deraf Pertama Jadual Peperiksaan Akhir yang disediakan oleh Bahagian Hal Ehwal Peperiksaan diberikan kepada Fakulti/Pusat Akademik/UiTM Negeri/UiTM Cawangan tidak lewat dari lima (5) minggu sebelum tarikh peperiksaan bermula.\n" +
                "2.17.2 Sebarang pertembungan perlu dilaporkan oleh pelajar secara bertulis kepada Fakulti/Pusat Akademik/UiTM Negeri/UiTM Cawangan dalam tempoh tujuh (7) hari selepas deraf pertama jadual peperiksaan akhir dipamerkan.\n" +
                "2.17.3 Jadual muktamad Peperiksaan Akhir dipamerkan tidak lewat dari tiga (3) minggu sebelum tarikh peperiksaan bermula.");

        List<String>R10 = new ArrayList<String>();
        R10.add("2.18.1 Keputusan peperiksaan dan penilaian kursus diberi dalam bentuk gred dan nilai gred (sila rujuk Jadual 4).\n" +
                "2.18.2 Keputusan bagi setiap kursus diberi status seperti berikut:\n" +
                "LU\n" +
                "− Lulus\n" +
                "F1\n" +
                "− Gagal kursus kali pertama\n" +
                "F2\n" +
                "− Gagal kursus kali kedua\n" +
                "F3\n" +
                "− Gagal kursus kali ketiga\n" +
                "PD\n" +
                "− Pemindahan Kredit\n" +
                "PC\n" +
                "− Pengecualian Kredit\n" +
                "TL\n" +
                "− Tidak lengkap\n" +
                "UD\n" +
                "− Audit\n" +
                "FD\n" +
                "− Tindakan disiplin\n" +
                "XX\n" +
                "− Tidak hadir peperiksaan dengan kebenaran\n" +
                "YY\n" +
                "− Tidak hadir peperiksaan tanpa kebenaran\n" +
                "ZZ\n" +
                "− Tidak dibenarkan menduduki peperiksaan akhir bagi kursus yang mempunyai peperiksaan akhir; atau tidak diberikan markah penilaian bagi kursus yang tiada peperiksaan akhir\n" +
                "2.18.3 Denda RM100.00 dikenakan untuk setiap kursus yang diberikan keputusan YY atau ZZ.\n" +
                "2.18.4 Status Tidak Lengkap (TL)\n" +
                "2.18.4.1 Status TL diberi kepada kursus berbentuk projek ilmiah/latihan amali/praktikum/latihan industri/klinikal yang tidak dapat dilengkapkan dalam semester yang ditetapkan.\n" +
                "2.18.4.2 Tempoh status TL adalah tidak melebihi satu (1) semester berikutnya. Sekiranya pelajar tidak menyiapkan projek ilmiah/latihan amali/praktikum/latihan industri/klinikal dalam tempoh yang ditetapkan, pelajar akan diberi Gred F atau gagal." +
                "2.18.4.3 Pelajar yang mempunyai kursus berstatus TL hendaklah mendaftar semula kursus tersebut dan membayar yuran pengajian pada semester akan datang.");

        List<String>R11 = new ArrayList<String>();
        R11.add("2.19.1 Keputusan Peperiksaan Akhir dan Penilaian pelajar di penghujung setiap semester disertakan dengan Purata Nilai Gred (PNG) dan Himpunan Purata Nilai Gred (HPNG) yang memberikan gambaran tentang pencapaian pelajar.\n" +
                "2.19.2 Rumus yang digunakan untuk mengira Purata Nilai Gred (PNG) dan Himpunan Purata Nilai Gred (HPNG) adalah seperti berikut:\n" +
                "PNG = Jumlah nilai kredit yang diperolehi di sesuatu semesterJumlah unit kredit yang didaftarkan dalam semester yang sama\n" +
                "HPNG = Jumlah nilai kredit yang diperolehi di semua semester Jumlah unit kredit yang terkumpul dalam semua semester\n" +
                "2.19.3 Penjanaan semula HPNG dilakukan untuk pelajar berstatus ANC, TS, TM dan D6 dengan menggantikan gred kursus yang gagal (sekiranya ada) menggunakan gred lulus kursus tersebut setelah ulangan. Gred FD, YY dan ZZ tidak diganti.\n" +
                "2.19.4 Rumus yang digunakan dalam penjanaan semula HPNG setelah pelajar lulus semua kursus dalam Pelan Pengajian ialah:\n" +
                "HPNG= Jumlah nilai kredit yang diperolehi di semua semester Jumlah unit kredit yang terkumpul dalam semua semester");

        List<String>R12 = new ArrayList<String>();
        R12.add("Berdasarkan kepada pencapaian HPNG, pelajar diberi status keputusan peperiksaan akhir dan penilaian seperti berikut:\n" +
                "ANC\n" +
                "− Tamat dengan Anugerah Naib Canselor\n" +
                "TS\n" +
                "− Tamat dengan Anugerah Dekan\n" +
                "TM\n" +
                "− Tamat\n" +
                "LNT\n" +
                "− Lulus Naik Taraf\n" +
                "AD\n" +
                "− Anugerah Dekan\n" +
                "LU\n" +
                "− Lulus\n" +
                "P\n" +
                "− Perhatian (Tidak Memuaskan)\n" +
                "D\n" +
                "− Gagal dan Diberhentikan\n" +
                "2.20.1 Status Tamat dengan Anugerah Naib Canselor (ANC), Tamat dengan Anugerah Dekan (TS) dan Anugerah Dekan (AD) dianugerahkan kepada pelajar berprestasi cemerlang.\n" +
                "2.20.2 Status Lulus (LU) dan Tamat (TM) Pelajar dianugerahkan kepada pelajar yang mencapai prestasi yang memuaskan." +
                "2.20.3 Status Perhatian (P) diberikan kepada pelajar yang mencapai prestasi yang tidak memuaskan dan dibahagikan kepada:\n" +
                "P1: Perhatian Pertama - memperolehi HPNG di antara 1.80 sehingga 1.99 pada sesuatu semester.\n" +
                "P2: Perhatian Kedua - memperolehi HPNG kurang daripada 2.00 selepas mendapat P1 pada semester terakhir sebelumnya.\n" +
                "2.20.4 Status Pemberhentian (D) diberikan kepada pelajar yang mencapai prestasi yang amat tidak memuaskan dan dibahagikan kepada:\n" +
                "D1\n" +
                "− HPNG kurang daripada 1.80.\n" +
                "D2\n" +
                "− HPNG kurang daripada 1.80 selepas status P1.\n" +
                "D3\n" +
                "− HPNG kurang daripada 2.00 selepas status P2.\n" +
                "D4\n" +
                "− Gagal dalam sesuatu kursus bagi kali ketiga.\n" +
                "D5\n" +
                "− HPNG kurang daripada 2.00 pada penghujung tempoh pengajian dan masih mempunyai kursus yang belum disempurnakan.\n" +
                "D6\n" +
                "− Lulus semua kursus yang dikehendaki oleh sesuatu program dan memenuhi semua keperluan program tetapi memperolehi HPNG kurang daripada 2.00.\n" +
                "D7\n" +
                "− Tidak menduduki peperiksaan bagi semua kursus terdaftar pada semester tersebut tanpa kelulusan Universiti\n" +
                "2.20.5 Status Sepenuh Masa Berlanjut (SML) diberi kepada pelajar sepenuh masa yang mencapai prestasi tidak memuaskan apabila mereka melebihi tempoh pengajian yang ditetapkan di dalam Pelan Pengajian.");

        List<String>R13 = new ArrayList<String>();
        R13.add("2.21.1 Penyata keputusan peperiksaan yang telah disahkan oleh Senat dipaparkan secara atas talian di Gerbang Maklumat Pelajar (i-Student Portal) dan dicetak sendiri oleh pelajar sebagai rekod. Cetakan yang diperolehi melalui paparan tersebut adalah diiktiraf sebagai cetakan rasmi di mana tiada tandatangan diperlukan.\n" +
                "2.21.2 Universiti berhak menahan Penyata Keputusan Peperiksaan atas apa-apa sebab tanpa pemakluman daripada Universiti sekiranya pelajar gagal mematuhi mana-mana peraturan yang ditetapkan oleh Universiti.");

        List<String>R14 = new ArrayList<String>();
        R14.add("2.22.1 Pelajar yang didapati bersalah di bawah Kaedah 3 (j), 3 (k) dan Kaedah 5, Kaedah-Kaedah Institusi Pelajaran (Tatatertib Pelajar-Pelajar) 1976, akan dihukum mengikut keputusan pihak berkuasa Lembaga Tatatertib Universiti.\n" +
                "2.22.2 Pelajar yang disabitkan kesalahan di atas mengikut keputusan Lembaga Tatatertib Universiti boleh diberi Gred F (gagal) dengan status FD oleh Senat.\n" +
                "2.22.3 Pelajar yang telah terbukti melakukan plagiarisme dalam projek ilmiah/tugasan akan digagalkan dalam kursus tersebut dan diberi gred F" +
                "(gagal) dengan status FD oleh Senat.");

        List<String>R15 = new ArrayList<String>();
        R15.add("Universiti berhak mengadakan peperiksaan semula pada bila-bila masa sekiranya perlu dalam keadaan berikut:\n" +
                "2.23.1 Berlaku kebocoran soalan Peperiksaan Akhir.\n" +
                "2.23.2 Pelajar tidak dapat menduduki Peperiksaan Akhir kerana bencana alam.\n" +
                "2.23.3 Arahan Naib Canselor.");

        List<String>R16 = new ArrayList<String>();
        R16.add("2.24.1 Peperiksaan Khas boleh diadakan bagi kursus yang ada peperiksaan akhir secara bertulis untuk membolehkan pelajar bergraduat menamatkan pengajian mereka dalam tempoh pengajian yang ditetapkan.\n" +
                "2.24.2 Peperiksaan Khas ditawarkan kepada semua pelajar.\n" +
                "2.24.3 Pelajar yang dibenarkan mengambil Peperiksaan Khas ialah:\n" +
                "2.24.3.1 Pelajar semester akhir yang berstatus lulus tetapi gagal dalam satu atau dua kursus sahaja.\n" +
                "2.24.3.2 Pelajar yang berstatus lulus tetapi gagal dalam satu atau dua kursus pada semester sebelum menjalani latihan praktik (bagi program yang menjalankan latihan praktik pada semester akhir).\n" +
                "2.24.3.3 Pelajar semester akhir dan bergraduat yang diberhentikan dengan status D3, D4, D5 serta mempunyai satu atau dua kursus sahaja untuk tamat. Pelajar adalah dinasihatkan juga untuk membuat Rayuan Meneruskan Pengajian (RMP) melalui Fakulti/Pusat Akademik/UiTM Negeri/UiTM Cawangan dalam tempoh empat belas (14) hari.\n" +
                "2.24.3.4 Pelajar semester akhir yang tidak dapat menduduki peperiksaan bagi satu atau dua kursus kerana disahkan sakit oleh pegawai perubatan Universiti atau hospital kerajaan. Pelajar harus disahkan status XX untuk kursus tersebut oleh Jawatankuasa Akademik Fakulti/Pusat Akademik/UiTM Negeri atau Jawatankuasa Kecil Akademik UiTM Cawangan.\n" +
                "2.24.4 Gred maksimum yang boleh diperolehi pelajar setelah menduduki Peperiksaan Khas ialah gred C.\n" +
                "2.24.5 Pelajar dengan kursus berstatus XX yang menduduki Peperiksaan Khas untuk kursus tersebut adalah diberikan gred sebenar dan tidak dikenakan yuran.\n" +
                "2.24.6 Yuran Peperiksaan Khas ialah RM100.00 untuk setiap kursus.\n" +
                "2.24.7 Pelajar yang tidak dibenarkan mengambil Peperiksaan Khas ialah:" +
                "2.24.7.1Pelajar yang gagal dan berstatus YY, ZZ dan FD.\n" +
                "2.24.7.2Pelajar yang gagal kursus bukan pada semester akhir.");

        List<String>R17 = new ArrayList<String>();
        R17.add("2.25.1 Intersesi ditawarkan kepada pelajar dengan tujuan untuk menamatkan pengajian dalam tempoh pengajian yang ditetapkan dalam Pelan Pengajian dengan syarat:\n" +
                "2.25.1.1Pelajar mengikuti pengajian dalam mod sepenuh masa sahaja.\n" +
                "2.25.1.2Pelajar mengambil maksimum dua (2) kursus sahaja.\n" +
                "2.25.1.3Kursus berkenaan ditawarkan oleh Fakulti/Pusat Akademik/UiTM Negeri/UiTM Cawangan bagi sesuatu sesi tertentu.\n" +
                "2.25.1.4Kursus yang ditawarkan tidak mempunyai pra-syarat dan/atau ko-syarat.\n" +
                "2.25.1.5Bilangan permohonan untuk mengikuti sesuatu kursus tidak kurang dari 15 orang.\n" +
                "2.25.2 Peperiksaan Intersesi hanya boleh diduduki oleh pelajar yang telah mendaftar dan membayar yuran sahaja. Yuran Intersesi ialah sebanyak RM200.00 untuk setiap kursus.\n" +
                "2.25.3 Status YY akan diberi kepada pelajar yang telah mendaftar dan membayar yuran untuk mengikuti program Intersesi tetapi tidak menghadiri kuliah dan/atau peperiksaan tanpa kebenaran bertulis daripada Dekan/Rektor. Yuran Intersesi tidak akan dikembalikan.\n" +
                "2.25.4 Pelajar yang sedang mengikuti program Intersesi dan kemudian diberhentikan kerana gagal peperiksaan semester sebelumnya dibenarkan meneruskan program Intersesi dengan syarat:\n" +
                "2.25.4.1 Pelajar layak untuk membuat Rayuan Meneruskan Pengajian.\n" +
                "2.25.4.2 Pelajar membuat Rayuan Meneruskan Pengajian.\n" +
                "2.25.5 Bagi pelajar dalam kategori yang dijelaskan pada Perkara 2.25.4, sekiranya Rayuan Meneruskan Pengajian pelajar tidak diluluskan maka keputusan penilaian Intersesi yang diperolehi adalah tidak sah dan yuran Intersesi tidak dikembalikan.\n" +
                "2.25.6 Status S1 (Tidak Memuaskan) ialah status yang diberi kepada pelajar apabila mereka mendapat status gagal dan diberhentikan (rujuk Perkara 2.20.4) di dalam semester intersesi. Walau bagaimanapun, pelajar boleh meneruskan pengajian pada semester berikutnya apabila mendapat S1 pada intersesi.");

        List<String>R18 = new ArrayList<String>();
        R18.add("2.26.1 Rayuan Penyemakan Semula Keputusan Peperiksaan Akhir\n" +
                "2.26.1.1 Pelajar boleh membuat rayuan penyemakan semula keputusan peperiksaan bagi sesuatu kursus. Semakan semula hanya boleh dilakukan bagi kursus yang mempunyai peperiksaan akhir sahaja dengan menyemak skrip jawapan peperiksaan akhir pelajar untuk kursus berkenaan.\n" +
                "2.26.1.2 Rayuan perlu dikemukakan kepada Jawatankuasa Akademik Fakulti/Pusat Akademik/UiTM Negeri atau Jawatankuasa Kecil Akademik UiTM Cawangan dengan menggunakan Borang BHEPep (KP-R)2005-1[Rayuan Peperiksaan UiTM (Penyemakan Semula Keputusan Peperiksaan)] dalam tempoh empat belas (14) hari selepas tarikh keputusan peperiksaan diumumkan secara rasmi.\n" +
                "2.26.1.3 Setiap permohonan dikenakan bayaran pemprosesan RM50.00 bagi setiap kursus.\n" +
                "2.26.1.4 Keputusan terhadap rayuan akan diumumkan dalam tempoh empat belas (14) hari bekerja daripada tarikh rayuan ditutup. Keputusan yang diumumkan adalah muktamad.\n" +
                "2.26.1.5 Rayuan penyemakan semula keputusan untuk Peperiksaan Khas dan Intersesi tidak dibenarkan.\n" +
                "2.26.2 Rayuan Meneruskan Pengajian\n" +
                "2.26.2.1Pelajar yang gagal dan diberhentikan atau diberikan status Gugur Taraf pada satu (1) semester sebelumnya boleh membuat rayuan kepada Jawatankuasa Akademik Fakulti/Pusat Akademik/UiTM Negeri atau Jawatankuasa Kecil Akademik UiTM Cawangan dalam tempoh empat belas (14) hari selepas tarikh keputusan peperiksaan diumumkan secara rasmi.\n" +
                "2.26.2.2Rayuan perlu dikemukakan secara bertulis atau menggunakan Borang PRPK 03-02[Rayuan Meneruskan Pengajian].\n" +
                "2.26.2.3Keputusan rayuan dipertimbangkan oleh Jawatankuasa Akademik Fakulti/Pusat Akademik/UiTM Negeri atau Jawatankuasa Kecil Akademik UiTM Cawangan.\n" +
                "2.26.2.4Setiap permohonan dikenakan bayaran pemprosesan RM50.00.\n" +
                "2.26.2.5Syarat-syarat rayuan:\n" +
                "a) Rayuan dibenarkan sekali sahaja sepanjang tempoh pengajian.\n" +
                "b) Pelajar yang gagal dan diberhentikan D1 dan D2 tidak layak membuat rayuan.\n" +
                "c) Bagi kategori gagal dan diberhentikan D3, HPNG hendaklah sekurang-kurangnya 1.90.\n" +
                "d) Bagi kategori gagal dan diberhentikan D4, HPNG hendaklah sekurang-kurangnya 2.00." +
                "e) Bagi kategori gagal dan diberhentikan D5, HPNG hendaklah sekurang-kurangnya 1.90.\n" +
                "f) Bagi kategori gagal dan diberhentikan D6, HPNG hendaklah sekurang-kurangnya 1.94.\n" +
                "g) Bagi kategori gagal dan diberhentikan D7, HPNG hendaklah sekurang-kurangnya 1.90.\n" +
                "h) Bagi pelajar yang diberikan status gugur taraf (GT), HPNG hendaklah sekurang-kurangnya 1.90.\n" +
                "i) Rayuan hanya boleh dibuat oleh pelajar yang gagal dan diberhentikan dalam peperiksaan yang baru satu (1) semester berlalu atau diberikan status gugur taraf pada satu (1) semester yang lalu.\n" +
                "2.26.2.6 Rayuan meneruskan pengajian bagi pelajar Program Penerapan Diploma semester 03 ke Sarjana Muda yang gagal dan diberhentikan sebelum tamat pengajan di tahap Sarjana Muda dan tidak memenuhi syarat penganugerahan diploma adalah seperi berikut:\n" +
                "D1 Tidak layak membuat rayuan.\n" +
                "D2 Tidak layak membuat rayuan.\n" +
                "D3 Layak membuat rayuan untuk dipertimbangkan masuk kembali ke program Diploma asal. Pemberian Pengecualian Kredit pada tahap diploma boleh dipertimbangkan oleh Jawatankuasa Akademik Fakulti/Pusat Akademik/UiTM Negeri atau Jawatankuasa Kecil Akademik UiTM Cawangan. Pelajar diberikan status SML.\n" +
                "D4 HPNG < 2.00: Layak membuat rayuan untuk dipertimbangkan masuk kembali ke program Diploma asal. Pemberian Pengecualian Kredit pada tahap diploma boleh dipertimbangkan oleh Jawatankuasa Akademik Fakulti/Pusat Akademik/UiTM Negeri atau Jawatankuasa Kecil Akademik UiTM Cawangan. Pelajar diberikan status SML.\n" +
                "HPNG > 2.00: Layak membuat rayuan untuk dipertimbangkan masuk kembali ke program Sarjana Muda. Pelajar diberikan status SML.\n" +
                "D5 Layak membuat rayuan untuk dipertimbangkan masuk kembali ke program Sarjana Muda. Pelajar diberikan status SML.\n" +
                "D7 Layak membuat rayuan untuk dipertimbangkan masuk kembali ke program Sarjana Muda. Pelajar diberikan status SML.\n" +
                "2.26.2.7 Pelajar D3 - D7 yang berjaya dalam Rayuan Meneruskan Pengajian akan menyambung pengajian dalam mod SML di mana mereka dikenakan yuran pengajian dengan kadar pengajian separuh masa (PLK) dengan tempoh pengajian separuh masa.\n" +
                "2.26.2.8 Pelajar yang diterima masuk semula diberi status X.\n" +
                "2.26.2.9 Keputusan terhadap rayuan akan diumumkan dalam tempoh empat belas (14) hari bekerja daripada tarikh rayuan ditutup. Keputusan yang diumumkan adalah sahkan oleh Senat dan muktamad.");

        List<String>R19 = new ArrayList<String>();
        R19.add("2.27.1 Pelajar Diploma dan Sarjana Muda layak dianugerahkan Diploma atau Sarjana Muda dengan syarat-syarat berikut:\n" +
                "2.27.1.1 Memperolehi HPNG sekurang-kurangnya 2.00;\n" +
                "2.27.1.2 Lulus dalam semua kursus yang dikehendaki oleh sesuatu Program Pengajian dan berstatus tamat (ANC, TS atau TM);\n" +
                "2.27.1.3 Memenuhi semua syarat dan keperluan Universiti; dan\n" +
                "2.27.1.4 Diperakukan oleh Senat.\n" +
                "2.27.2 Pengkelasan Sarjana Muda\n" +
                "Pengkelasan Sarjana Muda adalah mengikut nilai HPNG pelajar seperti yang ditetapkan oleh Senat (sila rujuk Jadual 6) dan terbahagi kepada:\n" +
                "2.27.2.1 Kelas Pertama.\n" +
                "2.27.2.2 Kelas Kedua (Tinggi).\n" +
                "2.27.2.3 Kelas Kedua (Rendah).\n" +
                "2.27.2.4 Kelas Ketiga.\n" +
                "[Perkara 2.27.2 berkuatkuasa pemakaiannya mulai kumpulan Peperiksaan Oktober 2008].\n" +
                "2.27.3 Anugerah Naib Canselor (ANC)\n" +
                "Pelajar menerima Anugerah Naib Canselor (ANC) apabila memenuhi syarat-syarat berikut:\n" +
                "2.27.3.1 Telah tamat program dan berjaya memperolehi Anugerah Dekan (AD) bagi setiap semester dalam tempoh pengajian minimum, tidak termasuk semester latihan praktik (sila rujuk Jadual 5).\n" +
                "2.27.3.2 Telah lulus latihan praktik bagi pelajar yang perlu menjalani latihan praktik.\n" +
                "2.27.3.3 Tidak pernah mengulang mana-mana kursus.\n" +
                "2.27.3.4 Tidak pernah disabitkan tindakan tatatertib.\n" +
                "2.27.4 Anugerah Dekan (AD)\n" +
                "Pelajar akan menerima Anugerah Dekan (AD) jika memenuhi syarat-syarat berikut:" +
                "2.27.4.1Memperolehi Purata Nilai Gred (PNG) minimum 3.50 dan mendaftar sekurang-kurangnya dua belas (12) unit kredit atau mengikut jumlah unit kredit sebenar dalam pelan pengajian semasa, yang mana lebih rendah, tidak termasuk kursus berbentuk Lulus/Gagal pada sesuatu semester.\n" +
                "2.27.4.2 Pelajar tidak pernah disabitkan tindakan tatatertib.\n" +
                "2.27.5 Transkrip dan Skrol\n" +
                "2.27.5.1 Transkrip dan Skrol diberikan kepada pelajar setelah tamat sesuatu Program Pengajian.\n" +
                "2.27.5.2 Pelajar yang berhenti/diberhentikan dari Universiti boleh memohon transkrip dengan kadar bayaran yang ditetapkan.");

        List<String>R20 = new ArrayList<String>();
        R20.add("2.28.1 Permohonan untuk pengaktifan semula status sebagai pelajar boleh dikemukakan secara atas talian melalui Gerbang Maklumat Pelajar dalam tempoh empat belas hari (14) hari setelah senarai gugur taraf diumumkan.\n" +
                "2.28.2 Setiap permohonan dikenakan bayaran RM50.00.\n" +
                "2.28.3 Setiap permohonan yang diluluskan dikenakan:\n" +
                "2.28.3.1 Bayaran pengaktifan semula status sebagai pelajar sebanyak RM50.00, dan\n" +
                "2.28.3.2 Bayaran pemprosesan yuran dan/atau pendaftaran kursus diluar tempoh sebanyak RM100.00.\n" +
                "2.28.4 Pemohon yang ingin membuat permohonan pengaktifan semula lewat dari tempoh rayuan yang ditetapkan dikenakan syarat- syarat berikut:\n" +
                "2.28.4.1 Rayuan dikemukakan menggunakan Borang HEA/ SPA/3/2008 [Appeal for Reinstatement of Status as Student] yang disertakan dengan borang permohonan Cuti Khas yang telah diluluskan oleh Fakulti/Pusat Akademik/UiTM Negeri/UiTM Cawangan.\n" +
                "2.28.4.2 Pemohon hanya boleh dibenarkan meneruskan pengajian pada semester berikutnya dan diberikan status Cuti Khas pada semester berkenaan.\n" +
                "2.28.4.3 Sekiranya pemohon telah membayar yuran sebelum mengemukakan permohonan maka yuran tersebut boleh dituntut kembali, dengan menolak yuran proses, denda pengaktifan semula status sebagai pelajar dan yuran pengekalan status semasa Cuti Khas.");

        List<String>R21 = new ArrayList<String>();
        R21.add("Pertukaran kampus bagi pelajar sepenuh masa adalah tidak dibenarkan.");

        List<String>R22 = new ArrayList<String>();
        R22.add("Pertukaran program adalah tidak dibenarkan kecuali memasuki mod pengajian separuh masa.");

        List<String>R23 = new ArrayList<String>();
        R23.add("3.1.1 PENTAKRIFAN\n" +
                "3.1.1.1 Institut Pendidikan Neo (iNED)\n" +
                "Institut yang mengendalikan program pengajian secara Pendidikan Jarak Jauh (e-PJJ), Pendidikan Usahasama (PPU) dan Pendidikan Berterusan (PPB).\n" +
                "3.1.1.2 Pelajar Pengajian Jarak Jauh (e-PJJ)\n" +
                "Pelajar Pengajian Jarak Jauh (e-PJJ) adalah pelajar separuh masa yang mengikuti seminar pada hujung minggu serta menggunakan kaedah elektronik untuk berinteraksi dengan pensyarah.\n" +
                "3.1.1.3 Pelajar Semester Akhir\n" +
                "Pelajar Semester Akhir adalah pelajar yang berstatus Lulus dan mempunyai baki unit kredit untuk menamatkan pengajian yang tidak melebihi 20 unit kredit bagi pelajar Diploma atau Sarjana Muda kecuali pelajar berstatus Perhatian.\n" +
                "3.1.1.4 Pakar Rujuk (Resource Person)\n" +
                "Pakar Rujuk adalah staf akademik yang dilantik oleh Pengarah iNED yang mempunyai kepakaran di dalam sesuatu bidang untuk menyediakan bahan-bahan pembelajaran PJJ.\n" +
                "3.1.1.5 Pemudah Cara Pembelajaran (Learning Facilitator)\n" +
                "Pemudah Cara Pembelajaran adalah staf akademik yang dilantik oleh Pengarah Institut Perkembangan Pendidikan untuk berinteraksi dengan pelajar secara maya tentang kandungan sesuatu kursus.\n" +
                "3.1.1.6 Pemudah Cara Seminar (Seminar Facilitator)\n" +
                "Pemudah Cara Seminar adalah staf akademik yang dilantik oleh Pengarah iNED untuk mengendalikan seminar PJJ.\n" +
                "3.1.2 PERATURAN DAN PROSEDUR\n" +
                "3.1.2.1 Tempoh Pengajian\n" +
                "Tidak melebihi 16 semester." +
                "3.1.2.2 Pendaftaran Kursus\n" +
                "a) Pelajar hendaklah mendaftar sekurang-kurangnya satu (1) kursus dalam sesuatu semester.\n" +
                "b) Pelajar dihadkan mengambil jumlah kredit tidak melebihi 16 unit kredit dalam sesuatu semester. Walau bagaimanapun pelajar berstatus Lulus yang mendapat HPNG melebihi 3.50 atau pelajar semester akhir yang akan menamatkan pengajian dibenarkan mengambil melebihi 16 unit kredit dengan kelulusan Pengarah iNED.\n" +
                "3.1.2.3 Bayaran Proses Pengecualian Kredit\n" +
                "Permohonan pengecualian kredit dikenakan bayaran proses sebanyak RM100.00.\n" +
                "3.1.2.4 Cuti Khas\n" +
                "a) Pelajar yang ingin mengambil cuti khas pada sesuatu semester hendaklah memajukan permohonan pada semester tersebut.\n" +
                "b) Pelajar dibenarkan mengambil cuti khas maksimum empat (4) semester termasuk mana-mana cuti khas yang pernah diambil sepanjang tempoh pengajian di Universiti.\n" +
                "c) Bayaran pengekalan status sebanyak RM30.00 dikenakan kepada pelajar yang belum membuat pendaftaran kursus dan pembayaran yuran.\n" +
                "d) Tempoh cuti khas tidak dikira sebagai tempoh pengajian.");

        List<String>R24 = new ArrayList<String>();
        R24.add("3.2.1 PENTAKRIFAN\n" +
                "3.2.1.1 Kolej Bersekutu UiTM\n" +
                "Kolej Bersekutu UiTM adalah Institusi Pengajian Tinggi dimiliki dan dikendalikan oleh sesuatu organisasi milik agensi awam di bawah Kerajaan Negeri/Persekutuan/Swasta/Yayasan yang menjalankan program pengajian UiTM sebagaimana yang diiktiraf dan diluluskan oleh Lembaga Pengarah Universiti dan Kementerian Pelajaran dan Pengajian Tinggi.\n" +
                "3.21.2 Program Usahasama\n" +
                "Program Usahasama adalah program UiTM yang dijalankan secara usahasama antara Kolej Bersekutu UiTM dengan Universiti dan dikendalikan oleh iNED.\n" +
                "3.2.1.3 Pelajar Program Usahasama\n" +
                "Pelajar Program Usahasama adalah pelajar yang berdaftar dengan Kolej Bersekutu UiTM untuk mengikuti Program Usahasama." +
                "3.2.2 PERATURAN DAN PROSEDUR\n" +
                "3.2.2.1 Cuti Khas\n" +
                "a) Permohonan hendaklah dimajukan kepada iNED melalui Kolej Bersekutu tidak lewat dari 14 hari bekerja sebelum minggu peperiksaan bermula menggunakan borang Permohonan Cuti Khas (Borang HEA/RP/CK-01(KKB)).\n" +
                "b) Dibenarkan memohon cuti khas bagi tempoh maksimum dua (2) semester termasuk mana-mana cuti khas yang pernah diambil sepanjang tempoh pengajian di Universiti.\n" +
                "c) Kos perkhidmatan UiTM sebanyak RM300.00 mestilah dibayar kepada Universiti melalui Kolej Bersekutu sebelum memohon cuti khas.\n" +
                "d) Bayaran pengekalan status sebanyak RM10.00 dikenakan untuk setiap permohonan yang diluluskan.\n" +
                "e) Tempoh cuti khas tidak dikira sebagai tempoh pengajian.\n" +
                "3.2.2.2 Pembiayaan Yuran Pengajian\n" +
                "Pembiayaan yuran pengajian mengikut kadar yang diluluskan oleh Kementerian Pengajian Tinggi diberikan kepada pelajar untuk maksimum enam (6) semester sahaja.\n" +
                "3.2.2.3 Sepenuh Masa Berlanjut (SML)\n" +
                "Pelajar yang telah melebihi tempoh pengajian mengikut Pelan Pengajian (berstatus SML) perlu membayar yuran pengajian mengikut jumlah yang dikenakan oleh Kolej Bersekutu.\n" +
                "3.2.2.4 Pemulangan Kos Perkhidmatan UiTM\n" +
                "Kos perkhidmatan UiTM tidak akan dipulangkan setelah pelajar mendaftar di Kolej Bersekutu UiTM.\n" +
                "3.2.2.5 Pertukaran Kolej Bersekutu UiTM\n" +
                "Pelajar Program Usahasama yang sedang dalam pengajian dibenarkan untuk bertukar tempat pengajian ke Kolej Bersekutu UiTM yang lain mengikut syarat-syarat berikut:\n" +
                "a) Permohon dimajukan oleh pelajar kepada iNED melalui Kolej asal dengan persetujuan Kolej baru yang menawarkan Program Pengajian yang sama.\n" +
                "b) Permohonan dipertimbangkan oleh Pengarah iNED/Ketua PPU.\n" +
                "3.2.2.6 Kebenaran Tidak Menduduki Peperiksaan\n" +
                "a) Permohonan untuk tidak menduduki peperiksaan yang telah dijalankan bagi sesuatu kursus perlu dibuat kepada Dekan/Rektor melalui Kolej Bersekutu dalam masa 24 jam setelah tamatnya peperiksaan kursus tersebut dengan menyertakan sijil sakit dari panel perubatan Kolej Bersekutu/pusat kesihatan kerajaan atau swasta yang telah" +
                "disahkan oleh Kolej Bersekutu.\n" +
                "b) Permohonan boleh ibuat secara bertulis atau menggunakan Borang HEA/RP/TMP-01(KKB)[Kebenaran Tidak Menduduki Peperiksaan Akhir].\n" +
                "3.2.2.7 Intersesi\n" +
                "Pelajar Program Usahasama hanya dibenarkan mengikuti pengajian Intersesi dengan syarat-syarat berikut:\n" +
                "a) Untuk menamatkan pengajian dalam Tempoh Pengajian yang ditetapkan.\n" +
                "b) Memohon kepada Dekan/Rektor berkenaan melalui iNED dengan sokongan Kolej Bersekutu UiTM menggunakan borang (Intersesi/KKB/2008).\n" +
                "c) Mengikuti pengajian di kampus-kampus Universiti.\n" +
                "d) Membayar yuran Intersesi mengikut kadar dan prosedur yang ditetapkan oleh Universiti.\n" +
                "3.2.2.8 Rayuan Penyemakan Semula Skrip Jawapan Peperiksaan Akhir\n" +
                "Pelajar Program Usahasama yang ingin membuat rayuan penyemakan semula skrip jawapan peperiksaan akhir hendaklah mengemukakan permohonan kepada Dekan/Rektor mengikut seliaan penyemakan skrip jawapan peperiksaan akhir dengan sokongan Kolej Bersekutu UiTM menggunakan Borang HEA/RA/PP-2000-7(KKB)[Rayuan Penyemakan Semula Keputusan Peperiksaan Akhir] dalam tempoh empat belas (14) hari selepas tarikh keputusan peperiksaan diumumkan secara rasmi.");






        MoviesDetails.put("2.1:    KEMASUKAN PELAJAR", A1);
        MoviesDetails.put("2.2:    STATUS PELAJAR UNIVERSITI", A2);
        MoviesDetails.put("2,3:    GUGUR TARAF SEBAGAI PELAJAR", A3);
        MoviesDetails.put("2.4:    KEPERLUAN AKADEMIK",KEPERLUAN_AKADEMIK);
        MoviesDetails.put("2.5:    TEMPOH PENGAJIAN",TEMPOH_PENGAJIAN);
        MoviesDetails.put("2.6:    MOD PENGAJIAN",MOD_PENGAJIAN);
        MoviesDetails.put("2.7:    CUTI KHAS",CUTI_KHAS);
        MoviesDetails.put("2.8:    PENANGGUHAN PENGAJIAN",PENANGGUHAN_PENGAJIAN);
        MoviesDetails.put("2.9:    PENGGANTUNGAN PENGAJIAN",R1);
        MoviesDetails.put("2.10:   PENDAFTARAN KURSUS",R2);
        MoviesDetails.put("2.11:   PINDAHAN PENDAFTARAN KURSUS",R3);
        MoviesDetails.put("2.12:   PENGESAHAN PENDAFTARAN KURSUS",R4);
        MoviesDetails.put("2.13:   KEHADIRAN PELAJAR",R5);
        MoviesDetails.put("2.14:   KELAYAKAN MENDUDUKI PEPERIKSAAN AKHIR",R6);
        MoviesDetails.put("2.15:   KEBENARAN TIDAK MENDUDUKI PEPERIKSAAN AKHIR",R7);
        MoviesDetails.put("2.16:   TARIKH PEPERIKSAAN AKHIR",R8);
        MoviesDetails.put("2.17:   JADUAL PEPERIKSAAN AKHIR",R9);
        MoviesDetails.put("2.18:   KEPUTUSAN PEPERIKSAAN AKHIR DAN PENILAIAN",R10);
        MoviesDetails.put("2.19:   PENGIRAAN PURATA NILAI GRED(PNG) DAN HIMPUNAN PURATA NILAI GRED(HPNG)",R11);
        MoviesDetails.put("2.20:   STATUS KEPUTUSAN PEPERIKSAAN AKHIR DAN PENILAIAN",R12);
        MoviesDetails.put("2.21:   PENYATA KEPUTUSAN PEPERIKSAAN",R13);
        MoviesDetails.put("2.22:   PERLANGGARAN KAEDAH TATATERTIB PELAJAR BERSABIT DENGAN PEPERIKSAAN AKHIR DAN PENILAIAN",R14);
        MoviesDetails.put("2.23:   PEPERIKSAAN SEMULA",R15);
        MoviesDetails.put("2.24:   PEPERIKSAAN KHAS",R16);
        MoviesDetails.put("2.25:   INTERSESI",R17);
        MoviesDetails.put("2.26:   RAYUAN",R18);
        MoviesDetails.put("2.27:   PENGURNIAAN AKADEMIK",R19);
        MoviesDetails.put("2.28:   PENGAKTIFAN SEMULA STATUS",R20);
        MoviesDetails.put("2.29:   PERTUKARAN KAMPUS",R21);
        MoviesDetails.put("2.30:   PERTUKARAN PROGRAM",R22);
        MoviesDetails.put("3.1:    PROGRAM PENGAJIAN JARAK JAUH SECARA ELEKTRONIK(E=PJJ)",R23);
        MoviesDetails.put("3.2:    PROGRAM PENGAJIAN USAHASAMA(PPU)",R24);






        return MoviesDetails;

    }

}

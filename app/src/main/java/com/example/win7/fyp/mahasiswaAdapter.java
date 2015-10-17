package com.example.win7.fyp;

/**
 * Created by Win7 on 10/7/2015.
 */


import java.util.ArrayList;
import java.util.HashMap;
import com.example.win7.fyp.mahasiswa;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;

public class mahasiswaAdapter extends BaseAdapter {
    private Activity activity;
    //private ArrayList<HashMap<String, String>> data;
    private ArrayList<mahasiswa> data_mhs=new ArrayList<mahasiswa>();

    private static LayoutInflater inflater = null;

    public mahasiswaAdapter(Activity a, ArrayList<mahasiswa> d) {
        activity = a; data_mhs = d;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    public int getCount() {
        return data_mhs.size();
    }
    public Object getItem(int position) {
        return data_mhs.get(position);
    }
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View vi = convertView;
        if (convertView == null)
            vi = inflater.inflate(R.layout.list_item_mhs, null);

        TextView calID1 = (TextView) vi.findViewById(R.id.calID1);
        TextView calSession1 = (TextView) vi.findViewById(R.id.calSession1);
        TextView kuliahStart1 = (TextView) vi.findViewById(R.id.kuliahStart1);
        TextView kuliahEnd1=(TextView) vi.findViewById(R.id.kuliahEnd1);
        TextView entranceStart1=(TextView)vi. findViewById(R.id.entranceStart1);
        TextView entranceEnd1=(TextView)vi. findViewById(R.id.entranceEnd1);
        TextView cutiPertStart1=(TextView) vi.findViewById(R.id.cutiPertStart1);
        TextView cutiPertEnd1=(TextView) vi.findViewById(R.id.cutiPertEnd1);
        TextView kuliah2Start1=(TextView)vi. findViewById(R.id.kuliah2Start1);
        TextView kuliah2End1=(TextView)vi. findViewById(R.id.kuliah2End1);
        TextView sufoStart1=(TextView)vi. findViewById(R.id.sufoStart1);
        TextView sufoEnd1=(TextView) vi.findViewById(R.id.sufoEnd1);
        TextView exitStart1=(TextView)vi. findViewById(R.id.exitStart1);
        TextView exitEnd1=(TextView)vi. findViewById(R.id.exitEnd1);
        TextView studyweekStart1=(TextView)vi. findViewById(R.id.studyweekStart1);
        TextView studyweekEnd1=(TextView)vi. findViewById(R.id.studyweekEnd1);
        TextView examStart1=(TextView)vi. findViewById(R.id.examStart1);
        TextView examEnd1=(TextView) vi.findViewById(R.id.examEnd1);
        TextView resultDate1=(TextView) vi.findViewById(R.id.resultDate1);
        TextView examKhasStart1=(TextView)vi. findViewById(R.id.examKhasStart1);
        TextView examKhasEnd1=(TextView) vi.findViewById(R.id.examKhasEnd1);
        TextView cutisemStart1=(TextView)vi. findViewById(R.id.cutisemStart1);
        TextView cutisemEnd1=(TextView) vi.findViewById(R.id.cutisemEnd1);

        mahasiswa daftar_mhs = data_mhs.get(position);

        calID1.setText(daftar_mhs.getCalID());
        calSession1.setText(daftar_mhs.getCalSession());
        kuliahStart1.setText(daftar_mhs.getKuliahStart());
        kuliahEnd1.setText(daftar_mhs.getKuliahEnd());
        entranceStart1.setText(daftar_mhs.getEntranceStart());
        entranceEnd1.setText(daftar_mhs.getEntranceEnd());
        cutiPertStart1.setText(daftar_mhs.getCutiPertStart());
        cutiPertEnd1.setText(daftar_mhs.getCutiPertEnd());
        kuliah2Start1.setText(daftar_mhs.getKuliah2Start());
        kuliah2End1.setText(daftar_mhs. getKuliah2End());
        sufoStart1.setText(daftar_mhs.getSufoStart());
        sufoEnd1.setText(daftar_mhs.getSufoEnd());
        exitStart1.setText(daftar_mhs.getExitStart());
        exitEnd1.setText(daftar_mhs.getExitEnd());
        studyweekStart1.setText(daftar_mhs.getStudyweekStart());
        studyweekEnd1.setText(daftar_mhs.getStudyweekEnd());
        examStart1.setText(daftar_mhs.getExamStart());
        examEnd1.setText(daftar_mhs.getExamEnd());
        resultDate1.setText(daftar_mhs.getResultDate());
        examKhasStart1.setText(daftar_mhs.getExamKhasStart());
        examKhasEnd1.setText(daftar_mhs.getExamKhasEnd());
        cutisemStart1.setText(daftar_mhs.getCutisemStart());
        cutisemEnd1.setText(daftar_mhs.getCutisemEnd());


        return vi;
    }
}


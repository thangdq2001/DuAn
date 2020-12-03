package com.example.duan1.Admin.Fragment.Dialog.KhachSan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.example.duan1.R;

public class DialogUpdateKhachSan extends DialogFragment {
    EditText KhuVuc,lat,log,name;
    Button cancel,update;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog_update_data_khachsan,container,false);
        KhuVuc = view.findViewById(R.id.edtUpdateKhuVucKhachSan);
        lat = view.findViewById(R.id.edtUpdateLatKhachSan);
        log = view.findViewById(R.id.edtUpdateLogKhachSan);
        name = view.findViewById(R.id.edtUpdateNameKhachSan);
        updateData();

        return view;
    }
    public void updateData(){
        String kv = String.valueOf(KhuVuc.getText().toString());
        Double Lat = Double.parseDouble(lat.getText().toString());
        Double Log = Double.parseDouble(log.getText().toString());
        String nameKs = String.valueOf(name.getText().toString());

        // cancel dialog
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogUpdateKhachSan dialogUpdateKhachSan = new DialogUpdateKhachSan();
                dialogUpdateKhachSan.dismiss();
            }
        });

    }
}

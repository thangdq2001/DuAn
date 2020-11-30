package com.example.duan1.Admin.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.duan1.Admin.Fragment.Dialog.Nhahang.NhaHangAddDataDiaLog;
import com.example.duan1.Admin.Fragment.Dialog.Nhahang.NhaHangTieuBieuAddDataDiaLog;
import com.example.duan1.R;

public class AdminNhaHangFragment extends Fragment {
    ImageView add,update,delete,addMonAn,updateMonAn,deleteMonAn,addNhahangTieuBieu,updateNhaHangTieuBieu,deleteNhaHangTieuBieu,addMonAnTieuBieu,updateMonAnTieuBieu,deleteMonAnBieu;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.adminnhahangfragment, container, false);
        add = view.findViewById(R.id.NhIconAdd);
        update = view.findViewById(R.id.NhIconSua);
        delete = view.findViewById(R.id.NhIiconXoa);
        addMonAn = view.findViewById(R.id.NhMaAdd);
        updateMonAn = view.findViewById(R.id.NhMSua);
        deleteMonAn = view.findViewById(R.id.NhMXoa);
        addNhahangTieuBieu = view.findViewById(R.id.NhTbIconAdd);
        updateNhaHangTieuBieu = view.findViewById(R.id.NhTbIconSua);
        deleteNhaHangTieuBieu = view.findViewById(R.id.NhTbIconXoa);
        addMonAnTieuBieu = view.findViewById(R.id.NhTbMaAdd);
        updateMonAnTieuBieu = view.findViewById(R.id.NhTbMSua);
        deleteMonAnBieu  = view.findViewById(R.id.NhTbMXoa);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NhaHangAddDataDiaLog nhaHangAddDataDiaLog = new NhaHangAddDataDiaLog();
                nhaHangAddDataDiaLog.show(getChildFragmentManager(),"NhaHangAddDataDiaLog");
            }
        });
        updateMonAn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        addMonAn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        updateMonAn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        deleteMonAn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        // Nha Hang tieu bieu
        addNhahangTieuBieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NhaHangTieuBieuAddDataDiaLog NhaHangtieuBieuDiaLog = new NhaHangTieuBieuAddDataDiaLog();
                NhaHangtieuBieuDiaLog.show(getChildFragmentManager(),"NhaHangTieuBieuAddDataDiaLog" );
            }
        });


    return view;




    }
}

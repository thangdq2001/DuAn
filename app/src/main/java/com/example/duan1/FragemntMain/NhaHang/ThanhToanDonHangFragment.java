package com.example.duan1.FragemntMain.NhaHang;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.duan1.Dao.CartDao;
import com.example.duan1.R;

public class ThanhToanDonHangFragment extends Fragment {
    TextView tongTien,TenNhahang,KhoanCach;
    ImageView back;
    String locaiton,nameNh,maNh;
    FragmentManager fragmentManager;
    Context context;
    ImageView backFragment;

    public ThanhToanDonHangFragment(String locaiton, FragmentManager fragmentManager, Context context,String nameNh,String maNh) {
        this.locaiton = locaiton;
        this.fragmentManager = fragmentManager;
        this.context = context;
        this.nameNh = nameNh;
        this.maNh = maNh;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.thanhtoanmonan, container, false);

        backFragment = view.findViewById(R.id.imgBackFragment);
        backFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentcontainer, new GiaoDienChinhNhaHang(nameNh,maNh,locaiton)).commit();
            }
        });
        tongTien = view.findViewById(R.id.txtTongTien);
        TenNhahang = view.findViewById(R.id.txtNameNhaHang);
        KhoanCach = view.findViewById(R.id.txtKhoangCachGiao);
        KhoanCach.setText("Cách khoảng cách của bạn:"+locaiton+"km");
        VoHangAdapter adapter = new VoHangAdapter(getChildFragmentManager(),context);


        //settong tien



        TenNhahang.setText(nameNh);
        RecyclerView recyclerView = view.findViewById(R.id.rcThanhToanDonhang);
        LinearLayoutManager manager = new LinearLayoutManager(context);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(manager);
        CartDao.readAll(maNh,adapter,context,tongTien);
        return  view;
    }
}

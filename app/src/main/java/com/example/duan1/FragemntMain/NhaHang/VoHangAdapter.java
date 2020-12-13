package com.example.duan1.FragemntMain.NhaHang;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.duan1.Admin.Model.VoHang;
import com.example.duan1.Dao.CartDao;
import com.example.duan1.R;

import java.util.ArrayList;

public class VoHangAdapter extends RecyclerView.Adapter<VoHangAdapter.ViewHolder> {
    ArrayList<VoHang> arrayList;
    FragmentManager fragmentManager;
    Context context;
    double TongTien =0;

    public VoHangAdapter(FragmentManager fragmentManager, Context context) {
        arrayList = new ArrayList<>();
        this.fragmentManager = fragmentManager;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.custom_chitietmonan, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.tenMonAn.setText(arrayList.get(position).getTenMon());
        holder.SoLuong.setText(String.valueOf(arrayList.get(position).getSoLuong())+"x");
        holder.thanhTien.setText(String.valueOf(arrayList.get(position).getThanhTien()));
        holder.delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CartDao.delete(arrayList.get(position).getIdVoHang(),position,VoHangAdapter.this);
                Toast.makeText(context, "Xóa thành công", Toast.LENGTH_SHORT).show();
            }
        });
        holder.note.setText(arrayList.get(position).getGhiChi());




    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView delete, tang, giam;
        TextView tenMonAn, thanhTien, SoLuong,note;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tenMonAn = itemView.findViewById(R.id.txtTenMonDat);
            thanhTien = itemView.findViewById(R.id.txtThanhtienMon);
            SoLuong = itemView.findViewById(R.id.txtSoLuongMonDat);
            delete = itemView.findViewById(R.id.imgDelete);
            note = itemView.findViewById(R.id.txtShowGhiChu);
        }
    }

    public void updateAdapter(VoHang voHang) {
        arrayList.add(voHang);
        notifyDataSetChanged();
    }

    public void resetAdapter() {
        arrayList.clear();
        notifyDataSetChanged();
    }
    public void deletesuccess(int position){
         arrayList.remove(position);
         notifyDataSetChanged();
    }
    public double getTongTien(){
        for(VoHang i:arrayList){
            TongTien = TongTien + i.getThanhTien();

        }
        return TongTien;
    }
}

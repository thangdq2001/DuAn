package com.example.duan1.Admin.Fragment.Dialog.Nhahang;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.duan1.Admin.Fragment.Dialog.MonAn.DialogaddMonAn;
import com.example.duan1.Admin.Model.NhaHang;
import com.example.duan1.Dao.NhaHangDao;
import com.example.duan1.R;

import java.util.ArrayList;

public class UpdateAndDeleteNhaHangAdapter extends RecyclerView.Adapter<UpdateAndDeleteNhaHangAdapter.ViewHolder> {
    public UpdateAndDeleteNhaHangAdapter(FragmentManager fragmentManager) {
        arrayList = new ArrayList<>();
        this.fragmentManager = fragmentManager;
    }
    FragmentManager fragmentManager;
    ArrayList<NhaHang> arrayList;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_item_delete_and_update_admin_nhahang, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.nameNhaHang.setText(arrayList.get(position).getNhName());
        holder.idNhaHang.setText("Bấm xem chi tiết nhà hàng");
        holder.idNhaHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogaddMonAn dialogaddMonAn = new DialogaddMonAn(arrayList.get(position).getNhId());
            }
        });
           holder.delete.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   NhaHangDao.deleteNhahang(arrayList.get(position).getNhId(), position, UpdateAndDeleteNhaHangAdapter.this);
               }
           });
        holder.update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogUpdateNhaHang dialogUpdateNhaHang = new DialogUpdateNhaHang(arrayList.get(position).getNhId());
                dialogUpdateNhaHang.show(fragmentManager, "DialogUpdateNhaHang");
            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameNhaHang,idNhaHang;
        ImageView delete,update;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameNhaHang = itemView.findViewById(R.id.txtNameNhaHangUpdateAndDelete);
            delete = itemView.findViewById(R.id.img_item_delete_nhahang);
            idNhaHang = itemView.findViewById(R.id.txtIdNhaHAng_update_and_delete);
            update = itemView.findViewById(R.id.imgUpdate);
        }
    }

    public void updateAdapter(NhaHang nhaHang) {
        arrayList.add(nhaHang);
        notifyDataSetChanged();
    }
    public void onDeleteSuccessful(int position){
        arrayList.remove(position);
        notifyDataSetChanged();
    }
}

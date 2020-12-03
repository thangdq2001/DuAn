package com.example.duan1.Admin.Fragment.Dialog.KhachSan;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.duan1.Admin.Model.KhachSan;
import com.example.duan1.Dao.KhachSanDao;
import com.example.duan1.R;

import java.util.ArrayList;

public class UpdateAndDeleteKhachSanAdapter extends RecyclerView.Adapter<UpdateAndDeleteKhachSanAdapter.ViewHolder> {
    public UpdateAndDeleteKhachSanAdapter() {
        arrayList = new ArrayList<>();
    }

    ArrayList<KhachSan> arrayList;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_item_updatedata_admin_khachsan, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.nameKhachsan.setText(arrayList.get(position).getKsName());
        holder.idKhachSan.setText(arrayList.get(position).getKsId());
           holder.delete.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   KhachSanDao.deleteKhachSan(arrayList.get(position).getKsId());
                   Handler handler = new Handler();
                   handler.postDelayed(new Runnable() {
                       @Override
                       public void run() {
                           notifyDataSetChanged();
                       }
                   },1500);
               }
           });

           //open dialog update Khach san
//        holder.update.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                KhachSan ks = new KhachSan();
//                DialogUpdateNhaHang dialogUpdateNhaHang = new DialogUpdateNhaHang(arrayList.get(position).getNhId());
//            }
//        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameKhachsan,idKhachSan;
        ImageView delete,update;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameKhachsan = itemView.findViewById(R.id.txtNameKhachSan_UpdateItem);
            delete = itemView.findViewById(R.id.imgDeleKhachSan);
            idKhachSan = itemView.findViewById(R.id.txtIdKhachSan_UpdateItem);
            update = itemView.findViewById(R.id.img_item_update_khachsan);
        }
    }

    public void updateAdapter(KhachSan khachSan) {
        arrayList.add(khachSan);
        notifyDataSetChanged();
    }
}

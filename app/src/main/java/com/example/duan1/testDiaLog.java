package com.example.duan1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.example.duan1.model.karaoke;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class testDiaLog extends DialogFragment {
    EditText namekok,phongVip,phongThuong,phongSinhVien;
    Button btn;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      View view = inflater.inflate(R.layout.test1, container,false);
        namekok = view.findViewById(R.id.tenkok);
        phongVip = view.findViewById(R.id.phongVip);
        phongThuong = view.findViewById(R.id.phongThuong);
        phongSinhVien = view.findViewById(R.id.phongSinhVien);
        btn = view.findViewById(R.id.btnClick);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             addData();
            }
        });
      return view;
    }
    private void addData(){
        FirebaseDatabase mDatabase =FirebaseDatabase.getInstance();
        final DatabaseReference mDatabaseRef = mDatabase.getReference("karaoke");
        final String tenkok = namekok.getText().toString();
        final int phongvip = Integer.parseInt(phongVip.getText().toString());
        final int phongthuong = Integer.parseInt(phongThuong.getText().toString());
        final int phonsinhvien = Integer.parseInt(phongSinhVien.getText().toString());
        mDatabaseRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                karaoke kok = new karaoke(tenkok,phongvip,phongthuong,phonsinhvien);
                String id = mDatabaseRef.getKey();
                mDatabaseRef.child(id).setValue(kok);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }
}

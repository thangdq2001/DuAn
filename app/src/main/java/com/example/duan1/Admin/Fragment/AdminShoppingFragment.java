package com.example.duan1.Admin.Fragment;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.duan1.Admin.Model.NhaHang;
import com.example.duan1.R;
import com.example.duan1.testAdapter;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class AdminShoppingFragment extends Fragment {
    ArrayList<NhaHang> arrayList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.testreadll, container, false);
        arrayList = new ArrayList<>();
        readAll();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                RecyclerView recyclerView = view.findViewById(R.id.recTestReadAll);
                testAdapter adapter = new testAdapter(arrayList);
                recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
                recyclerView.setAdapter(adapter);
            }
        },3000);
        return view;
    }
    public void readAll(){
        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference("NhaHang");
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if(snapshot.exists()){
                    for (DataSnapshot i:snapshot.getChildren()){
                        NhaHang nh = i.getValue(NhaHang.class);
                        arrayList.add(nh);
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}

package com.example.duan1.Admin.Fragment.Dialog.KhachSan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.duan1.Dao.KhachSanDao;
import com.example.duan1.R;

public class UpdateAndDeleteKhachSanFragment extends Fragment {
    UpdateAndDeleteKhachSanAdapter adapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      View view = inflater.inflate(R.layout.updateanddelete_khachsan,container,false);
      RecyclerView recyclerView = view.findViewById(R.id.rcUpdateAndDeleteKhachSan);
       adapter =  new UpdateAndDeleteKhachSanAdapter(getContext(),getChildFragmentManager());
      LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
      recyclerView.setAdapter(adapter);
      recyclerView.setLayoutManager(linearLayoutManager);
        KhachSanDao.readKhachSan(adapter,getContext());
      return view;
    }

}

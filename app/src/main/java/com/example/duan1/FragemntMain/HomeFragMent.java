package com.example.duan1.FragemntMain;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.duan1.FragemntMain.chuyenBayFragment.chuyenBayMainfragment;
import com.example.duan1.R;
import com.example.duan1.aDapter.GridViewBottomMainAdapter;

import java.util.ArrayList;
import java.util.List;

public class HomeFragMent extends Fragment {
    ViewFlipper viewFlipper;
    RecyclerView recyclerView;
    List<String> titles;
    List<String> location;
    List<Integer> img;
    GridViewBottomMainAdapter adapter;
    CardView hotel, flight, coffe, hoatdong, oderCar, shopping;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home, container, false);
        viewFlipper = view.findViewById(R.id.slideShow);
        int imges[] = {R.drawable.slideshow1, R.drawable.slidehow2, R.drawable.slideshow3};
        for (int image : imges) {
            customSlideShow(image);
        }
        recyclerView = view.findViewById(R.id.myrecyclerview);

        // customsGridlayoutbottom Main
        customGridLayoutBottom();

        //opencardView-->Chuyến bay
        flight = view.findViewById(R.id.cardViewChuyenBay);
        openCardViewFlight();

        return view;
    }
    public void openCardViewFlight(){
        flight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentcontainer,new chuyenBayMainfragment()).commit();
            }
        });
    }

    public void customGridLayoutBottom() {
        titles = new ArrayList<>();
        img = new ArrayList<>();
        location = new ArrayList<>();

        // add data to arraylist titles
        titles.add("Khach san 1 phuc vu 24/24 chat luong 5s");
        titles.add("Khach san 2 chất lượng có máy lạnh than máy nằm ngay mặt tiền đường lê hồng phong");
        titles.add("Khach san 3 phòng đầy đủ tiện nghi nằm ngay mặt tiền điền trần hưng đạo");
        titles.add("Khach san 4 phục vụ 24/24 đầy đủ tiện nghi thoáng mát sạch sẽ");

        // add data to arraylist img
        img.add(R.drawable.logo1);
        img.add(R.drawable.logo2);
        img.add(R.drawable.logoagoda);
        img.add(R.drawable.logo4);
        // add data arraylist locaiton

        location.add("cách vị trí hiện tại 500m");
        location.add("cách vị trí hiện tại 1km");
        location.add("cách vị trí hiện tại 1,5km");
        location.add("cách vị trí hiện tại 100m");

        adapter = new GridViewBottomMainAdapter(getActivity(), titles, location, img);
        Context context;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);


    }

    public void customSlideShow(int image) {
        ImageView imageView = new ImageView(getActivity());
        imageView.setBackgroundResource(image);
        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(4000);//--> slide show auto play in 4s
        viewFlipper.setAutoStart(true);
        // animation
        viewFlipper.setInAnimation(getContext(), R.anim.slide_in_left);
        viewFlipper.setOutAnimation(getActivity(), R.anim.slide_out_right);
    }
}

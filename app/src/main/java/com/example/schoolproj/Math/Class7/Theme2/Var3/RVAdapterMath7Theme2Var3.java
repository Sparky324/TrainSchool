package com.example.schoolproj.Math.Class7.Theme2.Var3;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.schoolproj.Math.Class7.Theme1.Var1.MathClass7Theme1Var1Task1Activity;
import com.example.schoolproj.Math.Class7.Theme1.Var1.MathClass7Theme1Var1Task2Activity;
import com.example.schoolproj.Math.Class7.Theme1.Var1.MathClass7Theme1Var1Task3Activity;
import com.example.schoolproj.Math.Class7.Theme1.Var1.MathClass7Theme1Var1Task4Activity;
import com.example.schoolproj.Math.Class7.Theme1.Var1.MathClass7Theme1Var1Task5Activity;
import com.example.schoolproj.R;

import java.util.List;

public class RVAdapterMath7Theme2Var3 extends RecyclerView.Adapter<RVAdapterMath7Theme2Var3.ViewHolder> {

    private List<String> mData;
    private LayoutInflater mInflater;
    private RVAdapterMath7Theme2Var3.ItemClickListener mClickListener;
    private Context mContext;

    RVAdapterMath7Theme2Var3(Context context, List<String> data) {
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;
        this.mContext = context;
    }

    @Override
    public RVAdapterMath7Theme2Var3.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.recyclerview_row, parent, false);
        return new RVAdapterMath7Theme2Var3.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RVAdapterMath7Theme2Var3.ViewHolder holder, int position) {
        String animal = mData.get(position);
        holder.myTextView.setText(animal);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView myTextView;

        ViewHolder(View itemView) {
            super(itemView);
            myTextView = itemView.findViewById(R.id.itemName);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            final Intent intent;
            switch (getAdapterPosition()) {
                //case 0:
                //    intent = new Intent(mContext, MathClass7Theme1Var1Task1Activity.class);
                //    break;
                //case 1:
                //    intent = new Intent(mContext, MathClass7Theme1Var1Task2Activity.class);
                //    break;
                //case 2:
                //    intent = new Intent(mContext, MathClass7Theme1Var1Task3Activity.class);
                //    break;
                //case 3:
                //    intent = new Intent(mContext, MathClass7Theme1Var1Task4Activity.class);
                //    break;
                //case 4:
                //    intent = new Intent(mContext, MathClass7Theme1Var1Task5Activity.class);
                //    break;
                default:
                    intent = null;
                    break;
            }
            if (intent != null)
                mContext.startActivity(intent);
            else
                mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    String getItem(int id) {
        return mData.get(id);
    }

    void setClickListener(RVAdapterMath7Theme2Var3.ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}
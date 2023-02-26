package com.example.schoolproj.Math.Class9.Theme2.Var1;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.schoolproj.R;

import java.util.List;

public class RVAdapterMath9Theme2Var1 extends RecyclerView.Adapter<RVAdapterMath9Theme2Var1.ViewHolder> {

    private List<String> mData;
    private LayoutInflater mInflater;
    private RVAdapterMath9Theme2Var1.ItemClickListener mClickListener;
    private Context mContext;

    RVAdapterMath9Theme2Var1(Context context, List<String> data) {
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;
        this.mContext = context;
    }

    @Override
    public RVAdapterMath9Theme2Var1.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.recyclerview_row, parent, false);
        return new RVAdapterMath9Theme2Var1.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RVAdapterMath9Theme2Var1.ViewHolder holder, int position) {
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
                case 0:
                    intent = new Intent(mContext, MathClass9Theme2Var1Task1Activity.class);
                    break;
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

    void setClickListener(RVAdapterMath9Theme2Var1.ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}
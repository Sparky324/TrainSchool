package com.example.schoolproj.Math.Class8;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.schoolproj.Math.Class8.Theme1.MathClass8Theme1Activity;
import com.example.schoolproj.Math.Class8.Theme2.MathClass8Theme2Activity;
import com.example.schoolproj.Math.Class8.Theme2.MathClass8Theme2TasksActivity;
import com.example.schoolproj.Math.Class8.Theme3.MathClass8Theme3Activity;
import com.example.schoolproj.R;

import java.util.List;

public class RVAdapterMath8 extends RecyclerView.Adapter<RVAdapterMath8.ViewHolder> {

    private List<String> mData;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;
    private Context mContext;

    RVAdapterMath8(Context context, List<String> data) {
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;
        this.mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.recyclerview_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
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
                    intent = new Intent(mContext, MathClass8Theme1Activity.class);
                    break;
                case 1:
                    intent = new Intent(mContext, MathClass8Theme2Activity.class);
                    break;
                case 2:
                    intent = new Intent(mContext, MathClass8Theme3Activity.class);
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

    void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}
package com.globalgis.grand_marketing.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.globalgis.grand_marketing.R;
import com.globalgis.grand_marketing.models.Firm;

import java.util.ArrayList;

public class FirmsSpinnerAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<Firm> mFirms;

    public FirmsSpinnerAdapter(Context context, ArrayList<Firm> firms) {
        mContext = context;
        mFirms = firms;
    }

    @Override
    public int getCount() {
        return mFirms.size() + 1;
    }

    @Override
    public Object getItem(int position) {
        return (position == 0) ? mFirms : mFirms.get(position);
    }

    @Override
    public long getItemId(int position) {
        return (position == 0) ? -1 : mFirms.get(position).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        ViewHolder holder;
        if(view == null) {
            view = LayoutInflater.from(mContext).inflate(android.R.layout.simple_dropdown_item_1line, null);
            holder = new ViewHolder();
            holder.firmName = (TextView)view.findViewById(android.R.id.text1);
            view.setTag(holder);
        } else {
            holder = (ViewHolder)view.getTag();
        }

        String text = (position == 0) ? mContext.getString(R.string.label_all) : mFirms.get(position - 1).getFirmName();
        holder.firmName.setText(text);

        return view;
    }

    class ViewHolder {
        TextView firmName;
    }
}

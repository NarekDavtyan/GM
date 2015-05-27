package com.globalgis.grand_marketing.adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.globalgis.grand_marketing.R;
import com.globalgis.grand_marketing.models.Cigarette;
import com.globalgis.grand_marketing.models.CigaretteSale;

import java.util.ArrayList;

public class SalesPagerAdapter extends PagerAdapter {

    private static final int ITEMS_PER_PAGE = 4;

    private Context mContext;
    private ArrayList<Cigarette> mCigarettes;
    private SparseArray<CigaretteSale> mCigaretteSales;
    private LayoutInflater mInflater;

    public SalesPagerAdapter(Context context, SparseArray<CigaretteSale> cigaretteSales) {
        mContext = context;
        mCigarettes = new ArrayList<Cigarette>();
        mCigaretteSales = cigaretteSales;
        mInflater = LayoutInflater.from(mContext);
    }

    public void update(ArrayList<Cigarette> cigarettes) {
        mCigarettes.clear();
        mCigarettes.addAll(cigarettes);
        notifyDataSetChanged();
    }

    @Override
    public View instantiateItem(ViewGroup container, int position) {
        if(container.getChildCount() > position) {
            return container.getChildAt(position);
        }
        ViewGroup pageView = createSalesLayoutContainer();
        Cigarette cigarette;
        int count = (position == getCount() - 1) ? mCigarettes.size() % ITEMS_PER_PAGE : ITEMS_PER_PAGE;
        int startPosition = position * ITEMS_PER_PAGE;
        for (int i = 0; i < count; i++) {
            cigarette = mCigarettes.get(startPosition + i);
            pageView.addView(createSaleLayout(startPosition + i + 1, cigarette, mCigaretteSales.get(cigarette.getId())));
        }

        container.addView(pageView);

        return pageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
    }

    @Override
    public int getCount() {
        return mCigarettes.size() / ITEMS_PER_PAGE + (mCigarettes.size() % ITEMS_PER_PAGE == 0 ? 0 : 1);
    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        return view.equals(o);
    }

    private LinearLayout createSalesLayoutContainer() {
        LinearLayout salesContainer = new LinearLayout(mContext);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        salesContainer.setOrientation(LinearLayout.VERTICAL);
        salesContainer.setLayoutParams(layoutParams);

        return salesContainer;
    }

    private LinearLayout createSaleLayout(int index, Cigarette cigarette, final CigaretteSale cigaretteSale) {
        LinearLayout saleLayout = (LinearLayout) mInflater.inflate(R.layout.row_cigarette_sale_item, null);
        final EditText priceInput = (EditText)saleLayout.findViewById(R.id.input_row_cigarette_sale_price);
        priceInput.setText(String.valueOf(cigaretteSale.getPrice()));
        final EditText countInput = (EditText)saleLayout.findViewById(R.id.input_row_cigarette_sale_count);
        countInput.setText(String.valueOf(cigaretteSale.getSalesCount()));

        String nameField = String.format(mContext.getString(R.string.label_row_cigarette_sale_name), index, cigarette.getName());
        ((TextView) saleLayout.findViewById(R.id.label_row_cigarette_sale_name)).setText(nameField);

        String infoField = String.format(mContext.getString(R.string.label_row_cigarette_sale_info), cigarette.getTar(),
                cigarette.getNicotine(), cigarette.getLength(), cigarette.getDiameter());
        ((TextView) saleLayout.findViewById(R.id.label_row_cigarette_sale_info)).setText(infoField);

        View.OnFocusChangeListener onPriceFocusChangeListener = new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if(!hasFocus) {
                    String priceText = priceInput.getText().toString();
                    int price = 0;
                    try {
                        price = Integer.parseInt(priceText);
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    } finally {
                        cigaretteSale.setPrice(price);
                    }
                }
            }
        };
        priceInput.setOnFocusChangeListener(onPriceFocusChangeListener);

        View.OnFocusChangeListener onCountFocusChangeListener = new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if(!hasFocus) {
                    //TODO update sales count
                    String countText = countInput.getText().toString();
                    int count = 0;
                    try {
                        count = Integer.parseInt(countText);
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    } finally {
                        cigaretteSale.setSalesCount(count);
                    }
                }
            }
        };
        countInput.setOnFocusChangeListener(onCountFocusChangeListener);

        return saleLayout;
    }
}

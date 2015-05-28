package com.globalgis.grand_marketing.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;

import com.globalgis.grand_marketing.R;
import com.globalgis.grand_marketing.VkInWork;
import com.globalgis.grand_marketing.adapters.TypesCursorAdapter;
import com.globalgis.grand_marketing.app.GMApplication;
import com.globalgis.grand_marketing.database.CountryTable;
import com.globalgis.grand_marketing.database.DbManager;
import com.globalgis.grand_marketing.models.Vk;

public class VkAddressFragment extends BaseFragment {

    private AutoCompleteTextView mCountryView;
    private TypesCursorAdapter mCountriesAdapter;
    private EditText mStateView;
    private EditText mCityView;
    private EditText mStreetView;
    private TextView mAccuracyView;
    private TextView mXView;
    private TextView mYView;
    private EditText mNotes;

    private Vk mVk;
    private DbManager mDbManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_address, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        mVk = VkInWork.getInstance().getVk();
        mDbManager = GMApplication.getDbManager();
        initView(view);
        fillView();
    }

    private void initView(View root) {
        mCountryView = (AutoCompleteTextView) root.findViewById(R.id.input_fragment_address_country);
        mStateView = (EditText) root.findViewById(R.id.input_fragment_address_state);
        mCityView = (EditText) root.findViewById(R.id.input_fragment_address_city);
        mStreetView = (EditText) root.findViewById(R.id.input_fragment_address_street);
        mAccuracyView = (TextView) root.findViewById(R.id.label_fragment_address_accuracy);
        mXView = (TextView) root.findViewById(R.id.label_fragment_address_x_coord);
        mYView = (TextView) root.findViewById(R.id.label_fragment_address_y_coord);
        mNotes = (EditText) root.findViewById(R.id.input_fragment_address_notes);
    }

    private void fillView() {
        initCountry();
    }

    private void initCountry() {
        mCountryView.setText(mDbManager.getTypeObject(CountryTable.TABLE_NAME, 1));
        mCountriesAdapter = new TypesCursorAdapter(mActivity, mDbManager, CountryTable.TABLE_NAME);
        mCountryView.setAdapter(mCountriesAdapter);
    }
}
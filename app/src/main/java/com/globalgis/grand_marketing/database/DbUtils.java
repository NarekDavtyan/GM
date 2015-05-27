package com.globalgis.grand_marketing.database;

import android.database.Cursor;
import android.util.SparseArray;
import com.globalgis.grand_marketing.models.Cigarette;
import com.globalgis.grand_marketing.models.CigaretteSale;
import com.globalgis.grand_marketing.models.Firm;
import com.globalgis.grand_marketing.models.Vk;

import java.util.ArrayList;

public class DbUtils {

    public static Firm getFirmFromCursor(Cursor cursor) {
        int id = cursor.getInt(cursor.getColumnIndex(FirmsTable.ID));
        int row = cursor.getInt(cursor.getColumnIndex(FirmsTable.ROW));
        String name = cursor.getString(cursor.getColumnIndex(FirmsTable.NAME));
        boolean isOwn = cursor.getString(cursor.getColumnIndex(FirmsTable.IS_OWN)).equals("1");
        int version = cursor.getInt(cursor.getColumnIndex(FirmsTable.VERSION));

        return new Firm(id, row, name, isOwn, version);
    }

    public static ArrayList<Firm> getFirmListFromCursor(Cursor cursor) {
        ArrayList<Firm> firms = new ArrayList<Firm>();
        while (cursor.moveToNext()) {
            firms.add(getFirmFromCursor(cursor));
        }

        return firms;
    }

    public static Vk getVkFromCursor(Cursor cursor) {
        int id = cursor.getInt(cursor.getColumnIndex(VksTable.ID));
        int organizationFormsId = cursor.getInt(cursor.getColumnIndex(VksTable.ORGANIZATION_FORMS_ID));
        int categoryId = cursor.getInt(cursor.getColumnIndex(VksTable.CATEGORY_ID));
        int vkClassId = cursor.getInt(cursor.getColumnIndex(VksTable.VK_CLASS_ID));
        int supplyId = cursor.getInt(cursor.getColumnIndex(VksTable.SUPPLY_ID));
        String enterpriseManager = cursor.getString(cursor.getColumnIndex(VksTable.ENTERPRISE_MANAGER));
        int openedId = cursor.getInt(cursor.getColumnIndex(VksTable.OPENED_ID));
        int cooperationId = cursor.getInt(cursor.getColumnIndex(VksTable.COOPERATION_ID));
        String companyName = cursor.getString(cursor.getColumnIndex(VksTable.COMPANY_NAME));
        int countryId = cursor.getInt(cursor.getColumnIndex(VksTable.COUNTRY_ID));
        int regionId = cursor.getInt(cursor.getColumnIndex(VksTable.REGION_ID));
        int cityId = cursor.getInt(cursor.getColumnIndex(VksTable.CITY_ID));
        int streetId = cursor.getInt(cursor.getColumnIndex(VksTable.STREET_ID));
        String house = cursor.getString(cursor.getColumnIndex(VksTable.HOUSE));
        int x = cursor.getInt(cursor.getColumnIndex(VksTable.X));
        int y = cursor.getInt(cursor.getColumnIndex(VksTable.Y));
        int z = cursor.getInt(cursor.getColumnIndex(VksTable.Z));
        String vkCode = cursor.getString(cursor.getColumnIndex(VksTable.VK_CODE));
        String vkName = cursor.getString(cursor.getColumnIndex(VksTable.VK_NAME));
        String phone = cursor.getString(cursor.getColumnIndex(VksTable.PHONE));
        String commonNotes = cursor.getString(cursor.getColumnIndex(VksTable.COMMON_NOTES));
        String note = cursor.getString(cursor.getColumnIndex(VksTable.NOTES));
        String complaintSuggestion = cursor.getString(cursor.getColumnIndex(VksTable.COMPLAINT_SUGGESTION));
        int avgBal = cursor.getInt(cursor.getColumnIndex(VksTable.AVG_BAL));
        String hvhh = cursor.getString(cursor.getColumnIndex(VksTable.HVHH));
        int version = cursor.getInt(cursor.getColumnIndex(VksTable.VERSION));

        return new Vk(id, organizationFormsId, categoryId, vkClassId, supplyId, enterpriseManager, companyName,
                openedId, cooperationId, countryId, regionId, cityId, streetId, house, x, y, z, vkCode, vkName, phone,
                commonNotes, note, complaintSuggestion, avgBal, version, hvhh);
    }

    public static CigaretteSale getCigaretteSaleFromCursor(Cursor cursor) {
        int id = cursor.getInt(cursor.getColumnIndex(CigaretteSalesTable.ID));
        int cigaretteId = cursor.getInt(cursor.getColumnIndex(CigaretteSalesTable.CIGARETTE_ID));
        int vkId = cursor.getInt(cursor.getColumnIndex(CigaretteSalesTable.VK_ID));
        int price = cursor.getInt(cursor.getColumnIndex(CigaretteSalesTable.PRICE));
        int count = cursor.getInt(cursor.getColumnIndex(CigaretteSalesTable.SALES_COUNT));
        int version = cursor.getInt(cursor.getColumnIndex(CigaretteSalesTable.VERSION));

        return new CigaretteSale(id, cigaretteId, vkId, price, count, version);
    }

    public static ArrayList<CigaretteSale> getCigaretteSaleListFromCursor(Cursor cursor) {
        ArrayList<CigaretteSale> sales = new ArrayList<CigaretteSale>();
        while (cursor.moveToNext()) {
            sales.add(getCigaretteSaleFromCursor(cursor));
        }

        return sales;
    }

    public static SparseArray<CigaretteSale> getCigaretteSaleSparseFromCursor(Cursor cursor) {
        SparseArray<CigaretteSale> sales = new SparseArray<CigaretteSale>();
        while (cursor.moveToNext()) {
            CigaretteSale cigaretteSale = getCigaretteSaleFromCursor(cursor);
            sales.put(cigaretteSale.getCigaretteId(), cigaretteSale);
        }

        return sales;
    }

    public static ArrayList<Cigarette> getCigarettesFromCursor(Cursor cursor) {
        ArrayList<Cigarette> rv = new ArrayList<Cigarette>();
        while (cursor.moveToNext()) {
            rv.add(getCigaretteFromCursor(cursor));
        }
        return rv;
    }

    public static Cigarette getCigaretteFromCursor(Cursor cursor) {
        Cigarette cigarette = new Cigarette();
        int id = cursor.getInt(cursor.getColumnIndex(CigarettesTable.ID));
        int serverId = cursor.getInt(cursor.getColumnIndex(CigarettesTable.SERVER_ID));
        int firmId = cursor.getInt(cursor.getColumnIndex(CigarettesTable.FIRM_ID));
        String name = cursor.getString(cursor.getColumnIndex(CigarettesTable.CIGARETTE_NAME));
        String desirablePrice = cursor.getString(cursor.getColumnIndex(CigarettesTable.DESIRABLE_PRICE));
        String wholePrice = cursor.getString(cursor.getColumnIndex(CigarettesTable.WHOLE_SALE_PRICE));
        String diameter = cursor.getString(cursor.getColumnIndex(CigarettesTable.DIAMETER));
        String length = cursor.getString(cursor.getColumnIndex(CigarettesTable.LENGTH));
        String nicotine = cursor.getString(cursor.getColumnIndex(CigarettesTable.NICOTINE));
        String tar = cursor.getString(cursor.getColumnIndex(CigarettesTable.TAR));
        boolean vvt = cursor.getString(cursor.getColumnIndex(CigarettesTable.DIAMETER)).equals("true");
        int row = cursor.getInt(cursor.getColumnIndex(CigarettesTable.ROW));
        int version = cursor.getInt(cursor.getColumnIndex(CigarettesTable.VERSION));

        cigarette.setId(id);
        cigarette.setServerId(serverId);
        cigarette.setFirmId(firmId);
        cigarette.setName(name);
        cigarette.setDesirablePrice(desirablePrice);
        cigarette.setWholePrice(wholePrice);
        cigarette.setDiameter(diameter);
        cigarette.setLength(length);
        cigarette.setNicotine(nicotine);
        cigarette.setTar(tar);
        cigarette.setVvt(vvt);
        cigarette.setRow(row);
        cigarette.setVersion(version);

        return cigarette;
    }
}

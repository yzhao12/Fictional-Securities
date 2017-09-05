package com.yzhao12.fictionalassets.DataObjects;

import android.net.Uri;
import android.os.Parcelable;

import com.google.firebase.auth.FirebaseUser;
import com.yzhao12.fictionalassets.DataObjects.PortfolioItem;

/**
 * Created by Yang on 6/17/2017.
 */

public class User {
    public User() {

    }

    public User(Uri profilePicUrl, int money, PortfolioItem[] portfolio) {
        m_profilePicUrl = profilePicUrl;
        m_userMoney = money;
        m_userPortfolio = portfolio;
    }

    public Uri getM_profilePicUrl() {
        return m_profilePicUrl;
    }

    public void setM_profilePicUrl(Uri profilePicUrl) {
        m_profilePicUrl = profilePicUrl;
    }

    public int getUserMoney() {
        return m_userMoney;
    }

    public void setUserMoney(int userMoney) {
        m_userMoney = userMoney;
    }

    public PortfolioItem[] getUserPortfolio() {
        return m_userPortfolio;
    }

    public void setUserPortfolio(PortfolioItem[] userPortfolio) {
        m_userPortfolio = userPortfolio;
    }



    private FirebaseUser m_userInstance;

    private Uri m_profilePicUrl;
    private int m_userMoney;
    private PortfolioItem[] m_userPortfolio;

}
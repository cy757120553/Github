package com.primb.github.dao;

import android.os.Parcel;
import android.os.Parcelable;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;

import java.util.Date;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit.

/**
 * Entity mapped to table "AUTH_USER".
 */
@Entity
public class AuthUser implements Parcelable {

    @Id
    @NotNull
    private String accessToken;

    @NotNull
    private Date authTime;
    private int expireIn;

    @NotNull
    private String scope;
    private boolean selected;

    @NotNull
    private String loginId;
    private String name;
    private String avatar;

    @Generated
    public AuthUser() {
    }

    public AuthUser(String accessToken) {
        this.accessToken = accessToken;
    }

    @Generated
    public AuthUser(String accessToken, Date authTime, int expireIn, String scope, boolean selected, String loginId, String name, String avatar) {
        this.accessToken = accessToken;
        this.authTime = authTime;
        this.expireIn = expireIn;
        this.scope = scope;
        this.selected = selected;
        this.loginId = loginId;
        this.name = name;
        this.avatar = avatar;
    }

    @NotNull
    public String getAccessToken() {
        return accessToken;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setAccessToken(@NotNull String accessToken) {
        this.accessToken = accessToken;
    }

    @NotNull
    public Date getAuthTime() {
        return authTime;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setAuthTime(@NotNull Date authTime) {
        this.authTime = authTime;
    }

    public int getExpireIn() {
        return expireIn;
    }

    public void setExpireIn(int expireIn) {
        this.expireIn = expireIn;
    }

    @NotNull
    public String getScope() {
        return scope;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setScope(@NotNull String scope) {
        this.scope = scope;
    }

    public boolean getSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    @NotNull
    public String getLoginId() {
        return loginId;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setLoginId(@NotNull String loginId) {
        this.loginId = loginId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.accessToken);
        dest.writeLong(this.authTime != null ? this.authTime.getTime() : -1);
        dest.writeInt(this.expireIn);
        dest.writeString(this.scope);
        dest.writeByte(this.selected ? (byte) 1 : (byte) 0);
        dest.writeString(this.loginId);
        dest.writeString(this.name);
        dest.writeString(this.avatar);
    }

    protected AuthUser(Parcel in) {
        this.accessToken = in.readString();
        long tmpAuthTime = in.readLong();
        this.authTime = tmpAuthTime == -1 ? null : new Date(tmpAuthTime);
        this.expireIn = in.readInt();
        this.scope = in.readString();
        this.selected = in.readByte() != 0;
        this.loginId = in.readString();
        this.name = in.readString();
        this.avatar = in.readString();
    }

    public static final Creator<AuthUser> CREATOR = new Creator<AuthUser>() {
        @Override
        public AuthUser createFromParcel(Parcel source) {
            return new AuthUser(source);
        }

        @Override
        public AuthUser[] newArray(int size) {
            return new AuthUser[size];
        }
    };
}

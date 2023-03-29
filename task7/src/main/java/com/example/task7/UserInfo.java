package com.example.task7;

import android.os.Parcel;
import android.os.Parcelable;


public class UserInfo implements Parcelable {

    private final String fName;

    private final String lName;

    private final String tName;

    private final byte age;

    public UserInfo(String fName, String lName, String tName, byte age){
        this.fName = fName;
        this.lName = lName;
        this.tName = tName;
        this.age = age;
    }

    protected UserInfo(Parcel in) {
        fName = in.readString();
        lName = in.readString();
        tName = in.readString();
        age = in.readByte();
    }

    public static final Creator<UserInfo> CREATOR = new Creator<UserInfo>() {
        @Override
        public UserInfo createFromParcel(Parcel in) {
            return new UserInfo(in);
        }

        @Override
        public UserInfo[] newArray(int size) {
            return new UserInfo[size];
        }
    };

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String gettName() {
        return tName;
    }

    public byte getAge() {
        return age;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(fName);
        parcel.writeString(lName);
        parcel.writeString(tName);
        parcel.writeByte(age);
    }
}

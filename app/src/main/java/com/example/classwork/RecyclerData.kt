package com.example.classwork

import android.os.Parcel
import android.os.Parcelable

data class RecyclerData(
    var image: Int, var name: String?,
    var phoneNumber :String?, var email :String?
    )
    : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(image)
        parcel.writeString(name)
        parcel.writeString(phoneNumber)
        parcel.writeString(email)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<RecyclerData> {
        override fun createFromParcel(parcel: Parcel): RecyclerData {
            return RecyclerData(parcel)
        }

        override fun newArray(size: Int): Array<RecyclerData?> {
            return arrayOfNulls(size)
        }
    }
}

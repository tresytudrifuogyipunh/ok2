package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: sn1  reason: default package */
public final class sn1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new tn1(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new tn1[i];
    }
}
package defpackage;

import android.os.HandlerThread;

/* renamed from: rs5  reason: default package */
public final /* synthetic */ class rs5 implements qt4 {
    public final /* synthetic */ int P;

    @Override // defpackage.qt4
    public final Object a() {
        return new HandlerThread(ts5.m(this.P, "ExoPlayer:MediaCodecQueueingThread:"));
    }
}
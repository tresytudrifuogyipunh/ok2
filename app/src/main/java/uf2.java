package defpackage;

import java.util.Map;

/* renamed from: uf2  reason: default package */
public final class uf2 implements mg2 {
    @Override // defpackage.mg2
    public final void b(Object obj, Map map) {
        eg3 eg3Var;
        y03 y03Var = (y03) obj;
        xx5 xx5Var = jv5.A.q;
        if (xx5Var.e && (eg3Var = xx5Var.d) != null) {
            ((xr4) eg3Var.Q).a(xx5Var.f(), xx5Var.f, 1);
            xx5Var.a("onLMDOverlayExpand");
            return;
        }
        vz3.k("LastMileDelivery not connected");
    }
}
package jsnes;

final class acj extends afc {
   // $FF: synthetic field
   private adv a;

   private acj(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 14;
   }

   public final void a() {
      int var1 = adv.r(this.a);
      int var2 = adv.p(this.a, adv.l(this.a, var1));
      this.a.g();
      adv.h(this.a, var1, var2);
   }

   // $FF: synthetic method
   acj(adv var1) {
      this(var1, (byte)0);
   }
}

package jsnes;

final class wi extends afc {
   // $FF: synthetic field
   private adv a;

   private wi(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 6;
   }

   public final void a() {
      int var1 = adv.p(this.a);
      int var2 = adv.j(this.a, adv.i(this.a, var1));
      this.a.g();
      adv.f(this.a, var1, var2);
   }

   // $FF: synthetic method
   wi(adv var1) {
      this(var1, (byte)0);
   }
}

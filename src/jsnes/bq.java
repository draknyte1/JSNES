package jsnes;

final class bq extends afc {
   // $FF: synthetic field
   private adv a;

   private bq(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 7;
   }

   public final void a() {
      adv.A(this.a, adv.L(this.a));
   }

   // $FF: synthetic method
   bq(adv var1) {
      this(var1, (byte)0);
   }
}

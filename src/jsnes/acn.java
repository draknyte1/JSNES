package jsnes;

final class acn extends afc {
   // $FF: synthetic field
   private adv a;

   private acn(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 12;
   }

   public final void a() {
      adv.D(this.a, adv.K(this.a));
   }

   // $FF: synthetic method
   acn(adv var1) {
      this(var1, (byte)0);
   }
}

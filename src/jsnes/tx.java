package jsnes;

final class tx extends afc {
   // $FF: synthetic field
   private adv a;

   private tx(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 11;
   }

   public final void a() {
      adv.z(this.a, adv.E(this.a));
   }

   // $FF: synthetic method
   tx(adv var1) {
      this(var1, (byte)0);
   }
}

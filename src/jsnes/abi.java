package jsnes;

final class abi extends afc {
   // $FF: synthetic field
   private adv a;

   private abi(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 19;
   }

   public final void a() {
      adv.a(this.a, adv.g(this.a));
   }

   // $FF: synthetic method
   abi(adv var1) {
      this(var1, (byte)0);
   }
}

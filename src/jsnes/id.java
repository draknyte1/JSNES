package jsnes;

final class id extends afg {
   // $FF: synthetic field
   private kt a;

   private id(kt var1, byte var2) {
      this.a = var1;
      super();
      this.a = 24;
   }

   public final void a() {
      int var1 = kt.r(this.a);
      int var2 = kt.g(this.a, var1) | 2;
      kt.a(this.a, var1, var2);
      kt.a(this.a, 4);
   }

   // $FF: synthetic method
   id(kt var1) {
      this(var1, (byte)0);
   }
}

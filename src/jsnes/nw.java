package jsnes;

final class nw extends afg {
   // $FF: synthetic field
   private kt a;

   private nw(kt var1, byte var2) {
      this.a = var1;
      super();
      this.a = 7;
      this.b = 14;
   }

   public final void a() {
      int var1 = kt.u(this.a);
      int var2 = 1 << (var1 >> 13);
      var1 &= 8191;
      kt.e(this.a, kt.e(this.a) && (kt.g(this.a, var1) & var2) == 0);
      kt.a(this.a, 4);
   }

   // $FF: synthetic method
   nw(kt var1) {
      this(var1, (byte)0);
   }
}

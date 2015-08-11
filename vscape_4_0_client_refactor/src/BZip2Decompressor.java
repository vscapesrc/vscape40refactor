final class BZip2Decompressor {
	private static final BZip2DecompressionState a = new BZip2DecompressionState();

	public static int decompress(byte[] var0, int var1, byte[] var2, int var3, int var4) {
		BZip2DecompressionState var5 = a;
		synchronized (a) {
			a.a = var2;
			a.b = var4;
			a.f = var0;
			a.g = 0;
			a.c = var3;
			a.h = var1;
			a.o = 0;
			a.n = 0;
			a.d = 0;
			a.e = 0;
			a.i = 0;
			a.j = 0;
			a.q = 0;
			BZip2DecompressionState var18 = a;
			boolean var19 = false;
			Object var21 = null;
			BZip2DecompressionState var24 = null;
			Object var6 = null;
			var18.p = 1;
			if (BZip2DecompressionState.x == null) {
				BZip2DecompressionState.x = new int[var18.p * 100000];
			}

			boolean var10000 = true;

			while (var10000 && (byte) getBits(8, var18) != 23) {
				byte var47 = (byte) getBits(8, var18);
				var47 = (byte) getBits(8, var18);
				var47 = (byte) getBits(8, var18);
				var47 = (byte) getBits(8, var18);
				var47 = (byte) getBits(8, var18);
				++var18.q;
				var47 = (byte) getBits(8, var18);
				var47 = (byte) getBits(8, var18);
				var47 = (byte) getBits(8, var18);
				var47 = (byte) getBits(8, var18);
				byte var20 = (byte) getBits(1, var18);
				var18.m = var20 != 0;
				if (var18.m) {
					System.out.println("PANIC! RANDOMISED BLOCK!");
				}

				var18.r = 0;
				var20 = (byte) getBits(8, var18);
				var18.r = var18.r << 8 | var20 & 255;
				var20 = (byte) getBits(8, var18);
				var18.r = var18.r << 8 | var20 & 255;
				var20 = (byte) getBits(8, var18);
				var18.r = var18.r << 8 | var20 & 255;

				int var23;
				for (var23 = 0; var23 < 16; ++var23) {
					byte var22 = (byte) getBits(1, var18);
					var18.A[var23] = var22 == 1;
				}

				for (var23 = 0; var23 < 256; ++var23) {
					var18.z[var23] = false;
				}

				for (var23 = 0; var23 < 16; ++var23) {
					if (var18.A[var23]) {
						for (var3 = 0; var3 < 16; ++var3) {
							if ((byte) getBits(1, var18) == 1) {
								var18.z[(var23 << 4) + var3] = true;
							}
						}
					}
				}

				var24 = var18;
				var18.y = 0;

				int var27;
				for (var27 = 0; var27 < 256; ++var27) {
					if (var24.z[var27]) {
						var24.B[var24.y] = (byte) var27;
						++var24.y;
					}
				}

				var23 = var18.y + 2;
				var3 = getBits(3, var18);
				var4 = getBits(15, var18);

				int var8;
				for (var27 = 0; var27 < var4; ++var27) {
					for (var8 = 0; (byte) getBits(1, var18) != 0; ++var8) {
						;
					}

					var18.F[var27] = (byte) var8;
				}

				byte[] var29 = new byte[6];

				byte var30;
				for (var30 = 0; var30 < var3; var29[var30] = var30++) {
					;
				}

				byte var9;
				byte var10;
				for (var8 = 0; var8 < var4; ++var8) {
					var9 = var18.F[var8];

					for (var10 = var29[var9]; var9 > 0; --var9) {
						var29[var9] = var29[var9 - 1];
					}

					var29[0] = var10;
					var18.E[var8] = var10;
				}

				int var35;
				int var32;
				for (var8 = 0; var8 < var3; ++var8) {
					var32 = getBits(5, var18);

					for (var35 = 0; var35 < var23; ++var35) {
						while ((byte) getBits(1, var18) != 0) {
							if ((byte) getBits(1, var18) == 0) {
								++var32;
							} else {
								--var32;
							}
						}

						var18.G[var8][var35] = (byte) var32;
					}
				}

				int var7;
				int var11;
				byte var12;
				int var15;
				int var16;
				int[] var26;
				int[] var28;
				for (var8 = 0; var8 < var3; ++var8) {
					var9 = 32;
					var10 = 0;

					for (var4 = 0; var4 < var23; ++var4) {
						if (var18.G[var8][var4] > var10) {
							var10 = var18.G[var8][var4];
						}

						if (var18.G[var8][var4] < var9) {
							var9 = var18.G[var8][var4];
						}
					}

					int[] var46 = var18.H[var8];
					int[] var10001 = var18.I[var8];
					int[] var10002 = var18.J[var8];
					byte[] var10003 = var18.G[var8];
					var11 = var23;
					var12 = var10;
					byte[] var14 = var10003;
					int[] var39 = var10002;
					var28 = var10001;
					var26 = var46;
					var15 = 0;

					for (var7 = var9; var7 <= var12; ++var7) {
						for (var16 = 0; var16 < var11; ++var16) {
							if (var14[var16] == var7) {
								var39[var15] = var16;
								++var15;
							}
						}
					}

					for (var7 = 0; var7 < 23; ++var7) {
						var28[var7] = 0;
					}

					for (var7 = 0; var7 < var11; ++var7) {
						++var28[var14[var7] + 1];
					}

					for (var7 = 1; var7 < 23; ++var7) {
						var28[var7] += var28[var7 - 1];
					}

					for (var7 = 0; var7 < 23; ++var7) {
						var26[var7] = 0;
					}

					var7 = 0;

					for (var16 = var9; var16 <= var12; ++var16) {
						var7 += var28[var16 + 1] - var28[var16];
						var26[var16] = var7 - 1;
						var7 <<= 1;
					}

					for (var16 = var9 + 1; var16 <= var12; ++var16) {
						var28[var16] = (var26[var16 - 1] + 1 << 1) - var28[var16];
					}

					var18.K[var8] = var9;
				}

				var8 = var18.y + 1;
				var9 = -1;
				boolean var40 = false;

				for (var4 = 0; var4 <= 255; ++var4) {
					var18.u[var4] = 0;
				}

				var4 = 4095;

				int var13;
				int var42;
				for (var42 = 15; var42 >= 0; --var42) {
					for (var13 = 15; var13 >= 0; --var13) {
						var18.C[var4] = (byte) ((var42 << 4) + var13);
						--var4;
					}

					var18.D[var42] = var4 + 1;
				}

				var42 = 0;
				var32 = var9 + 1;
				byte var37 = 50;
				byte var41 = var18.E[0];
				var23 = var18.K[var41];
				int[] var25 = var18.H[var41];
				var28 = var18.J[var41];
				var26 = var18.I[var41];
				var35 = var37 - 1;
				var13 = var23;

				byte var34;
				int var36;
				for (var36 = getBits(var23, var18); var36 > var25[var13]; var36 = var36 << 1 | var34) {
					++var13;
					var34 = (byte) getBits(1, var18);
				}

				var13 = var28[var36 - var26[var13]];

				while (true) {
					while (var13 != var8) {
						byte var33;
						byte var43;
						if (var13 != 0 && var13 != 1) {
							if ((var36 = var13 - 1) < 16) {
								var15 = var18.D[0];

								for (var34 = var18.C[var15 + var36]; var36 > 3; var36 -= 4) {
									var13 = var15 + var36;
									var18.C[var13] = var18.C[var13 - 1];
									var18.C[var13 - 1] = var18.C[var13 - 2];
									var18.C[var13 - 2] = var18.C[var13 - 3];
									var18.C[var13 - 3] = var18.C[var13 - 4];
								}

								while (var36 > 0) {
									var18.C[var15 + var36] = var18.C[var15 + var36 - 1];
									--var36;
								}

								var18.C[var15] = var34;
							} else {
								var15 = var36 / 16;
								var13 = var36 % 16;
								var7 = var18.D[var15] + var13;

								for (var34 = var18.C[var7]; var7 > var18.D[var15]; --var7) {
									var18.C[var7] = var18.C[var7 - 1];
								}

								++var18.D[var15];

								while (var15 > 0) {
									--var18.D[var15];
									var18.C[var18.D[var15]] = var18.C[var18.D[var15 - 1] + 16 - 1];
									--var15;
								}

								--var18.D[0];
								var18.C[var18.D[0]] = var34;
								if (var18.D[0] == 0) {
									var13 = 4095;

									for (var36 = 15; var36 >= 0; --var36) {
										for (var15 = 15; var15 >= 0; --var15) {
											var18.C[var13] = var18.C[var18.D[var36] + var15];
											--var13;
										}

										var18.D[var36] = var13 + 1;
									}
								}
							}

							++var18.u[var18.B[var34 & 255] & 255];
							BZip2DecompressionState.x[var42] = var18.B[var34 & 255] & 255;
							++var42;
							if (var35 == 0) {
								++var32;
								var35 = 50;
								var43 = var18.E[var32];
								var23 = var18.K[var43];
								var25 = var18.H[var43];
								var28 = var18.J[var43];
								var26 = var18.I[var43];
							}

							--var35;
							var15 = var23;

							for (var13 = getBits(var23, var18); var13 > var25[var15]; var13 = var13 << 1 | var33) {
								++var15;
								var33 = (byte) getBits(1, var18);
							}

							var13 = var28[var13 - var26[var15]];
						} else {
							var36 = -1;
							var11 = 1;

							do {
								if (var13 == 0) {
									var36 += var11;
								} else if (var13 == 1) {
									var36 += 2 * var11;
								}

								var11 <<= 1;
								if (var35 == 0) {
									++var32;
									var35 = 50;
									var43 = var18.E[var32];
									var23 = var18.K[var43];
									var25 = var18.H[var43];
									var28 = var18.J[var43];
									var26 = var18.I[var43];
								}

								--var35;
								var15 = var23;

								for (var13 = getBits(var23, var18); var13 > var25[var15]; var13 = var13 << 1 | var33) {
									++var15;
									var33 = (byte) getBits(1, var18);
								}
							} while ((var13 = var28[var13 - var26[var15]]) == 0 || var13 == 1);

							++var36;
							var43 = var18.B[var18.C[var18.D[0]] & 255];

							for (var18.u[var43 & 255] += var36; var36 > 0; --var36) {
								BZip2DecompressionState.x[var42] = var43 & 255;
								++var42;
							}
						}
					}

					var18.l = 0;
					var18.k = 0;
					var18.w[0] = 0;

					for (var13 = 1; var13 <= 256; ++var13) {
						var18.w[var13] = var18.u[var13 - 1];
					}

					for (var13 = 1; var13 <= 256; ++var13) {
						var18.w[var13] += var18.w[var13 - 1];
					}

					for (var13 = 0; var13 < var42; ++var13) {
						var12 = (byte) BZip2DecompressionState.x[var13];
						BZip2DecompressionState.x[var18.w[var12 & 255]] |= var13 << 8;
						++var18.w[var12 & 255];
					}

					var18.s = BZip2DecompressionState.x[var18.r] >> 8;
					var18.v = 0;
					var18.s = BZip2DecompressionState.x[var18.s];
					var18.t = (byte) var18.s;
					var18.s >>= 8;
					++var18.v;
					var18.L = var42;
					byte var31 = var18.k;
					var35 = var18.l;
					var42 = var18.v;
					var13 = var18.t;
					int[] var44 = BZip2DecompressionState.x;
					var11 = var18.s;
					byte[] var45 = var18.f;
					var7 = var18.g;
					var16 = var18.h;
					var23 = var18.h;
					var3 = var18.L + 1;

					label272: while (true) {
						if (var35 > 0) {
							while (true) {
								if (var16 == 0) {
									break label272;
								}

								if (var35 == 1) {
									if (var16 == 0) {
										var35 = 1;
										break label272;
									}

									var45[var7] = var31;
									++var7;
									--var16;
									break;
								}

								var45[var7] = var31;
								--var35;
								++var7;
								--var16;
							}
						}

						boolean var38 = true;

						while (var38) {
							var38 = false;
							if (var42 == var3) {
								var35 = 0;
								break label272;
							}

							var31 = (byte) var13;
							var9 = (byte) (var11 = var44[var11]);
							var11 >>= 8;
							++var42;
							if (var9 != var13) {
								var13 = var9;
								if (var16 == 0) {
									var35 = 1;
									break label272;
								}

								var45[var7] = var31;
								++var7;
								--var16;
								var38 = true;
							} else if (var42 == var3) {
								if (var16 == 0) {
									var35 = 1;
									break label272;
								}

								var45[var7] = var31;
								++var7;
								--var16;
								var38 = true;
							}
						}

						var35 = 2;
						var9 = (byte) (var11 = var44[var11]);
						var11 >>= 8;
						++var42;
						if (var42 != var3) {
							if (var9 != var13) {
								var13 = var9;
							} else {
								var35 = 3;
								var30 = (byte) (var11 = var44[var11]);
								var11 >>= 8;
								++var42;
								if (var42 != var3) {
									if (var30 != var13) {
										var13 = var30;
									} else {
										var30 = (byte) (var11 = var44[var11]);
										var11 >>= 8;
										++var42;
										var35 = (var30 & 255) + 4;
										var13 = (byte) (var11 = var44[var11]);
										var11 >>= 8;
										++var42;
									}
								}
							}
						}
					}

					var8 = var18.i;
					var18.i += var23 - var16;
					if (var18.i < var8) {
						++var18.j;
					}

					var18.k = var31;
					var18.l = var35;
					var18.v = var42;
					var18.t = var13;
					BZip2DecompressionState.x = var44;
					var18.s = var11;
					var18.f = var45;
					var18.g = var7;
					var18.h = var16;
					if (var18.v == var18.L + 1 && var18.l == 0) {
						var10000 = true;
						break;
					}

					var10000 = false;
					break;
				}
			}

			return var1 -= a.h;
		}
	}

	private static int getBits(int amount, BZip2DecompressionState state) {
		while (state.o < amount) {
			state.n = state.n << 8 | state.a[state.b] & 255;
			state.o += 8;
			++state.b;
			--state.c;
			++state.d;
			if (state.d == 0) {
				++state.e;
			}
		}

		int var2 = state.n >> state.o - amount & (1 << amount) - 1;
		state.o -= amount;
		return var2;
	}
}

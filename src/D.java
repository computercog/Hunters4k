import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.awt.image.MemoryImageSource;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JFrame;

public class D extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	private static final int WIDTH = 160;
	private static final int FRAME_HEIGHT = 120;
	private static final int VIEW_HEIGHT = 110;
	private static final int SCALE = 2;

    public D()
    {
    }

    public final void processEvent(AWTEvent awtevent)
    {
        int i;
        if((i = awtevent.getID()) == 401 || i == 402)
            a_boolean_array1d_static_fld[((KeyEvent)awtevent).getKeyCode()] = i == 401;
        if(i == 506 || i == 503)
        {
            a_int_static_fld += ((MouseEvent)awtevent).getX() - ((WIDTH * SCALE) /2);
            a_java_awt_Robot_static_fld.mouseMove((WIDTH * SCALE) /2, (VIEW_HEIGHT * SCALE) /2);
        }
        if(i == 501)
            a_boolean_static_fld = true;
        if(i == 502)
            a_boolean_static_fld = false;
    }

    @SuppressWarnings("deprecation")
	public static void main(String args[])
        throws Throwable
    {
        float af[] = new float[2000];
        float af1[] = new float[2000];
        float af2[] = new float[2000];
        float af3[] = new float[2000];
        float af4[] = new float[2000];
        int ai[] = new int[2000];
        int ai1[] = new int[2000];
        boolean aflag[] = new boolean[0x10000];
        Random random = new Random();
        for(int i = 1; i < 255; i++)
        {
            for(int j = 1; j < 255; j++)
            {
                int k = i - 128;
                int l = j - 128;
                int i1;
                if((i1 = (int)((128D - Math.sqrt(k * k + l * l)) / 15D)) > 7 || i1 > 0 && random.nextInt(i1) > 0)
                    aflag[i + j * 256] = true;
            }

        }

        D d;
        (d = new D()).enableEvents(511L);
        int ai2[] = new int[0x11300];
        MemoryImageSource memoryimagesource;
        (memoryimagesource = new MemoryImageSource(320, 220, ai2, 0, 320)).setAnimated(true);
        java.awt.Image image = d.createImage(memoryimagesource);
        d.setUndecorated(true);
        a_java_awt_Robot_static_fld = new Robot();
        d.setSize(WIDTH * SCALE, FRAME_HEIGHT * SCALE);
        d.setVisible(true);
        /*if(args.length == 0)
        {
            GraphicsDevice graphicsdevice;
            (graphicsdevice = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice()).setFullScreenWindow(d);
            graphicsdevice.setDisplayMode(new DisplayMode(320, 240, 16, 60));
        } else
        {
            d.setSize(320, 260);
            d.setVisible(true);
        }*/
        Graphics g = d.getGraphics();
        int ai3[][] = new int[16][4096];
        for(int j1 = 0; j1 < 64; j1++)
        {
            for(int k1 = 0; k1 < 64; k1++)
            {
                int i2 = random.nextInt(256);
                int j2 = random.nextInt(256);
                int k2 = (190 - (((j1 + k1 * 2) / 32) * 32 - ((j1 - k1 * 2 - 128) % 32) * 2 - j1 - k1)) + i2 / 8;
                int j3 = 255 - (random.nextInt(k1 * 4 + 1) * j2) / 256;
                if(i2 < k1 / 4)
                    j3 = 0;
                ai3[0][j1 + k1 * 64] = 0xff000000 | k2 << 16 | (k2 * j3) / 256 << 8 | (k2 * j3) / 256;
                k2 = (k2 * 180) / 256;
                ai3[1][j1 + k1 * 64] = 0xff000000 | k2 << 16 | (k2 * j3) / 256 << 8 | (k2 * j3) / 256;
                int k3 = j1 - 32;
                int l3 = k1 - 32;
                int j4 = (k3 <= 0 ? -k3 : k3) + (l3 <= 0 ? -l3 : l3);
                k2 = (j2 / 16 + j4 / 4 & 0xff) + 128;
                if((j1 & 7) < 1 || (k1 + (j1 / 8) * 24 & 0x3f) < 1)
                    k2 -= 16;
                else
                    k2 -= (k1 + (j1 / 8) * 24 & 0x3f) / 2;
                j3 = 255 - i2 / 16;
                ai3[11][j1 + k1 * 64] = 0xff000000 | (k2 * j3) / 256 << 16 | (k2 * j3) / 256 << 8 | k2;
                j3 = 255 - (((i2 * j2) / 256) * j2) / 256;
                if(i2 < 64)
                    j3 = 0;
                ai3[10][j1 + k1 * 64] = 0xff000000 | k2 << 16 | (k2 * j3) / 256 << 8 | (k2 * j3) / 256;
                int l4 = k3 * k3 + l3 * l3;
                int i5 = k3 + 8;
                int j5 = l3 + 8;
                int k5;
                if((k5 = 255 - (int)(Math.sqrt(i5 * i5 + j5 * j5) * 7D)) < 0)
                    k5 = 0;
                char c = '\0';
                int i6 = j1 - 32;
                int j6 = k1 - 62;
                if((i6 * i6 + j6 * j6 * 32) < 128)
                {
                    l4 = 0;
                    k5 = 0;
                }
                int j7 = (l4 >= 256 ? 0 : 255) << 24;
                ai3[5][j1 + k1 * 64] = j7 | (k5 * 128) / 256 << 16 | (k5 * 128) / 256 << 8 | k5;
                c = k3 * k3 + l3 * l3 * 6 <= 256 ? '\377' : '\0';
                if(k3 * k3 + l3 * l3 < 48 && c == '\377')
                    k5 = 0;
                ai3[6][j1 + k1 * 64] = j7 | (k5 * (c / 2 + 128)) / 256 << 16 | (k5 * (c / 2 + 128)) / 256 << 8 | k5;
                ai3[7][j1 + k1 * 64] = j7 | 0xffffff;
            }

        }

        d.setCursor(1);
        af[0] = 128.5F;
        af1[0] = 128.5F;
        long l1 = 0L;
        long l2 = 0L;
        int i3 = 0;
        BufferedImage bufferedimage;
        Graphics g1;
        (g1 = (bufferedimage = new BufferedImage(WIDTH * SCALE, FRAME_HEIGHT * SCALE, 1)).getGraphics()).setFont(new Font("Sans-Serif", 1, 10 * SCALE));
        int i4 = 100;
        int k4 = 0;
        float f = 1000000F;
        long l5 = 0L;
        float f1 = 0.0F;
        do
        {
            /*if(g1 != g1)
                break;*/
            Arrays.fill(a_float_array1d_static_fld, 16F);
            Arrays.fill(b, 16F);
            if(a_boolean_array1d_static_fld[27])
                System.exit(0);
            if(i4 > 0)
                af4[0] = (float)(-a_int_static_fld) / 200F;
            float f2 = (float)Math.sin(-af4[0]);
            float f3 = (float)Math.cos(-af4[0]);
            if(i4 > 0)
            {
                if(f > 0.0F)
                    f1 -= 2.0F / f;
                if(f1 < 0.0F)
                    f1 = 0.0F;
                af2[0] *= 0.8F;
                af3[0] *= 0.8F;
                if(a_boolean_array1d_static_fld[87])
                {
                    af2[0] += f3 / 4F;
                    af3[0] += f2 / 4F;
                }
                if(a_boolean_array1d_static_fld[83])
                {
                    af2[0] -= f3 / 4F;
                    af3[0] -= f2 / 4F;
                }
                if(a_boolean_array1d_static_fld[65])
                {
                    af2[0] += f2 / 4F;
                    af3[0] -= f3 / 4F;
                }
                if(a_boolean_array1d_static_fld[68])
                {
                    af2[0] -= f2 / 4F;
                    af3[0] += f3 / 4F;
                }
                for(int l6 = 0; l6 < 2000; l6++)
                {
                    if(l6 > 0)
                        if(ai[l6] == 2)
                        {
                            float f4 = af[0] - af[l6];
                            float f6 = af1[l6] - af1[0];
                            af2[l6] *= 0.95F;
                            af3[l6] *= 0.95F;
                            float f11;
                            for(f11 = ((float)(f4 * f4 + f6 * f6 >= 40F ? (double)random.nextFloat() * 3.1415926535897931D * 2D : Math.atan2(f6, f4))) - af4[l6]; (double)f11 >= 3.1415926535897931D; f11 = (float)((double)f11 - 6.2831853071795862D));
                            for(; (double)f11 < -3.1415926535897931D; f11 = (float)((double)f11 + 6.2831853071795862D));
                            f11 = (float)((double)f11 + random.nextGaussian() * 2D);
                            for(af4[l6] += f11 * 0.8F; (double)af4[l6] >= 3.1415926535897931D; af4[l6] -= 6.2831853071795862D);
                            for(; (double)af4[l6] < -3.1415926535897931D; af4[l6] += 6.2831853071795862D);
                            af2[l6] += Math.cos(-af4[l6]) / 4D;
                            af3[l6] += Math.sin(-af4[l6]) / 4D;
                        } else
                        if(ai[l6] == 3 && l1 - l5 > 80L)
                            if(ai1[l6] < 5)
                            {
                                ai[l6] = 2;
                            } else
                            {
                                ai[l6] = 0;
                                k4 += 10;
                            }
                    float f5 = (af2[l6] * 2.0F) / f;
                    float f7 = (af3[l6] * 2.0F) / f;
                    if(f5 > 0.9F)
                        f5 = 0.9F;
                    if(f7 > 0.9F)
                        f7 = 0.9F;
                    if(f5 < -0.9F)
                        f5 = -0.9F;
                    if(f7 < -0.9F)
                        f7 = -0.9F;
                    int l7 = (int)(((af[l6] - 0.5F) + f5) * 4F);
                    int i8 = (int)((af1[l6] - 0.5F) * 4F);
                    float f12 = f5;
                    for(int i10 = 0; i10 < 2; i10++)
                    {
                        for(int i11 = -1; i11 <= 1; i11++)
                        {
                            for(int l11 = -1; l11 <= 1; l11++)
                            {
                                if(aflag[(l7 + i11) / 4 + ((i8 + l11) / 4) * 256 & 0xffff])
                                    continue;
                                f12 = 0.0F;
                                if(i10 == 0)
                                    af2[l6] = 0.0F;
                                else
                                    af3[l6] = 0.0F;
                            }

                        }

                        if(i10 == 0)
                            af[l6] += f12;
                        else
                            af1[l6] += f12;
                        l7 = (int)((af[l6] - 0.5F) * 4F);
                        i8 = (int)(((af1[l6] - 0.5F) + f7) * 4F);
                        f12 = f7;
                    }

                }

            }
            int i7 = (int)(af[0] - 0.5F);
            int k7 = (int)(af1[0] - 0.5F);
            float f8 = -(af[0] - (float)i7) + 1.0F;
            float f10 = -(af1[0] - (float)k7) + 1.0F;
            Arrays.fill(ai2, 0xff000000);
            for(int j8 = 0; j8 <= 32; j8++)
            {
                int i9 = ((j8 + 1) / 2) * (j8 % 2 != 0 ? 1 : -1);
                for(int j10 = 0; j10 <= 32; j10++)
                {
                    int j11 = ((j10 + 1) / 2) * (j10 % 2 != 0 ? 1 : -1);
                    boolean flag = aflag[i7 + j11 + (k7 + i9) * 256 & 0xffff];
                    if(flag)
                        continue;
                    float f19 = 0.5F;
                    float f21 = 0.5F;
                    float f23 = -0.5F;
                    float f25 = 0.5F;
                    for(int k12 = 0; k12 < 4; k12++)
                    {
                        a(ai2, ai3[k12 % 2], (float)j11 + f19 + f8, (float)i9 + f21 + f10, (float)j11 + f23 + f8, (float)i9 + f25 + f10, f2, f3);
                        float f26 = f25;
                        f25 = f23;
                        f23 = -f26;
                        f26 = f21;
                        f21 = f19;
                        f19 = -f26;
                    }

                }

            }

            for(int k8 = 111; k8 < 220; k8++)
            {
                int j9 = k8 * 320;
                int k10 = (220 - k8 - 1) * 320;
                float f14 = 1.0F / (((float)(k8 - 110) * 2.0F) / 160F);
                int i12;
                if((i12 = (int)(255F - (f14 * 255F) / 16F)) < 0)
                    i12 = 0;
                float f17 = (af[0] + f3 * f14 + f2 * f14) * 64F;
                float f20 = ((af1[0] + f2 * f14) - f3 * f14) * 64F;
                float f22 = (-f2 * f14 * 2.0F * 64F) / 320F;
                float f24 = (f3 * f14 * 2.0F * 64F) / 320F;
                for(int j12 = 0; j12 < 320; j12++)
                {
                    if(f14 <= a_float_array1d_static_fld[j12])
                    {
                        int l12;
                        int i13 = (((l12 = ai3[10][(int)f17 & 0x3f | ((int)f20 & 0x3f) << 6]) >> 16 & 0xff) * i12) / 255;
                        int j13 = ((l12 >> 8 & 0xff) * i12) / 255;
                        int k13 = ((l12 & 0xff) * i12) / 255;
                        ai2[j9] = 0xff000000 | i13 << 16 | j13 << 8 | k13;
                        i13 = (((l12 = ai3[11][(int)f17 & 0x3f | ((int)f20 & 0x3f) << 6]) >> 16 & 0xff) * i12) / 255;
                        j13 = ((l12 >> 8 & 0xff) * i12) / 255;
                        k13 = ((l12 & 0xff) * i12) / 255;
                        ai2[k10] = 0xff000000 | i13 << 16 | j13 << 8 | k13;
                    }
                    j9++;
                    k10++;
                    f17 += f22;
                    f20 += f24;
                }

            }

            a_float_array1d_static_fld[320] = 16F;
            int l8 = -1;
            for(int k9 = 1; k9 < 2000; k9++)
            {
                if(ai[k9] != 0)
                {
                    float f13 = af[k9] - af[0];
                    float f15 = af1[k9] - af1[0];
                    if(a(ai2, ai3[4 + ai[k9]], f13 - f2 * 0.5F, f15 + f3 * 0.5F, f13 + f2 * 0.5F, f15 - f3 * 0.5F, f2, f3))
                        l8 = k9;
                    if(f13 * f13 + f15 * f15 < 0.4F)
                    {
                        double d1 = Math.sqrt(f13 * f13 + f15 * f15);
                        ai[k9] = 0;
                        i4 -= 10;
                        af2[0] -= ((double)f13 / d1) * 8D;
                        af3[0] -= ((double)f15 / d1) * 8D;
                        f1 = 1.0F;
                    }
                    continue;
                }
                int l10 = random.nextInt(252) + 2;
                int k11 = random.nextInt(252) + 2;
                if(!aflag[l10 + k11 * 256])
                    continue;
                float f16 = (float)l10 - af[0];
                float f18 = (float)k11 - af1[0];
                if(f16 * f16 + f18 * f18 > 256F)
                {
                    af[k9] = l10;
                    af1[k9] = k11;
                    ai1[k9] = 0;
                    ai[k9] = 1 + random.nextInt(2);
                }
            }

            if(f1 > 0.0F)
            {
                Arrays.fill(ai2, 0, 320 * (int)(f1 * f1 * 150F), 0xff0080ff);
                Arrays.fill(ai2, 320 * (int)(220F - f1 * f1 * 150F), 0x11300, 0xff0080ff);
            }
            if(a_boolean_static_fld && l1 - l5 > 125L && i4 > 0)
            {
                a_boolean_static_fld = false;
                l5 = l1;
                af2[0] -= f3 / 4F;
                af3[0] -= f2 / 4F;
                if(l8 >= 0 && ai[l8] != 0)
                {
                    ai[l8] = 3;
                    af2[l8] += (random.nextFloat() - 0.5F) * 2.0F;
                    af3[l8] += (random.nextFloat() - 0.5F) * 2.0F;
                    ai1[l8]++;
                }
                if(k4 > 0)
                    k4--;
            }
            memoryimagesource.newPixels();
            g1.drawImage(image, 0, 0, WIDTH * SCALE, VIEW_HEIGHT * SCALE, null);
            g1.setColor(new Color(0x4a4138));
            g1.fillRect(0, VIEW_HEIGHT * SCALE, WIDTH * SCALE, 10 * SCALE);
            g1.setColor(new Color(0xdad4c6));
            g1.drawString("Health: " + i4 + "    Score: " + k4, 8, (FRAME_HEIGHT * SCALE) - (1 * SCALE));
            g.drawImage(bufferedimage, 0, 0, null);
            i3++;
            long l9;
            if((l9 = (l1 = System.currentTimeMillis()) - l2) > 100L)
            {
                l2 = l1;
                f = (long)(i3 * 1000) / l9;
                i3 = 0;
            }
        } while(true);
    }

    private static boolean a(int ai[], int ai1[], float f, float f1, float f2, float f3, float f4, float f5)
    {
        float f6 = -(f4 * f - f5 * f1);
        float f7 = f5 * f + f4 * f1;
        float f8 = -(f4 * f2 - f5 * f3);
        float f9;
        if((f9 = f5 * f2 + f4 * f3) < 0.01F && f7 < 0.01F)
            return false;
        float f10 = 0.0F;
        float f11 = 64F;
        if(f9 < 0.01F)
        {
            f8 = f6 + ((f8 - f6) * (0.01F - f7)) / (f9 - f7);
            f10 = f11 + ((0.0F - f11) * (0.01F - f7)) / (f9 - f7);
            f9 = 0.01F;
        }
        if(f7 < 0.01F)
        {
            f6 = f8 + ((f6 - f8) * (0.01F - f9)) / (f7 - f9);
            f11 = f10 + ((f11 - f10) * (0.01F - f9)) / (f7 - f9);
            f7 = 0.01F;
        }
        int i = (int)((1.0F / f9) * 160F);
        int j = (int)((1.0F / f7) * 160F);
        int k = (int)((f8 / f9) * 160F + 160F);
        int l = (int)((f6 / f7) * 160F + 160F) - k;
        float f12 = 1.0F / f9;
        float f13 = 1.0F / f7;
        float f14 = f10 * f12;
        float f15 = f11 * f13;
        int i1 = 0;
        int j1 = l;
        if(k < 0)
            i1 = 0 - k;
        if(k + l > 320)
            j1 += 320 - (k + l);
        boolean flag = false;
        for(int k1 = i1; k1 < j1; k1++)
        {
            float f16;
            if((f16 = 1.0F / (f12 + ((f13 - f12) * (float)k1) / (float)l)) >= a_float_array1d_static_fld[k1 + k])
                continue;
            if(k1 + k == 160 && f16 < a_float_array1d_static_fld[320])
            {
                a_float_array1d_static_fld[320] = f16;
                flag = true;
            }
            int l1;
            if((l1 = (int)(255F - (f16 * 255F) / 16F)) < 0)
                l1 = 0;
            int i2 = (int)((f14 + ((float)k1 * (f15 - f14)) / (float)l) * f16);
            int j2 = i + (k1 * (j - i)) / l + 3;
            int k2 = 110 - (j2 + 1 >> 1);
            int l2 = 0;
            int i3 = j2;
            if(k2 < 0)
                l2 = 0 - k2;
            if(k2 + j2 > 220)
                i3 += 220 - (k2 + j2);
            int j3 = (k2 + l2) * 320 + k + k1;
            boolean flag1 = true;
            for(int k3 = l2; k3 < i3; k3++)
            {
                int l3;
                if(((l3 = ai1[i2 & 0x3f | ((k3 << 6) / j2 & 0x3f) << 6]) >> 24 & 0xff) > 0)
                {
                    if(f16 < b[j3])
                    {
                        b[j3] = f16;
                        int i4 = ((l3 >> 16 & 0xff) * l1) / 255;
                        int j4 = ((l3 >> 8 & 0xff) * l1) / 255;
                        int k4 = ((l3 & 0xff) * l1) / 255;
                        ai[j3] = 0xff000000 | i4 << 16 | j4 << 8 | k4;
                    }
                } else
                {
                    flag1 = false;
                }
                j3 += 320;
            }

            if(flag1)
                a_float_array1d_static_fld[k1 + k] = f16;
        }

        return flag;
    }

    public static float a_float_array1d_static_fld[] = new float[321];
    public static float b[] = new float[0x11300];
    public static boolean a_boolean_array1d_static_fld[] = new boolean[256];
    public static int a_int_static_fld = 0;
    public static Robot a_java_awt_Robot_static_fld;
    public static boolean a_boolean_static_fld = false;

}

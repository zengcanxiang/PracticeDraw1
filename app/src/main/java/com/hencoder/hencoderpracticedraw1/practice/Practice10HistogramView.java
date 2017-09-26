package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        Paint p = new Paint();
        int h = getMeasuredHeight();
        int w = getMeasuredWidth();

        p.setColor(Color.WHITE);
        p.setStrokeWidth(10);
        canvas.drawLine(50, 50, 50, h - 200, p);
        canvas.drawLine(50, h - 200, w - 100, h - 200, p);

        int xLength = w - 100 - 50;//x轴长度
        int yLength = h - 200 - 50;//y轴长度

        int jiange = 30;
        int length = (xLength - (jiange * 8)) / 7;//每一个格子要占的长度


        for (int i = 1; i <= 7; i++) {
            p.setColor(Color.GREEN);
            int left = 50 + jiange * i + length * (i - 1);
            int right = left + length;
            canvas.drawRect(left, 200, right, h - 200 - 10, p);// 画长方体

            p.setColor(Color.WHITE);
            p.setTextSize(28);
            canvas.drawText("底部文字", left, h - 200 + 20, p);

        }

    }
}

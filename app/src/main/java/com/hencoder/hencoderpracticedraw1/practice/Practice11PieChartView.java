package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import static android.R.attr.x;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图


        Paint p = new Paint();
        int h = getMeasuredHeight();
        int w = getMeasuredWidth();

        int dotsX = w / 2;
        int dotsY = h / 2;

        int banj = x / 4;

        p.setColor(Color.RED);
        p.setStyle(Paint.Style.FILL);
        canvas.drawArc(150 - 10f, 80 - 10f, 150 + dotsX - 10f, dotsY + 150 - 10f, -175f, 115f, true, p);


        p.setColor(Color.YELLOW);
        p.setStyle(Paint.Style.FILL);
        canvas.drawArc(150+5, 80+5, 150 + dotsX+5, dotsY + 150+5, -60f, 55f, true, p);


        p.setColor(Color.parseColor("#9C27B1"));
        p.setStyle(Paint.Style.FILL);
        canvas.drawArc(150+5, 80+5, 150 + dotsX+5, dotsY + 150+5, 0f, 10f, true, p);

        p.setColor(Color.parseColor("#9F9E9F"));
        p.setStyle(Paint.Style.FILL);
        canvas.drawArc(150+5, 80+5, 150 + dotsX+5, dotsY + 150+5, 12f, 5f, true, p);

        p.setColor(Color.parseColor("#019689"));
        p.setStyle(Paint.Style.FILL);
        canvas.drawArc(150+5, 80+5, 150 + dotsX+5, dotsY + 150+5, 19f, 60f, true, p);

        p.setColor(Color.parseColor("#2296F4"));
        p.setStyle(Paint.Style.FILL);
        canvas.drawArc(150+5, 80+5, 150 + dotsX+5, dotsY + 150+5, 82f, 100f, true, p);

    }
}

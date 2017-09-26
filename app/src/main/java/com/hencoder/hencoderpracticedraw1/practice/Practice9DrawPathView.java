package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形

        Path p=new Path();
        p.moveTo(200,200);

        p.arcTo(350,125,500,275,-230,230,true);
        p.arcTo(500,125,650,275,-180,230,false);


        p.rLineTo(-120,120);
        p.close();

        Paint paint=new Paint();
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawPath(p,paint);
    }
}

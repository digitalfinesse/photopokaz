package tech.palguev.photopokaz.helper;

/*
описание вида миниатюры в gallery_thumbnail
 */


import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class SquareLayout extends RelativeLayout {

    public SquareLayout(Context context) {
        super(context);
    }

    public SquareLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /*
    Когда мы работаем с новыми версиями, всегда есть опасность вызвать методы,
    которые не будут работать на старых устройствах. Чтобы избежать потенциальных ошибок,
    нужно делать проверки.

    Чтобы Lint не ругался на классы или методы, которые не поддерживаются в API,
    указанной в minSdkVersion, можно пометить их аннотацией @TargetApi() и в скобках указать
    поддерживаемую версию API.
     */
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public SquareLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int HeightMeasureSpec) {
        // Устанавливаем квадратный вид
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);
    }
}

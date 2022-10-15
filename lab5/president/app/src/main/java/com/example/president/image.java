package com.example.president;
import com.example.president.R;
        import android.view.ViewGroup;
        import android.widget.BaseAdapter;
        import android.widget.GridLayout;
        import android.widget.GridView;
        import android.widget.ImageView;
        import android.content.Context;
        import android.view.View;



public class image extends BaseAdapter {
    private Context mContext;
    public Integer[] thumbImages = {
            R.drawable.apj, R.drawable.pranab,
            R.drawable.ramnath, R.drawable.prathiba,
            R.drawable.droupadi
    };

    public image(Context c) {
        mContext = c;
    }
    @Override
    public int getCount() {
        return thumbImages.length;
    }
    @Override
    public Object getItem(int position) {
        return null;
    }
    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setLayoutParams(new GridView.LayoutParams(200, 200));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(8, 8, 8, 8);
        imageView.setImageResource(thumbImages[position]);
        return imageView;
    }
};


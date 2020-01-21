package id.ac.poliban.mi.sari.listviewpahlawan;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class HeroAdapter extends BaseAdapter {
    private List<Hero> data = new ArrayList<>();

    public HeroAdapter(List<Hero> data) {
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView img_hero;
        TextView tvHeroName;
        TextView tvHeroDesc;

        convertView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_hero, parent, false);

        //deklarasikan View
        img_hero = convertView.findViewById(R.id.img_hero);
        tvHeroName = convertView.findViewById(R.id.tv_hero_name);
        tvHeroDesc = convertView.findViewById(R.id.tv_hero_description);
        //isi data
        Glide.with(parent.getContext())
                .load(data.get(position).getHero())
                .apply(new RequestOptions().override(60, 60))
                .into(img_hero);
        tvHeroName.setText(data.get(position).getHeroName());
        tvHeroDesc.setText(data.get(position).getHeroDesc());

        return convertView;


    }
}

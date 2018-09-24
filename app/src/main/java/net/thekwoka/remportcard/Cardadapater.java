package net.thekwoka.remportcard;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Cardadapater extends ArrayAdapter<Reportcard> {

    public Cardadapater(Activity context, ArrayList<Reportcard> reportcards){
        super(context,0,reportcards);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.gradeshow, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Reportcard currentReport = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.NameSpace);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(currentReport.getName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView gradeTextView = (TextView) listItemView.findViewById(R.id.FinalGrade);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        gradeTextView.setText(currentReport.getTotalGrade());

        TextView engTextView = (TextView) listItemView.findViewById(R.id.engScore);
        String ENG = String.valueOf(currentReport.getENG());
        engTextView.setText(ENG);
        TextView korTextView = (TextView) listItemView.findViewById(R.id.korScore);
        String KOR = String.valueOf(currentReport.getKOR());
        korTextView.setText(KOR);
        TextView busTextView = (TextView) listItemView.findViewById(R.id.busScore);
        String BUS = String.valueOf(currentReport.getBUS());
        busTextView.setText(BUS);



        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }



}

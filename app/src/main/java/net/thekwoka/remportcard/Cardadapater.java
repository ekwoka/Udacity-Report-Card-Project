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

    //Maker Method
    public Cardadapater(Activity context, ArrayList<Reportcard> reportcards) {
        super(context, 0, reportcards);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.gradeshow, parent, false);
        }

        // Get the object located at this position in the list
        Reportcard currentReport = getItem(position);

        // Find the TextView in the gradeshow.xml to place student name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.NameSpace);
        // set this text on the name TextView
        nameTextView.setText(currentReport.getName());

        // Find the TextView in the gradeshow.xml to place letter grade
        TextView gradeTextView = (TextView) listItemView.findViewById(R.id.FinalGrade);
        // set this text on the number TextView
        gradeTextView.setText(currentReport.getTotalGrade());

        // Find the TextView in the gradeshow.xml to place the English Score
        TextView engTextView = (TextView) listItemView.findViewById(R.id.engScore);
        //Convert English score to String
        String ENG = String.valueOf(currentReport.getENG());
        // set this text on the number TextView
        engTextView.setText(ENG);

        // Find the TextView in the gradeshow.xml to place the Korean Score
        TextView korTextView = (TextView) listItemView.findViewById(R.id.korScore);
        //Convert English score to String
        String KOR = String.valueOf(currentReport.getKOR());
        // set this text on the number TextView
        korTextView.setText(KOR);

        // Find the TextView in the gradeshow.xml to place the Business Score
        TextView busTextView = (TextView) listItemView.findViewById(R.id.busScore);
        //Convert English score to String
        String BUS = String.valueOf(currentReport.getBUS());
        // set this text on the number TextView
        busTextView.setText(BUS);


        // Return the whole list item layout
        // so that it can be shown in the ListView
        return listItemView;
    }


}

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ort.tp5_.R;
import com.ort.tp5_.actividadprincipal;



public class fragentmostrar {
    TextView textomostrar;
    public View onCreateView(LayoutInflater inflador, ViewGroup grupo, Bundle paquete){
        View vistadevolver;
        vistadevolver=inflador.inflate (R.layout.mostrar, grupo, false);
        textomostrar=vistadevolver.findViewById (R.id.ciudadelegida);
        actividadprincipal miactivity;
        miactivity=(actividadprincipal) getActivity ();
        String nombreamostrar;
        nombreamostrar=miactivity.verciudad ();
        textomostrar.setText (nombreamostrar);
        return vistadevolver;
    }
}

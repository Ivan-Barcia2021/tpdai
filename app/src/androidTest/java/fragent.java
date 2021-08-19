import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.ort.tp5_.R;

public class fragent {
    EditText ingresocudad;
    Button miboton;
    public View onCreateView(LayoutInflater inflador, ViewGroup migrupo, Bundle datosrecibidos){
        View vista_devolver;
        vista_devolver=inflador.inflate (R.layout.ingreso, migrupo, false);
        ingresocudad=vista_devolver.findViewById (R.id.ingresociudad);
        miboton=vista_devolver.findViewById (R.id.miboton);
        miboton.setOnClickListener ((View.OnClickListener) this);
        return vista_devolver;

    }
    public void onClick(View v){
        String ciudad;
        ciudad=ingresocudad.getText ().toString ();
        actividadprincipal miactivity;
        miactivity=(actividadprincipal)getActivity ();
        miactivity.recibirdatos (ciudad);

    }
}

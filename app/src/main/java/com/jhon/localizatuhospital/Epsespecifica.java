package com.jhon.localizatuhospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Epsespecifica extends AppCompatActivity {
    private TextView tv2;
    private ListView lv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epsespecifica);
        Bundle extras = getIntent().getExtras();
        String local = extras.getString("eps");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher_foreground);
        tv2 = findViewById(R.id.textView2);
        lv2 = findViewById(R.id.Listview2);
        switch (local) {
            case "NUEVA EPS":
                tv2.setText("CENTROS DE ATENCION NUEVA EPS");
                Nuevaeps ();
                break;
            case "SALUD TOTAL EPS":
                tv2.setText("CENTROS DE ATENCION SALUD TOTAL");
                SALUDTOTAL ();
                break;
            case "EPS SANITAS":
                tv2.setText("CENTROS DE ATENCION EPS SANITAS");
                SANITAS ();
                break;
            case "COMPENSAR EPS":
                tv2.setText("CENTROS DE ATENCION COMPENSAR EPS");
                COMPENSAR ();
                break;
            case "COMFENALCO":
                tv2.setText("CENTROS DE ATENCION COMFENALCO");
                COMFENALCO ();
                break;
            case "SALUDCOOP":
                tv2.setText("CENTROS DE ATENCION SALUDCOOP");
                SALUDCOOP ();
                break;
            case "AXA COLPATRIA":
                tv2.setText("CENTROS DE ATENCION AXA COLPATRIA");
                COLPATRIA ();
                break;
            case "COOMEVA EPS":
                tv2.setText("CENTROS DE ATENCION COOMEVA EPS");
                COOMEVA () ;
                break;
            case "ALIANSALUD":
                tv2.setText("CENTROS DE ATENCION ALIANSALUD");
                ALIANSALUD ();
                break;
            case "CAPITAL SALUD EPS":
                tv2.setText("CENTROS DE ATENCION CAPITAL SALUD EPS");
                CAPITALSALUD () ;
                break;
            case "CONVIDA-EPS":
                tv2.setText("CENTROS DE ATENCION CONVIDA-EPS");
                CONVIDA ();
                break;
            case "EPS FAMISANAR":
                tv2.setText("CENTROS DE ATENCION EPS FAMISANAR");
                FAMISANAR ();
                break;
            case "COOSALUD":
                tv2.setText("CENTROS DE ATENCION SALUD TOTAL");
                COOSALUD ();
                break;
            case "COLSANITAS EPS":
                tv2.setText("CENTROS DE ATENCION COOSALUD");
                COLSANITAS ();
                break;
            case "ASMET SALUD":
                tv2.setText("CENTROS DE ATENCION ASMET SALUD");
                ASMETSALUD ();
                break;
            case "AMBUQ":
                tv2.setText("CENTROS DE ATENCION AMBUQ");
                AMBUQ ();
                break;
            case "MEDIMAS":
                tv2.setText("CENTROS DE ATENCION MEDIMAS");
                MEDIMAS ();
                break;
            case "SERVICIO OCCIDENTAL DE SALUD":
                tv2.setText("CENTROS DE ATENCION S.O.S");
                SOS ();
                break;
            case "MUTUALSER":
                tv2.setText("CENTROS DE ATENCION MUTUALSER");
                MUTUALSER ();
                break;
/**/
        }
        lv2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent intent1 = new Intent(getApplicationContext(), Mapashospitales.class);
                String j = lv2.getItemAtPosition(i).toString();
                intent1.putExtra("localidad",j);
                startActivity(intent1);
            }
        });
    }
    public void Nuevaeps () {
        String nueva []= {  "FUNDACIÓN HOSPITAL INFANTIL DE SAN JOSÉ", "HOSPITAL UNIVERSITARIO CLÍNICA SAN RAFAEL" ,
                "ESE INSTITUTO NACIONAL DE CANCEROLOGÍA", "NATIONAL CLINICS CENTENARIO","SOCIEDAD DE CIRUGÍA DE BOGOTÁ HOSPITAL DE SAN JOSÉ",
                "CORPORACIÓN JUAN CIUDAD – BARRIOS UNIDOS", "CORPORACIÓN JUAN CIUDAD" , "FUNDACIÓN HOSPITAL SAN CARLOS",  "FUNDACIÓN HOSPITAL INFANTIL DE SAN JOSÉ",
                "FUNDACIÓN CARDIO INFANTIL INSTITUTO DE CARDIOLOGÍA", "CLÍNICA LA COLINA.", "CLÍNICA LOS NOGALES S.A.S." , "CLÍNICA PALERMO",
                "FUNDACIÓN ABOOD SHAIO.", "CLÍNICA V.I.P." ,"CLÍNICA NUEVA." , "CLÍNICA UNIVERSIDAD DE LA SABANA"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,nueva);
        lv2.setAdapter(adapter);
    }
    public void SALUDTOTAL () {
        String saludtotal []= {  "CENTRO POLICLINICO DEL OLAYA", "CLINICA JUAN N CORPAS LTDA", "FUN. HOSPITAL INFANTIL UNIVER SAN JOSE",
                "HOSPITAL UNIV CLIN SAN RAFAEL BOGOTA", "SOCIEDAD DE CIRUGIA HOSPITAL SAN JOSE" , "VS UUBC AMERICAS 2", "VS UUBC CALLE 98",
                "VS UUBC CALLE 98 2", "VS UUBC LAS AMERICAS"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,saludtotal);
        lv2.setAdapter(adapter);
    }
    public void SANITAS () {
        String sanitas []= {  "CLÍNICA CAMPO ABIERTO OSI LTDA", "CLÍNICA CAMPO ABIERTO OSI LTDA", "CLÍNICA UNIVERSITARIA COLOMBIA",
                "CLINICA DEL OCCIDENTE LTDA", "CLINICA ODONTOLOGICA PROTECCION ORAL","CLINICA ODONTOLOGICA PROTECCION ORAL LAS AMERICAS",
                "CLINICA PALERMO", "CRUZ ROJA COLOMBIANA SECCIONAL CUNDINAMARCA", "FUNDACION CARDIO INFANTIL ", "FUNDACIÓN HOSPITAL DE LA MISERICORDIA" ,"FUNDACIÓN SALUD BOSQUE",
                "HOSPITAL INFANTIL SAN JOSÉ", "HOSPITAL UNIVERSITARIO CLINICA SAN RAFAEL", "HOSPITAL UNIVERSITARIO MAYOR-MEDERI",
                "I.E.C.O. S.A." ,"I.E.C.O. S.A. (CL 93) ","SOCIEDAD DE CIRUGÍA DE BOGOTÁ HOSPITAL SAN JOSÉ " };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,sanitas);
        lv2.setAdapter(adapter);
    }

    public void COMPENSAR () {
        String compensar []= {  "LOS COBOS MEDICAL CENTER", "CLÍNICA LOS NOGALES", "CLÍNICA DE LA MUJER", "CLÍNICA DE LA COLINA",
                "FUNDACIÓN CLÍNICA SHAIO", "FUNDACIÓN CARDIO INFANTIL" ,"CLÍNICA DEL COUNTRY","CLÍNICA PALERMO","CLÍNICA NUEVA",
                "CLÍNICA DE MARLY", "FUNDACIÓN SANTA FE DE BOGOTÁ", "CLÍNICA UNIVERSIDAD DE LA SABANA", "CLÍNICA VIP"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,compensar);
        lv2.setAdapter(adapter);
    }
    public void COMFENALCO () {
        String confenalco []= {  "CLINICA DE MARLY", "CLINICA NUEVA"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,confenalco);
        lv2.setAdapter(adapter);
    }

    public void ALIANSALUD () {
        String aliansalud []= {  "CLÍNICA DEL OCCIDENTE",
                "CLÍNICA NUEVA BOGOTÁ ALIANSALUD EPS",  "HOSPITAL UNIVERSITARIO MAYOR – MÉDERI", "CRUZ ROJA COLOMBIANA – DIRECCIÓN NACIONAL",
                "CRUZ ROJA COLOMBIANA SAMU", "CRUZ ROJA COLOMBIANA CRA. 45","CLÍNICA SHAIO", "FUNDACIÓN CARDIOINFANTIL","FUNDACIÓN HOSPITAL SAN CARLOS",
                "HOSPITAL INFANTIL UNIVERSITARIO DE SAN JOSÉ", "HOSPITAL UNIVERSITARIO SAN IGNACIO","INSTITUTO NACIONAL DE CANCEROLOGÍA",
                "CLINICA DE NUESTRA SEÑORA DE LA PAZ","CLINICA LA INMACULADA"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,aliansalud);
        lv2.setAdapter(adapter);
    }
    public void SALUDCOOP () {
        String salucop []= { "CLINICA JUAN CORPAS ","CLINICA NUESTRA SENORA DE LA PAZ","CLINICA VASCULAR NAVARRA", "COMPLEJO AVENIDA 68 URGENCIAS",
                "CORPORACION IPS CRUZ  BLANCA CLINICA SANTA BIBIANA", "CORPORACION IPS CRUZ BLANCA CLINICA JORGE PIÑEROS CORPAS", "CORPORACION IPS CORVESALUD- COODONTOLOGOS CENTRO PEDIATRICO",
                "CORPORACION IPS CORVESALUD-COODONTOLOGOS COMPLEJO CALLE 100","CORPORACION IPS CRUZ BLANCA CLINICA POLICARPA",  "HOSPITAL UNIVERSITARIO CLINICA SAN RAFAEL",
                "IPS CUNDINAMARCA CRUZ BLANCA – CLINICA MATERNO INFANTIL"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,salucop);
        lv2.setAdapter(adapter);
    }
    public void COLPATRIA (){
        String colpatria []= {  "CLÍNICA VIP CENTRO DE MEDICINA",
                "CLÍNICA PALERMO", "SOCIEDAD MÉDICA DE ORTOPEDIA Y ACCIDENTES LABORALES S A", "CLÍNICA VASCULAR NAVARRA", "CRUZ ROJA","CLÍNICA NUESTRA SEÑORA DE LA PAZ",
                "FUNDACIÓN CLÍNICA SHAIO", "FUNDACIÓN CARDIO INFANTIL" ,"HOSPITAL SAN IGNACIO","HOSPITAL DE SAN JOSÉ ","CLÍNICA NUEVA",
                "CLÍNICA DE OJOS", "FUNDACIÓN OFTALMOLÓGICA ", "SALUD ORAL", "CLÍNICA DE OCCIDENTE","HOSPITAL UNIVERSITARIO MAYOR MEDERI",
                "HOSPITAL UNIVERSITARIO BARRIOS UNIDOS-MEDERI ","CLÍNICA JUAN N CORPAS","HOSPITAL UNIVERSITARIO DE LA SAMARITANA"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,colpatria);
        lv2.setAdapter(adapter);
    }
    public void COOMEVA () {
        String coomeva []= {  "HOSPITAL INFANTIL UNIVERSITARIO SAN JOSE", "CENTRO CARDIOVASCULAR COLOMBIANO"
                , "CLÍNICA SAN DIEGO CIOSAD ", "SINERGIA SALUD S.A.S UNIDAD BÁSICA AVENIDA 68 ", "SINERGIA SALUD S.A.S AVENIDA CALLE 80",
                "SINERGIA GLOBAL EN SALUD UNIDAD BÁSICA LOURDES","SINERGIA GLOBAL EN SALUD UPREC BOGOTÁ " };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,coomeva);
        lv2.setAdapter(adapter);
    }
    public void CAPITALSALUD () {
        String cruz []= {  "SUBRED INTEGRADA DE SERVICIOS DE SALUD CENTROORIENTE", "SUBRED INTEGRADA DE SERVICIOS DE SALUD SUROCCIDENTE"
                , "SUBRED INTEGRADA DE SERVICIOS DE SALUD NORTE ", "SUBRED INTEGRADA DE SERVICIOS DE SALUD SUR ", "ZONA CENTRO-ORIENTE RED PRIVADA",
                "ZONA SUR-OCCIDENTE RED PRIVADA","ZONA NORTE IPS RED PRIVADA","ZONA SUR RED PRIVADA" };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,cruz);
        lv2.setAdapter(adapter);
    }
    public void CONVIDA () {
        String convida []= {  "HOSPITAL SAN IGNACIO", "HOSPITAL UNIVERSITARIO DE LA SAMARITANA","FUNDACION HOSPITAL DE LA MISERICORDIA"
                , "INSTITUTO NACIONAL DE CANCEROLOGIA", "CLINICA MAGDALENA ", "ALIANZA IPS", "ISANGEL IPS S.A.S.","IPS VIVIR  ",
                "FUNDACION RENAL DE COLOMBIA","AMI PALLIUM COLOMBIA"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,convida);
        lv2.setAdapter(adapter);
    }
    public void FAMISANAR () {
        String famisanar []= {  "HOSPITAL UNIVERSITARIO CLÍNICA SAN RAFAEL", "COLSUBSIDIO CLÍNICA CIUDAD ROMA", "COLSUBSIDIO CM QUIROGA",
                "CLÍNICA DEL OCCIDENTE","CAFAM FLORESTA", "UNIDAD SERVICIOS SALUD VICTORIA"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,famisanar);
        lv2.setAdapter(adapter);
    }
    public void COOSALUD () {
        String famisanar []= {  "HOSPITAL INFANTIL UNIVERSITARIO SAN JOSE", "PSQ S.A.S.", "SUBRED INTEGRADA DE SERVICIOS DE SALUD SUR ",
                "Fundación Clínica Megasalud", " Clínica Nuevo Monterrey","Fundación Santa Fe de Bogotá","Clínica del Occidente S.A.",
                "Miocardio S.A.S","SUBRED INTEGRADA DE SERVICIOS DE SALUD CENTROORIENTE","SUBRED INTEGRADA DE SERVICIOS DE SALUD NORTE "};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,famisanar);
        lv2.setAdapter(adapter);
    }
    public void COLSANITAS () {
        String colsanitas []= {  "CLÍNICA UNIVERSITARIA COLOMBIA", "IECO", "PROTECCIÓN ORAL",
                "ODONTOSANITAS", "CLINICA REINA SOFIA", "CLINICA ADMINISTRADORA COUNTRY S.A.",
                "CLINICA DE LA MUJER" , "CLINICA MARLY S.A.", "CLINICA NUEVA","CLINICA PALERMO" +
                "CLINICA SHAIO – FUNDACIÓN ABBOD SHAIO" ,"FUNDACIÓN CARDIO INFANTIL"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,colsanitas);
        lv2.setAdapter(adapter);
    }
    public void ASMETSALUD () {
        String asmetsalud []= {  "MEDIFACA IPS S.A.S", "MIOCARDIO SAS", "SOCIEDAD INTEGRAL DE ESPECIALISTAS EN SALUD S.A.S SIGLA SIES SALUD S.A.S",
                "SUBRED INTEGRADA DE SERVICIOS DE SALUD CENTRO ORIENTE", "SUBRED INTEGRADA DE SERVICIOS DE SALUD NORTE","INSTITUTO ROOSEVELT", "INTEGRAL SOLUTIONS SD SAS",
                "SUBRED INTEGRADA DE SERVICIOS DE SALUD SUR", "SUBRED INTEGRADA DE SERVICIOS DE SALUD SUR OCCIDENTE E.S.E",
                "TADASHI SAS CENTROS DE IMAGENES ESPECIALIZADAS", "HOSPITAL SAN JOSE", "FUNDACION HOSPITAL DE LA MISERICORDIA",
                "GENETICA MOLECULAR DE COLOMBIA S.A.S.", "GLOBAL LIFE AMBULANCIAS SAS","HEALTH LIFE IPS SAS SEDE JJ VARGAS",
                "HOSPITAL UNIVERSITARIO SAN IGNACIO",  "INSTITUTO DEL CORAZON DE BOGOTA", "INSTITUTO LATINOAMERICANO DE NEUROLOGÍA Y SISTEMA NERVIOSO-ILANS S.A.S",
                "ALBA CHIQUINQUIRA GARZON ALBERGUE LUPITA",  "ASOCIACION PROBIENESTAR DE LA FAMILIA COLOMBIANA PROFAMILIA", "AUDIOCOM SAS",
                "BIOTECNOLOGIA Y GENETICA S.A. BIOTECGEN S.A.",  "CLINICA SAN DIEGO", "CLINICA DE OJOS (CLINOJOS) LTDA","DAVITA S.A.S.",
                "DIALY SER S.A.S", "EMPRESA SOCIAL DEL ESTADO HOSPITAL UNIVERSITARIO DE LA SAMARITANA",  "ERMEDICALLS S.A.S"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,asmetsalud);
        lv2.setAdapter(adapter);
    }
    public void AMBUQ () {
        String ambuq []= {  "INSTITUTO NACIONAL DE CANCEROLOGIA", "CLINICA CANDELARIA", ""};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,ambuq);
        lv2.setAdapter(adapter);
    }
    public void MUTUALSER () {
        String mutual []= {  "INSTITUTO NACIONAL DE CANCEROLOGIA", "CLINICA CANDELARIA", ""};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,mutual);
        lv2.setAdapter(adapter);
    }
    public void MEDIMAS () {
        String savia []= {  "CLÍNICA ESIMED POLICARPA", "CLÍNICA VERAGUAS", "UNIDAD MÉDICA CECIMIN", "CLÍNICA SANTA BIBIANA",  "HOSPITAL DE SAN JOSÉ",
                "HOSPITAL DE LA SAMARITANA",  "FUNDACIÓN HOSPITAL DE LA MISERICORDIA","HOSPITAL INFANTIL UNIVERSITARIO DE SAN JOSÉ"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,savia);
        lv2.setAdapter(adapter);
    }
    public void SOS () {
        String sos []= {  "UNIDAD DE SERVICIOS DE SALUD SIMON BOLIVAR", "UNIDAD DE SERVICIOS DE SALUD CHAPINERO", "CLINICA ODONTOLOGICA PROTECCION ORAL",
                "CLINICA DE MARLY S.A.", "CENTRO MEDICO COLSUBSIDIO QUIROGA", "CLINICA COLSUBSIDIO CIUDAD ROMA","CLINICA INFANTIL COLSUBSIDIO",
                "ROOSEVELT INSTITUTO DE ORTOPEDIA INFANTIL", "CLINICA DEL OCCIDENTE S.A.","CLINICA DE NUESTRA SEÑORA DE LA PAZ","INSTITUTO NACIONAL DE CANCEROLOGIA"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,sos);
        lv2.setAdapter(adapter);
    }
}

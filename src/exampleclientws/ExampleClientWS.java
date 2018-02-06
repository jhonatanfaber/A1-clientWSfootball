package exampleclientws;

import eu.dataaccess.footballpool.ArrayOfString;
import eu.dataaccess.footballpool.ArrayOftCountryInfo;
import java.util.List;

public class ExampleClientWS {

    public static void main(String[] args) {
        System.out.println("Yellow card total: "+ yellowCardsTotal());
        
        ArrayOfString lista = allDefenders("spain");
        System.out.println("Spanish Defenders: " + lista.getString());
        
        ArrayOftCountryInfo countryNames = countryNames(true);
        System.out.println("country "+ countryNames.getTCountryInfo());
        
        
    }

    private static int yellowCardsTotal() {
        eu.dataaccess.footballpool.Info service = new eu.dataaccess.footballpool.Info();
        eu.dataaccess.footballpool.InfoSoapType port = service.getInfoSoap();
        return port.yellowCardsTotal();
    }  

    private static ArrayOfString allDefenders(java.lang.String sCountryName) {
        eu.dataaccess.footballpool.Info service = new eu.dataaccess.footballpool.Info();
        eu.dataaccess.footballpool.InfoSoapType port = service.getInfoSoap();
        return port.allDefenders(sCountryName);
    }

    private static ArrayOftCountryInfo countryNames(boolean bWithCompetitors) {
        eu.dataaccess.footballpool.Info service = new eu.dataaccess.footballpool.Info();
        eu.dataaccess.footballpool.InfoSoapType port = service.getInfoSoap();
        return port.countryNames(bWithCompetitors);
    }
    
    
    
    
}

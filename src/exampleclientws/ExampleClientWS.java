package exampleclientws;

import eu.dataaccess.footballpool.ArrayOfString;
import eu.dataaccess.footballpool.ArrayOftCountryInfo;
import eu.dataaccess.footballpool.TCountryInfo;
import java.util.List;

public class ExampleClientWS {

    public static void main(String[] args) {
        System.out.println("Yellow card total: "+ yellowCardsTotal());
        
        //ArrayOfString lista = allDefenders("spain");
        //System.out.println("Spanish Defenders: " + lista.getString());
        for (TCountryInfo country : getCountryName()) {
            System.out.println("Country: "+ country.getSName());
            System.out.println("Defenders: "+ allDefenders(country.getSName()).getString());
        }
    }
    
    private static List<TCountryInfo> getCountryName(){
        List<TCountryInfo> countries = countryNames(true).getTCountryInfo();
        return countries;
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

package arraylist;

import java.util.ArrayList;

public class SeparateElementsByComma {
 
    public static void main(String[] args) {
        
        //Create an ArrayList
        ArrayList<String> aListLanguages = new ArrayList<String>();
        
        //Add elements to ArrayList
        aListLanguages.add("English");
        aListLanguages.add("French");
        aListLanguages.add("Spanish");
        aListLanguages.add("Hindi");
        aListLanguages.add("Arabic");
        aListLanguages.add("Russian");
        
        StringBuilder sbString = new StringBuilder("");
        
        //iterate through ArrayList
        for(String language : aListLanguages){
            
            //append ArrayList element followed by comma
            sbString.append(language).append(",");
        }
        
        //convert StringBuilder to String
        String strList = sbString.toString();
        
        //remove last comma from String if you want
        if( strList.length() > 0 )
            strList = strList.substring(0, strList.length() - 1);
        
        System.out.println(strList);        
    }
 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author chaud
 */
public class Mobiles {
    String  modID,  modName, Category, Company, Version, Cameraback, Camerafront, Size;
    int Price;
 
    Mobiles(String modID, String modName, String Category, String Company, int Price, String Version, String Cameraback, String Camerafront, String Size){
        this.modID =modID;
        this.modName=modName;
        this.Category=Category;
        this.Company=Company;
        this.Price=Price;
        this.Version=Version;
        this.Cameraback=Cameraback;
        this.Camerafront=Camerafront;
        this.Size=Size;

    }

    public String GetmodId(){
        return modID;
    }
    public String getmodName(){
        return modName;
    } 
    public String getCategory (){
        return Category; 
    }
    public String getCompany(){
        return Company;
    }
    public int getPrice(){
        return Price;
    }
    public String getCameraback(){
        return Cameraback; 
    }
    public String Camerafront(){
        return Camerafront;
    }
    public String Size(){
        return Size; 
    }
}


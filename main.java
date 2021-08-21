import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class Main{

    public static ArrayList<Artifact> flowerList(Artifact[] artifacts){
        ArrayList<Artifact> flower = new ArrayList<Artifact>();
        for(int i = 0; i<artifacts.length; i++){
            if(artifacts[i].type.equals("Flower")){
                flower.add(artifacts[i]);
            }
        }
        return flower;
    }

    public static ArrayList<Artifact> plumeList(Artifact[] artifacts){
        ArrayList<Artifact> plume = new ArrayList<Artifact>();
        for(int i = 0; i<artifacts.length; i++){
            if(artifacts[i].type.equals("Plume")){
                plume.add(artifacts[i]);
            }
        }
        return plume;
    }

    public static ArrayList<Artifact> eonList(Artifact[] artifacts){
        ArrayList<Artifact> eon = new ArrayList<Artifact>();
        for(int i = 0; i<artifacts.length; i++){
            if(artifacts[i].type.equals("Sands")){
                eon.add(artifacts[i]);
            }
        }
        return eon;
    }

    public static ArrayList<Artifact> gobletList(Artifact[] artifacts){
        ArrayList<Artifact> goblet = new ArrayList<Artifact>();
        for(int i = 0; i<artifacts.length; i++){
            if(artifacts[i].type.equals("Goblet")){
                goblet.add(artifacts[i]);
            }
        }
        return goblet;
    }

    public static ArrayList<Artifact> circletList(Artifact[] artifacts){
        ArrayList<Artifact> circlet = new ArrayList<Artifact>();
        for(int i = 0; i<artifacts.length; i++){
            if(artifacts[i].type.equals("Circlet")){
                circlet.add(artifacts[i]);
            }
        }
        return circlet;
    }

    public static Artifact stringtoArtifacts(String[] data){
        Artifact artifact = new Artifact(data[1], data[0], data[2]);
        for(int i = 9; i<data.length; i++){

            switch(data[i]){

                case "Healing%":
                    artifact.set_healingBonus(Float.parseFloat(data[i+1]));
                    break;

                case "Physical DMG%":
                    artifact.set_physicalDMGBonus(Float.parseFloat(data[i+1]));
                    break;

                case "Pyro DMG%":
                    artifact.set_pyroDMGBonus(Float.parseFloat(data[i+1]));
                    break;

                case "Geo DMG%":
                    artifact.set_geoDMGBonus(Float.parseFloat(data[i+1]));
                    break; 

                case "Dendro DMG%":
                    artifact.set_dendroDMGBonus(Float.parseFloat(data[i+1]));
                    break;

                case "Cryo DMG%":
                    artifact.set_cryoDMGBonus(Float.parseFloat(data[i+1]));
                    break;

                case "Electro DMG%":
                    artifact.set_electroDMGBonus(Float.parseFloat(data[i+1]));
                    break;

                case "Anemo DMG%":
                    artifact.set_anemoDMGBonus(Float.parseFloat(data[i+1]));
                    break;

                case "Hydro DMG%":
                    artifact.set_hydroDMGBonus(Float.parseFloat(data[i+1]));
                    break;
                
                case "HP":
                    artifact.set_flatHP(Float.parseFloat(data[i+1]));
                    break;

                case "HP%":
                    artifact.set_percentHP(Float.parseFloat(data[i+1]));
                    break;
                
                case "ATK":
                    artifact.set_flatATK(Float.parseFloat(data[i+1]));
                    break;

                case "ATK%":
                    artifact.set_percentATK(Float.parseFloat(data[i+1]));
                    break;

                case "DEF":
                    artifact.set_flatDEF(Float.parseFloat(data[i+1]));
                    break;

                case "DEF%":
                    artifact.set_percentDEF(Float.parseFloat(data[i+1]));
                    break;

                case "Elemental Mastery":
                    artifact.set_elementalMastery(Float.parseFloat(data[i+1]));
                    break;

                case "Energy Recharge%":
                    artifact.set_percentRecharge(Float.parseFloat(data[i+1]));
                    break;

                case "CRIT DMG%":
                    artifact.set_critDMG(Float.parseFloat(data[i+1]));
                    break;

                case "CRIT Rate%":
                    artifact.set_critRate(Float.parseFloat(data[i+1]));
                    break;

                default:
                    break;
            }
        }
        return artifact;
    }

    public static Artifact[] readData(String path){

        String line = "";
        Artifact[] artifacts = new Artifact[175];
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));

            int i = 0;
            while((line = br.readLine()) != null){
                String[] values = line.split(";");
                artifacts[i] = stringtoArtifacts(values);
                i++;
            }
        }

        catch(FileNotFoundException e){
            e.printStackTrace();
        }

        catch(IOException e){
            e.printStackTrace();
        }


        return artifacts;

    }

    public static void main(String[] args) {

        String path = "D:/20s/1000DaysOfCode/Day 2/ArtifactOptimization/arts.csv";

        Artifact[] kenan = readData(path);
        System.out.println(kenan[174].type);
        System.out.println(kenan[174].type);

        ArrayList<Artifact> flower = flowerList(kenan);
        ArrayList<Artifact> plume = plumeList(kenan);
        ArrayList<Artifact> eon = eonList(kenan);
        ArrayList<Artifact> goblet = gobletList(kenan);
        ArrayList<Artifact> circlet = circletList(kenan);
        
        System.out.println(flower.size() + " " + plume.size() + " " + eon.size() + " " + goblet.size() + " " + circlet.size());




    }
}
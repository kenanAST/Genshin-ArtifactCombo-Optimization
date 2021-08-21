import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class Main{

    public static Stack<Artifact> flowerList(Artifact[] artifacts){
        Stack<Artifact> flower = new Stack<Artifact>();
        for(int i = 0; i<artifacts.length; i++){
            if(artifacts[i].type.equals("Flower")){
                flower.push(artifacts[i]);
            }
        }
        return flower;
    }

    public static Stack<Artifact> plumeList(Artifact[] artifacts){
        Stack<Artifact> plume = new Stack<Artifact>();
        for(int i = 0; i<artifacts.length; i++){
            if(artifacts[i].type.equals("Plume")){
                plume.push(artifacts[i]);
            }
        }
        return plume;
    }

    public static Stack<Artifact> eonList(Artifact[] artifacts){
        Stack<Artifact> eon = new Stack<Artifact>();
        for(int i = 0; i<artifacts.length; i++){
            if(artifacts[i].type.equals("Sands")){
                eon.push(artifacts[i]);
            }
        }
        return eon;
    }

    public static Stack<Artifact> gobletList(Artifact[] artifacts){
        Stack<Artifact> goblet = new Stack<Artifact>();
        for(int i = 0; i<artifacts.length; i++){
            if(artifacts[i].type.equals("Goblet")){
                goblet.push(artifacts[i]);
            }
        }
        return goblet;
    }

    public static Stack<Artifact> circletList(Artifact[] artifacts){
        Stack<Artifact> circlet = new Stack<Artifact>();
        for(int i = 0; i<artifacts.length; i++){
            if(artifacts[i].type.equals("Circlet")){
                circlet.push(artifacts[i]);
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

        Stack<Artifact> flower = flowerList(kenan);
        Stack<Artifact> plume = plumeList(kenan);
        Stack<Artifact> eon = eonList(kenan);
        Stack<Artifact> goblet = gobletList(kenan);
        Stack<Artifact> circlet = circletList(kenan);
        
        System.out.println(flower.size() + " " + plume.size() + " " + eon.size() + " " + goblet.size() + " " + circlet.size());

    }
}
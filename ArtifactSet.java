public class ArtifactSet {
    
    public Artifact flower;
    public Artifact plume;
    public Artifact eon;
    public Artifact goblet;
    public Artifact circlet;

    ArtifactSet(Artifact flower, Artifact plume, Artifact eon, Artifact goblet, Artifact circlet){
        this.flower = flower;
        this.plume = plume;
        this.eon = eon;
        this.goblet = goblet;
        this.circlet = circlet;
    }

    public float total_healingBonus(){
        return (flower.get_healingBonus() + plume.get_healingBonus() + eon.get_healingBonus() + goblet.get_healingBonus() + circlet.get_healingBonus());
    }

    public float total_physicalDMGBonus(){
        return (flower.get_physicalDMGBonus() + plume.get_physicalDMGBonus() + eon.get_physicalDMGBonus() + goblet.get_physicalDMGBonus() + circlet.get_physicalDMGBonus());
    }

    public float total_pyroDMGBonus(){
        return (flower.get_pyroDMGBonus() + plume.get_pyroDMGBonus() + eon.get_pyroDMGBonus() + goblet.get_pyroDMGBonus() + circlet.get_pyroDMGBonus());
    }

    public float total_geoDMGBonus(){
        return (flower.get_geoDMGBonus() + plume.get_geoDMGBonus() + eon.get_geoDMGBonus() + goblet.get_geoDMGBonus() + circlet.get_geoDMGBonus());
    }

    public float total_dendroDMGBonus(){
        return (flower.get_dendroDMGBonus() + plume.get_dendroDMGBonus() + eon.get_dendroDMGBonus() + goblet.get_dendroDMGBonus() + circlet.get_dendroDMGBonus());
    }

    public float total_cryoDMGBonus(){
        return (flower.get_cryoDMGBonus() + plume.get_cryoDMGBonus() + eon.get_cryoDMGBonus() + goblet.get_cryoDMGBonus() + circlet.get_cryoDMGBonus());
    }

    public float total_electroDMGBonus(){
        return (flower.get_electroDMGBonus() + plume.get_electroDMGBonus() + eon.get_electroDMGBonus() + goblet.get_electroDMGBonus() + circlet.get_electroDMGBonus());
    }

    public float total_anemoDMGBonus(){
        return (flower.get_anemoDMGBonus() + plume.get_anemoDMGBonus() + eon.get_anemoDMGBonus() + goblet.get_anemoDMGBonus() + circlet.get_anemoDMGBonus());
    }

    public float total_hydroDMGBonus(){
        return (flower.get_hydroDMGBonus() + plume.get_hydroDMGBonus() + eon.get_hydroDMGBonus() + goblet.get_hydroDMGBonus() + circlet.get_hydroDMGBonus());
    }

    ////////////////////

    public float total_flatHP(){
        return (flower.get_flatHP() + plume.get_flatHP() + eon.get_flatHP() + goblet.get_flatHP() + circlet.get_flatHP());
    }

    public float total_percentHP(){
        return (flower.get_percentHP() + plume.get_percentHP() + eon.get_percentHP() + goblet.get_percentHP() + circlet.get_percentHP());
    }

    public float total_flatATK(){
        return (flower.get_flatATK() + plume.get_flatATK() + eon.get_flatATK() + goblet.get_flatATK() + circlet.get_flatATK());
    }

    public float total_percentATK(){
        return (flower.get_percentATK() + plume.get_percentATK() + eon.get_percentATK() + goblet.get_percentATK() + circlet.get_percentATK());
    }

    public float total_flatDEF(){
        return (flower.get_flatDEF() + plume.get_flatDEF() + eon.get_flatDEF() + goblet.get_flatDEF() + circlet.get_flatDEF());
    }

    public float total_percentDEF(){
        return (flower.get_percentDEF() + plume.get_percentDEF() + eon.get_percentDEF() + goblet.get_percentDEF() + circlet.get_percentDEF());
    }

    public float total_elementalMastery(){
        return (flower.get_elementalMastery() + plume.get_elementalMastery() + eon.get_elementalMastery() + goblet.get_elementalMastery() + circlet.get_elementalMastery());
    }

    public float total_percentRecharge(){
        return (flower.get_percentRecharge() + plume.get_percentRecharge() + eon.get_percentRecharge() + goblet.get_percentRecharge() + circlet.get_percentRecharge());
    }

    public float total_critRate(){
        return (flower.get_critRate() + plume.get_critRate() + eon.get_critRate() + goblet.get_critRate() + circlet.get_critRate());
    }

    public float total_critDMG(){
        return (flower.get_critDMG() + plume.get_critDMG() + eon.get_critDMG() + goblet.get_critDMG() + circlet.get_critDMG());
    }
}

public class ArtifactSet {
    
    private Artifact flower;
    private Artifact plume;
    private Artifact eon;
    private Artifact goblet;
    private Artifact circlet;

    ArtifactSet(Artifact flower, Artifact plume, Artifact eon, Artifact goblet, Artifact circlet){
        this.flower = flower;
        this.plume = plume;
        this.eon = eon;
        this.goblet = goblet;
        this.circlet = circlet;
    }

    public float total_flatHP(){
        return (flower.get_flatHP() + plume.get_flatHP() + eon.get_flatHP() + goblet.get_flatHP() + circlet.get_flatHP());
    }

    public float total_percentHP(){
        return (flower.get_percentHP() + plume.get_percentHP() + eon.get_percentHP() + goblet.get_percentHP() + circlet.get_percentHP());
    }

    public float total_flatAttack(){
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

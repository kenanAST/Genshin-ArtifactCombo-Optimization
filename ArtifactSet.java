public class ArtifactSet {
    private Artifact flower;
    private Artifact plume;
    private Artifact eon;
    private Artifact goblet;
    private Artifact circlet;


    public int total_flatHP(){
        return (flower.get_flatHP() + plume.get_flatHP() + eon.get_flatHP() + goblet.get_flatHP() + circlet.get_flatHP());
    }

    public int total_percentHP(){
        return (flower.get_percentHP() + plume.get_percentHP() + eon.get_percentHP() + goblet.get_percentHP() + circlet.get_percentHP());
    }

    public int total_flatAttack(){
        return (flower.get_flatATK() + plume.get_flatATK() + eon.get_flatATK() + goblet.get_flatATK() + circlet.get_flatATK());
    }

    public int total_percentATK(){
        return (flower.get_percentATK() + plume.get_percentATK() + eon.get_percentATK() + goblet.get_percentATK() + circlet.get_percentATK());
    }
}

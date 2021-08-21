class Artifact{

    // Artifact Type
    private String name;
    private String type;
    private String setName;

    //Artifact Stats
    private int healingBonus;
    private int physicalDMGBonus;
    private int elementalDMGBonus;
    private int flatHP;
    private int percentHP;
    private int flatATK;
    private int percentATK;
    private int flatDEF;
    private int percentDEF;
    private int elementalMastery;
    private int percentRecharge;
    private int critRate;
    private int critDMG;

    Artifact(String name, String type, String setName){
        this.name = name;
        this.type = type;
        this.setName = setName;
    }


    //getter Stats

    public int get_healingBonus(){
        return this.healingBonus;
    }

    public int get_physicalDMGBonus(){
        return this.physicalDMGBonus;
    }

    public int get_elementalDMGBonus(){
        return this.elementalDMGBonus;
    }

    public int get_flatHP(){
        return this.flatHP;
    }

    public int get_percentHP(){
        return this.percentHP;
    }


    public int get_flatATK(){
        return this.flatATK;
    }


    public int get_percentATK(){
        return this.percentATK;
    }


    public int get_flatDEF(){
        return this.flatDEF;
    }


    public int get_percentDEF(){
        return this.percentDEF;
    }


    public int get_elementalMastery(){
        return this.elementalMastery;
    }

    public int get_percentRecharge(){
        return this.percentRecharge;
    }

    public int get_critRate(){
        return this.critRate;
    }

    public int get_critDMG(){
        return this.critDMG;
    }


}
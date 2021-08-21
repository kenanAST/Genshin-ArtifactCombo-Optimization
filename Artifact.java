class Artifact{

    // Artifact Type
    public String level;
    public String type;
    public String setName;

    //Artifact Stats
    private float healingBonus = 0;
    private float physicalDMGBonus = 0;
    private float pyroDMGBonus = 0;
    private float geoDMGBonus = 0;
    private float dendroDMGBonus = 0;
    private float cryoDMGBonus = 0;
    private float electroDMGBonus = 0;
    private float anemoDMGBonus = 0;
    private float hydroDMGBonus = 0;

    //sub stats
    private float flatHP = 0;
    private float percentHP = 0;
    private float flatATK = 0;
    private float percentATK = 0;
    private float flatDEF = 0;
    private float percentDEF = 0;
    private float elementalMastery = 0;
    private float percentRecharge = 0;
    private float critRate = 0;
    private float critDMG = 0;

    Artifact(String level, String type, String setName){
        this.level = level;
        this.type = type;
        this.setName = setName;
    }

    //setter Stats

    public void set_healingBonus(float healingBonus){
        this.healingBonus = healingBonus;
    }

    public void set_physicalDMGBonus(float physicalDMGBonus){
        this.physicalDMGBonus = physicalDMGBonus;
    }

    public void set_pyroDMGBonus(float pyroDMGBonus){
        this.pyroDMGBonus = pyroDMGBonus;
    }

    public void set_geoDMGBonus(float geoDMGBonus){
        this.geoDMGBonus = geoDMGBonus;
    }

    public void set_dendroDMGBonus(float dendroDMGBonus){
        this.dendroDMGBonus = dendroDMGBonus;
    }

    public void set_cryoDMGBonus(float cryoDMGBonus){
        this.cryoDMGBonus = cryoDMGBonus;
    }

    public void set_electroDMGBonus(float electroDMGBonus){
        this.electroDMGBonus = electroDMGBonus;
    }

    public void set_anemoDMGBonus(float anemoDMGBonus){
        this.anemoDMGBonus = anemoDMGBonus;
    }

    public void set_hydroDMGBonus(float hydroDMGBonus){
        this.hydroDMGBonus = hydroDMGBonus;
    }

    public void set_flatHP(float flatHP){
        this.flatHP = flatHP;
    }

    public void set_percentHP(float percentHP){
        this.percentHP = percentHP;
    }


    public void set_flatATK(float flatATK){
        this.flatATK = flatATK;
    }


    public void set_percentATK(float percentATK){
        this.percentATK = percentATK;
    }


    public void set_flatDEF(float flatDEF){
        this.flatDEF = flatDEF;
    }


    public void set_percentDEF(float percentDEF){
        this.percentDEF = percentDEF;
    }


    public void set_elementalMastery(float elementalMastery){
        this.elementalMastery = elementalMastery;
    }

    public void set_percentRecharge(float percentRecharge){
        this.percentRecharge = percentRecharge;
    }

    public void set_critRate(float critRate){
        this.critRate = critRate;
    }

    public void set_critDMG(float critDMG){
        this.critDMG = critDMG;
    }




    //getter Stats

    public float get_healingBonus(){
        return this.healingBonus;
    }

    public float get_physicalDMGBonus(){
        return this.physicalDMGBonus;
    }

    public float get_pyroDMGBonus(){
        return this.pyroDMGBonus;
    }

    public float get_geoDMGBonus(){
        return this.geoDMGBonus;
    }

    public float get_dendroDMGBonus(){
        return this.dendroDMGBonus;
    }

    public float get_cryoDMGBonus(){
        return this.cryoDMGBonus;
    }

    public float get_electroDMGBonus(){
        return this.electroDMGBonus;
    }

    public float get_anemoDMGBonus(){
        return this.anemoDMGBonus;
    }

    public float get_hydroDMGBonus(){
        return this.hydroDMGBonus;
    }

    public float get_flatHP(){
        return this.flatHP;
    }

    public float get_percentHP(){
        return this.percentHP;
    }


    public float get_flatATK(){
        return this.flatATK;
    }


    public float get_percentATK(){
        return this.percentATK;
    }


    public float get_flatDEF(){
        return this.flatDEF;
    }


    public float get_percentDEF(){
        return this.percentDEF;
    }


    public float get_elementalMastery(){
        return this.elementalMastery;
    }

    public float get_percentRecharge(){
        return this.percentRecharge;
    }

    public float get_critRate(){
        return this.critRate;
    }

    public float get_critDMG(){
        return this.critDMG;
    }


}
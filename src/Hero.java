public abstract class Hero extends GameEntity implements HavingSuperAbility {
    private String superAbilityType;


    public Hero(int health, int damage, String superAbilityType) {
        super(health, damage);
        this.superAbilityType = superAbilityType;
    }


    public String getSuperAbilityType() {
        return superAbilityType;
    }


    public void setSuperAbilityType(String superAbilityType) {
        this.superAbilityType = superAbilityType;
    }
}

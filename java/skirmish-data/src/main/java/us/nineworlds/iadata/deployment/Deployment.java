package us.nineworlds.iadata.deployment;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import us.nineworlds.iadata.enums.DefenseDice;
import us.nineworlds.iadata.enums.DeploymentRestrictions;
import us.nineworlds.iadata.enums.DeploymentTypes;
import us.nineworlds.iadata.enums.Factions;

@JsonIgnoreProperties({"shapeshifterForm", "defaultShapeShifterForm"})
public class Deployment {

	@JsonProperty(required=true, value="iaspecName")
	private String iaspecname;
	
	@JsonProperty(required=true, value="faction")
	private Factions faction;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("imageurl")
	private String imageurl;
	
	@JsonProperty("elite")
	private boolean elite;
	
	@JsonProperty("type")
	private DeploymentTypes deploymentType;
	
	@JsonProperty("unique")
	private boolean unique;
	
	@JsonProperty("subtitle")
	private String subtitle;
	
	@JsonProperty("deploymentCost")
	private int deploymentCost;
	
	@JsonProperty("reenforcementCost")
	private int reenforcementCost;
	
	@JsonProperty("unitsInGroup")
	private int unitsInGroup;
	
	@JsonProperty("restrictions")
	private List<DeploymentRestrictions> restrictions;
	
	@JsonProperty("health")
	private int health;
	
	@JsonProperty("speed")
	private int speed;
		
	@JsonProperty("defense")
	private List<DefenseDice> defenseDicePool;
	
	@JsonProperty("attack")
	private Attack attack;
	
	@JsonProperty("abilities")
	private List<Abilities> abilities;

	public Factions getFaction() {
		return faction;
	}

	public void setFaction(Factions faction) {
		this.faction = faction;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIaspecname() {
		return iaspecname;
	}

	public void setIaspecname(String iaspecname) {
		this.iaspecname = iaspecname;
	}

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public boolean isElite() {
		return elite;
	}

	public void setElite(boolean elite) {
		this.elite = elite;
	}

	public DeploymentTypes getDeploymentType() {
		return deploymentType;
	}

	public void setDeploymentType(DeploymentTypes deploymentType) {
		this.deploymentType = deploymentType;
	}

	public boolean isUnique() {
		return unique;
	}

	public void setUnique(boolean unique) {
		this.unique = unique;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public int getDeploymentCost() {
		return deploymentCost;
	}

	public void setDeploymentCost(int deploymentCost) {
		this.deploymentCost = deploymentCost;
	}

	public int getReenforcementCost() {
		return reenforcementCost;
	}

	public void setReenforcementCost(int reenforcementCost) {
		this.reenforcementCost = reenforcementCost;
	}

	public int getUnitsInGroup() {
		return unitsInGroup;
	}

	public void setUnitsInGroup(int unitsInGroup) {
		this.unitsInGroup = unitsInGroup;
	}

	public List<DeploymentRestrictions> getRestrictions() {
		return restrictions;
	}

	public void setRestrictions(List<DeploymentRestrictions> restrictions) {
		this.restrictions = restrictions;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public List<DefenseDice> getDefenseDicePool() {
		return defenseDicePool;
	}

	public void setDefenseDicePool(List<DefenseDice> defenseDicePool) {
		this.defenseDicePool = defenseDicePool;
	}

	public Attack getAttack() {
		return attack;
	}

	public void setAttack(Attack attack) {
		this.attack = attack;
	}

	public List<Abilities> getAbilities() {
		return abilities;
	}

	public void setAbilities(List<Abilities> abilities) {
		this.abilities = abilities;
	}
}

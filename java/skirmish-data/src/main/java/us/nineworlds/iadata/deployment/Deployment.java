package us.nineworlds.iadata.deployment;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;

import us.nineworlds.iadata.enums.DefenseDice;
import us.nineworlds.iadata.enums.DeploymentRestrictions;
import us.nineworlds.iadata.enums.DeploymentTypes;
import us.nineworlds.iadata.enums.Factions;

@JsonIgnoreProperties({"shapeshifterForm", "defaultShapeShifterForm"})
public class Deployment {

	@JsonProperty(required=true, value="iaspecName")
	@JsonPropertyDescription("The iaspec canonical name for the card.  This is typically the name of the card in lowercase without any puncuation or spaces included.")
	private String iaspecname;
	
	@JsonProperty(required=true, value="faction")
	@JsonPropertyDescription("An enumerated type for which faction this belongs.  Valid types are imperial, mercenary, rebel, any")
	private Factions faction;
	
	@JsonProperty("name")
	@JsonPropertyDescription("Optional field that contains the human readable name of the deployment card.")
	private String name;
	
	@JsonProperty("imageurl")
	@JsonPropertyDescription("Optional field that points to a url end point for the image of the deployment card.")
	private String imageurl;
	
	@JsonProperty("elite")
	@JsonPropertyDescription("Optional field specifying if the deployment card is elite or not.  0 for false, 1 for true.")
	private boolean elite;
	
	@JsonProperty("type")
	@JsonPropertyDescription("Optional field describing the type of deployment. Valid options currently are deployment or upgrade.")
	private DeploymentTypes deploymentType;
	
	@JsonProperty("unique")
	@JsonPropertyDescription("Optional field specifying if the deployment card is unique or not.  0 for false, 1 for true")
	private boolean unique;
	
	@JsonProperty("subtitle")
	@JsonPropertyDescription("Optional field providing the subtitle that sometimes appears under the name of the card.")
	private String subtitle;
	
	@JsonProperty("deploymentCost")
	@JsonPropertyDescription("Optional field providing the deployment cost for the deployment card.  This is not the re-enforcement cost of the card.")
	private int deploymentCost;
	
	@JsonProperty("reenforcementCost")
	@JsonPropertyDescription("Optional field that specifies how much the re-enforcement cost for each unit in the group.")
	private int reenforcementCost;
	
	@JsonProperty("unitsInGroup")
	@JsonPropertyDescription("Optional field that specifies the number of units that belong in this group.")
	private int unitsInGroup;
	
	@JsonProperty("restrictions")
	@JsonPropertyDescription("Optional field that lists all of the restriction traits for the deployment card.  This typically will match up with restrictions for command cards.")
	private List<DeploymentRestrictions> restrictions;
	
	@JsonProperty("health")
	@JsonPropertyDescription("Optional field that specifies how much starting health the deployment card has.")
	private int health;
	
	@JsonProperty("speed")
	@JsonPropertyDescription("Optional field that specifies the base movement speed for this deployment.  For upgrades or attachments this will always be zero.")
	private int speed;
		
	@JsonProperty("defense")
	@JsonPropertyDescription("Optional field that specifies the dice that make up the defense pool.")
	private List<DefenseDice> defenseDicePool;
	
	@JsonProperty("attack")
	@JsonPropertyDescription("Optional field that specifies the group for the attack pool dice.")
	private Attack attack;
	
	@JsonProperty("abilities")
	@JsonPropertyDescription("Optional field that lists the abilities for the deployment card.")
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
